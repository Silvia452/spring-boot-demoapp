package demoapp;



import demoapp.service.ParService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class NumeroParServiceTest {

    @Autowired
    ParService parService;

    //Se comprueba con ejemplos si es par o impar el número
    @Test
    public void dosNumerosParImpar() throws Exception {
        assertThat(parService.esPar(3)).isTrue();
        assertThat(parService.esPar(6)).isFalse();
    }

}
