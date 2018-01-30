
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
 *         &lt;element name="exportCfdiReturn" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/&gt;
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
    "exportCfdiReturn"
})
@XmlRootElement(name = "exportCfdiResponse")
public class ExportCfdiResponse {

    @XmlElement(required = true)
    protected byte[] exportCfdiReturn;

    /**
     * Gets the value of the exportCfdiReturn property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getExportCfdiReturn() {
        return exportCfdiReturn;
    }

    /**
     * Sets the value of the exportCfdiReturn property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setExportCfdiReturn(byte[] value) {
        this.exportCfdiReturn = value;
    }

}
