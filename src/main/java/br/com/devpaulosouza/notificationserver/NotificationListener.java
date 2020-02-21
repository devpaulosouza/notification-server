package br.com.devpaulosouza.notificationserver;

import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.streams.kstream.KStream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@EnableBinding(Sink.class)
public class NotificationListener {

    @Autowired
    private NotificationService notificationService;

    @StreamListener
    public void process(@Input(NotificationTopics.NOTIFICATION)KStream<String, Notification> notificationEvent) {

        notificationEvent
                .foreach((k, v) -> notificationService.execute(v).subscribe());
    }


}
