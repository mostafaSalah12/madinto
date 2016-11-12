package com.platformhouse.allegypt.configuration;

import org.springframework.context.annotation.Configuration;

@Configuration

public class SecurityConfiguration  {
	
	
	   /* @Override
	    * 
	    * extends WebSecurityConfigurerAdapter
	    * 
	    * 
	    protected void configure(HttpSecurity http) throws Exception {
	        http
	            .authorizeRequests()
	                .antMatchers("/", "/home").permitAll()
	                .anyRequest().authenticated()
	                .and()
	            .formLogin()
	                .loginPage("/login")
	                .permitAll()
	                .and()
	            .logout()
	                .permitAll();
	    }
	*/


}