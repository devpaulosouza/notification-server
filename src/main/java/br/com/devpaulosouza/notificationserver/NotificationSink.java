package br.com.devpaulosouza.notificationserver;

import org.apache.kafka.streams.kstream.KStream;
import org.springframework.cloud.stream.annotation.Input;

public interface NotificationSink {

    @Input(NotificationTopics.NOTIFICATION)
    KStream<?, ?> notification();

}
