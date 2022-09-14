// Write a program to claculate the percentage of  the student's marks out of 100

import java.util.*;

class Percentage {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double mark1, mark2, mark3, mark4, mark5,total,percentage;
        System.out.println("This is program to claculate the percentage of the 5 subjects");
        System.out.println("Enter the marks of the 1st subjects out of 100::");
        mark1 = sc.nextDouble();
        System.out.println("Enter the marks of the 2nd subjects out of 100::");
        mark2 = sc.nextDouble();
        System.out.println("Enter the marks of the 3rd subjects out of 100::");
        mark3 = sc.nextDouble();
        System.out.println("Enter the marks of the 4th subjects out of 100::");
        mark4 = sc.nextDouble();
        System.out.println("Enter the marks of the 5th subjects out of 100::");
        mark5 = sc.nextDouble();
        System.out.println("You enter the marks::" +"\n"+ mark1 +"\n"+ mark2 +"\n"+ mark3+"\n" + mark4 +"\n"+ mark5);
        total=mark1+mark2+mark3+mark4+mark5;
        percentage=(total/500)*100;
        System.out.println("Percentage of sub1 is::"+(mark1/100)*100+"%");
        System.out.println("Percentage of sub2 is::"+(mark2/100)*100+"%");
        System.out.println("Percentage of sub3 is::"+(mark3/100)*100+"%");
        System.out.println("Percentage of sub4 is::"+(mark4/100)*100+"%");
        System.out.println("Percentage of sub5 is::"+(mark5/100)*100+"%");
        System.out.println("Efective Percentage Is::"+percentage+"%");

    }

}
