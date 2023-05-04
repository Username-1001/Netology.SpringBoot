package ru.netology.authorization.repository;

import jakarta.validation.constraints.*;
import lombok.Data;

@Data
@NotNull
public class User {
    @NotBlank
    @NotNull
    @Size(min = 2, max = 20)
    private String name;
    @NotBlank
    @NotNull
    @Size(min = 8, max = 30)
    private String password;
}
