
import java.util.Date;                 //Date util.
import java.text.DateFormat;          //Format to text
import java.text.SimpleDateFormat;   //Simpler date format
import java.util.Random;            //Random Generator

// Using variable-length argument lists.
    public class VarargsTest {
    
// multiply numbers with method 'product'
    public static int product(int... numbers) {
        int Prod = 1;

    //Process the varibale-length arguments
    for (int Number : numbers)
        Prod *=Number;
    return Prod; //Terminate method of product
    }
public static void main(String[] args) {
    // values to multiply
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        int e = 5;
    // display integer values with nicely formatted output
    System.out.printf("a=%d,b=%d,c=%d,d=%d,e=%d\n\n",
                      a,b,c,d,e);

    // call method 'product' with different number of arguments in each call
    System.out.printf(" \n   •Result of Two calls• \n");
    System.out.printf("The Final Product of a & b is: %d\n",
        product(a,b));
    
    System.out.printf(" \n   •Result of Three calls• \n");
    System.out.printf("The Final Product of a, b, & c is: %d\n",
        product(a,b,c));
    
    System.out.printf(" \n   •Result of Four calls• \n");
    System.out.printf("The Final Product of a, b, c, & d is: %d\n",
        product(a,b,c,d));
    
    System.out.printf(" \n   •Result of Five calls• \n");
    System.out.printf("The Final Product of a, b, c, d, & e is: %d\n",
        product(a,b,c,d,e));
    
    //Gather systems date and time to print out
    System.out.printf ("\n     Thank you for using The Varargs Test application"
            + "\n        Time of calculation is: ");
        DateFormat df = new SimpleDateFormat("MM/dd/yy hh:mm:ss");
        Date dateobj = new Date();
            System.out.println(df.format(dateobj));
            System.exit(0); // Exit Program
            
    }//Terminate Main
} // Terminate Varargstest

 // ouput with nicely formatted output

