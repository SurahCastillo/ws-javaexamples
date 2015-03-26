
package es.udc.ws.movies.service.jaxws.wsdl;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.7-b01-
 * Generated source version: 2.1
 * 
 */
@SuppressWarnings("serial")
@WebFault(name = "MovieException", targetNamespace = "http://movies.ws.adoo.udc.es/")
public class MovieException
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private MovieExceptionInfo faultInfo;

    /**
     * 
     * @param message
     * @param faultInfo
     */
    public MovieException(String message, MovieExceptionInfo faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public MovieException(String message, MovieExceptionInfo faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: es.udc.ws.movies.service.jaxws.wsdl.MovieExceptionInfo
     */
    public MovieExceptionInfo getFaultInfo() {
        return faultInfo;
    }

}