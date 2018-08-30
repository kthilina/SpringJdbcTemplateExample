package com.kthilina.service.impl;

import com.kthilina.dao.CustomerDAO;
import com.kthilina.exception.JdbcTemplateRollBackException;
import com.kthilina.model.Customer;
import com.kthilina.exception.SavedFailException;
import com.kthilina.service.CustomerService;
import org.springframework.transaction.annotation.Transactional;

public class CustomerServiceImpl implements CustomerService {
    private CustomerDAO customerDAO;

    @Override
    @Transactional(rollbackFor = JdbcTemplateRollBackException.class)
    public void persiste() throws JdbcTemplateRollBackException {
        Customer customer = new Customer("Kamal", "0711223456");
        try {
            customerDAO.persist(customer);
        } catch (SavedFailException ex) {
            throw new JdbcTemplateRollBackException(ex.getMessage(), ex);
        }
    }

    public void setCustomerDAO(CustomerDAO customerDAO) {
        this.customerDAO = customerDAO;
    }
}
