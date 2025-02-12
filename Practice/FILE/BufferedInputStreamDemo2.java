package Practice.FILE;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedInputStreamDemo2{
    public static void main(String args[])
    {
        //InputStream istream=null;
        //BufferedInputStream bis=null;
        try{
            FileInputStream istream=new FileInputStream("C:\\j2ee\\bin\\A.java");
            BufferedInputStream bis=new BufferedInputStream(istream);
            System.out.println("char "+(char)bis.read());
            System.out.println("char "+(char)bis.read());
           /*System.out.println("char "+(char)bis.read());
           System.out.println("char "+(char)bis.read());
           System.out.println("char "+(char)bis.read());  */
            bis.mark(3);
            System.out.println("char "+(char)bis.read());
            System.out.println("reset invoked");
            bis.reset();
            for(int j=1;j<12;j+=1)
            {
                System.out.println("char "+(char)bis.read());
            }
            // bis.reset();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
      /*  finally{
                 if(istream !=NULL)
                      istream.close();
                  if(bis !=NULL)
                       bis.close();
                 }*/
    }
}
