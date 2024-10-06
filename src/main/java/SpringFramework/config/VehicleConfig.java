package SpringFramework.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "SpringFramework.entities")
public class VehicleConfig {
}
