package ss10.bai_tap.arrays_list;

import java.util.Arrays;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> list = new MyList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(3,19);
System.out.println(list);

    }
}
