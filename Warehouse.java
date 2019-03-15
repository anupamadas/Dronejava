package Drones;

import java.util.ArrayList;
import java.util.Arrays;


public class Warehouse {
 
	 public static long  parcels_stores;
	 public static ArrayList<String>   parcelList;

	
	 public static ArrayList<String> create_parcel_store(){
		String [] parcels_stores = null ;
		  ArrayList<String> parcelList = new ArrayList<>(Arrays.asList(parcels_stores));
		  return parcelList;
	}
	 public static void add_parcel(long parcel){
		 if(parcels_stores < parcel);
		 Warehouse.remove_parcel();
	parcelList = create_parcel_store();
	parcelList.clear();
	
	
	
	
}

	static void remove_parcel() {
		// TODO Auto-generated method stub
		
	}
}