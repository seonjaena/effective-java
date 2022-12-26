package com.sj.effectivejava.ch02.test;

import lombok.*;

@Getter
@Setter(AccessLevel.PRIVATE)
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class LaptopTest {

    private String model;
    private String company;

    public static LaptopTest ofModelNameAndCompany(String model, String company) {
        LaptopTest laptopTest = new LaptopTest();
        laptopTest.model = model;
        laptopTest.company = company;
        return laptopTest;
    }

}
