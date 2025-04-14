package dev.thevindu.lilchat.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

// WebScoketMessageBrokerConfigurer: Two-Way Channel between Client & Server
// STOMP: Structure to messages that passes to server. Does organization work
// Message broker used to direct the messages to the right place

@Configuration
@EnableWebSocketMessageBroker
public class WebSocketConfig implements WebSocketMessageBrokerConfigurer {
    @Override
    public void configureMessageBroker(MessageBrokerRegistry registry) {
        // Setting Message Broker
        registry.enableSimpleBroker("/topic");
        registry.setApplicationDestinationPrefixes("/app");
    }

    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        // Setting endpoint at /chat
        registry.addEndpoint("/chat").setAllowedOrigins("http://localhost:8080").withSockJS();
    }
}
