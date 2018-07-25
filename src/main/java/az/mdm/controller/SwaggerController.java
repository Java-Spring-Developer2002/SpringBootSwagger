package az.mdm.controller;

import az.mdm.Person;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/swagger")
public class SwaggerController {

    @RequestMapping(value = "/custom", method = RequestMethod.GET,produces = "application/json")
    public Person custom() {
        return new Person();
    }
}
