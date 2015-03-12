package nyc.c4q.reinardcox;
import java.text.DecimalFormat;

/*  Java has 8 primitive types:
 -------------------------------
 •  byte  - 8-bit integer
 •  short  - 16-bit integer
 •  int  - 32-bit integer
 •  long  - 64-bit integer
 •  float  - 32-bit floating point number
 •  double  - 64-bit floating point number
 •  boolean  - true or false
 •  char  - a single character, like 'A' or
 */

public class MoreVariablesAndPrinting {
    public static void main (String [] args){
        String $myName, myEyes, myTeeth, myHair;
        int _myAge, myHeight, myWeight;
        double cm, kg;

        $myName = "Zed A. Shaw";
        _myAge = 35;
        myHeight = 74;
        myWeight = 180;
        myEyes = "Blue";
        myTeeth = "White";
        myHair = "Brown";
        cm = 0.39370;
        kg = 0.45359237;

        DecimalFormat df = new DecimalFormat("#.##");
        DecimalFormat df2 = new DecimalFormat("#.#######");

        System.out.println("Testing " + df.format(cm) );
        System.out.println("Lets talk about " + $myName + ".");
        System.out.println("He's " + myHeight + " inches (or " +  (df.format(myHeight/cm)) + " cm) tall.");
        System.out.println("He's " + myWeight + " pounds (or " + (df2.format(myWeight*kg)) + " kg) heavy.");
        System.out.println("Actually, that's not too heavy.");
        System.out.println("He's got " + myEyes + " eyes and " + myHair + " hair.");
        System.out.println("His teeth are usually " + myTeeth + " depending on the coffee.");

        System.out.println("If I add " + _myAge + ", " + myHeight + ", and " + myWeight + " I get " + (_myAge + myHeight + myWeight) + "." );

        //Math.round(1.7333)
        //DecimalFormat df = new DecimalFormat("#.#####");
        //df.format(0.912385);
    }
}
