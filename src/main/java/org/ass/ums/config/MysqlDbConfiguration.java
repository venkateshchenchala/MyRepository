package org.ass.ums.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
@Configuration
public class MysqlDbConfiguration 
{
	@Bean
	public LocalSessionFactoryBean getSessionFactory()
	{
		  LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
		  sessionFactory.setDataSource(getDataSource());
		  sessionFactory.setHibernateProperties(getConnectionproperties());
		  sessionFactory.setPackagesToScan("org.ass.ums.entity");
		  return sessionFactory;
		  
	}
	
	public DataSource getDataSource()
	{
		DriverManagerDataSource dataSource = new DriverManagerDataSource();		
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/realm_db");
		dataSource.setUsername("root");
		dataSource.setPassword("root");
		return dataSource;
		
	}
	public static  Properties getConnectionproperties()
	{
		Properties p = new Properties();
		p.setProperty("hibernate.show_sql", "true");
		p.setProperty("hibernate.hbm2ddl.auto", "update");
		
		return p;
}
}
