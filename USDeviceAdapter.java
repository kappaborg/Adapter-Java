package Adapter;

class USDeviceAdapter implements UniversalPowerAdapter{
    private USDevice usDevice;
    public USDeviceAdapter(USDevice usDevice){
        this.usDevice = usDevice;
    }
    public void plug(){
        usDevice.plugInUs();
    }
}