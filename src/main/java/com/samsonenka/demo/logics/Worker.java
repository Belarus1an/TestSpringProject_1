package com.samsonenka.demo.logics;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
public class Worker {

    private static int counterID = 0;
    private int workerID;
    private String name;
    private String department;
    private float salary;

    public Worker() {
    }

    public Worker(String name, String department, float salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;

        counterID++;
        this.workerID = counterID;
    }

    public static List<Worker> addWorkersList(){

        List<Worker> workerList = new ArrayList<>();
        workerList.add(new Worker("Pavel", "Warsaw", 3700));
        workerList.add(new Worker("Anna", "Minsk", 4000));
        workerList.add(new Worker("Oksana", "Smorgon", 4200));
        workerList.add(new Worker("Anastasia", "Mogilyov", 3900));

        return workerList;
    }
}
