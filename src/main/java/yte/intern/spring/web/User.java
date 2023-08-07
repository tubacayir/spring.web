package yte.intern.spring.web;

import jakarta.validation.constraints.*;
import java.time.LocalDate;

public class User {
    @NotEmpty
    private String firstName;

    @NotEmpty
    private String lastName;

    @NotBlank(message = "Kullanıcı adı boş olamaz")
    @Pattern(regexp = "^(?!admin$)[a-zA-Z0-9]+$", message = "Geçersiz kullanıcı adı")
    private String username;

    @NotBlank(message = "E-mail adresi boş olamaz")
    @Email(message = "Geçersiz e-mail adresi")
    private String email;

    @NotNull(message = "Yaş boş olamaz")
    @Min(value = 12, message = "Yaş en az 12 olmalı")
    @Max(value = 100, message = "Yaş en fazla 100 olmalı")
    private Integer age;

    @NotBlank(message = "TC kimlik numarası boş olamaz")
    @Pattern(regexp = "^[0-9]{11}$", message = "Geçersiz TC kimlik numarası")
    private String tcIdentityNumber;

    @PastOrPresent(message = "Doğum tarihi bugün veya daha öncesinde olmalı")
    private LocalDate birthDate;

    @Size(max = 250, message = "İkametgah adresi 250 karakterden kısa olmalı")
    private String address;

    public User() {
    }


}

