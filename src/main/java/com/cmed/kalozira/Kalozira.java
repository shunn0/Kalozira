package com.cmed.kalozira;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class Kalozira {

    public static void main(String[] args) {
        SpringApplication.run(Kalozira.class, args);
    }
}

/*@Configuration
@EnableJpaAuditing
class DataJpaConfig {

    @Bean
    public AuditorAware<CMUser> auditor() {
        return () -> Optional.ofNullable(SecurityContextHolder.getContext())
                .map(SecurityContext::getAuthentication)
                .filter(Authentication::isAuthenticated)
                .map(Authentication::getPrincipal)
                .map(CMUser.class::cast);
    }
}*/
