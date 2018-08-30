package com.kthilina.service;

import com.kthilina.exception.JdbcTemplateRollBackException;

public interface CustomerService {
    public void persiste() throws JdbcTemplateRollBackException;
}
