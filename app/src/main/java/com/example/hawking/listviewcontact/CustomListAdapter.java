package com.example.hawking.listviewcontact;

/**
 * Created by hawking on 07/02/2017.
 */

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Administrator on 02/07/2017.
 */

public class CustomListAdapter extends BaseAdapter {
    private List<Contact> listContact;
    private LayoutInflater layoutInflater;
    private Context context;
    public CustomListAdapter(Context aContext,List<Contact> listContact){
        this.context = aContext;
        this.listContact = listContact;
        this.layoutInflater = LayoutInflater.from(aContext);
    }
    @Override
    public int getCount() {
        return listContact.size();
    }

    @Override
    public Object getItem(int position) {
        return listContact.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            convertView = layoutInflater.inflate(R.layout.list_item_layout, null);
            holder = new ViewHolder();
            holder.avatar = (ImageView) convertView.findViewById(R.id.imageView);
            holder.nameView = (TextView) convertView.findViewById(R.id.txtName);
            holder.numberView = (TextView) convertView.findViewById(R.id.txtNumber);
            holder.callButton = (ImageButton) convertView.findViewById(R.id.btnCall);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        Contact con = this.listContact.get(position);
        holder.nameView.setText(con.getName());
        holder.numberView.setText(con.getNumber());
        holder.avatar.setImageResource(con.getSrcAvt());

        return convertView;
    }
    static class ViewHolder{
        ImageView avatar;
        TextView nameView;
        TextView numberView;
        ImageButton callButton;
    }
}