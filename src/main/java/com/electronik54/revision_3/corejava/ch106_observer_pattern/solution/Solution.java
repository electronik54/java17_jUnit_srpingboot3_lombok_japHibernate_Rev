package com.electronik54.revision_3.corejava.ch106_observer_pattern.solution;

/**
 * Solution for Challenge 106: Observer Pattern
 */
public class Solution {

    public static void main(String[] args) {
        NewsAgency agency = new NewsAgency();

        Subscriber email = new EmailSubscriber("Subscriber1");
        Subscriber sms = new SMSSubscriber("Subscriber2");

        agency.subscribe(email);
        agency.subscribe(sms);

        agency.publish("Breaking News: Java 21 released!");
    }
}