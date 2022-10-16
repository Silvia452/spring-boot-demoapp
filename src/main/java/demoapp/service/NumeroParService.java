package demoapp.service;

import org.springframework.stereotype.Service;


@Service
public class NumeroParService {
    public boolean esPar(int num) {
        return (num % 2) == 0;
    } //metodo para saber si es par o impar
}