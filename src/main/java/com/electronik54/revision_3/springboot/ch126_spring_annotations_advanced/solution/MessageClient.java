package com.electronik54.revision_3.springboot.ch126_spring_annotations_advanced.solution;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/** Injects @Primary by default and SMS explicitly via @Qualifier. */
@Component
public class MessageClient {

    private final MessageService primaryService;
    private final MessageService smsService;

    public MessageClient(MessageService primaryService,
                         @Qualifier("smsMessageService") MessageService smsService) {
        this.primaryService = primaryService;
        this.smsService = smsService;
    }

    public String primary() {
        return primaryService.sendMessage("default");
    }

    public String sms() {
        return smsService.sendMessage("explicit");
    }
}