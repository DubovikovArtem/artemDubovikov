package com.hillel.lesson27;

import Entity.Store;
import api.PageStore;
import com.google.gson.Gson;
import org.testng.annotations.Test;

import java.io.IOException;
import java.time.LocalDate;

public class TestStoreApi {

    @Test
    public void testGetInventory() throws IOException {
        PageStore pageStore = new PageStore();
        String inventory = pageStore.get("inventory");
        System.out.println(inventory);
    }

    @Test
    public void testPostOrder() throws IOException {
        Store store = new Store();
        store.setId(8);
        store.setPetId(10);
        store.setQuantity(10);
        store.setShipDate(LocalDate.now().toString());
        store.setStatus("10");
        store.setComplete(true);

        String jsonObject = new Gson().toJson(store);

        PageStore pageStore = new PageStore();
        pageStore.createNewOrder("order", jsonObject);
    }

    @Test
    public void testGetOrderId() throws IOException {
        PageStore pageStore = new PageStore();
        String orderId = pageStore.get("order/" + "8");
        System.out.println(orderId);
    }

    @Test
    public void testDeleteOrderId() throws IOException {
        PageStore pageStore = new PageStore();
        pageStore.deleteOrderId("order/" + "8");
    }

}
