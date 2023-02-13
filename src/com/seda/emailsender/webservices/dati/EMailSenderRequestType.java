/**
 * EMailSenderRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.seda.emailsender.webservices.dati;

public class EMailSenderRequestType  implements java.io.Serializable {
    private java.lang.String EMailDataTOList;

    private java.lang.String EMailDataCCList;

    private java.lang.String EMailDataCCNList;

    private java.lang.String EMailDataAttacchedFileList;

    private java.lang.String EMailDataSubject;

    private java.lang.String EMailDataText;

    private java.lang.String EMailSender;
    
    private java.lang.String EmailCuteCute;

    public EMailSenderRequestType() {
    }

    public EMailSenderRequestType(
           java.lang.String EMailDataTOList,
           java.lang.String EMailDataCCList,
           java.lang.String EMailDataCCNList,
           java.lang.String EMailDataAttacchedFileList,
           java.lang.String EMailDataSubject,
           java.lang.String EMailDataText,
           java.lang.String EMailSender,
           java.lang.String EmailCuteCute) {
           this.EMailDataTOList = EMailDataTOList;
           this.EMailDataCCList = EMailDataCCList;
           this.EMailDataCCNList = EMailDataCCNList;
           this.EMailDataAttacchedFileList = EMailDataAttacchedFileList;
           this.EMailDataSubject = EMailDataSubject;
           this.EMailDataText = EMailDataText;
           this.EMailSender = EMailSender;
           this.EmailCuteCute = EmailCuteCute;
    }


    /**
     * Gets the EMailDataTOList value for this EMailSenderRequestType.
     * 
     * @return EMailDataTOList
     */
    public java.lang.String getEMailDataTOList() {
        return EMailDataTOList;
    }


    public java.lang.String getEmailCuteCute() {
		return EmailCuteCute;
	}

	public void setEmailCuteCute(java.lang.String emailCuteCute) {
		EmailCuteCute = emailCuteCute;
	}

	/**
     * Sets the EMailDataTOList value for this EMailSenderRequestType.
     * 
     * @param EMailDataTOList
     */
    public void setEMailDataTOList(java.lang.String EMailDataTOList) {
        this.EMailDataTOList = EMailDataTOList;
    }


    /**
     * Gets the EMailDataCCList value for this EMailSenderRequestType.
     * 
     * @return EMailDataCCList
     */
    public java.lang.String getEMailDataCCList() {
        return EMailDataCCList;
    }


    /**
     * Sets the EMailDataCCList value for this EMailSenderRequestType.
     * 
     * @param EMailDataCCList
     */
    public void setEMailDataCCList(java.lang.String EMailDataCCList) {
        this.EMailDataCCList = EMailDataCCList;
    }


    /**
     * Gets the EMailDataCCNList value for this EMailSenderRequestType.
     * 
     * @return EMailDataCCNList
     */
    public java.lang.String getEMailDataCCNList() {
        return EMailDataCCNList;
    }


    /**
     * Sets the EMailDataCCNList value for this EMailSenderRequestType.
     * 
     * @param EMailDataCCNList
     */
    public void setEMailDataCCNList(java.lang.String EMailDataCCNList) {
        this.EMailDataCCNList = EMailDataCCNList;
    }


    /**
     * Gets the EMailDataAttacchedFileList value for this EMailSenderRequestType.
     * 
     * @return EMailDataAttacchedFileList
     */
    public java.lang.String getEMailDataAttacchedFileList() {
        return EMailDataAttacchedFileList;
    }


    /**
     * Sets the EMailDataAttacchedFileList value for this EMailSenderRequestType.
     * 
     * @param EMailDataAttacchedFileList
     */
    public void setEMailDataAttacchedFileList(java.lang.String EMailDataAttacchedFileList) {
        this.EMailDataAttacchedFileList = EMailDataAttacchedFileList;
    }


    /**
     * Gets the EMailDataSubject value for this EMailSenderRequestType.
     * 
     * @return EMailDataSubject
     */
    public java.lang.String getEMailDataSubject() {
        return EMailDataSubject;
    }


    /**
     * Sets the EMailDataSubject value for this EMailSenderRequestType.
     * 
     * @param EMailDataSubject
     */
    public void setEMailDataSubject(java.lang.String EMailDataSubject) {
        this.EMailDataSubject = EMailDataSubject;
    }


    /**
     * Gets the EMailDataText value for this EMailSenderRequestType.
     * 
     * @return EMailDataText
     */
    public java.lang.String getEMailDataText() {
        return EMailDataText;
    }


    /**
     * Sets the EMailDataText value for this EMailSenderRequestType.
     * 
     * @param EMailDataText
     */
    public void setEMailDataText(java.lang.String EMailDataText) {
        this.EMailDataText = EMailDataText;
    }


    /**
     * Gets the EMailSender value for this EMailSenderRequestType.
     * 
     * @return EMailSender
     */
    public java.lang.String getEMailSender() {
        return EMailSender;
    }
    /* 
    * @return EMailSender
    */
   public java.lang.String getEMailSenderPEC() {
       return EMailSender;
   }

    /**
     * Sets the EMailSender value for this EMailSenderRequestType.
     * 
     * @param EMailSender
     */
    public void setEMailSender(java.lang.String EMailSender) {
        this.EMailSender = EMailSender;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EMailSenderRequestType)) return false;
        EMailSenderRequestType other = (EMailSenderRequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.EMailDataTOList==null && other.getEMailDataTOList()==null) || 
             (this.EMailDataTOList!=null &&
              this.EMailDataTOList.equals(other.getEMailDataTOList()))) &&
            ((this.EMailDataCCList==null && other.getEMailDataCCList()==null) || 
             (this.EMailDataCCList!=null &&
              this.EMailDataCCList.equals(other.getEMailDataCCList()))) &&
            ((this.EMailDataCCNList==null && other.getEMailDataCCNList()==null) || 
             (this.EMailDataCCNList!=null &&
              this.EMailDataCCNList.equals(other.getEMailDataCCNList()))) &&
            ((this.EMailDataAttacchedFileList==null && other.getEMailDataAttacchedFileList()==null) || 
             (this.EMailDataAttacchedFileList!=null &&
              this.EMailDataAttacchedFileList.equals(other.getEMailDataAttacchedFileList()))) &&
            ((this.EMailDataSubject==null && other.getEMailDataSubject()==null) || 
             (this.EMailDataSubject!=null &&
              this.EMailDataSubject.equals(other.getEMailDataSubject()))) &&
            ((this.EMailDataText==null && other.getEMailDataText()==null) || 
             (this.EMailDataText!=null &&
              this.EMailDataText.equals(other.getEMailDataText()))) &&
            ((this.EMailSender==null && other.getEMailSender()==null) || 
             (this.EMailSender!=null &&
              this.EMailSender.equals(other.getEMailSender()))) &&
            ((this.EMailSender==null && other.getEMailSenderPEC()==null) || 
             (this.EMailSender!=null &&
              this.EMailSender.equals(other.getEMailSenderPEC()))) &&
             ((this.EmailCuteCute==null && other.getEmailCuteCute()==null) || 
                      (this.EmailCuteCute!=null &&
                       this.EmailCuteCute.equals(other.getEmailCuteCute())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getEMailDataTOList() != null) {
            _hashCode += getEMailDataTOList().hashCode();
        }
        if (getEMailDataCCList() != null) {
            _hashCode += getEMailDataCCList().hashCode();
        }
        if (getEMailDataCCNList() != null) {
            _hashCode += getEMailDataCCNList().hashCode();
        }
        if (getEMailDataAttacchedFileList() != null) {
            _hashCode += getEMailDataAttacchedFileList().hashCode();
        }
        if (getEMailDataSubject() != null) {
            _hashCode += getEMailDataSubject().hashCode();
        }
        if (getEMailDataText() != null) {
            _hashCode += getEMailDataText().hashCode();
        }
        if (getEMailSender() != null) {
            _hashCode += getEMailSender().hashCode();
        }
        if (getEMailSenderPEC() != null) {
            _hashCode += getEMailSenderPEC().hashCode();
        }
        if (getEmailCuteCute() != null) {
            _hashCode += getEmailCuteCute().hashCode();
        }        
        
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EMailSenderRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dati.webservices.emailsender.seda.com", "EMailSenderRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("EMailDataTOList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservices.emailsender.seda.com", "EMailDataTOList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("EMailDataCCList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservices.emailsender.seda.com", "EMailDataCCList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("EMailDataCCNList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservices.emailsender.seda.com", "EMailDataCCNList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("EMailDataAttacchedFileList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservices.emailsender.seda.com", "EMailDataAttacchedFileList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("EMailDataSubject");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservices.emailsender.seda.com", "EMailDataSubject"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("EMailDataText");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservices.emailsender.seda.com", "EMailDataText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("EMailSender");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservices.emailsender.seda.com", "EMailSender"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("EMailCuteCute");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservices.emailsender.seda.com", "EMailCuteCute"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
