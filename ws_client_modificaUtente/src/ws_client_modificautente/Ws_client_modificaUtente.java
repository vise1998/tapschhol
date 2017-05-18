
package ws_client_modificautente;

/**
 *
 * @author Fabio
 */
public class Ws_client_modificaUtente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        System.out.println(modificaNome(1,1,"c"));
        System.out.println(modificaCognome(2,0,"s"));
        
        
    }

    private static boolean modificaNome(int id, int tipo, java.lang.String nome) {
        org.vise.modificautente.WsModificaUtente_Service service = new org.vise.modificautente.WsModificaUtente_Service();
        org.vise.modificautente.WsModificaUtente port = service.getWsModificaUtentePort();
        return port.modificaNome(id, tipo, nome);
    }

    private static boolean modificaCognome(int id, int tipo, java.lang.String cognome) {
        org.vise.modificautente.WsModificaUtente_Service service = new org.vise.modificautente.WsModificaUtente_Service();
        org.vise.modificautente.WsModificaUtente port = service.getWsModificaUtentePort();
        return port.modificaCognome(id, tipo, cognome);
    }
    
}
