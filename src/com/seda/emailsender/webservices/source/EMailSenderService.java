/**
 * EMailSenderService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.seda.emailsender.webservices.source;

public interface EMailSenderService extends javax.xml.rpc.Service {
    public java.lang.String getEMailSenderPortAddress();

    public com.seda.emailsender.webservices.source.EMailSenderInterface getEMailSenderPort() throws javax.xml.rpc.ServiceException;

    public com.seda.emailsender.webservices.source.EMailSenderInterface getEMailSenderPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
