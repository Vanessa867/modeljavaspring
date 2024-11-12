package com.comliv.demo.repository;

import java.util.ArrayList;

import com.comliv.demo.model.MeetingClubModel;

public interface IMeetingClubRepository {


    public void save(MeetingClubModel meeting);
    public ArrayList<MeetingClubModel> findAll();
    public MeetingClubModel findById(long id);
    public void deleteById(long id);
    
}
