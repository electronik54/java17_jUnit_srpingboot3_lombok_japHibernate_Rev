package com.electronik54.revision_3.corejava.ch115_dependency_inversion.solution;

/** The abstraction both high- and low-level modules depend on. */
public interface MessageSender {
    void send(String message, String to);
}