package service.impl;

import dao.PaymentinformationDao;
import dao.impl.PaymentinformationDaoImpl;
import model.paymentinformation.PagePaymentinformation;
import model.paymentinformation.Paymentinformation;
import service.PaymentinformationService;

public class PaymentinformationServiceImpl implements PaymentinformationService{
		PaymentinformationDao paymentinformationDao = new PaymentinformationDaoImpl();
	@Override
	public PagePaymentinformation<Paymentinformation> pagePaymentinformation(int page, int size) {
		// TODO Auto-generated method stub
		PagePaymentinformation<Paymentinformation> pagePaymentinformation=new PagePaymentinformation<>();
		pagePaymentinformation.setAll(paymentinformationDao.gatAllPaymentinformation().size());
		pagePaymentinformation.setList(paymentinformationDao.PagePaymentinformation(page, size));
		pagePaymentinformation.setPage(page);
		pagePaymentinformation.setSize(size);
		
		return pagePaymentinformation;
	}
	@Override
	public void add(Paymentinformation paymentinformation) {
		// TODO Auto-generated method stub
		paymentinformationDao.add(paymentinformation);
		
	}

}
