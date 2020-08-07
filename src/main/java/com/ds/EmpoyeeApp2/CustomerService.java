package com.ds.EmpoyeeApp2;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CustomerService {

	@Autowired
	private CustmerRepository repo;

	public void save(CustmoerBean custmoerBean) {
		repo.save(custmoerBean);
	}

}
