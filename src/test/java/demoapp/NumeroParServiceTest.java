package demoapp;



import demoapp.service.NumeroParService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class NumeroParServiceTest {

    @Autowired
    NumeroParService parService;

    //Se comprueba con ejemplos si es par o impar el número
    @Test
    public void dosNumerosParImpar() throws Exception {
        assertThat(parService.esPar(6)).isTrue();
        assertThat(parService.esPar(3)).isFalse();
    }

}
