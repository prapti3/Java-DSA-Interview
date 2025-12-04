package Array_ArrayList;

import java.util.ArrayList;

public class Array_List {
    public static void main(String[] args) {

//        ArrayList<Integer> list = new ArrayList<>();

        ArrayList<Integer> list = new ArrayList<>(5);
        list.add(23);
        list.add(54);
        list.add(76);



        System.out.println(list);
        System.out.println(list.contains(23));

        list.set(0,99);
        System.out.println(list);
        list.remove(2);
        System.out.println(list);

        System.out.println(list.isEmpty());








    }
}
