package com.example.ahmedsaleh.dbse_schools;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Ahmed Saleh on 4/23/2017.
 * Custom Class for convert data into grid view items
 */
public class Grid_View_Adapter extends BaseAdapter{
    private ArrayList<Grid_View_Item> data;
    private Context ctx;

    /**
     * Initialize the adapter
     * @param ctx Application Context
     * @param data ArrayList represent the data i.e names of the Governorates
     */
    public Grid_View_Adapter(Context ctx,ArrayList<Grid_View_Item>data)
    {
        this.ctx=ctx; this.data=data;
    }

    @Override
    public int getCount() {
      return data.size();
    }

    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Grid_View_Item item=data.get(position);
        if(convertView==null)
        {
            LayoutInflater layoutInflater=(LayoutInflater)this.ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView=layoutInflater.inflate(R.layout.grid_view_item,null);
        }
        TextView textView=(TextView)convertView.findViewById(R.id.grid_view_text_view);
        textView.setText(item.getmName());
        textView.setTypeface(null, Typeface.BOLD);
        return convertView;
    }

    /**
     * Function to change adapter data
     * @param ctx Application context
     * @param data new data
     */
    public void setAdapter(Context ctx,ArrayList<Grid_View_Item>data)
    {
        this.ctx=ctx; this.data=data;
        //notifyDataSetChanged();
    }
}
