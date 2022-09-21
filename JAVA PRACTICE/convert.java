import java.util.*;
public class convert {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        double killometer,meter,centimeter,Millimeter,Micrometer,Nanometer,Yard,Foot,Inch,NauticalMile;
        System.out.println("Entere the killo-meter");
        killometer=s.nextDouble();
        System.out.println("Miles in "+killometer+" killometer is = "+ killometer/1.609);
       
        System.out.println("Entere the meter");
        meter=s.nextDouble();
        System.out.println("Miles in "+meter+" meter is = "+ meter/1609);
        
        System.out.println("Entere the centimeter");
        centimeter=s.nextDouble();
        System.out.println("Miles in "+centimeter+" centimeter is = "+ centimeter/160900);
        
        System.out.println("Entere the Millimeter");
        Millimeter=s.nextDouble();
        System.out.println("Miles in "+Millimeter+" Millimeter is = "+ Millimeter/1.609e+6);
        
        System.out.println("Entere the Micrometer");
        Micrometer=s.nextDouble();
        System.out.println("Miles in "+Micrometer+" Micrometer is = "+ Micrometer/1.609e+9);
        
        System.out.println("Entere the Nanometer");
        Nanometer=s.nextDouble();
        System.out.println("Miles in "+Nanometer+" Nanometer is = "+ Nanometer/1.609e+12);
        
        System.out.println("Entere the Yard");
        Yard=s.nextDouble();
        System.out.println("Miles in "+Yard+" Yard is = "+ Yard/1760);
        
        System.out.println("Entere the Foot");
        Foot=s.nextDouble();
        System.out.println("Miles in "+Foot+" Foot is = "+ Foot/5280);
        
        System.out.println("Entere the Inch");
        Inch=s.nextDouble();
        System.out.println("Miles in "+Inch+" Inch is = "+ Inch/63360);
        
        System.out.println("Entere the NauticalMile");
        NauticalMile=s.nextDouble();
        System.out.println("Miles in "+NauticalMile+" NauticalMile is = "+ NauticalMile*1.151);
        
       




    }
}
