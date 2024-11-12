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
public class MeetingClubModel {

    @Id
    @GeneratedValue
    private long id;
    @Column(name = "data_encontro",  nullable = false)
    private String meetingDate;
    @Column(name = "titulo_reunião", nullable = false, length = 255)
    private String titleDate;
}
