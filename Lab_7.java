import java.sql.SQLOutput;
import java.util.*;

class ageException extends Exception{
    ageException(String text){
        super(text);
    }
}

class Father {
    int ageF;
    Father (int x) throws ageException{
        if (x<0){
            throw new ageException("Father Age Invalid (less than 0)");
        }
        this.ageF=x;
    }
}

class Son extends Father{
    int ageS;
    Son (int x, int y) throws ageException{
        super(x);
        if (y<0){
            throw new ageException("Son Age Invalid (less than 0)");
        }
        this.ageS=y;
        if (ageS>ageF){
            try {
                throw new ageException("Son's Age greater than Father's age");
            }
            catch(ageException e){
                System.out.println("Son > Father\n"+e);
            }
        }
    }
}

public class Lab_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
            try {
                System.out.print("Enter Father Age: ");
                a = sc.nextInt();
                System.out.print("Enter Son Age: ");
                b = sc.nextInt();
                Son obj = new Son(a, b);
            }
             catch (ageException e) {
                 System.out.println("Exception Occured : "+e);
            }
            finally {
                System.out.println("Finally Main Ended");
            }
    }
}
