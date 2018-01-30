
package sx.cfdi.providers.edicom;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="user" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="rfc" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="uuid" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
 *         &lt;element name="pfx" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/&gt;
 *         &lt;element name="pfxPassword" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "user",
    "password",
    "rfc",
    "uuid",
    "pfx",
    "pfxPassword"
})
@XmlRootElement(name = "cancelaCFDi")
public class CancelaCFDi {

    @XmlElement(required = true)
    protected String user;

    @XmlElement(required = true)
    protected String password;

    @XmlElement(required = true)
    protected String rfc;

    /*
    @XmlElement(required = true)
    protected List<String> uuid;
    */

    @XmlElement(required = true)
    protected String[] uuid;

    // protected  String[] uuid,
    @XmlElement(required = true)
    protected byte[] pfx;

    @XmlElement(required = true)
    protected String pfxPassword;

    /**
     * Gets the value of the user property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUser() {
        return user;
    }

    /**
     * Sets the value of the user property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUser(String value) {
        this.user = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Gets the value of the rfc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRfc() {
        return rfc;
    }

    /**
     * Sets the value of the rfc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRfc(String value) {
        this.rfc = value;
    }

    /**
     * Gets the value of the uuid property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the uuid property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUuid().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 

    public List<String> getUuid() {
        if (uuid == null) {
            uuid = new ArrayList<String>();
            // uuid = new String[0];
        }
        return this.uuid;
    }
     */

    public String[] getUuid() {
        if(uuid == null) {
            uuid = new String[0];
        }
        return this.uuid;
    }

    /**
     * Gets the value of the pfx property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getPfx() {
        return pfx;
    }

    /**
     * Sets the value of the pfx property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setPfx(byte[] value) {
        this.pfx = value;
    }

    /**
     * Gets the value of the pfxPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPfxPassword() {
        return pfxPassword;
    }

    /**
     * Sets the value of the pfxPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPfxPassword(String value) {
        this.pfxPassword = value;
    }

}
