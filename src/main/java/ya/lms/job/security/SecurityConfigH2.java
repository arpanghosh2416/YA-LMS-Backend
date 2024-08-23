package ya.lms.job.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfigH2 {

	@SuppressWarnings("removal")
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		http.authorizeHttpRequests(authorizeRequests -> authorizeRequests.requestMatchers("/h2-console/**").permitAll()
				.anyRequest().authenticated()).csrf(csrf -> csrf.disable()) // Disable CSRF protection for H2 Console
				.headers(headers -> headers.frameOptions().disable()); // Disable frame options for H2 Console

		return http.build();
	}

	@Bean
	public UserDetailsService userDetailsService() {
		// Configure default users, e.g., in-memory user details for simplicity
		return new InMemoryUserDetailsManager();
	}
}
