
package sx.cfdi.providers.edicom;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="getTimbreCfdiTestReturn" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getTimbreCfdiTestReturn"
})
@XmlRootElement(name = "getTimbreCfdiTestResponse")
public class GetTimbreCfdiTestResponse {

    @XmlElement(required = true)
    protected byte[] getTimbreCfdiTestReturn;

    /**
     * Gets the value of the getTimbreCfdiTestReturn property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getGetTimbreCfdiTestReturn() {
        return getTimbreCfdiTestReturn;
    }

    /**
     * Sets the value of the getTimbreCfdiTestReturn property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setGetTimbreCfdiTestReturn(byte[] value) {
        this.getTimbreCfdiTestReturn = value;
    }

}
