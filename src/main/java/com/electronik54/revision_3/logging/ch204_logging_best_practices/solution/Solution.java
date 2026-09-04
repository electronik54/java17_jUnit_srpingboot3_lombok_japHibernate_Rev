package com.electronik54.revision_3.logging.ch204_logging_best_practices.solution;

/**
 * Solution for Challenge 204.
 */
public class Solution {

    public static void main(String[] args) {
        OrderLogger logger = new OrderLogger();
        logger.process(42, 7);
        logger.process(50, 8);
    }
}