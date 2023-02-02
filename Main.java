package homework4;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //ex1();
        ex2();
    }

    private static void ex2() {
        LinkedList<String> wordsList = new LinkedList<>();
        Collections.addAll(wordsList, "apple", "juice", "sun", "flower", "cat", "dog");
        for (int i = 0; i < wordsList.size()/2; i++) {
            String oldWorld = wordsList.get(i);
            wordsList.set(i, wordsList.get(wordsList.size()-1-i));
            wordsList.set((wordsList.size()-1-i), oldWorld);
        }
        System.out.println(wordsList);
    }

    private static void ex1() {
        LinkedList<String> words = new LinkedList<>();
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Введите строку: ");
            String scan = input.nextLine();
            if (scan.equals("print")) {
                for (int i = 0; i < words.size(); i++) {
                    System.out.println(words.get(i));
                }
            } else if (scan.equals("revert")) {
                words.removeFirst();
            }
            else {
                words.addFirst(scan);
            }
        }
    }
}
