package dao;

import java.util.List;

import model.paymentinformation.Paymentinformation;

public interface PaymentinformationDao {
	List<Paymentinformation> gatAllPaymentinformation();
	List<Paymentinformation> PagePaymentinformation(int page,int size);
	void add(Paymentinformation paymentinformation);
}
