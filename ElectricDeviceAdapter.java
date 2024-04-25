package Adapter;

class ElectricDeviceAdapter implements FuelPumpAdapter {
    private ElectricDevice electricAdapter;
    public ElectricDeviceAdapter(ElectricDevice electricAdapter) {
        this.electricAdapter = electricAdapter;
    }
    @Override
    public void plug() {
        electricAdapter.plugInElectric();
    }
}
