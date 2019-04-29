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
        model.addAttribute("workers", workerList);

        return "index";
    }

}
