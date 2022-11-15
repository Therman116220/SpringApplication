package com.portfolio.application.model;

import javax.persistence.*;
import java.util.Collection;
import java.util.List;

@ Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String username;
    private String password;
    private String email;
}
