package lesson13.productslist;

import java.util.HashMap;

public class ProductList {

    public static HashMap<String, Integer> createList(String[] products) {
        HashMap<String, Integer> productMap = new HashMap<>();
        for (String product : products) {
            int count = (int) (Math.random() * 100);
            productMap.put(product, count);
        }
        return productMap;
    }

    public static void sumOfCountProducts(HashMap<String, Integer> productList) {
        int sum = 0;
        for (int value : productList.values()) {
            sum += value;
        }
        System.out.println("Количество продуктов равно: " + sum);
    }

}
