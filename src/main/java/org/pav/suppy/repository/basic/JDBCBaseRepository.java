package org.pav.suppy.repository.basic;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public abstract class JDBCBaseRepository extends JdbcDaoSupport {
    
    @Autowired
    private DataSource dataSource;
    
    @PostConstruct
    public void init(){
        this.setDataSource(this.dataSource);
    }
}
