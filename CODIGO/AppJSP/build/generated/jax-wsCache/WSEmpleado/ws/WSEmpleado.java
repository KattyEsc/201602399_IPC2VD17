
package ws;

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
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebService(name = "WSEmpleado", targetNamespace = "http://ws/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface WSEmpleado {


    /**
     * 
     * @param password
     * @param nickname
     * @return
     *     returns ws.Empleado
     */
    @WebMethod(operationName = "Verifica")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "Verifica", targetNamespace = "http://ws/", className = "ws.Verifica")
    @ResponseWrapper(localName = "VerificaResponse", targetNamespace = "http://ws/", className = "ws.VerificaResponse")
    @Action(input = "http://ws/WSEmpleado/VerificaRequest", output = "http://ws/WSEmpleado/VerificaResponse")
    public Empleado verifica(
        @WebParam(name = "nickname", targetNamespace = "")
        String nickname,
        @WebParam(name = "password", targetNamespace = "")
        String password);

    /**
     * 
     * @param password
     * @param apellido
     * @param nickname
     * @param id
     * @param nombre
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "Registra")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "Registra", targetNamespace = "http://ws/", className = "ws.Registra")
    @ResponseWrapper(localName = "RegistraResponse", targetNamespace = "http://ws/", className = "ws.RegistraResponse")
    @Action(input = "http://ws/WSEmpleado/RegistraRequest", output = "http://ws/WSEmpleado/RegistraResponse")
    public String registra(
        @WebParam(name = "id", targetNamespace = "")
        String id,
        @WebParam(name = "nickname", targetNamespace = "")
        String nickname,
        @WebParam(name = "password", targetNamespace = "")
        String password,
        @WebParam(name = "nombre", targetNamespace = "")
        String nombre,
        @WebParam(name = "apellido", targetNamespace = "")
        String apellido);

}