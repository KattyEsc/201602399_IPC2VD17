
package ws;

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
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "WSEmpleado", targetNamespace = "http://ws/", wsdlLocation = "http://localhost:8080/ProyectoIPC2WS/WSEmpleado?wsdl")
public class WSEmpleado_Service
    extends Service
{

    private final static URL WSEMPLEADO_WSDL_LOCATION;
    private final static WebServiceException WSEMPLEADO_EXCEPTION;
    private final static QName WSEMPLEADO_QNAME = new QName("http://ws/", "WSEmpleado");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/ProyectoIPC2WS/WSEmpleado?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        WSEMPLEADO_WSDL_LOCATION = url;
        WSEMPLEADO_EXCEPTION = e;
    }

    public WSEmpleado_Service() {
        super(__getWsdlLocation(), WSEMPLEADO_QNAME);
    }

    public WSEmpleado_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), WSEMPLEADO_QNAME, features);
    }

    public WSEmpleado_Service(URL wsdlLocation) {
        super(wsdlLocation, WSEMPLEADO_QNAME);
    }

    public WSEmpleado_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, WSEMPLEADO_QNAME, features);
    }

    public WSEmpleado_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WSEmpleado_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns WSEmpleado
     */
    @WebEndpoint(name = "WSEmpleadoPort")
    public WSEmpleado getWSEmpleadoPort() {
        return super.getPort(new QName("http://ws/", "WSEmpleadoPort"), WSEmpleado.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WSEmpleado
     */
    @WebEndpoint(name = "WSEmpleadoPort")
    public WSEmpleado getWSEmpleadoPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws/", "WSEmpleadoPort"), WSEmpleado.class, features);
    }

    private static URL __getWsdlLocation() {
        if (WSEMPLEADO_EXCEPTION!= null) {
            throw WSEMPLEADO_EXCEPTION;
        }
        return WSEMPLEADO_WSDL_LOCATION;
    }

}