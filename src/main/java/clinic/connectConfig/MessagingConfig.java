//package clinic.connectConfig;
//
//import org.apache.activemq.ActiveMQConnectionFactory;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.jms.core.JmsTemplate;
//
//import java.util.Arrays;
//@Configuration
//public class MessagingConfig {
//    private static final String DEFAULT_BROKER_URL = "tcp://localhost:8080";//todo поменять на айпи
//
//    private static final String ORDER_QUEUE = "order-queue";
//
//    @Bean
//    public ActiveMQConnectionFactory connectionFactory() {
//        ActiveMQConnectionFactory connectionFactory = new ActiveMQConnectionFactory();
//        connectionFactory.setBrokerURL(DEFAULT_BROKER_URL);
//        connectionFactory.setTrustedPackages(Arrays.asList("com.websystique.springmvc"));
//        return connectionFactory;
//    }
//
//    @Bean
//    public JmsTemplate jmsTemplate() {
//        JmsTemplate template = new JmsTemplate();
//        template.setConnectionFactory(connectionFactory());
//        template.setDefaultDestinationName(ORDER_QUEUE);
//        return template;
//    }
//}
