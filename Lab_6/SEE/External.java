package Lab_6.SEE;

import Lab_6.CIE.*;

public class External extends Personal {
    public double[] eMarks = new double[5];
    Internal internalObj; //Reference Variable
    public External (String name, String usn, int sem,double arrI[], double arrE[]){
        super(name, usn, sem);
        this.internalObj = new Internal(arrI);
        for (int i=0; i<5;i++){
            eMarks[i]=arrE[i];
        }
    }

    public void displayExtMarks() {
        System.out.println("External Marks");
        for (int i = 0; i < 5; i++) {
            System.out.println("Subject " + (i + 1) + " :" + eMarks[i]);
        }
    }

    public void displayIntMarks() {
        internalObj.displayIntMarks();
    }

    public void finalMarks(){
        System.out.println("Final Marks");
        for (int i = 0; i < 5; i++) {
            System.out.println("Subject " + (i + 1) + " :" + (eMarks[i]+internalObj.iMarks[i]));
        }
    }
}
