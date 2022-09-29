package demoapp.controller;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.NotBlank;
import javax.validation.constraints.Size;

public class Usuario {

        @Size(min = 3, max = 12, message = "El nombre tiene como mínimo 3 letras y como máximo 12.")
        private String nombre;

        @NotBlank(message = "Introduce el apellido del usuario")
        private String apellido;

        @Min(value = 18, message = "El usuario tiene que tener más de 18 años")
        @NotNull
        private Integer edad;


    }

