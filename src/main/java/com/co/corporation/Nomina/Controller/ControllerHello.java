package com.co.corporation.Nomina.Controller;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerHello {

    @RequestMapping("/Nomina")
    public String Hello() {
        return "Hello Spring Camilo";
    }
}