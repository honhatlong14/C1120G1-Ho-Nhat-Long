package lession_12_search_algorithm.bai_tap.timchuoitangdancododailonnhat;

import java.util.LinkedList;
import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        System.out.println("Enter a String: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        LinkedList<Character> max = new LinkedList<>();

        for (int i = 0; i < input.length(); i++) {
            LinkedList<Character> list = new LinkedList<>();
            list.add(input.charAt(i));
            for (int j = i + 1; j < input.length(); j++) {
                if (input.charAt(j) > list.getLast()) {
                    list.add(input.charAt(j));
                }
            }
            if (list.size() > max.size()) {
                max.clear();
                max.addAll(list);
            }
            list.clear();
        }
        for (Character ch: max) {
            System.out.print(ch);
        }
        System.out.println();
    }
}
