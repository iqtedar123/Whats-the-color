package com.techseven.uoftgpa;
 
import android.app.Fragment;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
 
public class FragmentFive extends Fragment {
	
      ImageView ivIcon;
      TextView tvItemName;
      static View view;
      public static final String IMAGE_RESOURCE_ID = "iconResourceID";
      public static final String ITEM_NAME = "itemName";
 
      public FragmentFive() {
 
      }
 
      @Override
      public View onCreateView(LayoutInflater inflater, ViewGroup container,
                  Bundle savedInstanceState) {
 
            view = inflater.inflate(R.layout.fragment_layout_five, container,
                        false);
 
            super.onSaveInstanceState(savedInstanceState);
            if(savedInstanceState!=null){
            	//view.setBackgroundColor(Color.RED);
            }
            else{
            	int vi1=FragmentTwo.pref.getInt("my_key", FragmentTwo.vi);
            	view.setBackgroundColor(vi1);
            }
            return view;
      }
 
}