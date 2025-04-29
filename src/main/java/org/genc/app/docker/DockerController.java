package org.genc.app.docker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class DockerController {


    @GetMapping("/greetUser")
    public String getMessage(){
        return  " Welcome  to docker";
    }


}
