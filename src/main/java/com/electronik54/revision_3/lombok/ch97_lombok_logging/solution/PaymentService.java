package com.electronik54.revision_3.lombok.ch97_lombok_logging.solution;

import lombok.extern.slf4j.Slf4j;

/**
 * @Slf4j injects a static SLF4J Logger named 'log'.
 */
@Slf4j
public class PaymentService {

    public void process(double amount) {
        log.info("Processing payment {}", amount);
        log.debug("Validated payment {}", amount);
        if (amount > 100) {
            log.warn("Amount {} exceeds 100 limit", amount);
        }
    }

    public void refund(double amount) {
        log.info("Refunded {}", amount);
    }
}