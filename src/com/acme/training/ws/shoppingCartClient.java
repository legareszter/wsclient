package com.acme.training.ws;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class shoppingCartClient {

    /**
     * @param args
     */
    public static void main(String[] args) {
        ShoppingCartWSService service = new ShoppingCartWSService();
        ShoppingCartWS sCWS = service.getShoppingCartWSPort();
        int id = sCWS.getNewShoppingCart();
        System.out.println("Hello! Kerlek, add meg a neved!");
        String customer = readAnswer();
        String[] tmp; 
        String restiName;
        String foodName;
        int quantity;
        String moreFood = "I";
        while (moreFood.equalsIgnoreCase("I")) {
            System.out.println("Mit akarsz rendelni? (etterem neve,etel neve)");
            tmp = readAnswer().split(", *");
            restiName = tmp[0];
            try {
                foodName = tmp[1];
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Nem adtal meg etelt vagy ettermet. Kerlek, add meg ujra! (etterem,etel)");
                tmp = readAnswer().split(", *");
                restiName = tmp[0];
                foodName = tmp[1];
            }
            System.out.println("Mennyit kersz belole?");
            quantity = Integer.parseInt(readAnswer());
            sCWS.addFoodByName(id, restiName, foodName, quantity);
            System.out.println("Kersz meg vmit? (I/N)");
            moreFood = readAnswer();
        }
        System.out.println("Hova szallitsuk? (zip,street)");
        tmp = readAnswer().split(", *"); 
        String zip = tmp[0];
        String street = tmp[1];
        String country = "Magyarorszag";
        String city = "Budapest";
        sCWS.setCustomer(id, customer);
        sCWS.setDeliveryAddress(id, zip, country, city, street);
        sCWS.setBillingAddress(id, zip, country, city, street);
        System.out.println(String.format("Rendelesedet rogzitettuk, szama: %d.", sCWS.checkOut(id)));
    }

    private static String readAnswer() {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String s = null;
        try {
        s = in.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return s;
    }

}
