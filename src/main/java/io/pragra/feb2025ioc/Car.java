package io.pragra.feb2025ioc;

import Engine.Engine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Car {

   // @Autowired
    private Engine engine;

    public Car (Engine engine){
        this.engine = engine;
    }

   /*// If we removed @autowired and create object manually then its tightly coupled
    private Engine engine = new Engine();
*/
    @GetMapping("/car")
    public String drive(){
        return engine.run();
    }
}
