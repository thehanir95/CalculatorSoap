
package com.calculator;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.calculator package. 
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

    private final static QName _IntegerAddition_QNAME = new QName("http://calculator.com/", "IntegerAddition");
    private final static QName _IntegerAdditionResponse_QNAME = new QName("http://calculator.com/", "IntegerAdditionResponse");
    private final static QName _IntegerDivition_QNAME = new QName("http://calculator.com/", "IntegerDivition");
    private final static QName _IntegerDivitionResponse_QNAME = new QName("http://calculator.com/", "IntegerDivitionResponse");
    private final static QName _IntegerMultiplication_QNAME = new QName("http://calculator.com/", "IntegerMultiplication");
    private final static QName _IntegerMultiplicationResponse_QNAME = new QName("http://calculator.com/", "IntegerMultiplicationResponse");
    private final static QName _IntegerSubstraction_QNAME = new QName("http://calculator.com/", "IntegerSubstraction");
    private final static QName _IntegerSubstractionResponse_QNAME = new QName("http://calculator.com/", "IntegerSubstractionResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.calculator
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link IntegerAddition }
     * 
     */
    public IntegerAddition createIntegerAddition() {
        return new IntegerAddition();
    }

    /**
     * Create an instance of {@link IntegerAdditionResponse }
     * 
     */
    public IntegerAdditionResponse createIntegerAdditionResponse() {
        return new IntegerAdditionResponse();
    }

    /**
     * Create an instance of {@link IntegerDivition }
     * 
     */
    public IntegerDivition createIntegerDivition() {
        return new IntegerDivition();
    }

    /**
     * Create an instance of {@link IntegerDivitionResponse }
     * 
     */
    public IntegerDivitionResponse createIntegerDivitionResponse() {
        return new IntegerDivitionResponse();
    }

    /**
     * Create an instance of {@link IntegerMultiplication }
     * 
     */
    public IntegerMultiplication createIntegerMultiplication() {
        return new IntegerMultiplication();
    }

    /**
     * Create an instance of {@link IntegerMultiplicationResponse }
     * 
     */
    public IntegerMultiplicationResponse createIntegerMultiplicationResponse() {
        return new IntegerMultiplicationResponse();
    }

    /**
     * Create an instance of {@link IntegerSubstraction }
     * 
     */
    public IntegerSubstraction createIntegerSubstraction() {
        return new IntegerSubstraction();
    }

    /**
     * Create an instance of {@link IntegerSubstractionResponse }
     * 
     */
    public IntegerSubstractionResponse createIntegerSubstractionResponse() {
        return new IntegerSubstractionResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IntegerAddition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://calculator.com/", name = "IntegerAddition")
    public JAXBElement<IntegerAddition> createIntegerAddition(IntegerAddition value) {
        return new JAXBElement<IntegerAddition>(_IntegerAddition_QNAME, IntegerAddition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IntegerAdditionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://calculator.com/", name = "IntegerAdditionResponse")
    public JAXBElement<IntegerAdditionResponse> createIntegerAdditionResponse(IntegerAdditionResponse value) {
        return new JAXBElement<IntegerAdditionResponse>(_IntegerAdditionResponse_QNAME, IntegerAdditionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IntegerDivition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://calculator.com/", name = "IntegerDivition")
    public JAXBElement<IntegerDivition> createIntegerDivition(IntegerDivition value) {
        return new JAXBElement<IntegerDivition>(_IntegerDivition_QNAME, IntegerDivition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IntegerDivitionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://calculator.com/", name = "IntegerDivitionResponse")
    public JAXBElement<IntegerDivitionResponse> createIntegerDivitionResponse(IntegerDivitionResponse value) {
        return new JAXBElement<IntegerDivitionResponse>(_IntegerDivitionResponse_QNAME, IntegerDivitionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IntegerMultiplication }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://calculator.com/", name = "IntegerMultiplication")
    public JAXBElement<IntegerMultiplication> createIntegerMultiplication(IntegerMultiplication value) {
        return new JAXBElement<IntegerMultiplication>(_IntegerMultiplication_QNAME, IntegerMultiplication.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IntegerMultiplicationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://calculator.com/", name = "IntegerMultiplicationResponse")
    public JAXBElement<IntegerMultiplicationResponse> createIntegerMultiplicationResponse(IntegerMultiplicationResponse value) {
        return new JAXBElement<IntegerMultiplicationResponse>(_IntegerMultiplicationResponse_QNAME, IntegerMultiplicationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IntegerSubstraction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://calculator.com/", name = "IntegerSubstraction")
    public JAXBElement<IntegerSubstraction> createIntegerSubstraction(IntegerSubstraction value) {
        return new JAXBElement<IntegerSubstraction>(_IntegerSubstraction_QNAME, IntegerSubstraction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IntegerSubstractionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://calculator.com/", name = "IntegerSubstractionResponse")
    public JAXBElement<IntegerSubstractionResponse> createIntegerSubstractionResponse(IntegerSubstractionResponse value) {
        return new JAXBElement<IntegerSubstractionResponse>(_IntegerSubstractionResponse_QNAME, IntegerSubstractionResponse.class, null, value);
    }

}
