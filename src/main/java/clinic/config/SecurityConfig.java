package clinic.config;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.sql.DataSource;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(securedEnabled = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Autowired
    private final DataSource dataSource;

    public SecurityConfig(DataSource dataSource) {
        this.dataSource = dataSource;
    }


    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.jdbcAuthentication().dataSource(dataSource)
                .usersByUsernameQuery("SELECT username, password, enabled "
                        + " FROM employee WHERE username = ?")
                .authoritiesByUsernameQuery("SELECT username, role "
                        + " FROM employee WHERE username = ?")
                .passwordEncoder(passwordEncoder());
//                .withDefaultSchema()
//                .withUser(User.withUsername("user")
//                        .password(passwordEncoder().encode("pass"))
//                        .roles("ADMIN"));
//        auth.jdbcAuthentication()
//                .dataSource(dataSource)
////                .withDefaultSchema()
//                .withUser(User.withUsername("user")
//                        .password(passwordEncoder().encode("pass"))
//                        .roles("ADMIN"));
    }

//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http
//                .authorizeRequests()
//                .antMatchers("/", "/auth").anonymous()
//                .antMatchers("/cases/*", "/employee/*", "/event/*", "/patient/*", "/prescription/*")
//                .hasAnyRole("ADMIN", "DOCTOR", "NURSE")
//                .antMatchers("/auth*").permitAll()
//                .anyRequest().authenticated();
//
//                .and()
//                .formLogin()
//                .loginPage("/auth")
//                .failureUrl("/auth?error=true")
//                .usernameParameter("login")
//                .passwordParameter("password")
//                .loginProcessingUrl("/auth")
//                .defaultSuccessUrl("/", true)
//
//                .and()
//                .logout()
//                .logoutUrl("/logout")
//                .logoutSuccessUrl("/")
//                .deleteCookies("JSESSIONID")
//                .and().csrf()
//                .and().exceptionHandling().accessDeniedPage("/403");
//    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

}