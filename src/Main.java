import java.util.Arrays;
import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<String> myWordList = new ArrayList<String>(Arrays.asList("apple", "banana", "cherry", "donut", "bagel", "danish", "berry", "baguette", "soda"));
        ArrayListAlgorithms.moveBWords(myWordList);
        System.out.println(myWordList);
    }
}
