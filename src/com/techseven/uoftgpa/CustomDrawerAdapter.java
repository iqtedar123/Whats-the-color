package com.techseven.uoftgpa;
 
import java.util.List;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.techseven.uoftgpa.R;
import com.techseven.uoftgpa.DrawerItem;
 
public class CustomDrawerAdapter extends ArrayAdapter<DrawerItem> {
 
      Context context;
      List<DrawerItem> drawerItemList;
      int layoutResID;
      static View view;
      public CustomDrawerAdapter(Context context, int layoutResourceID,
                  List<DrawerItem> listItems) {
            super(context, layoutResourceID, listItems);
            this.context = context;
            this.drawerItemList = listItems;
            this.layoutResID = layoutResourceID;
 
      }
 
      @Override
      public View getView(int position, View convertView, ViewGroup parent) {
            // TODO Auto-generated method stub
    	  	
            DrawerItemHolder drawerHolder;
            view = convertView;
 
            if (view == null) {
                  LayoutInflater inflater = ((Activity) context).getLayoutInflater();
                  drawerHolder = new DrawerItemHolder();
 
                  view = inflater.inflate(layoutResID, parent, false);
                  drawerHolder.ItemName = (TextView) view
                              .findViewById(R.id.drawer_itemName);
                  drawerHolder.icon = (ImageView) view.findViewById(R.id.drawer_icon);
 
                  view.setTag(drawerHolder);
 
            } else {
                  drawerHolder = (DrawerItemHolder) view.getTag();
 
            }
 
            DrawerItem dItem = (DrawerItem) this.drawerItemList.get(position);
 
            drawerHolder.icon.setImageDrawable(view.getResources().getDrawable(
                        dItem.getImgResID()));
            drawerHolder.ItemName.setText(dItem.getItemName());

            int vi1=FragmentTwo.pref.getInt("key_name1", FragmentTwo.vi);
            view.setBackgroundColor(vi1);
            return view;
      }
 
      private static class DrawerItemHolder {
            TextView ItemName;
            ImageView icon;
      }
}