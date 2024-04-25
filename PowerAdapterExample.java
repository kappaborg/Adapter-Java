package Adapter;
public class PowerAdapterExample{
    public static void main(String[] args){
        USDevice usDevice = new USDevice();
        UKDevice ukDevice = new UKDevice();
        UniversalPowerAdapter usAdapter = new USDeviceAdapter(usDevice);
        UniversalPowerAdapter ukAdapter = new UKDeviceAdapter(ukDevice);
        usAdapter.plug();
        ukAdapter.plug();
    }
}