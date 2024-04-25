package Adapter;
 

interface FuelPumpAdapter{
    void plug();
    }
    class FuelDevice{
        void plugInFuel(){
            System.out.println("Electric Plugged");
        }
    }
    class GasDevice{
        void plugInGas(){
            System.out.println("Gas Plugged");
        }
    }
    class ElectricDevice{
        void plugInElectric(){
            System.out.println("Electric Plugged");
        }
    }
    class MotorinDevice{
        void plugInMotorin(){
            System.out.println("Motorin Plugged");
        }
    }

