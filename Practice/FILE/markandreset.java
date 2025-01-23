package Practice.FILE;

import java.io.*;


public class markandreset {


    public static void main(String args[]) throws IOException

    {

        FileInputStream fistream = new FileInputStream("C:\\J2ee\\bin\\Security.txt");
        BufferedInputStream bistream = new BufferedInputStream(fistream);

        System.out.print("All the contents\n\t");
        int temp, counter = 0;

        while(( temp = bistream.read() ) != -1)

        {
            counter++;

            if(temp == '$') {


                if(bistream.markSupported())
                {

                    bistream.mark(counter);
                }
            }

            System.out.print((char) temp);
        }


        bistream.reset();
        System.out.print("\nReading again after position $ is marked\n\t");

        while(( temp = bistream.read()) != -1) {

            System.out.print((char) temp);
        }

        System.out.print("\nAgain and again read\n\t");

        bistream.reset();

        while(( temp = bistream.read() ) != -1) {

            System.out.print((char) temp);
        }

        bistream.close();

        fistream.close();

    }

}
