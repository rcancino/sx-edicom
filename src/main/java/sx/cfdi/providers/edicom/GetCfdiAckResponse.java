
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
 *         &lt;element name="getCfdiAckReturn" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/&gt;
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
    "getCfdiAckReturn"
})
@XmlRootElement(name = "getCfdiAckResponse")
public class GetCfdiAckResponse {

    @XmlElement(required = true)
    protected byte[] getCfdiAckReturn;

    /**
     * Gets the value of the getCfdiAckReturn property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getGetCfdiAckReturn() {
        return getCfdiAckReturn;
    }

    /**
     * Sets the value of the getCfdiAckReturn property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setGetCfdiAckReturn(byte[] value) {
        this.getCfdiAckReturn = value;
    }

}
