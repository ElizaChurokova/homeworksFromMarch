package com.company;

import org.graalvm.compiler.graph.Node;
import org.w3c.dom.ls.LSOutput;

import java.util.*;
import java.util.stream.Stream;


public class Main {
    public static void main(String[] args) {
        //HW54 TASK B

        Random rand = new Random();

        int[] randomNumbers = new int[100];
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = (int) (Math.random() * 100);
            System.out.println(randomNumbers[i]);
        }
        System.out.println("----------Even numbers: -----------");
        Arrays.stream(randomNumbers).filter(x -> x % 2 == 0).forEach(x -> System.out.println(x));

        System.out.println("-------------Odd numbers, with adding 10: -------------");
        Arrays.stream(randomNumbers).filter(x -> x % 2 != 0).map(x -> x + 10).forEach(x-> System.out.println(x));




//HW54 TASK A
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "Vera");
        hashMap.put(2, "Zara");
        hashMap.put(3, "Max");
        hashMap.put(4, "Alex");
        hashMap.put(5, "Ann");
        hashMap.put(6, "John");
        hashMap.put(7, "Ben");
        hashMap.put(8, "Sam");
        hashMap.put(9, "Eva");
        hashMap.put(10, "Sophie");
        Stream.of(hashMap).forEach(x -> System.out.println(x));

        List<Map.Entry<Integer, String>> entries = new ArrayList<>(hashMap.entrySet());
        Collections.sort(entries, (x, y) -> x.getKey().compareTo(x.getKey()));
        for (Map.Entry<Integer, String> entry : entries) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        System.out.println("---------------------------");
        //  Stream.of(hashMap).filter(x -> x > 5). forEach(x -> System.out.println(x));

        //ЗАМЕТКА: в ультимат версии както криво выходит и на консолье ошибку выдает. не могу понять почему.
        // в коммюнити версии идее нормально выходит. но так как я изначально подготовила к запушиванию ультимат версию, отправляю
        // этот вариант.

        // TASK A не совсем смогла сделать, сложно было работать с хэшмап



    }


}





