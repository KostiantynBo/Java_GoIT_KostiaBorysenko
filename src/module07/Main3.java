package module07;

import java.util.*;

public class Main3 {
    public static void main(String[] args) {
        Random random = new Random(10000);

        List<Integer> integerLinkedList = new LinkedList<>();
        List<String> stringLinkedList = new LinkedList<>();
        List<Integer> integerArrayList = new ArrayList<>();
        List<String> stringArrayList = new ArrayList<>();

        System.out.println("List of Integer");
        System.out.println("");

        long startL = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            integerLinkedList.add(random.nextInt());
        }

        long finishL = System.currentTimeMillis();
        System.out.println("Time add Linkedlist: " + (finishL - startL));


        long startA = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            integerArrayList.add(random.nextInt());
        }
        long finishA = System.currentTimeMillis();
        System.out.println("Time add Arraylist: " + (finishA - startA));

        long startL1 = System.currentTimeMillis();

        integerLinkedList.set(5000, random.nextInt());


        long finishL1 = System.currentTimeMillis();
        System.out.println("Time set Linkedlist: " + (finishL1 - startL1));

        long startA1 = System.currentTimeMillis();

        integerArrayList.set(5000, random.nextInt());


        long finishA1 = System.currentTimeMillis();
        System.out.println("Time set Arraylist: " + (finishA1 - startA1));

        long startL2 = System.currentTimeMillis();

        integerLinkedList.get(5000);

        long finishL2 = System.currentTimeMillis();
        System.out.println("Time get Linkedlist: " + (finishL2 - startL2));

        long startA2 = System.currentTimeMillis();

        integerArrayList.get(5000);


        long finishA2 = System.currentTimeMillis();
        System.out.println("Time get Arraylist: " + (finishA2 - startA2));

        long startL3 = System.currentTimeMillis();

        integerLinkedList.remove(5000);

        long finishL3 = System.currentTimeMillis();
        System.out.println("Time remove Linkedlist: " + (finishL3 - startL3));

        long startA3 = System.currentTimeMillis();

        integerArrayList.remove(5000);

        long finishA3 = System.currentTimeMillis();
        System.out.println("Time remove Arraylist: " + (finishA3 - startA3));

        System.out.println("List of String");
        System.out.println("");

        long startL4 = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            stringLinkedList.add("L" + i);
        }

        long finishL4 = System.currentTimeMillis();
        System.out.println("Time add Linkedlist: " + (finishL4 - startL4));

        long startA4 = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            stringArrayList.add("A" + i);
        }

        long finishA4 = System.currentTimeMillis();
        System.out.println("Time add Linkedlist: " + (finishA4 - startA4));

        long startL5 = System.currentTimeMillis();

        stringLinkedList.set(5000, "L");


        long finishL5 = System.currentTimeMillis();
        System.out.println("Time set Linkedlist: " + (finishL5 - startL5));

        long startA5 = System.currentTimeMillis();

        stringArrayList.set(5000, "A");


        long finishA5 = System.currentTimeMillis();
        System.out.println("Time set Arraylist: " + (finishA5 - startA5));

        long startL6 = System.currentTimeMillis();

        stringLinkedList.get(5000);

        long finishL6 = System.currentTimeMillis();
        System.out.println("Time get Linkedlist: " + (finishL6 - startL6));

        long startA6 = System.currentTimeMillis();

        stringArrayList.get(5000);


        long finishA6 = System.currentTimeMillis();
        System.out.println("Time get Arraylist: " + (finishA6 - startA6));

        long startL7 = System.currentTimeMillis();

        stringLinkedList.remove(5000);

        long finishL7 = System.currentTimeMillis();
        System.out.println("Time remove Linkedlist: " + (finishL7 - startL7));

        long startA7 = System.currentTimeMillis();

        stringArrayList.remove(5000);

        long finishA7 = System.currentTimeMillis();
        System.out.println("Time remove Arraylist: " + (finishA7 - startA7));
    }
}

