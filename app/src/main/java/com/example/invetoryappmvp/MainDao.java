package com.example.invetoryappmvp;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

import static androidx.room.OnConflictStrategy.REPLACE;

@Dao
public class MainDao {

    @Insert(onConflict = REPLACE)
    void insert(DataDto dataDto) {

    }

    @Delete
    void delete(DataDto dataDto) {

    }

    @Query("UPDATE universities SET name = :sName WHERE ID = :sID")
    void update(String sName, int sID){

    }

    @Query("SELECT * FROM universities");
    List<DataDto> selectAll(){

    }

}
