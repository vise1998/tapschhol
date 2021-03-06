
package org.vise.modificautente;

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
@WebService(name = "ws_modificaUtente", targetNamespace = "http://modificaUtente.vise.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface WsModificaUtente {


    /**
     * 
     * @param id
     * @param tipo
     * @param cognome
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "modificaCognome", targetNamespace = "http://modificaUtente.vise.org/", className = "org.vise.modificautente.ModificaCognome")
    @ResponseWrapper(localName = "modificaCognomeResponse", targetNamespace = "http://modificaUtente.vise.org/", className = "org.vise.modificautente.ModificaCognomeResponse")
    @Action(input = "http://modificaUtente.vise.org/ws_modificaUtente/modificaCognomeRequest", output = "http://modificaUtente.vise.org/ws_modificaUtente/modificaCognomeResponse")
    public boolean modificaCognome(
        @WebParam(name = "id", targetNamespace = "")
        int id,
        @WebParam(name = "tipo", targetNamespace = "")
        int tipo,
        @WebParam(name = "cognome", targetNamespace = "")
        String cognome);

    /**
     * 
     * @param id
     * @param tipo
     * @param nome
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "modificaNome", targetNamespace = "http://modificaUtente.vise.org/", className = "org.vise.modificautente.ModificaNome")
    @ResponseWrapper(localName = "modificaNomeResponse", targetNamespace = "http://modificaUtente.vise.org/", className = "org.vise.modificautente.ModificaNomeResponse")
    @Action(input = "http://modificaUtente.vise.org/ws_modificaUtente/modificaNomeRequest", output = "http://modificaUtente.vise.org/ws_modificaUtente/modificaNomeResponse")
    public boolean modificaNome(
        @WebParam(name = "id", targetNamespace = "")
        int id,
        @WebParam(name = "tipo", targetNamespace = "")
        int tipo,
        @WebParam(name = "nome", targetNamespace = "")
        String nome);

}
