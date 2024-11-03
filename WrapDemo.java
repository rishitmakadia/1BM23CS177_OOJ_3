import java.util.*;

public class WrapDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Integer Value: ");
        Integer iob1;
        iob1= in.nextInt();
        int i1=iob1;
        System.out.println("i = "+i1+"\niob = "+iob1);
        System.out.println(iob1.getClass().getName());
        System.out.println();
        Double dob1 = Double.valueOf(91.7);
        double d1 = dob1;
        System.out.println("d = "+d1+"\ndob = "+dob1);
        System.out.println(dob1.getClass().getName());
    }
}
