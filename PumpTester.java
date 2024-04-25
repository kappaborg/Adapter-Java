package Adapter;

public class PumpTester {
  public static void main(String[] args) {
    FuelDevice fuelAdapter = new FuelDevice();
    GasDevice gasAdapter = new GasDevice(); 
    ElectricDevice electricAdapter = new ElectricDevice();
    MotorinDevice motorinAdapter = new MotorinDevice();
    
    FuelPumpAdapter fuelAdp = new FuelDeviceAdapter(fuelAdapter);
    FuelPumpAdapter motorinAdp = new MotorinDeviceAdapter(motorinAdapter);
    FuelPumpAdapter gasAdp = new GasDeviceAdapter(gasAdapter);
    FuelPumpAdapter electricAdp = new ElectricDeviceAdapter(electricAdapter); 
    electricAdp.plug();  
    motorinAdp.plug();
    fuelAdp.plug();
    gasAdp.plug();
  }
}
