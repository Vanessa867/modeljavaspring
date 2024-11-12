package com.comliv.demo.repository;

import java.util.ArrayList;

import com.comliv.demo.model.UserModel;

public interface IUserRepository {

    public void save(UserModel user);
    public ArrayList<UserModel> findAll();
    public UserModel findById(long id);
    public void deleteById(long id);
}
