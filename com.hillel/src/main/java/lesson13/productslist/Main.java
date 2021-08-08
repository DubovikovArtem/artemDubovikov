package lesson13.productslist;


import java.util.HashMap;

import static lesson13.productslist.ProductList.*;

public class Main {
    public static void main(String[] args) {
        String products = "Бананы, картофель, пиво, яйцо";
        String[] product = products.split(",");

        HashMap<String, Integer> productList = new HashMap<>(createList(product));

        System.out.println(productList);
        sumOfCountProducts(productList);

    }
}
