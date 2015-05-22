package com.techseven.uoftgpa;
 
import android.app.Fragment;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.techseven.uoftgpa.R;
 
public class FragmentSix extends Fragment {
 
      ImageView ivIcon;
      TextView tvItemName;
      static View view;
      public static final String IMAGE_RESOURCE_ID = "iconResourceID";
      public static final String ITEM_NAME = "itemName";
      static Button b1,b2,b3;
      public FragmentSix() {
 
      }
 
      @Override
      public View onCreateView(LayoutInflater inflater, ViewGroup container,
                  Bundle savedInstanceState) {
 
            view = inflater.inflate(R.layout.fragment_layout_six, container,
                        false);
            b1=(Button)view.findViewById(R.id.button1);
            b2=(Button)view.findViewById(R.id.button2);
            b3=(Button)view.findViewById(R.id.button3);
            setupB1();
            setupB2();
            setupB3();
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

  	private void setupB2() {
		// TODO Auto-generated method stub
		 View.OnClickListener b2listener=new View.OnClickListener(){

				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/TechMeister786"));
					startActivity(browserIntent);
					
				}
	    		  
	    	  };
	    	  b2.setOnClickListener(b2listener);
	}

	private void setupB3() {
		// TODO Auto-generated method stub
		View.OnClickListener b3listener=new View.OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/channel/UC4uxWP2WIvdEIDCKAb6Ydag"));
				startActivity(browserIntent);
			}
    		  
    	  };
    	  b3.setOnClickListener(b3listener);
	}



	private void setupB1() {
		// TODO Auto-generated method stub
		 View.OnClickListener b1listener=new View.OnClickListener(){

				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/TechMeister786"));
					startActivity(browserIntent);
					
				}
	    		  
	    	  };
	    	  b1.setOnClickListener(b1listener);
	}
 
}