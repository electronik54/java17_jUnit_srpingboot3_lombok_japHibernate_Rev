package com.electronik54.revision_3.springboot.ch126_spring_annotations_advanced.solution;

import org.springframework.stereotype.Service;

/** Non-primary implementation; selected via @Qualifier("smsMessageService"). */
@Service("smsMessageService")
public class SmsMessageService implements MessageService {
    @Override
    public String sendMessage(String message) {
        return "Send via SMS: " + message;
    }
}