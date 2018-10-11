package com.greenfox.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class EmployeeSecurityConfiguration extends WebSecurityConfigurerAdapter {

//    @Override
//    public void configure(WebSecurity web) throws Exception {
//        web.ignoring().antMatchers("/resources/**");
//    }
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.authorizeRequests().antMatchers("/").permitAll().antMatchers("/list").hasAnyRole("USER", "ADMIN")l
//                .antMatchers("/list").hasAnyRole("USER", "ADMIN")
//                .antMatchers("/add").hasAnyRole("ADMIN")
//                .anyRequest().authenticated().and().formLogin()
//                .permitAll().and().logout().permitAll();
//
//        http.csrf().disable();
//    }
//
//
//    @Autowired
//    public void configureGlobal(AuthenticationManagerBuilder authenticationMgr) throws Exception {
//        authenticationMgr.inMemoryAuthentication().withUser("employee").password("employee")
//                .authorities("ROLE_USER").and().withUser("javainuse").password("javainuse")
//                .authorities("ROLE_USER", "ROLE_ADMIN");
//    }
//

  @Override
  public void configure(AuthenticationManagerBuilder auth) throws Exception {
    auth.inMemoryAuthentication().withUser("javainuse")
            .password("javainuse").roles("USER");
  }

  @Override
  public void configure(HttpSecurity http) throws Exception {
    http.antMatcher("/**").authorizeRequests().anyRequest().hasRole("USER")
            .and().formLogin().loginPage("/login")
            .failureUrl("/login.jsp?error=1").loginProcessingUrl("/login")
            .permitAll().and().logout()
            .logoutSuccessUrl("/list");

  }
}