import java.util.Scanner;
import java.text.DecimalFormat;
class area
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("1. If the radius is known");
        System.out.println("2. If the diameter is known");
        System.out.println("3. If the circumference is known");
        int choice=sc.nextInt();
        double a=0;
        switch(choice)
        {
            case 1:
                double r=sc.nextDouble();
                a=Math.PI*r*r;
                break;
            case 2:
                double d=sc.nextDouble();
                a=Math.PI*(d/2)*(d/2);
                break;
            case 3:
                double c=sc.nextDouble();
                a=(c*c)/4*Math.PI;
        }
        DecimalFormat df=new DecimalFormat("#.##");
        System.out.println("The area of the circle is: " +df.format(a));
    }
}
    

