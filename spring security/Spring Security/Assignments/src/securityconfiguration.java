package com.example.spring.securityjdbc;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
@EnableWebSecurity
public class securityconfiguration extends WebSecurityConfigurerAdapter{
	@Autowired
	DataSource datasource;
	@Override
	protected void configure(AuthenticationManagerBuilder auth)throws Exception{
		auth.jdbcAuthentication()
		.dataSource(datasource);
		}
	
	@Bean
	public PasswordEncoder getpasswordEncoder() {
		return NoOpPasswordEncoder.getInstance();
		//   return new BCryptPasswordEncoder();  //Q6
		//return NoOpPasswordEncoder.getInstance();
	}
	@Override
	protected void configure(HttpSecurity http)throws Exception{
		http.authorizeRequests()
		
		.antMatchers("/admin").hasRole("admin")
		.antMatchers("/user").hasAnyRole("user","admin")
		.antMatchers("/*").permitAll()
		.antMatchers("/welcome").permitAll()
		.and()
		.formLogin()
		 .loginPage("/login1")
         .permitAll()
         .and()
         .logout().logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
         .logoutSuccessUrl("/login").deleteCookies("JSESSIONID")
         .invalidateHttpSession(true).permitAll() .and()
         .rememberMe().tokenValiditySeconds(2592000).key("mySecret!").rememberMeParameter("checkRememberMe"); 
		
	}
	
}
