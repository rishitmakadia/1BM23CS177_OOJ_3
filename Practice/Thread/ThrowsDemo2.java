package Practice.Thread;

class ThrowsDemo2{

    //static void throwOne()  throws NullPointerException {
    static void throwOne()  throws ArithmeticException {
        System.out.println("Inside throwOne.");
        throw new ArithmeticException("demo");
    }

    public static void main(String args[]) {

        try{

            throwOne();
        }

        catch ( ArithmeticException e) {
            System.out.println("Caught " + e);
        }
        System.out.println("Main program Resumes");

    }//end of main

}// end of class
