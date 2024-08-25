package br.edu.infnet.appAndreas.controller;

import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignAutoConfiguration;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableFeignClients
@ImportAutoConfiguration({FeignAutoConfiguration.class})
public class AppController {

}
