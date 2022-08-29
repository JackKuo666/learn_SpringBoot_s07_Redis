package com.example.s07_2_spirngbootredistest.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class Account implements Serializable {
    int id;
    String name;
    String password;
    String role;
}
