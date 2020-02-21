package br.com.devpaulosouza.notificationserver;

import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.streams.kstream.KStream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;

@Slf4j
@EnableBinding(NotificationStream.class)
public class NotificationListener {

    @Autowired
    private NotificationService notificationService;

    @StreamListener(NotificationStream.INPUT)
    public void process(Notification notificationEvent) {
        notificationService.execute(notificationEvent).subscribe();
    }

}
