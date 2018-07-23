package com.udemy.spring.basics.traning.componetns;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.udemy.spring.basics.traning.springbasics.scope.JdbcConnection;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class ComponentDAO {
	
	@Autowired
	ComponentJdbcConnection jdbcConnection;

	public void setJdbcConnection(ComponentJdbcConnection jdbcConnection) {
		this.jdbcConnection = jdbcConnection;
	}

	public ComponentJdbcConnection getJdbcConnection() {
		return jdbcConnection;
	} 
	
	
}
