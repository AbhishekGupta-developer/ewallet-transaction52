package com.myorganisation.ewallet.transactions52.service.resource;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class NotificationMessage {

    private String toEmail;
    private String subject;
    private String body;

}
