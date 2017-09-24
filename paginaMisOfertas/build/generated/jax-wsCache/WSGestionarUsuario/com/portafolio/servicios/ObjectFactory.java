
package com.portafolio.servicios;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.portafolio.servicios package. 
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

    private final static QName _EliminarUsuario_QNAME = new QName("http://service.portafolio.com/", "eliminarUsuario");
    private final static QName _EliminarUsuarioResponse_QNAME = new QName("http://service.portafolio.com/", "eliminarUsuarioResponse");
    private final static QName _Hello_QNAME = new QName("http://service.portafolio.com/", "hello");
    private final static QName _HelloResponse_QNAME = new QName("http://service.portafolio.com/", "helloResponse");
    private final static QName _IngresarUsuario_QNAME = new QName("http://service.portafolio.com/", "ingresarUsuario");
    private final static QName _IngresarUsuarioResponse_QNAME = new QName("http://service.portafolio.com/", "ingresarUsuarioResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.portafolio.servicios
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EliminarUsuario }
     * 
     */
    public EliminarUsuario createEliminarUsuario() {
        return new EliminarUsuario();
    }

    /**
     * Create an instance of {@link EliminarUsuarioResponse }
     * 
     */
    public EliminarUsuarioResponse createEliminarUsuarioResponse() {
        return new EliminarUsuarioResponse();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link IngresarUsuario }
     * 
     */
    public IngresarUsuario createIngresarUsuario() {
        return new IngresarUsuario();
    }

    /**
     * Create an instance of {@link IngresarUsuarioResponse }
     * 
     */
    public IngresarUsuarioResponse createIngresarUsuarioResponse() {
        return new IngresarUsuarioResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarUsuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.portafolio.com/", name = "eliminarUsuario")
    public JAXBElement<EliminarUsuario> createEliminarUsuario(EliminarUsuario value) {
        return new JAXBElement<EliminarUsuario>(_EliminarUsuario_QNAME, EliminarUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarUsuarioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.portafolio.com/", name = "eliminarUsuarioResponse")
    public JAXBElement<EliminarUsuarioResponse> createEliminarUsuarioResponse(EliminarUsuarioResponse value) {
        return new JAXBElement<EliminarUsuarioResponse>(_EliminarUsuarioResponse_QNAME, EliminarUsuarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.portafolio.com/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.portafolio.com/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IngresarUsuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.portafolio.com/", name = "ingresarUsuario")
    public JAXBElement<IngresarUsuario> createIngresarUsuario(IngresarUsuario value) {
        return new JAXBElement<IngresarUsuario>(_IngresarUsuario_QNAME, IngresarUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IngresarUsuarioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.portafolio.com/", name = "ingresarUsuarioResponse")
    public JAXBElement<IngresarUsuarioResponse> createIngresarUsuarioResponse(IngresarUsuarioResponse value) {
        return new JAXBElement<IngresarUsuarioResponse>(_IngresarUsuarioResponse_QNAME, IngresarUsuarioResponse.class, null, value);
    }

}
