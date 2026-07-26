package com.example.demo.configu;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
@EnableWebSecurity
public class Security {
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {

        httpSecurity.
                httpBasic(withDefaults());

        httpSecurity.authorizeHttpRequests(authorize -> {

          //   authorize.requestMatchers("/logi").permitAll();
            authorize.requestMatchers("/api").authenticated();
            authorize.anyRequest().permitAll();
        });
//        httpSecurity.formLogin(formLogin -> {
//
//            //
//            formLogin.loginPage("/login");
//            formLogin.usernameParameter("Sandip");
//            formLogin.passwordParameter("SandipSabat@");
//        });
//
       return httpSecurity.build();
    }
}