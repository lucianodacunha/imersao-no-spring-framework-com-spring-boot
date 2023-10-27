package io.github.lucianodacunha.primeirospassos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Main implements CommandLineRunner {
    @Autowired
    private Calc calc;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Result: " + calc.sum(1, 2));
    }
}
