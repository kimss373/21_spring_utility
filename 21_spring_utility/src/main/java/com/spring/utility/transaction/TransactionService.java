package com.spring.utility.transaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TransactionService {

	@Autowired
	private TransactionDAO transactionDao;
	
	@Transactional
	public void addAccountTransfer() throws Exception {
		transactionDao.updateSendMoney();
		System.out.println(1/0); 	// 문제 발생
		transactionDao.updateRecvMoney();
	}
	
	@Transactional
	public void addOrder() throws Exception {
		transactionDao.updatePoint();
		transactionDao.updateCartCnt();
		System.out.println(1/0);	// 문제 발생
		transactionDao.updateOrderCnt();
	}
	
}
