package org.pav.suppy.repository.basic;

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
