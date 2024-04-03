package com.example.prueba;
import jakarta.websocket.server.PathParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NameController {
    //methods with endpoint/ getMapping + parameter : @RequestParam
    @GetMapping("/hello") // not parameters...........
    public static String sayHello(@RequestParam String name,@RequestParam int age ){
        return "hello world!! my name is:.." + name +" "+ age;
    }
    //getMapping + parameter : @PathVariable
    @GetMapping("/helloName/{name}/{age}")// with parameters...............
    public static String sayHelloName(@PathVariable String name,
                                   @PathVariable int age){
        return ("Hello " + name + ", your Age is: " + age);
    }
}
