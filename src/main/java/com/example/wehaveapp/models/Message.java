package com.example.wehaveapp.models;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "message")
public class Message {

    //////////////// Instance Variables & Table Columns ////////////

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String body;

    @ManyToOne
    private Chat chat;

    @ManyToOne
    private User sender;

    @OneToMany(mappedBy = "message", cascade = CascadeType.ALL)
    private List<Reaction> reactions;

    //////////////////////// Getters and Setters ////////////////////

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Chat getChat() {
        return chat;
    }

    public void setChat(Chat chat) {
        this.chat = chat;
    }

    public User getSender() {
        return sender;
    }

    public void setSender(User sender) {
        this.sender = sender;
    }

    public List<Reaction> getReactions() {
        return reactions;
    }

    public void setReactions(List<Reaction> reactions) {
        this.reactions = reactions;
    }

    //////////////////////// Constructors ////////////////////

    // No Args
    public Message() {}

    public Message(String body, Chat chat, User sender) {
        this.body = body;
        this.chat = chat;
        this.sender = sender;
    }
}
