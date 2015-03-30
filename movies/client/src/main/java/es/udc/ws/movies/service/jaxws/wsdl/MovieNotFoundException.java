
package es.udc.ws.movies.service.jaxws.wsdl;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.7-b01-
 * Generated source version: 2.1
 * 
 */
@WebFault(name = "MovieNotFoundException", targetNamespace = "http://movies.ws.adoo.udc.es/")
public class MovieNotFoundException
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private MovieNotFoundExceptionInfo faultInfo;

    /**
     * 
     * @param message
     * @param faultInfo
     */
    public MovieNotFoundException(String message, MovieNotFoundExceptionInfo faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public MovieNotFoundException(String message, MovieNotFoundExceptionInfo faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: es.udc.ws.movies.service.jaxws.wsdl.MovieNotFoundExceptionInfo
     */
    public MovieNotFoundExceptionInfo getFaultInfo() {
        return faultInfo;
    }

}
