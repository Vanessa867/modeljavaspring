package com.comliv.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserModel {

    @Id
    @GeneratedValue
    private long id;
    @Column(name = "nome_usuario", nullable = false, length = 255)
    private String username;
    @Column(name = "email_usuario", nullable = false, length = 255)
    private String email;
    @Column(name = "senha_usuario", nullable = false, length = 255)
    private String password;
}
