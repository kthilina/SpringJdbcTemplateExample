package com.kthilina.dao.impl;

import com.kthilina.dao.CustomerDAO;
import com.kthilina.model.Customer;
import com.kthilina.exception.SavedFailException;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

public class CustomerDAOImpl implements CustomerDAO {
    private JdbcTemplate jdbcTemplate;

    public void persist(Customer customer) throws SavedFailException {
        String sql = "INSERT INTO customer (name, tel) VALUES (?, ?)";
        try {
            int val = jdbcTemplate.update(sql, new Object[]{customer.getName(), customer.getTel()});
            //Uncomment for the rollback check.
            //throw new SavedFailException("Save fail");
        } catch (Exception ex) {
            throw new SavedFailException("Save fail", ex);
        }
    }

    public void setDataSource(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }
}
