package com.techseven.uoftgpa;
 
import java.util.ArrayList;

import android.app.Fragment;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
 
public class FragmentTwo extends Fragment {
 
      ImageView ivIcon;
      TextView tvItemName;
      static EditText m1,m2,m3,m4,m5;
      static TextView out;
      static Button go1,cr1;
      static View view;
      static String mark_string;
      static double total;
      static int vi=Color.rgb(96, 125, 139);
      static Editor editor;
      static SharedPreferences pref;
      static double mark_num,list_item=0.0;
      public static final String IMAGE_RESOURCE_ID = "iconResourceID";
      public static final String ITEM_NAME = "itemName";
      private final static String APP_TITLE = "YOUR-APP-NAME";
      private final static String APP_PNAME = "YOUR-PACKAGE-NAME";
      
      private final static int DAYS_UNTIL_PROMPT = 1;
      private final static int LAUNCHES_UNTIL_PROMPT = 1;
      public FragmentTwo()
      {
 
      }
 
      @Override
      public View onCreateView(LayoutInflater inflater, ViewGroup container,
                  Bundle savedInstanceState) {
 
            view=inflater.inflate(R.layout.fragment_layout_two,container, false);
            m1=(EditText)view.findViewById(R.id.editText1);
            m2=(EditText)view.findViewById(R.id.editText2);
            m3=(EditText)view.findViewById(R.id.editText3);
            m4=(EditText)view.findViewById(R.id.editText4);
            m5=(EditText)view.findViewById(R.id.editText5);
            go1=(Button)view.findViewById(R.id.button1);
            cr1=(Button)view.findViewById(R.id.button2);
            out=(TextView)view.findViewById(R.id.textView7);
            setupGoBtn();
            setupClearBtn();
            
            super.onSaveInstanceState(savedInstanceState);
            pref = view.getContext().getSharedPreferences("MyPref5", 0);
            editor = pref.edit();
            
            if(savedInstanceState!=null){
            	//view.setBackgroundColor(Color.RED);
            }
            else{
            	int vi1=pref.getInt("key_name", vi);
            	view.setBackgroundColor(vi1);
            }
            return view;
            
      }



      private void setupClearBtn() {
		// TODO Auto-generated method stub
    	  View.OnClickListener cllistener=new View.OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				m1.setText("");
				m2.setText("");
				m3.setText("");
				m4.setText("");
				m5.setText("");
				out.setText("");
				
			}
    		  
    	  };
    	  cr1.setOnClickListener(cllistener);
	}

	private void setupGoBtn() {
		// TODO Auto-generated method stub
    	  View.OnClickListener golistener=new View.OnClickListener(){
    		  public void onClick(View view){
    	    	  list_item=0.0;
    	    	  total=0;
    	    	  String[] marks = new String[5];
    	    	  ArrayList<Double> marks_input=new ArrayList<Double>();
    	    	  ArrayList<Double>  gpa_lst=new ArrayList<Double>();	
    	    	  
    	    	  if(m1.getText().length()!=0){
    	    		  marks[0]=m1.getText().toString();
    	    	  }
    	    	  else{
    	    		  marks[0]="";
    	    	  }
    	    	  if(m2.getText().length()!=0){
    	    		  marks[1]=m2.getText().toString();
    	    	  }
    	    	  else{
    	    		  marks[1]="";
    	    	  }
    	    	  if(m3.getText().length()!=0){
    	    		  marks[2]=m3.getText().toString();
    	    	  }
    	    	  else{
    	    		  marks[2]="";
    	    	  }
    	    	  if(m4.getText().length()!=0){
    	    		  marks[3]=m4.getText().toString();
    	    	  }
    	    	  else{
    	    		  marks[3]="";
    	    	  }
    	    	  if(m5.getText().length()!=0){
    	    		  marks[4]=m5.getText().toString();
    	    	  }
    	    	  else{
    	    		  marks[4]="";
    	    	  }
    	    	  
    	    	  
    	    	// keep only valid marks and weights
    			for(int i = 0; i<5; i++) {
    				mark_string = marks[i];
    				if (mark_string.length() != 0) {
    				//convert strings to doubles
    					mark_num=Double.valueOf(mark_string);
    					//add to lists
    					marks_input.add(mark_num);
    				}
    			};
    			
    			//loop through each mark and change it to correct gpa 
    			///then add to a list called gpa_lst
    			for (int p=0; p<marks_input.size(); p=p+1){
    				list_item = marks_input.get(p);
    				if (list_item<=100 & list_item>=85 ){
    					list_item=4.0;
    				}else if (list_item>80) {
    					list_item=3.7;
    				}else if (list_item>=77 & list_item<=79){
    					list_item=3.3;
    				}else if (list_item>=73 & list_item<=76){
    					list_item=3.0;
    				}else if (list_item>=70 & list_item<=72){
    					list_item=2.7;
    				}else if (list_item>=67 & list_item<=69){
    					list_item=2.3;
    				}else if (list_item>=63 & list_item<=66){
    					list_item=2.0;
    				}else if (list_item>=60 & list_item<=62){
    					list_item=1.7;
    				}else if (list_item>=57 & list_item<=59){
    					list_item=1.3;
    				}else if (list_item>=53 & list_item<=56){
    					list_item=1.0;
    				}else if (list_item>=50 & list_item<=52){
    					list_item=0.7;
    				}else{
    					list_item=0.0;
    				}
    				gpa_lst.add(list_item);
    			};
    			
    			//get sum of all gpa's
    			for (int sum1=0;sum1<gpa_lst.size();sum1+=1){
    				
    				total=total+ gpa_lst.get(sum1);
    			};
    			int totalpoint=gpa_lst.size();
    			double totalmark=total/totalpoint;
    			String totalstring=Double.toString(totalmark);
    			out.setText(totalstring);
    	      }


    	 
    	  };
    	  go1.setOnClickListener(golistener);
	}

	
}