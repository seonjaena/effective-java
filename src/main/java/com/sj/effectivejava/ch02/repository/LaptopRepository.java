package com.sj.effectivejava.ch02.repository;

import com.sj.effectivejava.ch02.entity.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LaptopRepository extends JpaRepository<Laptop, Long> {
}
