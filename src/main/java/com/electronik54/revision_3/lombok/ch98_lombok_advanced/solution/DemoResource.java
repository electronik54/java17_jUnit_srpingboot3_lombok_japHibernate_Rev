package com.electronik54.revision_3.lombok.ch98_lombok_advanced.solution;

import lombok.Cleanup;
import lombok.SneakyThrows;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/**
 * Demonstrates @SneakyThrows and @Cleanup.
 */
public class DemoResource {

    @SneakyThrows
    public void work() {
        // @SneakyThrows lets us throw IOException without declaring it
        throw new IOException("simulated failure");
    }

    public void closeResource() {
        try {
            work();
        } catch (Exception e) {
            System.out.println("SneakyThrows worked, resource closed");
        }
    }

    @SneakyThrows
    public void writeWithCleanup() {
        @Cleanup ByteArrayOutputStream bos = new ByteArrayOutputStream();
        bos.write("hello".getBytes());
        System.out.println("Wrote " + bos.size() + " bytes via @Cleanup (auto-closed)");
    }
}