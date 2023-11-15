package Main;
import java.util.Random;

public class Main
{
    public static void main(String[] args)
    {
        Random rand = new Random();
        int[] occurrences = new int[10];
        for(int i = 0; i < 5000; i++){occurrences[rand.nextInt(10)]++;}
        System.out.println("Occurrences:");
        for(int i = 0; i < 10; i++)
        {
            System.out.println(Integer.toString(i + 1) + ": " + Integer.toString(occurrences[i]));
        }
    }
}