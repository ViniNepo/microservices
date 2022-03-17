package com.vinicius.cursos.hrpayroll.services;

import com.vinicius.cursos.hrpayroll.entities.Payment;
import com.vinicius.cursos.hrpayroll.entities.Worker;
import com.vinicius.cursos.hrpayroll.feignClients.WorkerFeignClients;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

import static java.lang.String.valueOf;

@Service
public class PaymentService {

    @Autowired
    private WorkerFeignClients workerFeignClients;

    public Payment getPayment(long workerId, int days) {
        Map<String, String> uriVariable = new HashMap<>();
        uriVariable.put("id", valueOf(workerId));

        Worker worker = workerFeignClients.findById(workerId).getBody();
        return new Payment(worker.getName(), worker.getDailyIncome(), days);
    }
}
