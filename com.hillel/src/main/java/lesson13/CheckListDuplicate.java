package lesson13;

import java.util.*;

public class CheckListDuplicate {
    public static void main(String[] args) {
        List<Integer> listOfRandomNumbers = new ArrayList<>();
        int size = 0;
        int countOfDeletedDuplicate = 0;
        Random random = new Random();

        System.out.println("Main");
        for (int i = 0; i < 100; i++) {
            listOfRandomNumbers.add(random.nextInt(20));
            System.out.print(listOfRandomNumbers.get(i) + " ");
            size = listOfRandomNumbers.size();
        }
        System.out.println();

        List<Integer> copyListOfRandomNumbers = new ArrayList<>(listOfRandomNumbers);
        Set<Integer> set = new HashSet<>(copyListOfRandomNumbers);
        List<Integer> newListOfRandomNumbers = new ArrayList<>(set);

        System.out.println("New");
        for (Integer s : newListOfRandomNumbers) {
            System.out.printf(s + " ");
            countOfDeletedDuplicate = size - newListOfRandomNumbers.size();
        }
        System.out.println();
        System.out.println("Количество удалённых дубликатов = " + countOfDeletedDuplicate);
    }
}
