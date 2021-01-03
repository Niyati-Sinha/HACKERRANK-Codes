import java.util.Scanner;
import java.util.regex.*;

public class Solution
{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases>0){
			String pattern = in.nextLine();
           try {
               Pattern.compile(pattern);// is the pattern is a valid regex i.e. a valid language according to the automata theory
               //System.out.println(pattern);
               System.out.println("Valid");
           } catch (PatternSyntaxException exception) {
               System.out.println("Invalid");
           }
            testCases--;
		}
        in.close();
	}
}



