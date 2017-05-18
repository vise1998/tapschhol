
package org.vise.modificautente;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.vise.modificautente package. 
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

    private final static QName _ModificaNome_QNAME = new QName("http://modificaUtente.vise.org/", "modificaNome");
    private final static QName _ModificaNomeResponse_QNAME = new QName("http://modificaUtente.vise.org/", "modificaNomeResponse");
    private final static QName _ModificaCognomeResponse_QNAME = new QName("http://modificaUtente.vise.org/", "modificaCognomeResponse");
    private final static QName _ModificaCognome_QNAME = new QName("http://modificaUtente.vise.org/", "modificaCognome");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.vise.modificautente
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ModificaCognomeResponse }
     * 
     */
    public ModificaCognomeResponse createModificaCognomeResponse() {
        return new ModificaCognomeResponse();
    }

    /**
     * Create an instance of {@link ModificaNomeResponse }
     * 
     */
    public ModificaNomeResponse createModificaNomeResponse() {
        return new ModificaNomeResponse();
    }

    /**
     * Create an instance of {@link ModificaCognome }
     * 
     */
    public ModificaCognome createModificaCognome() {
        return new ModificaCognome();
    }

    /**
     * Create an instance of {@link ModificaNome }
     * 
     */
    public ModificaNome createModificaNome() {
        return new ModificaNome();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModificaNome }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://modificaUtente.vise.org/", name = "modificaNome")
    public JAXBElement<ModificaNome> createModificaNome(ModificaNome value) {
        return new JAXBElement<ModificaNome>(_ModificaNome_QNAME, ModificaNome.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModificaNomeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://modificaUtente.vise.org/", name = "modificaNomeResponse")
    public JAXBElement<ModificaNomeResponse> createModificaNomeResponse(ModificaNomeResponse value) {
        return new JAXBElement<ModificaNomeResponse>(_ModificaNomeResponse_QNAME, ModificaNomeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModificaCognomeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://modificaUtente.vise.org/", name = "modificaCognomeResponse")
    public JAXBElement<ModificaCognomeResponse> createModificaCognomeResponse(ModificaCognomeResponse value) {
        return new JAXBElement<ModificaCognomeResponse>(_ModificaCognomeResponse_QNAME, ModificaCognomeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModificaCognome }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://modificaUtente.vise.org/", name = "modificaCognome")
    public JAXBElement<ModificaCognome> createModificaCognome(ModificaCognome value) {
        return new JAXBElement<ModificaCognome>(_ModificaCognome_QNAME, ModificaCognome.class, null, value);
    }

}
