package com.techseven.uoftgpa;
 
import com.techseven.uoftgpa.R;

import android.R.color;
import android.app.Fragment;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
 
public class FragmentThree extends Fragment {
 
      ImageView ivIcon;
      TextView tvItemName;
      static View view;
      public static final String IMAGE_RESOURCE_ID = "iconResourceID";
      public static final String ITEM_NAME = "itemName";
      static Button d1;
      public FragmentThree() {
 
      }
 
      @Override
      public View onCreateView(LayoutInflater inflater, ViewGroup container,
                  Bundle savedInstanceState) {
 
            view = inflater.inflate(R.layout.fragment_layout_three, container,
                        false);
            d1=(Button)view.findViewById(R.id.button1);
            setupD1();
            super.onSaveInstanceState(savedInstanceState);
            if(savedInstanceState!=null){
            	//view.setBackgroundColor(Color.RED);
            }
            else{
            	int vi1=FragmentTwo.pref.getInt("key_name2", FragmentTwo.vi);
            	view.setBackgroundColor(vi1);
            }
            return view;
      }

	private void setupD1() {
		// TODO Auto-generated method stub
  	  View.OnClickListener dlistener=new View.OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.techseven.colors"));
				startActivity(browserIntent);
				
			}
  		  
  	  };
  	  d1.setOnClickListener(dlistener);
	}
 
}