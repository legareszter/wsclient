
package com.acme.training.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebService(name = "ShoppingCartWS", targetNamespace = "http://ws.training.acme.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ShoppingCartWS {


    /**
     * 
     */
    @WebMethod
    @RequestWrapper(localName = "init", targetNamespace = "http://ws.training.acme.com/", className = "com.acme.training.ws.Init")
    @ResponseWrapper(localName = "initResponse", targetNamespace = "http://ws.training.acme.com/", className = "com.acme.training.ws.InitResponse")
    public void init();

    /**
     * 
     * @param arg0
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getShoppingCartId", targetNamespace = "http://ws.training.acme.com/", className = "com.acme.training.ws.GetShoppingCartId")
    @ResponseWrapper(localName = "getShoppingCartIdResponse", targetNamespace = "http://ws.training.acme.com/", className = "com.acme.training.ws.GetShoppingCartIdResponse")
    public int getShoppingCartId(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "addFood", targetNamespace = "http://ws.training.acme.com/", className = "com.acme.training.ws.AddFood")
    @ResponseWrapper(localName = "addFoodResponse", targetNamespace = "http://ws.training.acme.com/", className = "com.acme.training.ws.AddFoodResponse")
    public void addFood(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        int arg2);

    /**
     * 
     * @param arg4
     * @param arg3
     * @param arg2
     * @param arg1
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "setDeliveryAddress", targetNamespace = "http://ws.training.acme.com/", className = "com.acme.training.ws.SetDeliveryAddress")
    @ResponseWrapper(localName = "setDeliveryAddressResponse", targetNamespace = "http://ws.training.acme.com/", className = "com.acme.training.ws.SetDeliveryAddressResponse")
    public void setDeliveryAddress(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        String arg2,
        @WebParam(name = "arg3", targetNamespace = "")
        String arg3,
        @WebParam(name = "arg4", targetNamespace = "")
        String arg4);

    /**
     * 
     * @param arg0
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "checkOut", targetNamespace = "http://ws.training.acme.com/", className = "com.acme.training.ws.CheckOut")
    @ResponseWrapper(localName = "checkOutResponse", targetNamespace = "http://ws.training.acme.com/", className = "com.acme.training.ws.CheckOutResponse")
    public int checkOut(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @param arg4
     * @param arg3
     * @param arg2
     * @param arg1
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "setBillingAddress", targetNamespace = "http://ws.training.acme.com/", className = "com.acme.training.ws.SetBillingAddress")
    @ResponseWrapper(localName = "setBillingAddressResponse", targetNamespace = "http://ws.training.acme.com/", className = "com.acme.training.ws.SetBillingAddressResponse")
    public void setBillingAddress(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        String arg2,
        @WebParam(name = "arg3", targetNamespace = "")
        String arg3,
        @WebParam(name = "arg4", targetNamespace = "")
        String arg4);

    /**
     * 
     * @param arg1
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "setCustomer", targetNamespace = "http://ws.training.acme.com/", className = "com.acme.training.ws.SetCustomer")
    @ResponseWrapper(localName = "setCustomerResponse", targetNamespace = "http://ws.training.acme.com/", className = "com.acme.training.ws.SetCustomerResponse")
    public void setCustomer(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1);

    /**
     * 
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getNewShoppingCart", targetNamespace = "http://ws.training.acme.com/", className = "com.acme.training.ws.GetNewShoppingCart")
    @ResponseWrapper(localName = "getNewShoppingCartResponse", targetNamespace = "http://ws.training.acme.com/", className = "com.acme.training.ws.GetNewShoppingCartResponse")
    public int getNewShoppingCart();

}