package com.moringaschool.mycookbook;

import android.content.Context;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

public class CookbookArrayAdapter extends ArrayAdapter {
    private Context mContext;
    private ArrayList <String> mFoods;

    public CookbookArrayAdapter(Context mContext, int resource, ArrayList<String> mFoods){
        super(mContext, resource);
        this.mContext = mContext;
        this.mFoods = mFoods;
    }

    @Override
    public Object getItem(int position) {
        String foods = mFoods.get(position);
        return String.format(foods);
    }

    @Override
    public int getCount() {
        return mFoods.size();
    }
}
