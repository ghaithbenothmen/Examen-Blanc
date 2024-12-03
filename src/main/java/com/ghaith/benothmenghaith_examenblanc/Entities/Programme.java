package com.ghaith.benothmenghaith_examenblanc.Entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Programme {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long prId;

    private String prNom;

    @ManyToMany(mappedBy="programmes", cascade = CascadeType.ALL)
    private List<Utilisateur> utilisateurs;

    @ManyToOne(cascade = CascadeType.ALL)
    private Chaine chaine;

}
