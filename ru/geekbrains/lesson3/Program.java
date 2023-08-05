package ru.geekbrains.lesson3;

import java.util.ArrayList;
import java.util.Arrays;

public class Program {

    public static void main(String[] args) {

        LinkedList<Employee> linkedList = new LinkedList<>();
        linkedList.addFirst(new Employee("AAAA", 40));
        linkedList.addFirst(new Employee("BBB", 41));
        linkedList.addFirst(new Employee("CC", 33));
        linkedList.addFirst(new Employee("EEE", 41));
        linkedList.addFirst(new Employee("FFF", 55));
        linkedList.addFirst(new Employee("GGG", 21));
        linkedList.addFirst(new Employee("HHHH", 33));
        linkedList.addFirst(new Employee("DDDDD", 24));


        //Employee e = linkedList.contains(new Employee("JJJJJ", 24));
        //System.out.println(linkedList);
        //ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 5, 10, 11));
        //System.out.println(arrayList);

        /*Employee[] array1 = new Employee[] {new Employee("AAAA", 40),
                new Employee("BBB", 41),
                new Employee("CC", 33)};
        Arrays.sort(array1);
        System.out.println(Arrays.toString(array1));*/

        //System.out.println();
        //linkedList.sort(new EmployeeComparator(SortType.Ascending));
        //System.out.println(linkedList);

        //System.out.println();
       // linkedList.sort(new EmployeeComparator(SortType.Descending));
        //System.out.println(linkedList);

        //linkedList.removeFirst();
        //linkedList.removeLast();

        //System.out.println();
        //System.out.println(linkedList);

        //linkedList.removeLast(reverseList);
        System.out.println(linkedList);
        linkedList.revList();
        //linkedList.reverseList();
        System.out.println(linkedList);


    }

}
