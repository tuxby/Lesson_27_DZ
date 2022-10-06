package by.tux;

import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    //1. Найти миимальный минимальный элемент массива
    public static void task1(){
        ArrayFunc getMin = arr -> {
            int min = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (arr[i]<min){
                    min = arr[i];
                }
            }
            return min;
        };
        System.out.println(getMin.doSomeWork(new int[]{4,2,6,7,3}));
    }

    //2. Найти второй по велечине элмент массива
    public static void task2(){
        ArrayFunc getSecondMax = arr -> {
            int max = arr[0];
            int secondMax = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > max){
                    secondMax = max;
                    max = arr[i];
                }
            }
            return secondMax;
        };
        System.out.println(getSecondMax.doSomeWork(new int[]{4,2,6,7,3}));
    }

    //3. Найти самую часто встречающуюся букву в строке
    public static void task3(){
        StringFunc mostCharEntries = string -> {
            HashMap<Character,Integer> hashMap = new HashMap<>();
            for(Character i: string.toCharArray()){
                if (!hashMap.containsKey(i) && !Character.isWhitespace(i)) {
                    hashMap.put(i, 1);
                }
                else if (!Character.isWhitespace(i)){
                    int currentCount = hashMap.get(i);
                    currentCount++;
                    hashMap.put(i, currentCount);
                }
            }
            return Collections.max(hashMap.entrySet(), Map.Entry.comparingByValue()).getKey().toString();
        };

        System.out.println(mostCharEntries.doSomeWork("Learns very cool if you like what you teach"));
    }

    //4. Отсортировать лист со строками в лексикографическом порядке, т.е по алфавиту
    public static void task4(){
        StringFunc wordViaAphabet = string -> {
            TreeSet<String> treeSet = new TreeSet<>();
            String s[] = string.split(" ");
            for(var i : s){
                treeSet.add(i.toLowerCase());
            }
            String res = "";
            for(var i : treeSet){
                res = res + i + " ";
            }
            return res;
        };
        System.out.println(wordViaAphabet.doSomeWork("Learns very cool if you like what you teach"));
    }
}


