
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

    private final static QName _ObtenerInformacionGeneralResponse_QNAME = new QName("http://ws.company.pe/", "obtenerInformacionGeneralResponse");
    private final static QName _ObtenerInformacionGeneral_QNAME = new QName("http://ws.company.pe/", "obtenerInformacionGeneral");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: pe.company.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ObtenerInformacionGeneralResponse }
     * 
     */
    public ObtenerInformacionGeneralResponse createObtenerInformacionGeneralResponse() {
        return new ObtenerInformacionGeneralResponse();
    }

    /**
     * Create an instance of {@link ObtenerInformacionGeneral }
     * 
     */
    public ObtenerInformacionGeneral createObtenerInformacionGeneral() {
        return new ObtenerInformacionGeneral();
    }

    /**
     * Create an instance of {@link Pelicula }
     * 
     */
    public Pelicula createPelicula() {
        return new Pelicula();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerInformacionGeneralResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.company.pe/", name = "obtenerInformacionGeneralResponse")
    public JAXBElement<ObtenerInformacionGeneralResponse> createObtenerInformacionGeneralResponse(ObtenerInformacionGeneralResponse value) {
        return new JAXBElement<ObtenerInformacionGeneralResponse>(_ObtenerInformacionGeneralResponse_QNAME, ObtenerInformacionGeneralResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerInformacionGeneral }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.company.pe/", name = "obtenerInformacionGeneral")
    public JAXBElement<ObtenerInformacionGeneral> createObtenerInformacionGeneral(ObtenerInformacionGeneral value) {
        return new JAXBElement<ObtenerInformacionGeneral>(_ObtenerInformacionGeneral_QNAME, ObtenerInformacionGeneral.class, null, value);
    }

}
