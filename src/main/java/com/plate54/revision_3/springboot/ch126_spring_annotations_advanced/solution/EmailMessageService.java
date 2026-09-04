package com.electronik54.revision_3.springboot.ch126_spring_annotations_advanced.solution;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/** Default implementation (@Primary). */
@Service
@Primary
public class EmailMessageService implements MessageService {
    @Override
    public String sendMessage(String message) {
        return "Send via Email: " + message;
    }
}