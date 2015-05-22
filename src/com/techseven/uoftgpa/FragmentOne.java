package com.techseven.uoftgpa;
 
import com.techseven.uoftgpa.R;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
 
public class FragmentOne extends Fragment {
 
      ImageView ivIcon;
      TextView tvItemName;
      static View view;
      public static final String IMAGE_RESOURCE_ID = "iconResourceID";
      public static final String ITEM_NAME = "itemName";
 
      public FragmentOne() {
 
      }
 
      @Override
      public View onCreateView(LayoutInflater inflater, ViewGroup container,
                  Bundle savedInstanceState) {
 
            view = inflater.inflate(R.layout.fragment_layout_one, container,
                        false);
            super.onCreate(savedInstanceState);
            if(savedInstanceState!=null){
            	//view.setBackgroundColor(Color.RED);
            }
            else{
            	int vi1=FragmentTwo.pref.getInt("key_name", FragmentTwo.vi);
            	view.setBackgroundColor(vi1);
            }

            return view;
      }
 
}