package Adapter;
class FuelDeviceAdapter implements FuelPumpAdapter
{
   private FuelDevice fuelAdapter;
   public FuelDeviceAdapter(FuelDevice fuelAdapter){
       this.fuelAdapter = fuelAdapter;
   }
   public void plug(){
       fuelAdapter.plugInFuel();
   }
}
