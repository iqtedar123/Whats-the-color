package com.techseven.uoftgpa;
 
import android.app.Fragment;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class CalActivity extends Fragment {
 
      ImageView ivIcon;
      TextView tvItemName;
      static Button sc,bc,gc,rc,pc,ppc,tc,blc;
      static View view;
      public static final String IMAGE_RESOURCE_ID = "iconResourceID";
      public static final String ITEM_NAME = "itemName";
      static int vi=Color.rgb(96, 125, 139);
      static int vi1,vi3,vi2;
      public CalActivity() {
 
      }
 
      @Override
      public View onCreateView(LayoutInflater inflater, ViewGroup container,
                  Bundle savedInstanceState) {
 
            view = inflater.inflate(R.layout.fragment_cal_activity, container,
                        false);
            
            super.onSaveInstanceState(savedInstanceState);
           
            if(savedInstanceState!=null){
            	//view.setBackgroundColor(Color.RED);
            }
            else{
            	vi1=FragmentTwo.pref.getInt("my_key5", vi);
            	view.setBackgroundColor(vi1);
            }
            return view;
      }
      
 
}