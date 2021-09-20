package api;

import httpClient.HttpClient;
import okhttp3.RequestBody;

import java.io.IOException;
import java.nio.charset.StandardCharsets;


public class PageStore {
    String baseUrl = "https://petstore.swagger.io/v2/store/";

    public String get(String url) throws IOException {
        String request = new HttpClient().getRequest(baseUrl + url);
        return request;
    }

    public String createNewOrder(String url, String jsonObject) throws IOException {
        RequestBody requestBody = RequestBody.create(jsonObject.toString().getBytes(StandardCharsets.UTF_8));
        String order = new HttpClient().postRequest(baseUrl + url, requestBody);
        System.out.println(order);
        return order;
    }

    public void deleteOrderId(String url) throws IOException {
         new HttpClient().deleteRequest(baseUrl + url);
    }

}
