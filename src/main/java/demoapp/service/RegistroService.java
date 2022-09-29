package demoapp.service;
import org.springframework.stereotype.Service;

@Service

public class RegistroService {
    public String saluda(String nombre) {
        return "Hola " + nombre;
    }
}
