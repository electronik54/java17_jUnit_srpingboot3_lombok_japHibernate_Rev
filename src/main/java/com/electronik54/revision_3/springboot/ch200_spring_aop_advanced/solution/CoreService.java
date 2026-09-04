package com.electronik54.revision_3.springboot.ch200_spring_aop_advanced.solution;

import org.springframework.stereotype.Service;

/** Target advised by two ordered aspects. */
@Service
public class CoreService {

    public void execute() {
        System.out.println("executing core logic");
    }
}