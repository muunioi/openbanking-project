package com.zerobase.openbanking_project.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/account")
public class AccountController {

    //create - 계좌 생성
    @RequestMapping("/create")
    public String createAccount() {
        return "Account created";
    }

    //read - 계좌 목록 조회 및 잔액 조회
    @RequestMapping("/show")
    public String showAccount() {
        return "Account show";
    }

    //update - 계좌 수정

    //delete - 계좌 삭제

}
