package com.example.android.miwok;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class WordAdapter extends ArrayAdapter<Word> {

    public WordAdapter(@NonNull Context context, @NonNull ArrayList<Word> objects) {
        super(context, 0, objects);
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


        enLan.setText(currentWord.getEnglishWord());
        miLan.setText(currentWord.getMiWokWord());

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
