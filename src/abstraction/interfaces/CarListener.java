package abstraction.interfaces;

public interface CarListener {
    default String setPeep(){
        return "Setting the Peep";
    }
}
