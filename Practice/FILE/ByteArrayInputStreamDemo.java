package Practice.FILE;

import java.io.*;
class ByteArrayInputStreamDemo {
    public static void main(String args[]) throws IOException {
        String tmp = "abcdefghijklmnopqrstuvwxyz";

        byte b[] = tmp.getBytes();
        int c;

        ByteArrayInputStream input1 = new ByteArrayInputStream(b);

        ByteArrayInputStream input2 = new ByteArrayInputStream(b,0,3);


        while((c=input1.read())!=-1)
        {
            System.out.print((char)c);

//System.out.println((char)c);
        }
        input1.close();


    }
}
