import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Pangram{
    public static boolean isPangram(String input)
    {
        input= input.toLowerCase();
         Set<Character> alphabetSet = new HashSet<>();
         for(char c: input.toCharArray())
         {
            if(Character.isAlphabetic(c))
            {
                alphabetSet.add(c);
            }
         }
         return alphabetSet.size()==26;
    }
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.print("enter the sentence: ");
        String input = scanner.nextLine();
        if(isPangram(input))
        {
            System.out.println("The sentence is a Pangram");
        }
        else
        {
            System.out.println("The sentence is not a Pangram");

        }
        scanner.close();
    }
    
}
