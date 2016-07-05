//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.06.30 at 06:20:11 PM IST 
//


package https.compute_ind_.west_1_jiocloudservices_com.doc._2016_03_01;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="requestId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="volumeSet">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="item" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="volumeId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="attachmentSet" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="snapshotId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="createTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                             &lt;element name="size" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "requestId",
    "volumeSet"
})
@XmlRootElement(name = "DescribeVolumesResponse")
public class DescribeVolumesResponse {

    @XmlElement(required = true)
    protected String requestId;
    @XmlElement(required = true)
    protected DescribeVolumesResponse.VolumeSet volumeSet;

    /**
     * Gets the value of the requestId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestId() {
        return requestId;
    }

    /**
     * Sets the value of the requestId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestId(String value) {
        this.requestId = value;
    }

    /**
     * Gets the value of the volumeSet property.
     * 
     * @return
     *     possible object is
     *     {@link DescribeVolumesResponse.VolumeSet }
     *     
     */
    public DescribeVolumesResponse.VolumeSet getVolumeSet() {
        return volumeSet;
    }

    /**
     * Sets the value of the volumeSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link DescribeVolumesResponse.VolumeSet }
     *     
     */
    public void setVolumeSet(DescribeVolumesResponse.VolumeSet value) {
        this.volumeSet = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="item" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="volumeId" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="attachmentSet" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="snapshotId" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="createTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *                   &lt;element name="size" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "item"
    })
    public static class VolumeSet {

        protected List<DescribeVolumesResponse.VolumeSet.Item> item;

        /**
         * Gets the value of the item property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the item property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DescribeVolumesResponse.VolumeSet.Item }
         * 
         * 
         */
        public List<DescribeVolumesResponse.VolumeSet.Item> getItem() {
            if (item == null) {
                item = new ArrayList<DescribeVolumesResponse.VolumeSet.Item>();
            }
            return this.item;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="volumeId" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="attachmentSet" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="snapshotId" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="createTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
         *         &lt;element name="size" type="{http://www.w3.org/2001/XMLSchema}byte"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "status",
            "volumeId",
            "attachmentSet",
            "snapshotId",
            "createTime",
            "size"
        })
        public static class Item {

            @XmlElement(required = true)
            protected String status;
            @XmlElement(required = true)
            protected String volumeId;
            @XmlElement(required = true)
            protected String attachmentSet;
            @XmlElement(required = true)
            protected String snapshotId;
            @XmlElement(required = true)
            @XmlSchemaType(name = "dateTime")
            protected Date createTime;
            protected int size;

            /**
             * Gets the value of the status property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getStatus() {
                return status;
            }

            /**
             * Sets the value of the status property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setStatus(String value) {
                this.status = value;
            }

            /**
             * Gets the value of the volumeId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getVolumeId() {
                return volumeId;
            }

            /**
             * Sets the value of the volumeId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setVolumeId(String value) {
                this.volumeId = value;
            }

            /**
             * Gets the value of the attachmentSet property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAttachmentSet() {
                return attachmentSet;
            }

            /**
             * Sets the value of the attachmentSet property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAttachmentSet(String value) {
                this.attachmentSet = value;
            }

            /**
             * Gets the value of the snapshotId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSnapshotId() {
                return snapshotId;
            }

            /**
             * Sets the value of the snapshotId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSnapshotId(String value) {
                this.snapshotId = value;
            }

            /**
             * Gets the value of the createTime property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public Date getCreateTime() {
                return createTime;
            }

            /**
             * Sets the value of the createTime property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setCreateTime(Date value) {
                this.createTime = value;
            }

            /**
             * Gets the value of the size property.
             * 
             */
            public int getSize() {
                return size;
            }

            /**
             * Sets the value of the size property.
             * 
             */
            public void setSize(byte value) {
                this.size = value;
            }

        }

    }

}
