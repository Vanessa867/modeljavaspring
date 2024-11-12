package com.comliv.demo.repository;

import java.util.ArrayList;

import com.comliv.demo.model.FavoritesModel;



public interface IFavoritesRepository {

    public void save(FavoritesModel favorites);
    public ArrayList<FavoritesModel> findAll();
    public FavoritesModel findById(long id);
    public void deleteById(long id);

    
}
