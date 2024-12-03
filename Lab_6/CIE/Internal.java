package Lab_6.CIE;

public class Internal {
    public double[] iMarks = new double[5];
    public Internal(double arr[]){
        for (int i=0; i<5;i++){
            iMarks[i]=arr[i];
        }
    }
    public void displayIntMarks(){
        System.out.println("Internal Marks");
        for (int i=0; i<5; i++){
            System.out.println("Subject "+(i+1)+" :"+ iMarks[i]);
        }
    }
}
