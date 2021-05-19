package Adapters;

import java.rmi.RemoteException;

import Business.Abstracts.ICheckPerson;
import Entities.Concretes.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisAdapter implements ICheckPerson{

	@Override
	public boolean Save(Customer customer) {
		
		KPSPublicSoapProxy client=new KPSPublicSoapProxy();
		//return client.TCKimlikNoDogrula(Long.parseLong(customer.getNationaltyId()),customer.getFirstName().toUpperCase(),customer.getLastName().toUpperCase(),customer.getId(),
			//	customer.getBirthYear());
		boolean result=true;
		try {
			 client.TCKimlikNoDogrula(Long.parseLong(customer.getNationaltyId()),customer.getFirstName().toUpperCase(), customer.getLastName().toUpperCase(),customer.getId());
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
		
	}
	
	
	
	
	

}
