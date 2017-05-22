package com.example.android.miwok;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;


public class WordAdapter extends ArrayAdapter<Word> {
    private int mBackGroundColor;

    public WordAdapter(@NonNull Context context, @NonNull ArrayList<Word> objects, int backGroundColor) {
        super(context, 0, objects);
        mBackGroundColor = backGroundColor;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;

        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        Word currentWord = getItem(position);

        TextView enLan = (TextView) listItemView.findViewById(R.id.enLan);
        TextView miLan = (TextView) listItemView.findViewById(R.id.miLan);
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.imageView);
        LinearLayout background = (LinearLayout) listItemView.findViewById(R.id.backGround);


        enLan.setText(currentWord.getEnglishWord());
        miLan.setText(currentWord.getMiWokWord());

        // Set the theme color for the list item
//        View textContainer = listItemView.findViewById(R.id.backGround);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mBackGroundColor);
        // Set the background color of the text container View
        background.setBackgroundColor(color);

        if(currentWord.hasImage()){
            imageView.setImageResource(currentWord.getImageResourceID());
            //just incase The view was invisible make sure turn it back on
            imageView.setVisibility(View.VISIBLE);
        }else{
            //int: One of VISIBLE, INVISIBLE, or GONE.
            imageView.setVisibility(View.GONE);
        }

        return listItemView;
    }
}
