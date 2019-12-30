package com.ges.interco.security;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;

@EnableWebSecurity
@Configuration
public class AppSecurityConf extends WebSecurityConfigurerAdapter {
	
	
	@Autowired
	UserDetailsService userDetailsService;
	
	 
	@Bean
	public AuthenticationProvider auth() {
		
		DaoAuthenticationProvider authenticationProvider = new DaoAuthenticationProvider();
		authenticationProvider.setUserDetailsService(userDetailsService);
		authenticationProvider.setPasswordEncoder(NoOpPasswordEncoder.getInstance());
		return authenticationProvider;
		} 

	@Override
	protected void configure(HttpSecurity http ) throws Exception {
		http.
		cors().
		and().
		csrf().
		disable().
		authorizeRequests().
		antMatchers("/**").
		authenticated().
		and().
		httpBasic();
	}
	
}
