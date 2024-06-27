package abstraction.interfaces;

public interface VehicleListener {
    default String setPeep(){
        return "Setting the Peep";
    }
}
