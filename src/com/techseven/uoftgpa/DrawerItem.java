package com.techseven.uoftgpa;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
 
public class DrawerItem {
	
      String ItemName;
      int imgResID;
      static View view;

      public DrawerItem(String itemName, int imgResID) {
            super();
            ItemName = itemName;
            this.imgResID = imgResID;
      }
 
      public String getItemName() {
            return ItemName;
      }
      public void setItemName(String itemName) {
            ItemName = itemName;
      }
      public int getImgResID() {
            return imgResID;
      }
      public void setImgResID(int imgResID) {
            this.imgResID = imgResID;
      }
 
}