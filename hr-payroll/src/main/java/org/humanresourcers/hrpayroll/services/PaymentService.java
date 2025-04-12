package org.humanresourcers.hrpayroll.services;

import org.humanresourcers.hrpayroll.entities.Payment;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public Payment getPayment(Long workerId, int days) {
        //testing
        return new Payment("Bob", 200.0, days);
    }
}
