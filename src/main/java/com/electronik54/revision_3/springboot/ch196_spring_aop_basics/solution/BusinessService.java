package com.electronik54.revision_3.springboot.ch196_spring_aop_basics.solution;

import org.springframework.stereotype.Service;

/** Target class whose method will be intercepted by the aspect. */
@Service
public class BusinessService {

    public String processOrder(int id) {
        String result = "BusinessService processing order " + id;
        System.out.println(result);
        return result;
    }
}