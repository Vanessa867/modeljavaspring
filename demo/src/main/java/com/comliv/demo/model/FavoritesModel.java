package com.comliv.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;


@Entity
public class FavoritesModel {
    @ManyToMany
    @JoinColumn(name = "User_id")
    private UserModel userid;

    @ManyToMany
    @JoinColumn(name = "Club_id")
    private ClubsModel clubid;
}
