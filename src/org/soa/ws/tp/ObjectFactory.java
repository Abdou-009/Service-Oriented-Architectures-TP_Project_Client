
package org.soa.ws.tp;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.soa.ws.tp package. 
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

    private final static QName _GetMaxValue_QNAME = new QName("http://tp.ws.soa.org/", "getMaxValue");
    private final static QName _GetMinValueResponse_QNAME = new QName("http://tp.ws.soa.org/", "getMinValueResponse");
    private final static QName _ToUpperString_QNAME = new QName("http://tp.ws.soa.org/", "toUpperString");
    private final static QName _ToUpperStringResponse_QNAME = new QName("http://tp.ws.soa.org/", "toUpperStringResponse");
    private final static QName _GetMinValue_QNAME = new QName("http://tp.ws.soa.org/", "getMinValue");
    private final static QName _GetMoyValue_QNAME = new QName("http://tp.ws.soa.org/", "getMoyValue");
    private final static QName _ToLowerString_QNAME = new QName("http://tp.ws.soa.org/", "toLowerString");
    private final static QName _GetMoyValueResponse_QNAME = new QName("http://tp.ws.soa.org/", "getMoyValueResponse");
    private final static QName _GetMaxValueResponse_QNAME = new QName("http://tp.ws.soa.org/", "getMaxValueResponse");
    private final static QName _ToLowerStringResponse_QNAME = new QName("http://tp.ws.soa.org/", "toLowerStringResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.soa.ws.tp
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetMinValue }
     * 
     */
    public GetMinValue createGetMinValue() {
        return new GetMinValue();
    }

    /**
     * Create an instance of {@link GetMoyValue }
     * 
     */
    public GetMoyValue createGetMoyValue() {
        return new GetMoyValue();
    }

    /**
     * Create an instance of {@link ToUpperStringResponse }
     * 
     */
    public ToUpperStringResponse createToUpperStringResponse() {
        return new ToUpperStringResponse();
    }

    /**
     * Create an instance of {@link GetMaxValue }
     * 
     */
    public GetMaxValue createGetMaxValue() {
        return new GetMaxValue();
    }

    /**
     * Create an instance of {@link GetMinValueResponse }
     * 
     */
    public GetMinValueResponse createGetMinValueResponse() {
        return new GetMinValueResponse();
    }

    /**
     * Create an instance of {@link ToUpperString }
     * 
     */
    public ToUpperString createToUpperString() {
        return new ToUpperString();
    }

    /**
     * Create an instance of {@link GetMaxValueResponse }
     * 
     */
    public GetMaxValueResponse createGetMaxValueResponse() {
        return new GetMaxValueResponse();
    }

    /**
     * Create an instance of {@link ToLowerStringResponse }
     * 
     */
    public ToLowerStringResponse createToLowerStringResponse() {
        return new ToLowerStringResponse();
    }

    /**
     * Create an instance of {@link GetMoyValueResponse }
     * 
     */
    public GetMoyValueResponse createGetMoyValueResponse() {
        return new GetMoyValueResponse();
    }

    /**
     * Create an instance of {@link ToLowerString }
     * 
     */
    public ToLowerString createToLowerString() {
        return new ToLowerString();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMaxValue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tp.ws.soa.org/", name = "getMaxValue")
    public JAXBElement<GetMaxValue> createGetMaxValue(GetMaxValue value) {
        return new JAXBElement<GetMaxValue>(_GetMaxValue_QNAME, GetMaxValue.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMinValueResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tp.ws.soa.org/", name = "getMinValueResponse")
    public JAXBElement<GetMinValueResponse> createGetMinValueResponse(GetMinValueResponse value) {
        return new JAXBElement<GetMinValueResponse>(_GetMinValueResponse_QNAME, GetMinValueResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ToUpperString }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tp.ws.soa.org/", name = "toUpperString")
    public JAXBElement<ToUpperString> createToUpperString(ToUpperString value) {
        return new JAXBElement<ToUpperString>(_ToUpperString_QNAME, ToUpperString.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ToUpperStringResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tp.ws.soa.org/", name = "toUpperStringResponse")
    public JAXBElement<ToUpperStringResponse> createToUpperStringResponse(ToUpperStringResponse value) {
        return new JAXBElement<ToUpperStringResponse>(_ToUpperStringResponse_QNAME, ToUpperStringResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMinValue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tp.ws.soa.org/", name = "getMinValue")
    public JAXBElement<GetMinValue> createGetMinValue(GetMinValue value) {
        return new JAXBElement<GetMinValue>(_GetMinValue_QNAME, GetMinValue.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMoyValue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tp.ws.soa.org/", name = "getMoyValue")
    public JAXBElement<GetMoyValue> createGetMoyValue(GetMoyValue value) {
        return new JAXBElement<GetMoyValue>(_GetMoyValue_QNAME, GetMoyValue.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ToLowerString }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tp.ws.soa.org/", name = "toLowerString")
    public JAXBElement<ToLowerString> createToLowerString(ToLowerString value) {
        return new JAXBElement<ToLowerString>(_ToLowerString_QNAME, ToLowerString.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMoyValueResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tp.ws.soa.org/", name = "getMoyValueResponse")
    public JAXBElement<GetMoyValueResponse> createGetMoyValueResponse(GetMoyValueResponse value) {
        return new JAXBElement<GetMoyValueResponse>(_GetMoyValueResponse_QNAME, GetMoyValueResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMaxValueResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tp.ws.soa.org/", name = "getMaxValueResponse")
    public JAXBElement<GetMaxValueResponse> createGetMaxValueResponse(GetMaxValueResponse value) {
        return new JAXBElement<GetMaxValueResponse>(_GetMaxValueResponse_QNAME, GetMaxValueResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ToLowerStringResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tp.ws.soa.org/", name = "toLowerStringResponse")
    public JAXBElement<ToLowerStringResponse> createToLowerStringResponse(ToLowerStringResponse value) {
        return new JAXBElement<ToLowerStringResponse>(_ToLowerStringResponse_QNAME, ToLowerStringResponse.class, null, value);
    }

}
