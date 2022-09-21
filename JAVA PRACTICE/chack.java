import java.util.*;
public class chack {
    public static void main(String args[])
    {   
        
        System.out.println("Enter the Int ");
        Scanner s=new Scanner(System.in);
        System.out.println(s.hasNextInt());
     
        System.out.println("Enter the Double ");
        Scanner s2=new Scanner(System.in);
        System.out.println(s2.hasNextDouble());
     
        System.out.println("Enter the String ");
        Scanner s3=new Scanner(System.in);
        System.out.println(s3.hasNext());
     
        System.out.println("Enter the Short ");
        Scanner s4=new Scanner(System.in);
        System.out.println(s4.hasNextShort());
        
        System.out.println("Enter the Boolean ");
        Scanner s5=new Scanner(System.in);
        System.out.println(s5.hasNextBoolean());
        
        System.out.println("Enter the Byte ");
        Scanner s6=new Scanner(System.in);
        System.out.println(s6.hasNextByte());
        
        System.out.println("Enter the Line ");
        Scanner s7=new Scanner(System.in);
        System.out.println(s7.hasNextLine());
        
        System.out.println("Enter the Long ");
        Scanner s8=new Scanner(System.in);
        System.out.println(s8.hasNextLong());

    }
}
