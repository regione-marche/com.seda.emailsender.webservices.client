package com.seda.emailsender.webservices.source;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import com.seda.emailsender.webservices.dati.EMailSenderPECResponse;
import com.seda.emailsender.webservices.dati.EMailSenderRequestType;
import com.seda.emailsender.webservices.dati.EMailSenderResponse;

public class EMailSenderUnitTest {

	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new EMailSenderUnitTest(args);

	}

	public EMailSenderUnitTest(String[] args) {
		EMailSenderServiceLocator serviceLocator=new EMailSenderServiceLocator();
		
		try {
			EMailSenderSOAPBindingStub emailSenderInterface=(EMailSenderSOAPBindingStub)serviceLocator.getEMailSenderPort(new URL("http://10.10.80.6:9862/EMailSender/service"));
			//EMailSenderSOAPBindingStub emailSenderInterface=(EMailSenderSOAPBindingStub)serviceLocator.getEMailSenderPort(new URL("http://cowsseda01.seda.intra:9080/EMailSender/service"));
			
			EMailSenderRequestType request=new EMailSenderRequestType();
			EMailSenderPECResponse response;
			EMailSenderResponse resp;
			
			//request.setEMailDataTOList("citymat@pec.it");
			request.setEMailDataCCList("");
			request.setEMailDataCCNList("");
			//request.setEMailDataAttacchedFileList("\\\\10.10.9.106\\BirtReport\\demo_attach_file.txt");
			request.setEMailDataAttacchedFileList("");
			request.setEMailDataSubject("Email di prova");
			//request.setEMailSender("Payer@seda.it");
			request.setEMailSender("");

			request.setEMailDataText("testPEC");
			request.setEMailDataTOList("luigi.preite@pecaruba.it");

			request.setEmailCuteCute("000P5");
			response=emailSenderInterface.getEMailSenderPEC(request);
			System.out.println("EMAIL PEC: " + response.getValue());
			
			request.setEmailCuteCute("000TO");
			response=emailSenderInterface.getEMailSenderPEC(request);
			System.out.println("EMAIL PEC: " + response.getValue());
/*
			request.setEMailDataText("test email normale");
			request.setEMailDataTOList("luigipreite@aruba.it");

			request.setEmailCuteCute("000P5");
			resp=emailSenderInterface.getEMailSender(request);
			System.out.println("EMAIL: " + resp.getValue());

			request.setEmailCuteCute("000TO");
			resp=emailSenderInterface.getEMailSender(request);
			System.out.println("EMAIL: " + resp.getValue());
*/			
			
			
			
			
		} catch (MalformedURLException e) {
			
			e.printStackTrace();
		} catch (ServiceException e) {
			
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}


