package Lab_6;

import Lab_6.CIE.*;
import Lab_6.SEE.*;

import java.util.*;

public class Lab_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int noStd, sem;
        String name, usn;
        System.out.println("Enter No. of Students: ");
        noStd=sc.nextInt();
        External student[] = new External[noStd];
        for (int i=0; i<noStd; i++){
            System.out.println("\nEnter details for Student " + (i + 1));

            // Input student details
            System.out.println("Enter USN: ");
            usn = sc.next();
            System.out.println("Enter Name: ");
            name = sc.next();
            System.out.println("Enter Semester: ");
            sem = sc.nextInt();

            double[] iMarks = new double[5];
            System.out.println("Enter 5 Internal Marks : ");
            for (int k = 0; k < 5; k++) {
                iMarks[k] = sc.nextDouble();
            }

            double[] eMarks = new double[5];
            System.out.println("Enter 5 External Marks : ");
            for (int j = 0; j < 5; j++) {
                eMarks[j] = sc.nextDouble();
            }

            student[i] = new External(usn, name, sem, iMarks, eMarks);
            student[i].displayPersonal();
            student[i].displayIntMarks();
            student[i].displayExtMarks();
            student[i].finalMarks();
        }
    }
}