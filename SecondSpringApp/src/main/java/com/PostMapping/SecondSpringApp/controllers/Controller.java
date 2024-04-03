package com.PostMapping.SecondSpringApp.controllers;

import com.PostMapping.SecondSpringApp.Client;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.w3c.dom.ls.LSException;

import java.util.List;
import java.util.ArrayList;

@RestController
public class Controller {//I need to create the endpoint in our API, which allows the reception of data, to create clients from them

    //responding to a Post request
    @PostMapping("/client") // Post Request
    public void newClient(@RequestBody Client newClient1){ //The new client's data will arrive in the request, how do I tell my parameter where to get that data from? adding @RequestBody, I tell the variable: Client newclient1 to create the new client with the data that it will find in the body of the request package
        //what the method will do
        System.out.println("New client created!!");
        System.out.println("Name: "+ newClient1.getName());
        System.out.println("LastName: "+ newClient1.getLastName());

    }
    //RESPONSES
    @GetMapping("/client/get") // Request
    @ResponseBody              //Response
    public List<Client> getClient(){//
        List <Client> clientList = new ArrayList<Client>();
        clientList.add(new Client(25633,"Emi","Escobar"));
        clientList.add(new Client(25634,"Lionel","Messi"));
        clientList.add(new Client(25635,"Ronaldo","Pepe"));
        return clientList; // this method is going to return list of clients, but I want to "specify" that this list of clients be returned in the "body of my response". how can I do this? below GetMapping I just need to add a notation @ResponseBody
    }

    @GetMapping("/clientEntity")
    ResponseEntity <String> getAnswer(){ // with Response Entity we can manage the complete package in the HTTP response, therefor I can manipulate the body, the header or even the status code
        return new ResponseEntity<>("Response Entity message", HttpStatus.OK);
    }
}
