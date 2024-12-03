package com.ghaith.benothmenghaith_examenblanc.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Utilisateur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long usrId;

    private String usrNom;
    private Date usrDateInscription;

    @Enumerated(EnumType.STRING)
    private Profession profession;

    @ManyToMany(cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Programme> programmes;
}
