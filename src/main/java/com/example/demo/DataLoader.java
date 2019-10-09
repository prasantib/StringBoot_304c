package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    @Autowired
    CarRepository repository;

    @Override
    public void run(String... strings) throws Exception {
        Car car;
        car = new Car("2015", "Honda", "Accord");
        repository.save(car);

        car = new Car("2016", "Toyota", "Carrola");
        repository.save(car);

        car = new Car("2019", "Chevy", "Malibu");
        repository.save(car);
    }
}
