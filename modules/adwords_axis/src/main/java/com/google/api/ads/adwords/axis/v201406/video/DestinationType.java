/**
 * DestinationType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201406.video;

public class DestinationType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected DestinationType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _YOUTUBE = "YOUTUBE";
    public static final java.lang.String _ADVERTISER_SITE = "ADVERTISER_SITE";
    public static final java.lang.String _LEGACY_BOTH = "LEGACY_BOTH";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final DestinationType YOUTUBE = new DestinationType(_YOUTUBE);
    public static final DestinationType ADVERTISER_SITE = new DestinationType(_ADVERTISER_SITE);
    public static final DestinationType LEGACY_BOTH = new DestinationType(_LEGACY_BOTH);
    public static final DestinationType UNKNOWN = new DestinationType(_UNKNOWN);
    public java.lang.String getValue() { return _value_;}
    public static DestinationType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        DestinationType enumeration = (DestinationType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static DestinationType fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DestinationType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "DestinationType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
