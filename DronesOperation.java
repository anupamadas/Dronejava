package Drones;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class DronesOperation {
	
	protected static String name;
	protected static String current_location;
	protected static String destination;
	protected static String parcel;
	protected static String status;
	protected static String parking_location;
	protected static String order_address;
	
	public DronesOperation(String name,String parking_slot,String status){
		       this.name = name;
		       this.current_location = parking_slot;
		       this.parking_location = parking_slot;
		       this.status = status;
			    System.out.println("Drone #{name} is ready"); 
		
	}
	
	
	  public void signal_after_reach(){
		 if(current_location ==destination){
		 System.out.println("reached destination");
		 }
	  }

	  public void unload_item(){
		 if (current_location != destination){
			 Warehouse.remove_parcel();
               System.out.println("Item has been delivered") ;
		    	 CommandCenter.unloaded_pacakge("Delivered");
		    park_in_command_center();
		 }
	  }
	 
	  public void park_in_command_center(){
	    this.current_location = parking_location;
	    CommandCenter.drone_current_status("Parked");
	    System.out.println("Drone is ready for another delivery");
	  }

  public void leave_for_delivery(String destination){
	  this.current_location = order_address;
      System.out.println("Drone is on the way") ;
       signal_after_reach();
       unload_item();
  }
  
  

  public void pick_up(String parcel){
	  DronesOperation.parcel = parcel;
	         DronesOperation.current_location = Parcel.location;
	         DronesOperation.destination = Parcel.destination;
	         System.out.println("Drone has picked parcel id:#{parcel.parcel_id}"); 
			    leave_for_delivery(destination);
  }
  


 

}
