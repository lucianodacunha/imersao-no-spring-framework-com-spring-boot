package io.github.lucianodacunha.primeirospassos;

import org.springframework.stereotype.Component;

@Component
public class Calc {

    public int sum(int a, int b){
        return a + b;
    }
}
