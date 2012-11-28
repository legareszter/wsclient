package com.acme.training.ws;

public class shoppingCartClient {

    /**
     * @param args
     */
    public static void main(String[] args) {
        ShoppingCartWSService service = new ShoppingCartWSService();
        ShoppingCartWS sCWS = service.getShoppingCartWSPort();
        int id = sCWS.getNewShoppingCart();
//        sCWS.setCustomer(id, "Sztike");
//        sCWS.addFood(id, 2, 3);
//        sCWS.setDeliveryAddress(id, "1082", "Magyarország", "Budapest", "Futó utca");
//        sCWS.setBillingAddress(id, "1082", "Magyarország", "Budapest", "Futó utca");
        String customer = args[0];
        int foodId = Integer.parseInt(args[1]);
        int quantity = Integer.parseInt(args[2]);
        String zip = args[3];
        String country = args[4];
        String city = args[5];
        String street = args[6];
        sCWS.setCustomer(id, customer);
        sCWS.addFood(id, foodId, quantity);
        sCWS.setDeliveryAddress(id, zip, country, city, street);
        sCWS.setBillingAddress(id, zip, country, city, street);
        System.out.println(String.format("Rendelésedet rögzítettük, száma: %d.", sCWS.checkOut(id)));
    }

}
