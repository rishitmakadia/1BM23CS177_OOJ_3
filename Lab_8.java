
// import java.util.*;

class clg extends Thread{
    String str;
    clg(String s){
        this.str=s;
    }
    synchronized public void run(){
        
            System.out.println("College = "+str);
            try {
                Thread.sleep(10000);
            } catch (Exception e) {
                System.out.println("College Exception: "+e);
            }
        
    }
}

class branch extends Thread{
    String br;
    branch(String b){
        this.br=b;
    }
    public void run(){
        for (int i=1; i<=2;i++){
            try {
                System.out.println("Branch "+i+" = "+br);
                Thread.sleep(2000);
            } catch (Exception e) {
                System.out.println("Branch Exception: "+e);
            }
        }
    }
}


class Lab_8{
    public static void main(String[] args) {
        clg[] c1=new clg[4];
        c1[0] = new clg("BMS");
        c1[1] = new clg("College");
        c1[2] = new clg("of");                  
        c1[3] = new clg("Engineering");
        branch b1=new branch("CSE");
        try {
            b1.start();
            for (int i=0; i<4;i++){
                c1[i].start();
                // c1[i].join();
            }
        } 
        catch (Exception e) {
            System.out.println("Exception Occured: "+e);
        }
    }
}