import java.util.*;
class sum
{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    int num1,num2,num3,sum;
    System.out.println("Enter the first number: ");
    num1=sc.nextInt();
    System.out.println("Enter the second number: ");
    num2=sc.nextInt();
    System.out.println("Enter the third number: ");
    num3=sc.nextInt();
    sum=num1+num2+num3;
    
    System.out.println("Sum of yor number is ::");
    System.out.println(num1+" + "+num2+" + "+num3+" = "+sum);


    }
}
