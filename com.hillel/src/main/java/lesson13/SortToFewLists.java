package lesson13;

import java.util.ArrayList;
import java.util.List;

public class SortToFewLists {
    public static void main(String[] args) {
        List<Integer> listMain = new ArrayList<>(addRandomNumbersToList());
        heapDivision(listMain);
    }

     static List<Integer> addRandomNumbersToList() {
        List<Integer> listOfRandomNumbers = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            int number = (int) (Math.random() * 500);
            listOfRandomNumbers.add(number);
        }
        return listOfRandomNumbers;
    }

     static void showLists(String key, List<Integer> list) {
        System.out.printf(key + ": " + list + " ");
        System.out.println();
    }

     static void heapDivision(List<Integer> listMain) {
        List<Integer> listOne = new ArrayList<>();
        List<Integer> listTwo = new ArrayList<>();
        List<Integer> listThree = new ArrayList<>();

        for (int i = 0; i < listMain.size(); i++) {
            if (listMain.get(i) % 2 == 0 && listMain.get(i) % 3 == 0) {
                listOne.add(listMain.get(i));
                listTwo.add(listMain.get(i));
            } else if (listMain.get(i) % 2 == 0) {
                listOne.add(listMain.get(i));
            } else if (listMain.get(i) % 3 == 0) {
                listTwo.add(listMain.get(i));
            } else {
                listThree.add(listMain.get(i));
            }
        }
        showLists("First", listOne);
        showLists("Second", listTwo);
        showLists("Third", listThree);
    }
}
