package me.iwts.bifrost.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author iwts
 * @date 2022/7/17 23:13
 */
@RestController
@RequestMapping(value = "/health")
public class HealthController {
    /**
     * health check
     *
     * @return check result
     * */
    @RequestMapping(value = "/check")
    @ResponseBody
    public String healthCheck() {
        return "200 OK";
    }
}
