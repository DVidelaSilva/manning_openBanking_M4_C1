package com.manning.openbanking.security;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;

import jakarta.servlet.http.HttpServletResponse;


@Configuration
@EnableWebSecurity
@EnableMethodSecurity
@RequiredArgsConstructor
public class SecurityConfig {

    @Autowired
    private final JwtAuthenticationConverter jwtAuthenticationConverter;

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
        return httpSecurity
                .csrf(csrf -> csrf.disable())
                .authorizeHttpRequests(http -> {
                    //http.requestMatchers("/api/transactions/{accountNumber}").permitAll();
                    http.requestMatchers("/api/transactions/{accountNumber}").authenticated();
                    http.anyRequest().authenticated();
                })
                .oauth2ResourceServer(oauth -> {
                    oauth.jwt(jwt -> jwt.jwtAuthenticationConverter(jwtAuthenticationConverter));
                })
                .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
                .exceptionHandling(exceptions -> exceptions
                    // Personalizar el manejo de autenticación no válida
                    .authenticationEntryPoint((request, response, authException) -> {
                        // Si el usuario no está autenticado, redirige a la URL deseada
                        response.setStatus(HttpServletResponse.SC_FOUND); // 302 Redirect
                        response.setHeader("Location", "/api/v1/transactions/1234567"); // La URL a la que deseas redirigir
                    })
                )
                .build();
    }
}