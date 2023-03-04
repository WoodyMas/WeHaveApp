package com.example.wehaveapp.models;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "reactions")
public class Reaction {

    //////////////// Instance Variables & Table Columns ////////////

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "message_id")
    private Message message;

    private String emoji;

    //////////////////////// Getters and Setters ////////////////////

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }

    public String getEmoji() {
        return emoji;
    }

    public void setEmoji(String emoji) {
        this.emoji = emoji;
    }

    //////////////////////// Constructors ////////////////////

    // No Args
    public Reaction() {}

    public Reaction(User user, Message message, String emoji) {
        this.user = user;
        this.message = message;
        this.emoji = emoji;
    }
}