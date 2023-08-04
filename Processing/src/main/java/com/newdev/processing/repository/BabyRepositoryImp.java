package com.newdev.processing.repository;

import com.newdev.processing.entity.BabyEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class BabyRepositoryImp {

    @Autowired
    private BabyEntityRepository baby;

    public void saveData(BabyEntity babyEntity){

       baby.save(babyEntity);
    }
}
