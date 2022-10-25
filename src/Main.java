import java.util.Scanner;
import java.util.Stack;

public class Main {


    public static void main(String[] args) {
        Stack<Character> s = new Stack<Character>();
        Scanner in = new Scanner(System.in);
        String data = in.nextLine();
        //write your code here

        int size = (data.toCharArray()).length;
        char[] chars;
        chars = data.toCharArray();
        for(int i =0; i<size; i++){
            s.push(chars[i]);
        }

        for(int i =0; i<size; i++){
            System.out.print(s.pop());
        }

    }
}