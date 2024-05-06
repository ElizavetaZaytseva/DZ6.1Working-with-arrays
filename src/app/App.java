package app;

import org.w3c.dom.css.Counter;

import java.util.Arrays;
import java.util.Random;

public class App {
    public static void main(String[] arg) {

        int length = 20;
        int[] twentynumbers = new int[length];
        int sumnegnumbers = 0;
        int pairednumber = 0;
        int unpairnumber = 0;
        int countpair = 1;
        int countunpair = 1;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int indexmax = 0;
        int indexmin = 0;
        double avr = 0;
        int sum = 0;
        boolean firstnegative = false;
       // Random random = new Random(7);
        for (int i = 0; i < length; i++) {
            Random random = new Random();
            twentynumbers[i] = random.nextInt(201) - 100;

            if (twentynumbers[i] < 0)
                sumnegnumbers += twentynumbers[i];

            if (twentynumbers[i] % 2 == 0)
                pairednumber = countpair++;

            if (twentynumbers[i] % 2 != 0)
                unpairnumber = countunpair++;


            if (twentynumbers[i] >= max) {
                max = twentynumbers[i];
                indexmax = i;
            }
            if (twentynumbers[i] <= min) {
                min = twentynumbers[i];
                indexmin = i;
            }
                if (!firstnegative && twentynumbers[i] < 0) {
                    firstnegative = true;
                    continue;
                }
                if (firstnegative) {
                    sum += twentynumbers[i];
                    avr = sum / twentynumbers.length;
                    //  avr = sumnumbers / twentynumbers.length;
                }

            }
            System.out.println("Array elements are: " + Arrays.toString(twentynumbers));
            System.out.println("Sum of negative numbers is: " + sumnegnumbers);
            System.out.println("Number of paired numbers is: " + pairednumber);
            System.out.println("Number of unpaired numbers is: " + unpairnumber);
            System.out.println("Maximum element: " + max + " with index " + indexmax);
            System.out.println("Minimum element: " + min + " with index " + indexmin);
            System.out.printf("The arithmetic mean of the numbers after the first negative number: "+
                    avr);
        }
    }
