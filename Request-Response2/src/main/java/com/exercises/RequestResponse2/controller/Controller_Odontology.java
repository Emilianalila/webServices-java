package com.exercises.RequestResponse2.controller;

import com.exercises.RequestResponse2.Patient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

@RestController
public class Controller_Odontology {
    //A_Respond with all the patients list
    @GetMapping ("/patientList")
    ResponseEntity<List<Patient>>  getPatientList(){ //ResponseEntity is a generic type. Consequently, we can use any type as the response body:

        List <Patient> patientsList = new ArrayList<Patient>();
        patientsList.add(new Patient(1,93995840,"Emiliana","Escobar", "1989-08-16"));
        patientsList.add(new Patient(2,93995841,"Maria","Wzfjjg", "1980-08-16"));
        patientsList.add(new Patient(3,93995842,"Marius","Diaconita", "2023-08-16"));
        patientsList.add(new Patient(4,93995843,"Mauro","Morales", "1950-08-16"));
        patientsList.add(new Patient(5,93995844,"Martin","Gro", "1990-08-16"));
        patientsList.add(new Patient(6,93995845,"Joana","Leiva", "2021-08-16"));

        return new ResponseEntity<>(patientsList, HttpStatus.OK);
    }

    @GetMapping("/underage")
    ResponseEntity <List<Patient>> getUnderage(){ // this response return a List of underAge patients

        //variables we don't know
        List<Patient> patientsList = new ArrayList<Patient>();
        patientsList.add(new Patient(1,93995840,"Emiliana","Escobar", "2022-08-16"));
        patientsList.add(new Patient(2,93995841,"Maria","Escobar", "1980-09-16"));
        patientsList.add(new Patient(3,93995842,"Marius","Diaconita", "2019-01-16"));
        patientsList.add(new Patient(4,93995843,"Mauro","Escobar", "1991-02-25"));
        patientsList.add(new Patient(5,93995844,"Martin","Escobar", "1990-04-16"));
        patientsList.add(new Patient(6,93995845,"Joana","Leiva", "2021-03-16"));

        // I create a new list to save the underage
        List <Patient> underAgeList = new ArrayList<>();
        for (Patient currentPatient : patientsList){
            String birthDay = currentPatient.getBirthDay();
            LocalDate birthDayFormat = LocalDate.parse(birthDay);
            LocalDate today = LocalDate.now(); // or Period age = Period.between(birthDayFormat, today); then age.getYears()<18
            long age = ChronoUnit.YEARS.between(birthDayFormat, today); // here I have only the "years" between this two dates
            if (age < 18){
           // System.out.println(" age: "+ age+ " birthFormat: "+birthDayFormat+ "  today:  "+today+  " "+ birthDay);
            underAgeList.add(currentPatient);
            }
        }
        return new ResponseEntity<>(underAgeList, HttpStatus.OK);
    }
}
