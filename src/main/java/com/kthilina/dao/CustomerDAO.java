package com.kthilina.dao;

import com.kthilina.model.Customer;
import com.kthilina.exception.SavedFailException;

public interface CustomerDAO {
    public void persist(Customer customer) throws SavedFailException;
}




