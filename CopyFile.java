*Aim: Write a program to copy one file to another.
Java code:
*/
import java.io.*;
class CopyFile
{
 public static void main(String args[])throws IOException, FileNotFoundException
  {
    int i;
     File f1=new File("C:\\Users\\Remin\\Desktop\\remin\\java\\file\\myname.txt");
     File f2=new File("C:\\Users\\remin\\Desktop\\remin\\java\\file\\myfile.txt");
     FileInputStream fin=new FileInputStream(f1);
     FileOutputStream fout=new FileOutputStream(f2);
     do
     {
      i=fin.read();
      if (i !=-1)
        fout.write(i);
     }while(i!=-1);
   System.out.println("The entire content of the myname file is copied into the file myfile");
    fin.close();
     fout.close();
 }
}
/*output
>java CopyFile
The entire content of the myname file is copied into the file myfile
*/