package com.example.custom_adapter_practice;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class myAdaptercodes extends BaseAdapter {

    private final Activity context;
    private final String[]news_headline;
    private final String[]news_Description;
    private final Integer[]NewsImageId;

    public myAdaptercodes(Activity context, String[] news_headline, String[] news_Description, Integer[] newsImageId) {
        this.context = context;
        this.news_headline = news_headline;
        this.news_Description = news_Description;
        NewsImageId = newsImageId;
    }


    @Override
    public int getCount() {
        return news_headline.length;
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
    public View getView(int position, View convertView, ViewGroup parent) {


        LayoutInflater new_layoutinflater = context.getLayoutInflater();

        View rowview=new_layoutinflater.inflate(R.layout.custom_layout,null,true);

        TextView news_title = (TextView) rowview.findViewById(R.id.news_head);
        ImageView news_image = (ImageView) rowview.findViewById(R.id.news_image);
        TextView news_des=(TextView) rowview.findViewById(R.id.news_description);


        news_title.setText(news_headline[position]);
        news_image.setImageResource(NewsImageId[position]);
        news_des.setText(news_Description[position]);

        return rowview;
    }
}
