
package com.acme.training.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.acme.training.ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _SetDeliveryAddress_QNAME = new QName("http://ws.training.acme.com/", "setDeliveryAddress");
    private final static QName _GetShoppingCartIdResponse_QNAME = new QName("http://ws.training.acme.com/", "getShoppingCartIdResponse");
    private final static QName _Init_QNAME = new QName("http://ws.training.acme.com/", "init");
    private final static QName _GetNewShoppingCartResponse_QNAME = new QName("http://ws.training.acme.com/", "getNewShoppingCartResponse");
    private final static QName _CheckOutResponse_QNAME = new QName("http://ws.training.acme.com/", "checkOutResponse");
    private final static QName _InitResponse_QNAME = new QName("http://ws.training.acme.com/", "initResponse");
    private final static QName _AddFood_QNAME = new QName("http://ws.training.acme.com/", "addFood");
    private final static QName _SetDeliveryAddressResponse_QNAME = new QName("http://ws.training.acme.com/", "setDeliveryAddressResponse");
    private final static QName _SetCustomerResponse_QNAME = new QName("http://ws.training.acme.com/", "setCustomerResponse");
    private final static QName _GetNewShoppingCart_QNAME = new QName("http://ws.training.acme.com/", "getNewShoppingCart");
    private final static QName _GetShoppingCartId_QNAME = new QName("http://ws.training.acme.com/", "getShoppingCartId");
    private final static QName _AddFoodResponse_QNAME = new QName("http://ws.training.acme.com/", "addFoodResponse");
    private final static QName _SetCustomer_QNAME = new QName("http://ws.training.acme.com/", "setCustomer");
    private final static QName _SetBillingAddressResponse_QNAME = new QName("http://ws.training.acme.com/", "setBillingAddressResponse");
    private final static QName _CheckOut_QNAME = new QName("http://ws.training.acme.com/", "checkOut");
    private final static QName _SetBillingAddress_QNAME = new QName("http://ws.training.acme.com/", "setBillingAddress");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.acme.training.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SetBillingAddress }
     * 
     */
    public SetBillingAddress createSetBillingAddress() {
        return new SetBillingAddress();
    }

    /**
     * Create an instance of {@link GetNewShoppingCart }
     * 
     */
    public GetNewShoppingCart createGetNewShoppingCart() {
        return new GetNewShoppingCart();
    }

    /**
     * Create an instance of {@link SetCustomerResponse }
     * 
     */
    public SetCustomerResponse createSetCustomerResponse() {
        return new SetCustomerResponse();
    }

    /**
     * Create an instance of {@link InitResponse }
     * 
     */
    public InitResponse createInitResponse() {
        return new InitResponse();
    }

    /**
     * Create an instance of {@link SetDeliveryAddressResponse }
     * 
     */
    public SetDeliveryAddressResponse createSetDeliveryAddressResponse() {
        return new SetDeliveryAddressResponse();
    }

    /**
     * Create an instance of {@link AddFoodResponse }
     * 
     */
    public AddFoodResponse createAddFoodResponse() {
        return new AddFoodResponse();
    }

    /**
     * Create an instance of {@link GetShoppingCartIdResponse }
     * 
     */
    public GetShoppingCartIdResponse createGetShoppingCartIdResponse() {
        return new GetShoppingCartIdResponse();
    }

    /**
     * Create an instance of {@link GetShoppingCartId }
     * 
     */
    public GetShoppingCartId createGetShoppingCartId() {
        return new GetShoppingCartId();
    }

    /**
     * Create an instance of {@link CheckOutResponse }
     * 
     */
    public CheckOutResponse createCheckOutResponse() {
        return new CheckOutResponse();
    }

    /**
     * Create an instance of {@link SetBillingAddressResponse }
     * 
     */
    public SetBillingAddressResponse createSetBillingAddressResponse() {
        return new SetBillingAddressResponse();
    }

    /**
     * Create an instance of {@link CheckOut }
     * 
     */
    public CheckOut createCheckOut() {
        return new CheckOut();
    }

    /**
     * Create an instance of {@link SetDeliveryAddress }
     * 
     */
    public SetDeliveryAddress createSetDeliveryAddress() {
        return new SetDeliveryAddress();
    }

    /**
     * Create an instance of {@link AddFood }
     * 
     */
    public AddFood createAddFood() {
        return new AddFood();
    }

    /**
     * Create an instance of {@link SetCustomer }
     * 
     */
    public SetCustomer createSetCustomer() {
        return new SetCustomer();
    }

    /**
     * Create an instance of {@link GetNewShoppingCartResponse }
     * 
     */
    public GetNewShoppingCartResponse createGetNewShoppingCartResponse() {
        return new GetNewShoppingCartResponse();
    }

    /**
     * Create an instance of {@link Init }
     * 
     */
    public Init createInit() {
        return new Init();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetDeliveryAddress }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.training.acme.com/", name = "setDeliveryAddress")
    public JAXBElement<SetDeliveryAddress> createSetDeliveryAddress(SetDeliveryAddress value) {
        return new JAXBElement<SetDeliveryAddress>(_SetDeliveryAddress_QNAME, SetDeliveryAddress.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetShoppingCartIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.training.acme.com/", name = "getShoppingCartIdResponse")
    public JAXBElement<GetShoppingCartIdResponse> createGetShoppingCartIdResponse(GetShoppingCartIdResponse value) {
        return new JAXBElement<GetShoppingCartIdResponse>(_GetShoppingCartIdResponse_QNAME, GetShoppingCartIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Init }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.training.acme.com/", name = "init")
    public JAXBElement<Init> createInit(Init value) {
        return new JAXBElement<Init>(_Init_QNAME, Init.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNewShoppingCartResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.training.acme.com/", name = "getNewShoppingCartResponse")
    public JAXBElement<GetNewShoppingCartResponse> createGetNewShoppingCartResponse(GetNewShoppingCartResponse value) {
        return new JAXBElement<GetNewShoppingCartResponse>(_GetNewShoppingCartResponse_QNAME, GetNewShoppingCartResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckOutResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.training.acme.com/", name = "checkOutResponse")
    public JAXBElement<CheckOutResponse> createCheckOutResponse(CheckOutResponse value) {
        return new JAXBElement<CheckOutResponse>(_CheckOutResponse_QNAME, CheckOutResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InitResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.training.acme.com/", name = "initResponse")
    public JAXBElement<InitResponse> createInitResponse(InitResponse value) {
        return new JAXBElement<InitResponse>(_InitResponse_QNAME, InitResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddFood }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.training.acme.com/", name = "addFood")
    public JAXBElement<AddFood> createAddFood(AddFood value) {
        return new JAXBElement<AddFood>(_AddFood_QNAME, AddFood.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetDeliveryAddressResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.training.acme.com/", name = "setDeliveryAddressResponse")
    public JAXBElement<SetDeliveryAddressResponse> createSetDeliveryAddressResponse(SetDeliveryAddressResponse value) {
        return new JAXBElement<SetDeliveryAddressResponse>(_SetDeliveryAddressResponse_QNAME, SetDeliveryAddressResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetCustomerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.training.acme.com/", name = "setCustomerResponse")
    public JAXBElement<SetCustomerResponse> createSetCustomerResponse(SetCustomerResponse value) {
        return new JAXBElement<SetCustomerResponse>(_SetCustomerResponse_QNAME, SetCustomerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNewShoppingCart }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.training.acme.com/", name = "getNewShoppingCart")
    public JAXBElement<GetNewShoppingCart> createGetNewShoppingCart(GetNewShoppingCart value) {
        return new JAXBElement<GetNewShoppingCart>(_GetNewShoppingCart_QNAME, GetNewShoppingCart.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetShoppingCartId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.training.acme.com/", name = "getShoppingCartId")
    public JAXBElement<GetShoppingCartId> createGetShoppingCartId(GetShoppingCartId value) {
        return new JAXBElement<GetShoppingCartId>(_GetShoppingCartId_QNAME, GetShoppingCartId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddFoodResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.training.acme.com/", name = "addFoodResponse")
    public JAXBElement<AddFoodResponse> createAddFoodResponse(AddFoodResponse value) {
        return new JAXBElement<AddFoodResponse>(_AddFoodResponse_QNAME, AddFoodResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetCustomer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.training.acme.com/", name = "setCustomer")
    public JAXBElement<SetCustomer> createSetCustomer(SetCustomer value) {
        return new JAXBElement<SetCustomer>(_SetCustomer_QNAME, SetCustomer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetBillingAddressResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.training.acme.com/", name = "setBillingAddressResponse")
    public JAXBElement<SetBillingAddressResponse> createSetBillingAddressResponse(SetBillingAddressResponse value) {
        return new JAXBElement<SetBillingAddressResponse>(_SetBillingAddressResponse_QNAME, SetBillingAddressResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckOut }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.training.acme.com/", name = "checkOut")
    public JAXBElement<CheckOut> createCheckOut(CheckOut value) {
        return new JAXBElement<CheckOut>(_CheckOut_QNAME, CheckOut.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetBillingAddress }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.training.acme.com/", name = "setBillingAddress")
    public JAXBElement<SetBillingAddress> createSetBillingAddress(SetBillingAddress value) {
        return new JAXBElement<SetBillingAddress>(_SetBillingAddress_QNAME, SetBillingAddress.class, null, value);
    }

}
