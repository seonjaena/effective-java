package com.sj.effectivejava.ch02.repository;

import com.sj.effectivejava.ch02.entity.NutritionFact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NutritionFactRepository extends JpaRepository<NutritionFact, Long> {
}
