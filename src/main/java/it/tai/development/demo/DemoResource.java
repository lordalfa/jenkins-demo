package it.tai.development.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/demo")
@RestController
public class DemoResource {

    private int version = 1;

    @GetMapping("/message")
    public MessageDto message() {
        return new MessageDto(String.format("Service Version %d", version));
    }
}
