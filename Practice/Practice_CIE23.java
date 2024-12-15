class child1 extends Thread{
    String tname;
    child1(String s){
        this.tname=s;
    }
    public void run(){
        try{
            System.out.println(getName()+"\tC1");
            for (int i=2; i<15; i++){
                int count=0;
                for (int j=1; j<=i; j++){
                    if (i%j==0){
                        count++;
                    }
                }
                if (count==2){
                    System.out.println("\t"+i);
                }
            }
        }
        catch (Exception e){
            System.out.println("Child 1 :\t"+e);
        }
    }
}
class child2 implements Runnable{
    Thread tname;
    int n;
    child2(String s, int no){
        this.n=no;
        tname = new Thread(this, s);
        tname.start();
    }
    public void run(){
        try{
            System.out.println(tname.getName()+"\tC2");
            int x=0, y=1, z=0;
            System.out.print("Fibonnaci Series: ");
            for (int i=0; i<n; i++){
                System.out.print("\t"+x);
                z=x+y;
                x=y;
                y=z;
            }
        }
        catch(Exception e){
            System.out.println("Child 2 :\t"+e);
        }
    }
}
public class Practice_CIE23 {
    public static void main(String[] args) {
        child1 c1= new child1("Child 1");
        Thread newThread = new Thread(c1);
        newThread.start();
        child2 c3=new child2("Child 3", 7);
        for (int i=0; i<11; i++){
            try{
                System.out.println("Main: "+i);
//                Thread.sleep(10);
            }
            catch (Exception e){
                System.out.println("Main Interrupted"+e);
            }
        }
        child2 c2=new child2("Child 2", 5);
        try {
            // Ensure main waits for the two child threads to complete
            c1.join();
            c2.tname.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted: " + e);
        }
        System.out.println("\nMain Thread Completed");
    }
}
