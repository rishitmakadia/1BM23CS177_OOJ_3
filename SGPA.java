import java.util.*;

class Student{
    Scanner in = new Scanner(System.in);
    String name, usn;
    int sub, i;
    double sgpa=0, totalCredit=0;
    int[] aCredit, aMarks, aGrade;
    Student(){
        System.out.println("Enter NAME: ");
        name = in.next();
        System.out.println("Enter USN: ");
        usn = in.next();
        System.out.println("Enter No. of Subject: ");
        sub = in.nextInt();
        aCredit=new int[sub];
        aMarks=new int[sub];
        aGrade=new int[sub];
    }
    void enterMarks(){
        for(i=0 ; i<sub;i++) {
            System.out.println("Subject " + (i + 1) + " Marks");
            aMarks[i] = in.nextInt();
            System.out.println("Subject " + (i + 1) + " Credit");
            aCredit[i] = in.nextInt();
            if (aMarks[i]<=100 && aMarks[i]>90)
                aGrade[i]=10;
            else if (aMarks[i]<90 && aMarks[i]>=80)
                aGrade[i]=9;
            else if (aMarks[i]<80 && aMarks[i]>=70)
                aGrade[i]=8;
            else if (aMarks[i]<70 && aMarks[i]>=60)
                aGrade[i]=7;
            else if (aMarks[i]<60 && aMarks[i]>=50)
                aGrade[i]=6;
            else if (aMarks[i]<50 && aMarks[i]>=40)
                aGrade[i]=5;
            else if (aMarks[i]<40 && aMarks[i]>=0)
                aGrade[i]=0;
            else
                System.out.println("Enter correct marks");
        }
    }
    double result(){
        for (i=0; i<sub; i++){
            sgpa = sgpa + aCredit[i]*aGrade[i];
            totalCredit = totalCredit+aCredit[i];
        }
        return (sgpa/totalCredit);
    }
}

public class SGPA {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int noSt;
        System.out.println("Enter No. of Student: ");
        noSt = in.nextInt();
        Student[] st= new Student[noSt];
        for (int i=0; i<noSt;i++){
            System.out.println("Student "+(i+1)+" Details");
            st[i] = new Student();
            st[i].enterMarks();
            System.out.println(" ");
        }
        for (int i=0; i<noSt; i++){
            System.out.println("SGPA of "+st[i].name+" is "+st[i].result());
        }
    }
}
