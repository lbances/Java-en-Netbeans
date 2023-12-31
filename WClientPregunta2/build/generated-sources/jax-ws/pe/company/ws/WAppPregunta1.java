
package pe.company.ws;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "WAppPregunta1", targetNamespace = "http://ws.company.pe/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface WAppPregunta1 {


    /**
     * 
     * @param titulo
     * @return
     *     returns java.util.List<pe.company.ws.Pelicula>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "obtenerInformacionGeneral", targetNamespace = "http://ws.company.pe/", className = "pe.company.ws.ObtenerInformacionGeneral")
    @ResponseWrapper(localName = "obtenerInformacionGeneralResponse", targetNamespace = "http://ws.company.pe/", className = "pe.company.ws.ObtenerInformacionGeneralResponse")
    @Action(input = "http://ws.company.pe/WAppPregunta1/obtenerInformacionGeneralRequest", output = "http://ws.company.pe/WAppPregunta1/obtenerInformacionGeneralResponse")
    public List<Pelicula> obtenerInformacionGeneral(
        @WebParam(name = "titulo", targetNamespace = "")
        String titulo);

}
