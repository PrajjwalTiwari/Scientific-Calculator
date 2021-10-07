import java.util.Scanner;
class measurementtools
{
public static void main(String args[])
{
 int g=0;
 do
 {
Scanner sc=new Scanner(System.in);
System.out.println("Select the following options...");
System.out.println("Measurement tools :\n 1.Currency Converter\n 2.Area \n 3.Calculator \n 4.Temperature Conversion \n");
int option=sc.nextInt();
System.out.println("Your option = "+option);
double result=0;
         if(option==1)
{
new currencyconverter2();
}
          else if(option==2)
{
new Area();
}
         else if(option==3)
{
new calculatorf();
}
      else if(option==4)
{
new TemperatureConverter();
}
else 
{
System.out.println("Invalid input");
}

 System.out.println("would you like to countinue so press 1: ");
 g=sc.nextInt();
}while(g==1);
  
}
}