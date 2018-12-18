package service;

import model.paymentinformation.PagePaymentinformation;
import model.paymentinformation.Paymentinformation;

public interface PaymentinformationService {
	PagePaymentinformation<Paymentinformation> pagePaymentinformation(int page,int size);
	void add(Paymentinformation paymentinformation);
}
