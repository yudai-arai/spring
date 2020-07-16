package demo;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

@Configuration
public class WebConfig {
    @Bean
    public MessageSource messeageSource() {
        ReloadableResourceBundleMessageSource bean = new ReloadableResourceBundleMessageSource();

        bean.setBasename("classpath:message");

        bean.setDefaultEncoding("UTF-8");

        return bean;
    }

    @Bean
    public LocalValidatorFactoryBean localValidatorFactoryBean() {
        LocalValidatorFactoryBean localValidatorFactoryBean = new LocalValidatorFactoryBean();

        localValidatorFactoryBean.setValidationMessageSource(messeageSource());

        return localValidatorFactoryBean;
    }


}
