package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomKobiAdapter extends BaseAdapter {
    Context mContext;
    String[] kobiName;
    String[] kobiDob;
    int[] kobiImage;

    public CustomKobiAdapter(Context mContext, String[] kobiName, String[] kobiDob, int[] kobiImage) {
        this.mContext = mContext;
        this.kobiName = kobiName;
        this.kobiDob = kobiDob;
        this.kobiImage = kobiImage;
    }

    @Override
    public int getCount() {
        return 2;
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
        if(convertView == null){
            convertView = LayoutInflater.from(mContext).inflate(R.layout.item_kobi_list, parent,false);
        }
        TextView txtKobiName = convertView.findViewById(R.id.txt_kobi_name);
        TextView txtKObiDob = convertView.findViewById(R.id.txt_kobi_dob);
        ImageView imgPhoto = convertView.findViewById(R.id.img_kobi_image);

        txtKobiName.setText(kobiName[position]);
        txtKObiDob.setText(kobiDob[position]);
        imgPhoto.setImageResource(kobiImage[position]);

        return convertView;
    }
}
