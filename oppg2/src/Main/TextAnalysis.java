package Main;
import java.util.ArrayList;

public class TextAnalysis
{
    private int[] noChars = new int[30];
    TextAnalysis(String input)
    {
        for(int i = 0; i < input.length(); i++)
        {
            int val = input.codePointAt(i) - 65;
            if(val >= 32 && val <= 57){val -= 32;}
            else if(val == 165 || val == 133){val = 26;}
            else if(val == 183 || val == 151){val = 27;}
            else if(val == 164 || val == 132){val = 28;}
            else if(!(val >= 0 && val <= 25)){val = 29;}
            noChars[val]++;
        }
    }
    int GetNoDifferentLetters()
    {
        int noDifferentLetters = 0;
        for(int i = 0; i < 29; i++)
        {
            if(noChars[i] > 0) {noDifferentLetters++;}
        }
        return noDifferentLetters;
    }
    int GetTotNoChars()
    {
        int sum = 0;
        for(int i : noChars){sum += i;}
        return sum - noChars[29];
    }
    float GetRatioOfNonLetters()
    {
        return noChars[29] / ((float) GetTotNoChars() + noChars[29]) * 100;
    }
    int GetLetterOccurrence(char c)
    {
        int val = Character.getNumericValue(c) - 10;
        if(val >= 32 && val <= 57){val -= 32;}
        else if(val == 165 || val == 133){val = 26;}
        else if(val == 183 || val == 151){val = 27;}
        else if(val == 164 || val == 132){val = 28;}
        else if(!(val >= 0 && val <= 25)){val = 29;}
        return noChars[val];
    }
    ArrayList<Character> GetMostCommon()
    {
        int highest = 0;
        for(int i : noChars)
        {
            if(i > highest){highest = i;}
        }
        ArrayList<Character> common = new ArrayList<Character>();
        for(int i = 0; i < 29; i++)
        {
            if(noChars[i] == highest)
            {
                if(i == 26){i = 146 - 65;}
                else if(i == 27){i = 157-65;}
                else if(i == 28){i = 143 - 65;}
                common.add((char) (i + 65));
            }
        }
        return common;
    }
}