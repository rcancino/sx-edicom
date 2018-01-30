
package sx.cfdi.providers.edicom;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CancelaResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CancelaResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ack" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="text" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="uuids" type="{http://cfdi.service.ediwinws.edicom.com}ArrayOf_xsd_string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CancelaResponse", propOrder = {
    "ack",
    "text",
    "uuids"
})
public class CancelaResponse {

    @XmlElement(required = true, nillable = true)
    protected String ack;

    @XmlElement(required = true, nillable = true)
    protected String text;

    @XmlElement(required = true, nillable = true)
    protected String[] uuids;

    /**
     * Gets the value of the ack property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAck() {
        return ack;
    }

    /**
     * Sets the value of the ack property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAck(String value) {
        this.ack = value;
    }

    /**
     * Gets the value of the text property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setText(String value) {
        this.text = value;
    }

    /**
     * Gets the value of the uuids property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfXsdString }
     *     

    public ArrayOfXsdString getUuids() {
        return uuids;
    }
     */

    public String[] getUuids() {
        return uuids;
    }

    /**
     * Sets the value of the uuids property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfXsdString }
     *     

    public void setUuids(ArrayOfXsdString value) {
        this.uuids = value;
    }
     */

    public void setUuids(String[] value) {
        this.uuids = value;
    }

}
