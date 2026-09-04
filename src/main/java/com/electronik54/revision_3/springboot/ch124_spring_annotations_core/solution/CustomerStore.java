package com.electronik54.revision_3.springboot.ch124_spring_annotations_core.solution;

import org.springframework.stereotype.Repository;

import java.util.List;

/** @Repository - data access layer stereotype. */
@Repository
public class CustomerStore {

    public List<String> findAll() {
        return List.of("A", "B");
    }
}