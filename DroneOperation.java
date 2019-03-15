package Drones;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DroneOperation {
  
	long Parcel;
	long longitudesandlattitudes;

  public void start_delivery(){
  Warehouse.create_parcel_store();
  Warehouse.add_parcel(Parcel);
  CommandCenter.instruct_to_pick_parcel(Parcel, "gift",longitudesandlattitudes , "Parked" );
	}


@Test
public void droneOperation(){
	try{
	start_delivery();
System.out.println ("Drone had completed operation");
	}
catch (Exception e) {
	Assert.assertEquals("Drone reached","Drone not completed job"," Drone have some technical issue");
}

}
}