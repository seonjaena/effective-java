package com.sj.effectivejava.ch02.test;

public class NutritionFactsTest {

    private final int servingSize;
    private final int servings;
    private final int calories;

    public NutritionFactsTest(Builder builder) {
        this.servingSize = builder.servingSize;
        this.servings = builder.servings;
        this.calories = builder.calories;
    }

    public static class Builder {
        private final int servingSize;
        private final int servings;
        private int calories = 0;
        public Builder(int servingSize, int servings) {
            this.servingSize = servingSize;
            this.servings = servings;
        }
        public Builder calories(int val) {
            this.calories = val;
            return this;
        }
        public NutritionFactsTest builder() {
            return new NutritionFactsTest(this);
        }
    }

}
