package com.electronik54.revision_3.springboot.ch199_spring_aop_realworld.solution;

import org.springframework.stereotype.Service;

/** Business logic - clean of any timing/monitoring code. */
@Service
public class ReportService {

    @Timed
    public String reportCustomer(int id) {
        // simulated work
        try {
            Thread.sleep(5);
        } catch (InterruptedException ignored) {
            Thread.currentThread().interrupt();
        }
        return "report for " + id;
    }
}