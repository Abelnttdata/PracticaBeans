package com.example.springcoredojo.examplexmlpath;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Youtuber {
  /*  @Autowired
    private AccountRepository accountRepository;
    private String name;

    public Youtuber(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public AccountRepository getAccountRepository() {
        return accountRepository;
    }

    public void setAccountRepository(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }*/

    private String nombre;

    public Youtuber() {
    }

    @Override
    public String toString() {
        return "Youtuber{" +
                "nombre='" + nombre + '\'' +
                '}';
    }

    public Youtuber(String name) {
        this.nombre = name;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
