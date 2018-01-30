package sx.cfdi.providers.edicom;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.2.1
 * 2017-11-16T23:05:31.994-06:00
 * Generated source version: 3.2.1
 * 
 */
@WebServiceClient(name = "CFDiService", 
                  wsdlLocation = "file:/Users/rcancino/github/sx-edicom/src/main/resources/wsdl/edicom.wsdl",
                  targetNamespace = "http://cfdi.service.ediwinws.edicom.com") 
public class CFDiService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://cfdi.service.ediwinws.edicom.com", "CFDiService");
    public final static QName CFDi = new QName("http://cfdi.service.ediwinws.edicom.com", "CFDi");
    static {
        URL url = null;
        try {
            url = new URL("file:/Users/rcancino/github/sx-edicom/src/main/resources/wsdl/edicom.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(CFDiService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/Users/rcancino/github/sx-edicom/src/main/resources/wsdl/edicom.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public CFDiService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public CFDiService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CFDiService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public CFDiService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public CFDiService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public CFDiService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns CFDi
     */
    @WebEndpoint(name = "CFDi")
    public CFDi getCFDi() {
        return super.getPort(CFDi, CFDi.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CFDi
     */
    @WebEndpoint(name = "CFDi")
    public CFDi getCFDi(WebServiceFeature... features) {
        return super.getPort(CFDi, CFDi.class, features);
    }

}
