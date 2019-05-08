package com.samsonenka.demo.controllers;

import com.samsonenka.demo.logics.Worker;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class TestController {

    private List<Worker> workerList = new ArrayList<>();

    @GetMapping("/workers")
    public String getWorkers(Model model){

        workerList = Worker.addWorkersList();
        
        for (Worker value: workerList){
            if (value.getSalary() < 4000){
                value.setSalary(value.getSalary() + 1);
            }
        }

        model.addAttribute("workers", workerList);

        return "index";
    }

}
