package nyc.c4q.reinardcox;

import java.util.Scanner;

/**
 * Created by Shadow on 3/12/2015.
 */
public class StillUsingVariables {
    public static void  main (String [] args) {
        String name1;
        int year1;

        Scanner inputX = new Scanner(System.in);
        System.out.print("What is your name? ");
        name1 = inputX.nextLine();
        System.out.print("What year did your graduate? ");
        year1 = inputX.nextInt();

        System.out.println("My name is " + name1 + " and I'll graduate in " + year1 + ". ");
    }
}
