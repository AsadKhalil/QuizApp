package com.example.quizapp;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import org.w3c.dom.Text;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.viewholder>
{
    private List<CategoryModel> cml;

    public CategoryAdapter(List<CategoryModel> cml)
     {
        this.cml = cml;
    }

    @NonNull
    @Override
    public viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.category_item,parent,false);
        return new viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewholder holder, int position)
    {
        holder.setData(cml.get(position).getImageurl(),cml.get(position).getTitle() );
    }

    @Override
    public int getItemCount() {
        return cml.size();
    }

    class viewholder extends RecyclerView.ViewHolder
    {

        private CircleImageView categoryimage;
        private TextView textcategory;

        public viewholder(@NonNull View itemview)
        {

            super(itemview );
            categoryimage=itemview.findViewById(R.id.categoryimag);
            textcategory=itemview.findViewById(R.id.categorytext);
        }

        private void setData(String url, final String title)
        {
            Glide.with(itemView.getContext()).load(url).into(categoryimage);
            textcategory.setText(title);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent questionintent=new Intent(itemView.getContext(),Questions.class);
                    questionintent.putExtra("title",title);
                    itemView.getContext().startActivity(questionintent);
                }
            });
        }
    }

}
