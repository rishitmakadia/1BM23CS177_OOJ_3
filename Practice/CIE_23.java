// Exception Handling Demonstration

// User-defined exception
class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

public class CIE_23 {
    public static void main(String[] args) {
        // Demonstrating try-catch with multiple clauses and nested try
        try {
            System.out.println("Main try block started.");

            // Nested try block
            try {
                System.out.println("Nested try block started.");
                int division = 10 / 0; // Will cause ArithmeticException
                System.out.println("Result: " + division);
            } catch (ArithmeticException e) {
                System.out.println("Caught ArithmeticException: " + e.getMessage());
            }

            // Throwing a user-defined exception
            throw new CustomException("This is a user-defined exception.");

        } catch (CustomException e) {
            System.out.println("Caught CustomException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Caught General Exception: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed.");
        }

        // Demonstrating the use of throw and throws
        try {
            methodThatThrowsException();
        } catch (Exception e) {
            System.out.println("Caught Exception from method: " + e.getMessage());
        }
    }

    // Method that uses 'throws' to indicate a possible exception
    public static void methodThatThrowsException() throws CustomException {
        throw new CustomException("Exception thrown from method.");
    }
}
