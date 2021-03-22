package com.kmbl.mw.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.web.server.SecurityWebFilterChain;

/*@EnableWebSecurity
@Configuration
public class ServiceConfigurator extends WebSecurityConfigurerAdapter {
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable().authorizeRequests().anyRequest().permitAll();
	}

}
*/
@EnableWebFluxSecurity
@Configuration
class ServiceConfigurator {
   @Bean
   public SecurityWebFilterChain securitygWebFilterChain(
         ServerHttpSecurity http) {
      return http.httpBasic().disable().build();
   }
}

