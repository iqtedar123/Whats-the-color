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
import android.widget.Toast;
import android.widget.ToggleButton;

public class FragmentFour extends Fragment {
 
      ImageView ivIcon;
      TextView tvItemName;
      static Button sc,bc,gc,rc,pc,ppc,tc,blc;
      static View view;
      public static final String IMAGE_RESOURCE_ID = "iconResourceID";
      public static final String ITEM_NAME = "itemName";
      static int vi=Color.rgb(96, 125, 139);
      static int vi1,vi3,vi2;
      public FragmentFour() {
 
      }
 
      @Override
      public View onCreateView(LayoutInflater inflater, ViewGroup container,
                  Bundle savedInstanceState) {
 
            view = inflater.inflate(R.layout.fragment_layout_four, container,
                        false);
            sc=(Button)view.findViewById(R.id.button1);
            gc=(Button)view.findViewById(R.id.button3);
            bc=(Button)view.findViewById(R.id.button2);
            rc=(Button)view.findViewById(R.id.button4);
            pc=(Button)view.findViewById(R.id.button5);
            ppc=(Button)view.findViewById(R.id.button6);
            tc=(Button)view.findViewById(R.id.button7);
            blc=(Button)view.findViewById(R.id.button8);
            setupScBtn();
            setupGcBtn();
            setupBcBtn();
            setupRcBtn();
            setupPcBtn();
            setupPPcBtn();
            setupTcBtn();
            setupBLcBtn();
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
      private void setupGcBtn() {
		// TODO Auto-generated method stub
  		View.OnClickListener gclistener=new View.OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				 vi1=Color.rgb(37,155,36);
				 FragmentTwo.editor.putInt("key_name", vi1);//Frag2
				 FragmentTwo.editor.putInt("my_key", vi1);//FRAG5
				 FragmentTwo.editor.putInt("key_name2", vi1);//FRAG3
				 FragmentTwo.editor.putInt("my_key3", vi1);//frag6
				 FragmentTwo.editor.putInt("my_key4", vi1);//frag1
				 FragmentTwo.editor.putInt("my_key5",vi1);//frag4
				 vi3=Color.rgb(66,189,65);
				 FragmentTwo.editor.putInt("key_name1", vi3);//drawer
				 FragmentTwo.editor.commit();
				 vi2=FragmentTwo.pref.getInt("my_key5", vi);
				 view.setBackgroundColor(vi2);
				 //DrawerItem.view.setBackgroundResource(R.id.action_bar_title);
				 Toast.makeText(view.getContext(), "Green Theme Set.",
						   Toast.LENGTH_SHORT).show();
			}
    		  
    	  };
    	  gc.setOnClickListener(gclistener);
	}

	private void setupBcBtn() {
		// TODO Auto-generated method stub
  		View.OnClickListener bclistener=new View.OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				 vi1=Color.rgb(33,33,33);
				 FragmentTwo.editor.putInt("key_name", vi1);//Frag2
				 FragmentTwo.editor.putInt("my_key", vi1);//FRAG5
				 FragmentTwo.editor.putInt("key_name2", vi1);//FRAG3
				 FragmentTwo.editor.putInt("my_key3", vi1);//frag6
				 FragmentTwo.editor.putInt("my_key4", vi1);//frag1
				 FragmentTwo.editor.putInt("my_key5",vi1);//frag4
				 vi3=Color.rgb(66,66,66);
				 FragmentTwo.editor.putInt("key_name1", vi3);//drawer
				 FragmentTwo.editor.commit();
				 vi2=FragmentTwo.pref.getInt("my_key5", vi);
				 view.setBackgroundColor(vi2);
				 Toast.makeText(view.getContext(), "Black Theme Set.",
						   Toast.LENGTH_SHORT).show();
			}
    		  
    	  };
    	  bc.setOnClickListener(bclistener);
	}
	private void setupPcBtn() {
		// TODO Auto-generated method stub
  		View.OnClickListener pclistener=new View.OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				 vi1=Color.rgb(233, 30, 99);
				 FragmentTwo.editor.putInt("key_name", vi1);//Frag2
				 FragmentTwo.editor.putInt("my_key", vi1);//FRAG5
				 FragmentTwo.editor.putInt("key_name2", vi1);//FRAG3
				 FragmentTwo.editor.putInt("my_key3", vi1);//frag6
				 FragmentTwo.editor.putInt("my_key4", vi1);//frag1
				 FragmentTwo.editor.putInt("my_key5",vi1);//frag4
				 vi3=Color.rgb(240, 98, 146);
				 FragmentTwo.editor.putInt("key_name1", vi3);//drawer
				 FragmentTwo.editor.commit();
				 vi2=FragmentTwo.pref.getInt("my_key5", vi);
				 view.setBackgroundColor(vi2);
				 Toast.makeText(view.getContext(), "Pink Theme Set.",
						   Toast.LENGTH_SHORT).show();
			}
    		  
    	  };
    	  pc.setOnClickListener(pclistener);
	}
	private void setupPPcBtn() {
		// TODO Auto-generated method stub
  		View.OnClickListener ppclistener=new View.OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				 vi1=Color.rgb(74, 20, 140);
				 FragmentTwo.editor.putInt("key_name", vi1);//Frag2
				 FragmentTwo.editor.putInt("my_key", vi1);//FRAG5
				 FragmentTwo.editor.putInt("key_name2", vi1);//FRAG3
				 FragmentTwo.editor.putInt("my_key3", vi1);//frag6
				 FragmentTwo.editor.putInt("my_key4", vi1);//frag1
				 FragmentTwo.editor.putInt("my_key5",vi1);//frag4
				 vi3=Color.rgb(186, 104, 200);
				 FragmentTwo.editor.putInt("key_name1", vi3);//drawer
				 FragmentTwo.editor.commit();
				 vi2=FragmentTwo.pref.getInt("my_key5", vi);
				 view.setBackgroundColor(vi2);
				 Toast.makeText(view.getContext(), "Purple Theme Set.",
						   Toast.LENGTH_SHORT).show();
			}
    		  
    	  };
    	  ppc.setOnClickListener(ppclistener);
	}
	private void setupTcBtn() {
		// TODO Auto-generated method stub
  		View.OnClickListener tclistener=new View.OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				 vi1=Color.rgb(0, 150, 136);
				 FragmentTwo.editor.putInt("key_name", vi1);//Frag2
				 FragmentTwo.editor.putInt("my_key", vi1);//FRAG5
				 FragmentTwo.editor.putInt("key_name2", vi1);//FRAG3
				 FragmentTwo.editor.putInt("my_key3", vi1);//frag6
				 FragmentTwo.editor.putInt("my_key4", vi1);//frag1
				 FragmentTwo.editor.putInt("my_key5",vi1);//frag4
				 vi3=Color.rgb(128, 203, 196);
				 FragmentTwo.editor.putInt("key_name1", vi3);//drawer
				 FragmentTwo.editor.commit();
				 vi2=FragmentTwo.pref.getInt("my_key5", vi);
				 view.setBackgroundColor(vi2);
				 Toast.makeText(view.getContext(), "Teal Theme Set.",
						   Toast.LENGTH_SHORT).show();
			}
    		  
    	  };
    	  tc.setOnClickListener(tclistener);
	}
	private void setupBLcBtn() {
		// TODO Auto-generated method stub
  		View.OnClickListener blclistener=new View.OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				 vi1=Color.rgb(86, 119, 252);
				 FragmentTwo.editor.putInt("key_name", vi1);//Frag2
				 FragmentTwo.editor.putInt("my_key", vi1);//FRAG5
				 FragmentTwo.editor.putInt("key_name2", vi1);//FRAG3
				 FragmentTwo.editor.putInt("my_key3", vi1);//frag6
				 FragmentTwo.editor.putInt("my_key4", vi1);//frag1
				 FragmentTwo.editor.putInt("my_key5",vi1);//frag4
				 vi3=Color.rgb(145, 167, 255);
				 FragmentTwo.editor.putInt("key_name1", vi3);//drawer
				 FragmentTwo.editor.commit();
				 vi2=FragmentTwo.pref.getInt("my_key5", vi);
				 view.setBackgroundColor(vi2);
				 Toast.makeText(view.getContext(), "Blue Theme Set.",
						   Toast.LENGTH_SHORT).show();
			}
    		  
    	  };
    	  blc.setOnClickListener(blclistener);
	}
	private void setupRcBtn() {
		// TODO Auto-generated method stub
  		View.OnClickListener rclistener=new View.OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				 vi1=Color.rgb(229, 28, 35);
				 FragmentTwo.editor.putInt("key_name", vi1);//Frag2
				 FragmentTwo.editor.putInt("my_key", vi1);//FRAG5
				 FragmentTwo.editor.putInt("key_name2", vi1);//FRAG3
				 FragmentTwo.editor.putInt("my_key3", vi1);//frag6
				 FragmentTwo.editor.putInt("my_key4", vi1);//frag1
				 FragmentTwo.editor.putInt("my_key5",vi1);//frag4
				 vi3=Color.rgb(243, 108, 96);
				 FragmentTwo.editor.putInt("key_name1", vi3);//drawer
				 FragmentTwo.editor.commit();
				 vi2=FragmentTwo.pref.getInt("my_key5", vi);
				 view.setBackgroundColor(vi2);
				 Toast.makeText(view.getContext(), "Red Theme Set.",
						   Toast.LENGTH_SHORT).show();
			}
    		  
    	  };
    	  rc.setOnClickListener(rclistener);
	}
	private void setupScBtn() {
		// TODO Auto-generated method stub
		View.OnClickListener sclistener=new View.OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				 vi1=Color.rgb(255,87,34);
				 FragmentTwo.editor.putInt("key_name", vi1);//Frag2
				 FragmentTwo.editor.putInt("my_key", vi1);//FRAG5
				 FragmentTwo.editor.putInt("key_name2", vi1);//FRAG3
				 FragmentTwo.editor.putInt("my_key3", vi1);//frag6
				 FragmentTwo.editor.putInt("my_key4", vi1);//frag1
				 FragmentTwo.editor.putInt("my_key5",vi1);//frag4
				 vi3=Color.rgb(255, 152, 0);
				 FragmentTwo.editor.putInt("key_name1", vi3);//drawer
				 FragmentTwo.editor.commit();
				 vi2=FragmentTwo.pref.getInt("my_key5", vi);
				 view.setBackgroundColor(vi2);
				 Toast.makeText(view.getContext(), "Orange Theme Set.",
						   Toast.LENGTH_SHORT).show();
			}
    		  
    	  };
    	  sc.setOnClickListener(sclistener);
	}
 
}