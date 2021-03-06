package com.example.demo.api.dto;

import java.util.Date;
import java.util.UUID;

public class TrainerMeetDTO {
    private UUID trainer;
    private UUID client;
    private Date date;

    public UUID getTrainer() {
        return trainer;
    }

    public UUID getClient() {
        return client;
    }

    public Date getDate() {
        return date;
    }
}
