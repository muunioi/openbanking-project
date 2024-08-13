package com.zerobase.openbanking_project.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/transaction")
public class TransactionController {

    // create - 거래하기 (송금)
    @RequestMapping("/create")
    public String createTransaction() {
        return "Transaction created";
    }

    // read - 거래내역 조회
    @RequestMapping("/show")
    public String showTransaction() {
        return "Transaction showed";
    }
}
