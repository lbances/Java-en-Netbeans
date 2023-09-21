
package pe.company.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the pe.company.ws package. 
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

    private final static QName _Baraja_QNAME = new QName("http://ws.company.pe/", "baraja");
    private final static QName _BarajaResponse_QNAME = new QName("http://ws.company.pe/", "barajaResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: pe.company.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Baraja }
     * 
     */
    public Baraja createBaraja() {
        return new Baraja();
    }

    /**
     * Create an instance of {@link BarajaResponse }
     * 
     */
    public BarajaResponse createBarajaResponse() {
        return new BarajaResponse();
    }

    /**
     * Create an instance of {@link Empleado }
     * 
     */
    public Empleado createEmpleado() {
        return new Empleado();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Baraja }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.company.pe/", name = "baraja")
    public JAXBElement<Baraja> createBaraja(Baraja value) {
        return new JAXBElement<Baraja>(_Baraja_QNAME, Baraja.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BarajaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.company.pe/", name = "barajaResponse")
    public JAXBElement<BarajaResponse> createBarajaResponse(BarajaResponse value) {
        return new JAXBElement<BarajaResponse>(_BarajaResponse_QNAME, BarajaResponse.class, null, value);
    }

}
