package javabrains.springsecurity;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.objenesis.instantiator.android.AndroidSerializationInstantiator;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.util.matcher.AndRequestMatcher;
@EnableWebSecurity
public class Securityconfig extends WebSecurityConfigurerAdapter {
	@Autowired
	DataSource datasource;
@Override
protected void configure(AuthenticationManagerBuilder auth) throws Exception {
	// TODO Auto-generated method stub
	
	
      auth.inMemoryAuthentication()
      .withUser("blah")
      .password("blah")
      .roles("USER")
      .and()
      .withUser("foo")
      .password("foo")
      .roles("ADMIN");
      
}
@Bean
public PasswordEncoder getpasswordEncoder() {
	return NoOpPasswordEncoder.getInstance()	;
}

@Override
protected void configure(HttpSecurity http) throws Exception {
	// TODO Auto-generated method stub
	http.authorizeRequests()
	.antMatchers("/admin").hasRole("ADMIN")
	.antMatchers("/user").hasAnyRole("USER","ADMIN")
	.antMatchers("/").permitAll()
	.and().formLogin();
}
      


}
