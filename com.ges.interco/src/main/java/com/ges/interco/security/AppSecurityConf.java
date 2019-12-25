package com.ges.interco.security;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
import org.springframework.util.AntPathMatcher;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

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
	protected void configure(HttpSecurity http) throws Exception {
		
		http.
		cors().
		and().
		csrf().
		disable();
		
		http.authorizeRequests().
		antMatchers("/**").
		permitAll().anyRequest().authenticated().
		and().
		httpBasic();
	}
	
		@Bean
	    public CorsConfigurationSource corsConfigurationSource() {
	        final CorsConfiguration configuration = new CorsConfiguration();
	        configuration.setAllowedOrigins(Collections.unmodifiableList(Arrays.asList("*")));
	        configuration.setAllowedMethods(Collections.unmodifiableList(Arrays.asList("HEAD",
	                "GET", "POST", "PUT", "DELETE", "PATCH")));
	        // setAllowCredentials(true) is important, otherwise:
	        // The value of the 'Access-Control-Allow-Origin' header in the response must not be the wildcard '*' when the request's credentials mode is 'include'.
	        configuration.setAllowCredentials(true);
	        // setAllowedHeaders is important! Without it, OPTIONS preflight request
	        // will fail with 403 Invalid CORS request
	        configuration.setAllowedHeaders(Collections.unmodifiableList(Arrays.asList("Authorization", "Cache-Control", "Content-Type","Access-Control-Allow-Origin")));
	        final UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
	        source.registerCorsConfiguration("/**", configuration);
	       
	
	        return source;
	
	
	 }
}
