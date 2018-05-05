import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * 
 */

/**
 * Java based config. file
 * 
 * @author arka.a.bhattacharya
 *
 */
@Configuration
@ComponentScan({ "com.pluralsight" })
@PropertySource("app.properties")
public class AppConfig {
	
	@Bean
	public static PropertySourcesPlaceholderConfigurer getPropertySourcesPlaceholderConfigurer() {
		return new PropertySourcesPlaceholderConfigurer();
	}

	// @Bean(name = "customerService")
	// public CustomerService getCustomerService() {
	// Constructor Injection
	// CustomerServiceImpl service = new
	// CustomerServiceImpl(getCustomerRepository());

	// Setter injection
	/*
	 * CustomerServiceImpl service = new CustomerServiceImpl();
	 * service.setCustomerRepository(getCustomerRepository());
	 */

	// Autowiring used in CustomerServiceImpl
	// CustomerServiceImpl service = new CustomerServiceImpl();
	// return service;
	// }

	// @Bean(name = "customerRepository")
	// public CustomerRepository getCustomerRepository() {
	// return new HibernateCustomerRepositoryImpl();
	// }
}
