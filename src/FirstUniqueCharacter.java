import java.util.*;

public class FirstUniqueCharacter {

    public static void main(String arg[]) {

        Scanner in = new Scanner(System.in);

        //storing the input string to String variable "str"
        String str = in.nextLine();
        //write your code here
        int flag = -1;
        HashMap<Character, Integer> h = new LinkedHashMap<>();
        char[] chars = str.toCharArray();
        for(int i =0; i<chars.length; i++){
            if(h.containsKey(chars[i])){
                h.put(chars[i], h.get(chars[i]) + 1);

            }else {
                h.put(chars[i], 1);
            }
        }

        Set<Map.Entry<Character, Integer> > entrySet = h.entrySet();

        for(Map.Entry<Character, Integer> entry : entrySet){
            if(entry.getValue() == 1){
                System.out.println(entry.getKey());
                flag = 1;
            }
        }

        if(flag == -1){
            System.out.println("-1");
        }


    }
}
