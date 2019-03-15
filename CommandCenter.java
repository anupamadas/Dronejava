package Drones;

import org.testng.annotations.Test;

public class CommandCenter {
	
	 public static String drone_status;
	 public static String parcel_status;
	 public static String parking_slot;

	public static void instruct_to_pick_parcel(Long parcel,String drone_name,long longitudesandlattitudes,String status){
	    if( status == "Parked"){
	    	DronesOperation DronesOperation = new DronesOperation(drone_name, parking_slot, status);
	    	DronesOperation.pick_up("Parcel");
		     drone_status = "Delivering";
		     parcel_status = "Out_for_Delivery";
	    }
	 }

	    public static void drone_current_status(String status){
	    drone_status = status;
	    }

	    public static void unloaded_pacakge(String status){
	    parcel_status = status;
	 }
	
 
}
