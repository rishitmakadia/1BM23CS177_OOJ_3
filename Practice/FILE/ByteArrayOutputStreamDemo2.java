package Practice.FILE;

import java.io.*;
class ByteArrayOutputStreamDemo2 {
    public static void main(String args[]) throws IOException {
        ByteArrayOutputStream f = new ByteArrayOutputStream();
        String s = "This should end up in the array";

/*getBytes(): Encodes this String into a sequence of bytes using the platform's default charset,
storing the result into a new byte array.*/

        byte buf[] = s.getBytes();
        f.write(buf);
        System.out.println("Buffer as a string");
        System.out.println(f.toString());
        System.out.println("Into array");
        System.out.println("buffer size"+" "+buf.length);

/*The java.io.ByteArrayOutputStream.toByteArray() method creates a newly allocated buffer with the size
as the current size of this output stream.*/

        byte b[] = f.toByteArray();
        System.out.println("buffer size of b"+" "+b.length);
        for (int i=0; i<b.length; i++) {
            System.out.print((char) b[i]);
        }
        System.out.println("\nTo an OutputStream()");
        OutputStream f2 = new FileOutputStream("test.txt");
/*The java.io.ByteArrayOutputStream.writeTo(OutputStream out) method writes the content of this byte array
   output stream to the specified ouput stream argument.*/

        f.writeTo(f2);
        f2.close();
        System.out.println("Doing a reset");
        f.reset();
        for (int i=0; i<6; i++)
            f.write('X');
        System.out.println(f.toString());
    }
}
