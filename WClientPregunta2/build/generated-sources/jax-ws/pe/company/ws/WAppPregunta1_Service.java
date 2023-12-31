
package pe.company.ws;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "WAppPregunta1", targetNamespace = "http://ws.company.pe/", wsdlLocation = "http://localhost:8080/WSPregunta1/WAppPregunta1?wsdl")
public class WAppPregunta1_Service
    extends Service
{

    private final static URL WAPPPREGUNTA1_WSDL_LOCATION;
    private final static WebServiceException WAPPPREGUNTA1_EXCEPTION;
    private final static QName WAPPPREGUNTA1_QNAME = new QName("http://ws.company.pe/", "WAppPregunta1");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/WSPregunta1/WAppPregunta1?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        WAPPPREGUNTA1_WSDL_LOCATION = url;
        WAPPPREGUNTA1_EXCEPTION = e;
    }

    public WAppPregunta1_Service() {
        super(__getWsdlLocation(), WAPPPREGUNTA1_QNAME);
    }

    public WAppPregunta1_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), WAPPPREGUNTA1_QNAME, features);
    }

    public WAppPregunta1_Service(URL wsdlLocation) {
        super(wsdlLocation, WAPPPREGUNTA1_QNAME);
    }

    public WAppPregunta1_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, WAPPPREGUNTA1_QNAME, features);
    }

    public WAppPregunta1_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WAppPregunta1_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns WAppPregunta1
     */
    @WebEndpoint(name = "WAppPregunta1Port")
    public WAppPregunta1 getWAppPregunta1Port() {
        return super.getPort(new QName("http://ws.company.pe/", "WAppPregunta1Port"), WAppPregunta1.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WAppPregunta1
     */
    @WebEndpoint(name = "WAppPregunta1Port")
    public WAppPregunta1 getWAppPregunta1Port(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws.company.pe/", "WAppPregunta1Port"), WAppPregunta1.class, features);
    }

    private static URL __getWsdlLocation() {
        if (WAPPPREGUNTA1_EXCEPTION!= null) {
            throw WAPPPREGUNTA1_EXCEPTION;
        }
        return WAPPPREGUNTA1_WSDL_LOCATION;
    }

}
