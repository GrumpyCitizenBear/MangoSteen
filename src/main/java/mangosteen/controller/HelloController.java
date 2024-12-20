package mangosteen.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping(path = "v1.0/hello/{name}")
    public String sayHello(@PathVariable("name") String name){
        return String.format("Hello, %s", name);
    }
}
