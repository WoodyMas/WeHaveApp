package com.example.wehaveapp.models;


import javax.persistence.*;
import java.util.List;

@Entity

@Table (name = "user")
public class User {

    //////////////// Instance Variables & Table Columns ////////////

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false, length = 1000)
    private String password;

    @Column(nullable = false)
    private boolean isAdmin;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "chat")
    private List<Chat> userChats;

    //////////////////////// Getters and Setters ////////////////////


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<Chat> getUserChats() {
        return userChats;
    }

    public void setUserChats(List<Chat> userChats) {
        this.userChats = userChats;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }

    //////////////////////// Constructors ////////////////////

    // No Args
    public User() {}

    public User(String email, String password, boolean isAdmin, String username){
        this.email = email;
        this.password = password;
        this.isAdmin = isAdmin;
        this.username = username;
    };
}
