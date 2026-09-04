package com.electronik54.revision_3.corejava.ch110_facade_pattern.solution;

/**
 * Facade: exposes two simple methods while hiding subsystem orchestration.
 */
public class ComputerFacade {
    private final CPU cpu = new CPU();
    private final Memory memory = new Memory();
    private final HardDrive hardDrive = new HardDrive();

    public void start() {
        System.out.println("Computer starting...");
        cpu.load();
        memory.load();
        hardDrive.read();
    }

    public void shutdown() {
        System.out.println("Computer shutting down...");
        cpu.stop();
        hardDrive.close();
    }
}