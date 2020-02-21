package br.com.devpaulosouza.notificationserver;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

@Slf4j
@Component
public class NotificationService {

    public Mono<Notification> execute(Notification notification) {
        return Mono.just(notification)
                .doOnNext(this::notifyWebSocket);
    }

    private void notifyWebSocket(Notification notification) {
        log.info("Notificação {}", notification);
    }

}
