import java.util.*;

class ownException extends Exception{
    ownException (String s){
        super(s);
    }
}
class StudentPractice {
    String name, usn;
    int sem;
    StudentPractice(String s, String n, int sem){
        this.name=s;
        this.usn=n;
        this.sem=sem;
    }
    void percentage(double per) throws ownException{
        try{
            if (per>=80 && per<100)
                System.out.println("Distinction");
            else if (per>=60 && per<80) {
                System.out.println("First Class");
            }
            else{
                throw new ownException("Needs to improve");
            }
        }
        catch (ownException e){
            System.out.println("Caught in Percentage: "+e);
//            throw e;
        }
        finally {
            System.out.println("percentage block completed");
        }
    }
}

public class Practice_CIE22 {
    public static void main(String[] args) {
        StudentPractice sp1 = new StudentPractice("Ria", "iugrw", 3);
        double a = 55.0;
        try {
            sp1.percentage(a);
        } catch (ownException e) {
            System.out.println("Caught in main function " + e);
        }
    }
}
