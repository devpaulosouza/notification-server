package br.com.devpaulosouza.notificationserver;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface NotificationStream {

    String INPUT = "notification";


    @Input(NotificationStream.INPUT)
    SubscribableChannel input();

}
