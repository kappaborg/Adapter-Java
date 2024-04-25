package Adapter;

class GasDeviceAdapter implements FuelPumpAdapter {
    private GasDevice gasAdapter;
    public GasDeviceAdapter(GasDevice gasAdapter) {
        this.gasAdapter = gasAdapter;
    }
    @Override
    public void plug() {
        gasAdapter.plugInGas();
    }
}
