package devops_lab;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DevopsLabController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello from the DevOps lab!";
    }
}