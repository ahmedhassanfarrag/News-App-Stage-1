package com.example.android.newsapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class NewsAdapter extends ArrayAdapter<News> {
    public NewsAdapter(Activity context, ArrayList<News> news) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, news);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.news_list, parent, false);
        }

        // Get the Earthquake object located at this position in the list
        News currentNews = getItem(position);
        // Find the TextView with view ID sectionName
        TextView sectionName = (TextView)listItemView.findViewById(R.id.sectionName);
        sectionName.setText(currentNews.getmSectionName());

        TextView date = (TextView)listItemView.findViewById(R.id.date);
        date.setText(currentNews.getmTime());
        TextView time = (TextView)listItemView.findViewById(R.id.time);
        time.setText(currentNews.getmTime());



        // Find the TextView with view ID titleName.
        TextView titleName = (TextView)listItemView.findViewById(R.id.webTitle);
        titleName.setText(currentNews.getmTitile());

        // Find the TextView with view ID titleName.
        TextView PillarName = (TextView)listItemView.findViewById(R.id.pillarName);
        PillarName.setText(currentNews.getmPillarName());

        // Return the list item view that is now showing the appropriate data
        return listItemView;


    }

}
