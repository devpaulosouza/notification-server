package br.com.devpaulosouza.notificationserver;

import java.util.UUID;

public interface NotificationPayload {

    UUID getId();

    Notification getMessage();

}
