package br.com.devpaulosouza.notificationserver;

public interface NotificationEvent {

    EventType getType();

    NotificationPayload getPayload();

}
