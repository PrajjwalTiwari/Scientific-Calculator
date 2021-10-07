import java.util.Scanner;
class Area
{
public static void main(String args[])
{
new Area (); 
}
public Area () 
{
Scanner sc=new Scanner(System.in);
double num1,num2,pi=3.14;
System.out.println("Select the following options...");
System.out.println("Areas : 1.Rectangle \n 2.Circle \n 3.Square \n 4.Sphere \n 5.Triangle ");
int option=sc.nextInt();
System.out.println("Your option = "+option);
double result=0;
if(option==1)
{
System.out.println("Enter the length value: ");
num1=sc.nextDouble();
System.out.println("Enter the width value: ");
num2=sc.nextDouble();
result=num1*num2;
System.out.println("Area of reactangle = "+result);
}else if(option==2)
{
System.out.println("Enter the Radius of the circle");
num1=sc.nextDouble();
result=pi*num1*num1;
System.out.println("Area of circle = "+result);
}else if(option==3)
{
System.out.println("Enter the value of side of the square");
num1=sc.nextDouble();
result=num1*num1;
System.out.println("Area of square = "+result);
}else if(option==4)
{
System.out.println("Enter the radius of the sphere");
num1=sc.nextDouble();
result=(4*22*num1*num1)/(7);
System.out.println("Total surface Area of sphere = "+result);
}else if(option==5)
{
System.out.println("Enter the base of the triangle");
num1=sc.nextDouble();
System.out.println("Enter the height of the triangle");
num2=sc.nextDouble();
result=(num1*num2)/2;
System.out.println("Area of triangle = "+result);
}else 
System.out.println("Invalid input,Please try again.");
}
}