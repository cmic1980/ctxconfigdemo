package demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.rabbitmq.client.impl.AMQImpl.Queue;

/**
 * @author yu.miao
 */
@Configuration
public class RabbitConfig {
    static final String topicExchangeName = "spring-boot-exchange";
    static final String queueName = "spring-boot";

    @Bean
    public Queue defaultQueue() {
        return new Queue();
    }
}
