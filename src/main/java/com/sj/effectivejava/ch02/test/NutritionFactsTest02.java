package com.sj.effectivejava.ch02.test;

import lombok.*;

@Getter
@Builder(builderMethodName = "hiddenBuilder")
public class NutritionFactsTest02 {

    private final int servingSize;
    private final int servings;
    @Builder.Default
    private final int calories = 0;
    @Builder.Default
    private final int fat = 0;
    @Builder.Default
    private final int solium = 0;
    @Builder.Default
    private final int carbohydrate = 0;

    public static NutritionFactsTest02Builder builder(int servingSize, int servings) {
        return hiddenBuilder()
                .servingSize(servingSize)
                .servings(servings);
    }

}
