package Main;

import org.w3c.dom.Text;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            System.out.println("Enter a string:");
            TextAnalysis test= new TextAnalysis(sc.nextLine());
            System.out.println(test.GetNoDifferentLetters());
            System.out.println(test.GetTotNoChars());
            System.out.println(test.GetLetterOccurrence('A'));
            System.out.println(test.GetMostCommon());
        }
    }
}