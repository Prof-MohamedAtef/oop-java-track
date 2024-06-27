package abstraction.interfaces;

public class Machines implements CarListener, VehicleListener{

    @Override
    public String setPeep() {
        return CarListener.super.setPeep() + " + " + VehicleListener.super.setPeep();
    }
    
}
