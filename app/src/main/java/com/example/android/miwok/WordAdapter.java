package com.example.android.miwok;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.core.content.ContextCompat;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {
    private int colorId;

    public WordAdapter(Context context, ArrayList<Word> words, int colorId) {
        super(context, 0, words);
        this.colorId = colorId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItem = convertView;
        if (listItem == null) {
            listItem = LayoutInflater.from(getContext()).inflate(
                    R.layout.row_word, parent, false);
        }
        View container = listItem.findViewById(R.id.root_view);
        int color = ContextCompat.getColor(getContext(), colorId);
        container.setBackgroundColor(color);
        Word word = getItem(position);
        TextView miwokTextView = (TextView) listItem.findViewById(R.id.tv_miwok);
        miwokTextView.setText(word.getMiwokTranslation());
        TextView englishTextView = (TextView) listItem.findViewById(R.id.tv_english);
        englishTextView.setText(word.getDefaultTranslation());
        if (word.getImageResource() != 0) {
            ImageView iconImageView = (ImageView) listItem.findViewById(R.id.img_icon);
            iconImageView.setImageResource(word.getImageResource());
        } else {
            ImageView iconImageView = (ImageView) listItem.findViewById(R.id.img_icon);
            iconImageView.setVisibility(View.GONE);
        }

        return listItem;
    }
}
