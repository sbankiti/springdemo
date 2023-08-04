package com.newdev.processing.repository;

import com.newdev.processing.entity.BabyEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BabyEntityRepository extends JpaRepository<BabyEntity,Integer> {
}
