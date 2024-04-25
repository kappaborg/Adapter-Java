package Adapter;


class UKDeviceAdapter implements UniversalPowerAdapter{
    private UKDevice ukDevice;
    public UKDeviceAdapter(UKDevice ukDevice){
        this.ukDevice = ukDevice;
    }
    public void plug(){
        ukDevice.plugInUk();
    }
}