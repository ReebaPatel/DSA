import java.util.ArrayList;
import java.util.Scanner;

public class Array_List {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         //arraylist
        // ArrayList<Integer> list = new ArrayList<>(5);
        
        //declared
        // list.add(12);
        // list.add(11);
        // list.add(10);
        // list.add(9);
        // list.add(8);
        // System.out.println(list);

        //user input
        // int n = sc.nextInt(); 
        /*even tho it can add any nos of elems 
        but it doesnt know yet whats the size 
        of array so you cant directly say list.soze() 
        xz it keeps growing so you ask fo the size*/
        // for(int i = 0; i< n; i++){
        //     list.add(sc.nextInt());
        // }
        // System.out.println(list);

        //multi dimensional arraylist
        ArrayList<ArrayList<Integer>> list = new ArrayList<>(5);

        for(int i = 0; i < 3; i++){
            list.add(new ArrayList<>());
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(sc.nextInt());
            }
        }

        System.out.println(list);
        sc.close();
    }
}
