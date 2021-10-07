 import java.util.Scanner;
class calculatorf
{
public static void main(String args[])
{
new calculatorf (); 
}
public calculatorf () 
{
  float num1,num2,result=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter first value: ");
 num1=sc.nextFloat();
System.out.println("Enter second value: ");
 num2=sc.nextFloat(); 
System.out.println("Select from the following option....");
System.out.println("\n 1. Addition \n 2. Subtraction \n 3. Multiplication \n 4. Division\n\t\t");
int option=sc.nextInt();
System.out.println("\n Your option is =\t"+option);

if(option==1)
{
result=num1+num2;
System.out.println("\nResult of addition is =\t "+result);
}
else if(option==2)
{
result=num1-num2;
System.out.println("\nResult of subtraction is =\t "+result);
}
else if(option==3)
{
result=num1*num2;
System.out.println("\nResult of multiplication is =\t "+result);
}
else if(option==4)
{
result=num1/num2;
System.out.println("\nResult of division is =\t "+result);
}
else
{ 
System.out.println("Please Enter between 1 to 4\n");
}
}
}