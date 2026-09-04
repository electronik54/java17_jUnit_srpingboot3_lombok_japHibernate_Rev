package com.electronik54.revision_3.logging.ch205_logging_spring_boot.solution;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/** Spring bean using Lombok's @Slf4j for logging. */
@Slf4j
@Service
public class BankService {

    public void transfer(String from, String to, double amount) {
        log.info("Transfer {} from {} to {}", amount, from, to);
    }
}