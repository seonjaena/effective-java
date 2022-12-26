package com.sj.effectivejava.ch02.service;

import com.sj.effectivejava.ch02.dto.LaptopForm;
import com.sj.effectivejava.ch02.entity.Laptop;
import com.sj.effectivejava.ch02.repository.LaptopRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class Service001 {

    private final LaptopRepository laptopRepository;

    @Transactional
    public Laptop addLaptop(LaptopForm laptopForm) {
        return laptopRepository.save(Laptop.ofModelNameAndCompany(laptopForm.getName(), laptopForm.getCorp()));
    }

}
