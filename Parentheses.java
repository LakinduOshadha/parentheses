import java.util.Stack;
import java.util.Scanner;
/**
 *  Parentheses determines whether its parentheses are properly balanced or not.
 *
 * @author Lakindu Oshadha (lakinduoshadha98@gmail.com)
 */
public class Parentheses {
    /**
     * Checks the given parentheses are balanced or not
     *
     * @param str  parentheses
     * @return if balanced, returns true
     */
    public static Boolean isBalanced(String str) {
        // Implementing local variables
        char symbol1, symbol2;
        Stack newStack = new Stack();
        //Checking the conditions and returning true/ false
        for(int i = 0; i < str.length(); i++){
            symbol1 = str.charAt(i);
            if(symbol1 == '(' || symbol1 =='{' || symbol1 =='['){
                newStack.push(symbol1);
            }
            if(symbol1 == ')' || symbol1 == '}' || symbol1 == ']' ){
                if(newStack.isEmpty()){
                    return false;
                }
                else{
                    symbol2 = newStack.pop().toString().charAt(0);
                    if(!isMatched(symbol2, symbol1))
                        return false;
                }
            }
        }
        if(!newStack.isEmpty())
            return false;
        return true;
    }

    /**
     * Checks the given pairs of parentheses are matched or not.
     *
     * @param character1 parentheses1
     * @param character2 parentheses 2
     * @return if matched, returns true
     */
    public static boolean isMatched(char character1, char character2){
        //Checking the conditions and returens whether given 2 parentheses are matched or not.
        if(character1 == '(' && character2 == ')') {
            return true;
        }
        else if(character1 == '{' && character2 == '}') {
            return true;
        }
        else if(character1 == '[' && character2 == ']') {
            return true;
        } else {
            return false;
        }
    }

    /**
     * main
     *
     * @param args
     */
    public static void main(String[] args){
        // Getting input
        Scanner sc= new Scanner(System.in);
        System.out.print("\n" + "This finds the given parentheses are balanced or not" + "\nEnter the Parentheses : ");
        String str= sc.nextLine();
        System.out.println("\nEntered String : " + str);
        //Checking whether those are balanced or not & printing the results
        if (isBalanced(str)) {
            System.out.println("\nTURE : Parentheses are balanced");
        }else {
            System.out.println("\nFALSE : Parentheses are NOT balanced");
        }
    }
}

