package com.ssm.controller;

import com.ssm.service.LivingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class LivingController {

    @Autowired
    private LivingService livingService;
}
