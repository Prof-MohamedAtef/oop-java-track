package onejuly;

public class ReleaseResourcesGC {
    public ReleaseResourcesGC() {
        System.out.println("Constructor: Object Created");
    }

    @Override
    protected void finalize() throws Throwable {
        try {
            System.out.println("Finalizer: Object is being garbage collected");
            // Perform cleanup operations here
        } finally {
            // super.finalize();
        }
    }

    public static void main(String[] args) {
        ReleaseResourcesGC rGc = new ReleaseResourcesGC();
        rGc = null;
        System.gc();

        // Adding a delay to ensure garbage collection happens before program exits
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}