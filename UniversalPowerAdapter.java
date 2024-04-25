package Adapter;

interface UniversalPowerAdapter{
    void plug();
}
class USDevice{
    void plugInUs(){
        System.out.println("Plugged into US power outlet");
    }
}
class UKDevice{
    void plugInUk(){
        System.out.println("Plugged into UK power outlet");
    }
}