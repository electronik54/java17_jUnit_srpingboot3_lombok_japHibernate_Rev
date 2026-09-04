package com.electronik54.revision_3.corejava.ch119_mockito_mocking.solution;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

/**
 * Mockito unit test - no real EmailService or PaymentService used.
 */
@ExtendWith(MockitoExtension.class)
class OrderServiceTest {

    @Mock
    private PaymentService paymentService;

    @Mock
    private EmailService emailService;

    @InjectMocks
    private OrderService orderService;

    @Test
    void placeOrder_chargesAndSendsEmail() {
        // Stub the payment mock to succeed
        when(paymentService.charge("a@b.com", 100.0)).thenReturn(true);

        boolean result = orderService.placeOrder("a@b.com", 100.0);

        assertTrue(result);
        verify(paymentService).charge("a@b.com", 100.0);
        verify(emailService).sendOrderConfirmation("a@b.com", 42L);
        // No other interactions
        verifyNoMoreInteractions(paymentService, emailService);
    }

    @Test
    void placeOrder_noEmailWhenPaymentFails() {
        when(paymentService.charge("a@b.com", 100.0)).thenReturn(false);

        boolean result = orderService.placeOrder("a@b.com", 100.0);

        assertFalse(result);
        verify(emailService, never()).sendOrderConfirmation(any(), anyLong());
    }
}