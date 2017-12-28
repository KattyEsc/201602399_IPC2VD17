
package ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ws package. 
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

    private final static QName _Registra_QNAME = new QName("http://ws/", "Registra");
    private final static QName _RegistraResponse_QNAME = new QName("http://ws/", "RegistraResponse");
    private final static QName _Verifica_QNAME = new QName("http://ws/", "Verifica");
    private final static QName _VerificaResponse_QNAME = new QName("http://ws/", "VerificaResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Registra }
     * 
     */
    public Registra createRegistra() {
        return new Registra();
    }

    /**
     * Create an instance of {@link RegistraResponse }
     * 
     */
    public RegistraResponse createRegistraResponse() {
        return new RegistraResponse();
    }

    /**
     * Create an instance of {@link Verifica }
     * 
     */
    public Verifica createVerifica() {
        return new Verifica();
    }

    /**
     * Create an instance of {@link VerificaResponse }
     * 
     */
    public VerificaResponse createVerificaResponse() {
        return new VerificaResponse();
    }

    /**
     * Create an instance of {@link Empleado }
     * 
     */
    public Empleado createEmpleado() {
        return new Empleado();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Registra }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "Registra")
    public JAXBElement<Registra> createRegistra(Registra value) {
        return new JAXBElement<Registra>(_Registra_QNAME, Registra.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistraResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "RegistraResponse")
    public JAXBElement<RegistraResponse> createRegistraResponse(RegistraResponse value) {
        return new JAXBElement<RegistraResponse>(_RegistraResponse_QNAME, RegistraResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Verifica }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "Verifica")
    public JAXBElement<Verifica> createVerifica(Verifica value) {
        return new JAXBElement<Verifica>(_Verifica_QNAME, Verifica.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerificaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "VerificaResponse")
    public JAXBElement<VerificaResponse> createVerificaResponse(VerificaResponse value) {
        return new JAXBElement<VerificaResponse>(_VerificaResponse_QNAME, VerificaResponse.class, null, value);
    }

}
