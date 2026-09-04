package com.electronik54.revision_3.lombok.ch97_lombok_logging.solution;

/**
 * Solution for Challenge 97: Lombok Logging (@Slf4j)
 */
public class Solution {

    public static void main(String[] args) {
        PaymentService service = new PaymentService();
        service.process(100.00);
        service.process(150.00); // triggers the warn branch
        service.refund(25.00);
    }
}