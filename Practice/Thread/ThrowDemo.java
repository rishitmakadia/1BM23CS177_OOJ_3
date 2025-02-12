package Practice.Thread;

// Demonstrate throw.
class ThrowDemo {
    static void demoproc() {
        try {
            throw new NullPointerException("demo");
        }
//System.out.println("Hello");
        catch(NullPointerException e) {
            System.out.println("Caught inside demoproc");
            throw e; // rethrow the exception
        }
    }
    public static void main(String args[]) {
        try {
            demoproc();
        }
        catch(NullPointerException e) {
            System.out.println("Recaught: " + e);
        }
        System.out.println("After Exception Normal Program");
    }
}