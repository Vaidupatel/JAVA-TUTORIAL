import java.util.*;
class cgpa {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("<---Enter the marks out of 100--->");
        double sub1,sub2,sub3,sub4,sub5,cgpa;
        
        
        System.out.println("Enter the marks of 1st subject: ");
        sub1=s.nextDouble();
        if(sub1>100)
        {
            System.out.println("!!!!Please enter the marks out of 100!!!!");
            return;
        }
        
        
        System.out.println("Enter the marks of 2nd subject: ");
        sub2=s.nextDouble();
        if(sub2>100)
        {
            System.out.println("!!!!Please enter the marks out of 100!!!!");
            return;
        }

        System.out.println("Enter the marks of 3rd subject: ");
        sub3=s.nextDouble();
        if(sub3>100)
        {
            System.out.println("!!!!Please enter the marks out of 100!!!!");
            return;
        }
        
        System.out.println("Enter the marks of 4th subject: ");
        sub4=s.nextDouble();
        if(sub4>100)
        {
            System.out.println("!!!!Please enter the marks out of 100!!!!");
            return;
        }
        
        System.out.println("Enter the marks of 5th subject: ");
        sub5=s.nextDouble();
        if(sub5>100)
        {
            System.out.println("!!!!Please enter the marks out of 100!!!!");
            return;
        }
        
        cgpa = (sub1+sub2+sub3+sub4+sub5)/50;
        System.out.println("CGPA=  "+cgpa);
        }



    }
    

