package org.ass.ums.config;


import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class DispatcherServeltInitializer implements WebApplicationInitializer
{

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		AnnotationConfigWebApplicationContext con=new AnnotationConfigWebApplicationContext();
		con.register(Appconfiguration.class);
		DispatcherServlet servlet = new DispatcherServlet(con);
		Dynamic dynamic = servletContext.addServlet("dispatcher",servlet );
		dynamic.addMapping("/");
		dynamic.setLoadOnStartup(1);
	}
 
}
