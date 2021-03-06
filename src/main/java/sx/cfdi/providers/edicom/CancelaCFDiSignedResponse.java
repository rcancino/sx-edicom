
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
 *         &lt;element name="cancelaCFDiSignedReturn" type="{http://cfdi.service.ediwinws.edicom.com}CancelaResponse"/&gt;
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
    "cancelaCFDiSignedReturn"
})
@XmlRootElement(name = "cancelaCFDiSignedResponse")
public class CancelaCFDiSignedResponse {

    @XmlElement(required = true)
    protected CancelaResponse cancelaCFDiSignedReturn;

    /**
     * Gets the value of the cancelaCFDiSignedReturn property.
     * 
     * @return
     *     possible object is
     *     {@link CancelaResponse }
     *     
     */
    public CancelaResponse getCancelaCFDiSignedReturn() {
        return cancelaCFDiSignedReturn;
    }

    /**
     * Sets the value of the cancelaCFDiSignedReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancelaResponse }
     *     
     */
    public void setCancelaCFDiSignedReturn(CancelaResponse value) {
        this.cancelaCFDiSignedReturn = value;
    }

}
