package cat.dbuenov;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.*;

@RestController
@ComponentScan
@RequestMapping("/")
public class Controlador {

    @GetMapping("/")
    public String helloWorld(@RequestParam(value = "name", defaultValue = "World") String name) {
        return String.format("Hello %s!", name);
    }

}
