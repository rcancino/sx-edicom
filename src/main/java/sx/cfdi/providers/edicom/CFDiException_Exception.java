
package sx.cfdi.providers.edicom;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.2.1
 * 2017-11-16T23:05:31.937-06:00
 * Generated source version: 3.2.1
 */

@WebFault(name = "fault", targetNamespace = "http://cfdi.service.ediwinws.edicom.com")
public class CFDiException_Exception extends Exception {
    
    private sx.cfdi.providers.edicom.CFDiException fault;

    public CFDiException_Exception() {
        super();
    }
    
    public CFDiException_Exception(String message) {
        super(message);
    }
    
    public CFDiException_Exception(String message, Throwable cause) {
        super(message, cause);
    }

    public CFDiException_Exception(String message, sx.cfdi.providers.edicom.CFDiException fault) {
        super(message);
        this.fault = fault;
    }

    public CFDiException_Exception(String message, sx.cfdi.providers.edicom.CFDiException fault, Throwable cause) {
        super(message, cause);
        this.fault = fault;
    }

    public sx.cfdi.providers.edicom.CFDiException getFaultInfo() {
        return this.fault;
    }
}