
package sx.cfdi.providers.edicom;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOf_xsd_string", propOrder = {
    "item"
})
public class ArrayOfXsdString {

    /*
    protected List<String> item;

    public List<String> getItem() {
        if (item == null) {
            item = new ArrayList<String>();
        }
        return this.item;
    }
    */

    protected String[] item;

    public String[] getItem() {
        if (item == null) {
            item = new String[0];
        }
        return this.item;
    }

}
