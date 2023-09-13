package com.example.helloworldcontroller;


import jdk.jfr.DataAmount;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Messages {
    String name;
    String messages;
    String iD;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessages() {
        return messages;
    }

    public void setMessages(String messages) {
        this.messages = messages;
    }

    public String getiD() {
        return iD;
    }

    public void setiD(String iD) {
        this.iD = iD;
    }
}
