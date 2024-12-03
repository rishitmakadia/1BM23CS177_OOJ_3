package Lab_6.CIE;


public class Personal{
    public String name,usn;
    public int sem;
    public Personal(String n, String no, int s){
        this.name=n;
        this.usn=no;
        this.sem=s;
    }
    public void displayPersonal(){
        System.out.println("Name = "+name);
        System.out.println("USN = "+usn);
        System.out.println("Semester = "+sem);
    }
}