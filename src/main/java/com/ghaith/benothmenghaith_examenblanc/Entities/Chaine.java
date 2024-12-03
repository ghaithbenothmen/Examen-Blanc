package com.example.foyerprojectspring.Entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Chaine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long chId;

    private String chNom;
    private Thematique chTheme;
}
