/**
 * EMailSenderInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.seda.emailsender.webservices.source;

public interface EMailSenderInterface extends java.rmi.Remote {
    public com.seda.emailsender.webservices.dati.EMailSenderResponse getEMailSender(com.seda.emailsender.webservices.dati.EMailSenderRequestType in) throws java.rmi.RemoteException, com.seda.emailsender.webservices.srv.EMailSenderFaultType;
    public com.seda.emailsender.webservices.dati.EMailSenderPECResponse getEMailSenderPEC(com.seda.emailsender.webservices.dati.EMailSenderRequestType in) throws java.rmi.RemoteException, com.seda.emailsender.webservices.srv.EMailSenderFaultType;
}
