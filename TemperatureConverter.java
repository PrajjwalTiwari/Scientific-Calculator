import java.util.Scanner;
public class TemperatureConverter
{
public static void main(String args[])
{ 
new TemperatureConverter (); 
}
public TemperatureConverter () 
{  
Scanner sc=new Scanner(System.in);
System.out.println("Temperature Conversion");
System.out.println("Enter the no.");
double num1=sc.nextDouble();
System.out.println("Select from the following option....");
System.out.println("\n 1.Celcius to Fahrenheit \n 2.Fahrenheit to Celcius \n 3.Kelvin to Fahrenhiet \n 4.Fahrenhiet to Kelvin \n 5.Kelvin to Celsius \n 6.Celsius to Kelvin");
int option=sc.nextInt();
System.out.println("Your option = "+option);
double result=0.0;
if(option==1)
{
result=9/5.0*num1+32;
System.out.println("result in fahrenheit = "+result);
}
else if(option==2)
{
result=5/9.0*(num1-32);
System.out.println("result in celcius = "+result);
}
else if(option==3)
{
result=9/5.0*(num1-273)+32;
System.out.println("result in fahrenhiet = "+result);
}
else if(option==4)
{
result=5/9.0*(num1-32)+273;
System.out.println("result in kelvin = "+result);
}
else if(option==5)
{
result=num1-273;
System.out.println("result in celsius = "+result);
}
else if(option==6)
{
result=num1+273;
System.out.println("result in kelvin = "+result);
}
else 
System.out.println("Wrong input,Please try again.");
}
}
