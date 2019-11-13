package com.example.quizapp;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class question_custom_adapter extends BaseAdapter
{
    private int totalsets;

    public question_custom_adapter(int totalsets) {
        this.totalsets = totalsets;

    }

    @Override
    public int getCount() {
        return totalsets;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, final ViewGroup parent)
    {
            View view;
            if(convertView==null)
            {
                view= LayoutInflater.from(parent.getContext()).inflate(R.layout.question_set,parent,false);
            }
            else
            {
                view=convertView;
            }
            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i=new Intent(parent.getContext(),Test.class);
                    parent.getContext().startActivity(i);
                }
            });
        ((TextView)view.findViewById(R.id.questiontextviewid)).setText(String.valueOf(position+1));

            return view;
    }
}
