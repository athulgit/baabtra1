import java.io.*;
import java.util.Scanner;

public class Main
{
    public static void main(String []args)throws IOException
    {
        String a,b;
        char o;
        int n;
        boolean ints1,ints2;
        Scanner ob = new Scanner(System.in);
        do
        {
            n=1;
            System.out.println("Enter 2 inputs :");
            a=ob.next();
            b=ob.next();
            System.out.println("Enter the operator");
            o=ob.next().charAt(0);
            System.out.println("Numbers Entered "+ a+" "+b + " Operation Entered "+o);
             ints1= isInteger(a);
             ints2= isInteger(b);
             int l= b.compareTo("0");
             if(o=='/'&& l==0)
             {
                 System.out.println("Zero can not be dividend");
                 n++;
             }

        }while(ints1==false ||ints2==false ||!(o=='+'|| o=='-' || o=='*' ||o=='/')||n>=2);
        switch(o)
        {
            case '+':System.out.println("Result is : "+(Integer.parseInt(a)+Integer.parseInt(b)));
                        break;
            case '-':System.out.println("Result is : "+(Integer.parseInt(a)-Integer.parseInt(b)));
                break;
            case '*':System.out.println("Result is : "+(Integer.parseInt(a)*Integer.parseInt(b)));
                break;
            case '/':System.out.println("Result is : "+(Integer.parseInt(a)/Integer.parseInt(b)));
                break;
        }

    }
    public static boolean isInteger(String s)
    {
        boolean isValidInteger=false;
        try
        {
            Integer.parseInt(s);
            isValidInteger = true;
        }
        catch (NumberFormatException ex)
        {
            System.out.println("Input Error "+s+" \n ReEnter the inputs");
        }

        return isValidInteger;
    }

}