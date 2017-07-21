package com.example.springbootexceptionhandling.bird;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

@Entity
public class Bird {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;

    @Column(name = "SCIENTIFIC_NAME")
    @NotNull
    private String scientificName;

    @Column(name = "SPECIE")
    @NotNull
    private String specie;

    @Column(name = "MASS")
    @NotNull
    @Max(104000)
    private Double mass;

    @Column(name = "LENGTH")
    @NotNull
    @Max(210)
    private Integer length;


}
