package Practice.Thread;

class Nesttry {
    public static void main(String args[]) {
        try {
            int a = args.length;
            // If no command-line args are present, this generates a divide-by-zero exception.
            int b = 42 / a;
            System.out.println("a = " + a);
            try { // Nested try block
                // If one command-line arg is used, this generates a divide-by-zero exception.
                if (a == 1) a = a / (a - a);
                // If two command-line args are used, this generates an out-of-bounds exception.
                if (a == 2) {
                    int c[] = {1};
                    c[42] = 99; // Out-of-bounds access
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Array index out-of-bounds: " + e);
            }
        } catch (ArithmeticException e) {
            System.out.println("Divide by 0: " + e);
        }
        System.out.println("After Nested Try-Catch block, this statement will be executed.");
    }
}

