
package sx.cfdi.providers.edicom;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="changePasswordReturn" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
    "changePasswordReturn"
})
@XmlRootElement(name = "changePasswordResponse")
public class ChangePasswordResponse {

    protected boolean changePasswordReturn;

    /**
     * Gets the value of the changePasswordReturn property.
     * 
     */
    public boolean isChangePasswordReturn() {
        return changePasswordReturn;
    }

    /**
     * Sets the value of the changePasswordReturn property.
     * 
     */
    public void setChangePasswordReturn(boolean value) {
        this.changePasswordReturn = value;
    }

}