import java.util.Scanner;
class Arithmetic
{
  public static void main(String args[])
  {
    float a,b;
    int option;
    Scanner input=new Scanner(System.in);
    System.out.print("Enter the value of A : ");
    a=input.nextFloat();
    System.out.print("Enter the value of B : ");
    b=input.nextFloat();

    System.out.print("Operations are\n1.Addition\n2.Subraction\n3.Multiplication\n4.Division\n\n");

    System.out.print("Enter your option from 1 to 4 : ");

    option=input.nextInt();
    input.close();

    if(option==1)
        System.out.print("Sum of Values "+a+" and "+b+" is "+(a+b));
    else if(option==2)
        System.out.print("Difference of Values "+a+" and "+b+" is "+(a-b));
    else if(option==3)
        System.out.print("Product of Values "+a+" and "+b+" is "+(a*b));
    else if(option==4)
        System.out.print("Quotient of Values "+a+" and "+b+" is "+(a/b));
    else
        System.out.print("Option entered is wrong , Enter the valid one!!\n");
  }
}

