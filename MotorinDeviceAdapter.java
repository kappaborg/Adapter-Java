package Adapter;

class  MotorinDeviceAdapter implements FuelPumpAdapter
{
   private MotorinDevice motorinAdapter;
   public MotorinDeviceAdapter(MotorinDevice motorinAdapter){
       this.motorinAdapter = motorinAdapter;
    }
   public void plug(){
        motorinAdapter.plugInMotorin();
   }
}