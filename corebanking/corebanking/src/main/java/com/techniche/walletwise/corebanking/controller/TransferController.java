package com.techniche.walletwise.corebanking.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TransferController {
    @GetMapping(path ="/requestType")
    public String specifyType(){
        return "This service is for transfers";
    }
}
