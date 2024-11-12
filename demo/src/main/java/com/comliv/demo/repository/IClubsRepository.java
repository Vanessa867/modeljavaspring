package com.comliv.demo.repository;

import java.util.ArrayList;

import com.comliv.demo.model.ClubsModel;

public interface IClubsRepository {

    public void save(ClubsModel clubs);
    public ArrayList<ClubsModel> findAll();
    public ClubsModel findById(long id);
    public void deleteById(long id);
    
}
