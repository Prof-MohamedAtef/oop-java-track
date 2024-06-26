package onejuly;

public class AutoCloseGc implements AutoCloseable {

    public AutoCloseGc(){
        System.out.println("Constructor: Object created");
    }

    @Override
    public void close() throws Exception {
        System.out.println("Close: Resources are being released");
    }


    public static void main(String[] args) throws Exception {
        AutoCloseGc autoCloseGc = new AutoCloseGc();
        autoCloseGc.close();
        
            // Use the object
         // The close method is called automatically here
    }
    
}
