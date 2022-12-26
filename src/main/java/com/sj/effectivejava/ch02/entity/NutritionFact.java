package com.sj.effectivejava.ch02.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "NUTRITION_FACTS")
@Getter
@Setter(AccessLevel.PRIVATE)
@Builder(builderMethodName = "innerBuilder")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class NutritionFact {

    @Id
    @Column(name = "NUTRITION_FACTS_IDX")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "SERVING_SIZE")
    private int servingSize;

    @Column(name = "SERVINGS")
    private int servings;

    @Builder.Default
    @Column(name = "CALORIES")
    private int calories = 0;

    @Builder.Default
    @Column(name = "FAT")
    private int fat = 0;

    @Builder.Default
    @Column(name = "SOLIUM")
    private int solium = 0;

    @Builder.Default
    @Column(name = "CARBOHYDRATE")
    private int carbohydrate = 0;

    public static NutritionFactBuilder builder(int servingSize, int servings) {
        return innerBuilder()
                .servingSize(servingSize)
                .servings(servings);
    }

}
