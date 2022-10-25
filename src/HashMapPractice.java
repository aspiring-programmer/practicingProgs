import java.util.Hashtable;
import java.util.Scanner;

public class HashMapPractice {

    public static void main(String[] args)
    {
        Hashtable<Integer,String> boardingPass= new Hashtable<Integer,String>();
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int arr[]=new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

//        for (int i = 0; i < size; i++) {
//            boardingPassNumber = scanner.nextInt();
//            boardingPass.put(boardingPassNumber, "Checked");
//        }

        for(int i:arr)
        {
            if(boardingPass.containsKey(i))
                System.out.println(i);
            else
                boardingPass.put(i,"Checked");
        }
    }

}


/** import java.util.*;
 import java.util.Scanner;

 class Source {
 public static void main(String[] args)
 {
 Hashtable<Integer,String> boardingPass= new Hashtable<Integer,String>();
 Scanner scanner = new Scanner(System.in);
 int size = scanner.nextInt();
 int arr[]=new int[size];
 for (int i = 0; i < size; i++) {
 arr[i] = scanner.nextInt();
 }

 for(int i:arr)
 {
 if(boardingPass.containsKey(i))
 System.out.println(i);
 else
 boardingPass.put(i,"Checked");
 }
 }
 }
 **/
