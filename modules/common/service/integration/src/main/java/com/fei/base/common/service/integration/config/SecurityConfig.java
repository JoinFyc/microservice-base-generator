//package com.fei.base.common.service.integration.config;
//
///**
// * @author JoinFyc
// * @description web安全适配
// * @date 2024-08-19
// */
//public class SecurityConfig extends WebSecurityConfigurerAdapter {
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http
//                .authorizeRequests()
//                .antMatchers("/swagger-ui.html", "/v3/api-docs/**").permitAll()
//                .anyRequest().authenticated()
//                .and()
//                .csrf().disable();
//    }
//}
