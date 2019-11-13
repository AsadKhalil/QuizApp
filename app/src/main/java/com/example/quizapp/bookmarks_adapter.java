package com.example.quizapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public  class bookmarks_adapter extends RecyclerView.Adapter<bookmarks_adapter.viewholder>
{
    private List<questionmodel> saveditems;

    public bookmarks_adapter(List<questionmodel> saveditems) {
        this.saveditems = saveditems;
    }

    @NonNull
    @Override
    public viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {

        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.bookmark_saveditem,parent,false);
        return new viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewholder holder, int position)
    {
        holder.setvalues(saveditems.get(position).getQs(),saveditems.get(position).getCorrectans(),position);
    }

    @Override
    public int getItemCount() {
        return saveditems.size();
    }

    class viewholder extends RecyclerView.ViewHolder
    {
        private TextView qs,ans;
        private ImageButton del;

        public viewholder(@NonNull View itemView)
        {
            super(itemView);

            qs=itemView.findViewById(R.id.qstext);
            ans=itemView.findViewById(R.id.anstext);
            del=itemView.findViewById(R.id.deleteicon);

        }
        private void setvalues(String qs, String ans, final int position)
        {
            this.qs.setText(qs);
            this.ans.setText(ans);
            del.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View v) {
                    saveditems.remove(position);
                    notifyItemRemoved(position);
                }
            });
        }
    }

}
