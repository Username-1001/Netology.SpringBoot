package ru.netology.conditional.configuration;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import ru.netology.conditional.DevProfile;
import ru.netology.conditional.ProductionProfile;
import ru.netology.conditional.SystemProfile;

@Configuration
@ComponentScan("ru.netology.conditional")
public class AppConfig {

    @ConditionalOnProperty(prefix = "netology.profile", name = "dev", havingValue = "true", matchIfMissing = true)
    @Bean
    public SystemProfile devProfile() {
        return new DevProfile();
    }

    @ConditionalOnProperty(prefix = "netology.profile", name = "dev", havingValue = "false")
    @Bean
    public SystemProfile prodProfile() {
        return new ProductionProfile();
    }
}
