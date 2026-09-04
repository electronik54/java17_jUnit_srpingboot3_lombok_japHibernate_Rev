package com.electronik54.revision_3.corejava.ch116_solid_realworld.solution;

/** Orchestrates SRP components + DIP gateway. */
public class EmployeePaymentService {
    private final PaymentGateway gateway;
    private final SalaryCalculator calculator = new SalaryCalculator();

    public EmployeePaymentService(PaymentGateway gateway) {
        this.gateway = gateway;
    }

    public void pay(Employee employee) {
        double amount = calculator.gross(employee);
        gateway.pay(employee.getName(), amount);
    }
}