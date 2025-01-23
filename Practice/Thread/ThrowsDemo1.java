package Practice.Thread;

class ThrowsDemo1{

    static void throwOne()  throws IllegalAccessException {
        //static void throwOne()  throws   ArrayIndexOutOfBoundsException {
        System.out.println("Inside throwOne.Method is not handling the exception");
        throw new IllegalAccessException("demo");
        // throw new ArrayIndexOutOfBoundsException("demo1");
    }

    public static void main(String args[]) {

        try{

            throwOne();
        }

        catch ( IllegalAccessException e) {
            System.out.println("Caught " + e);
        }
        System.out.println("Main program Resumes");

    }//end of main

}// end of class