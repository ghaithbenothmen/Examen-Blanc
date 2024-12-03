package com.ghaith.benothmenghaith_examenblanc.Repository;

import com.ghaith.benothmenghaith_examenblanc.Entities.Profession;
import com.ghaith.benothmenghaith_examenblanc.Entities.Thematique;
import com.ghaith.benothmenghaith_examenblanc.Entities.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;

public interface UtilisateurRepository extends JpaRepository<Utilisateur,Long> {

    Utilisateur getUtilisateurByUsrNom(String usrNom);

    @Query("SELECT u FROM Utilisateur u JOIN u.programmes prog WHERE u.profession = :profession AND prog.chaine.chTheme = :theme AND u.usrDateInscription > :date")
    List<Utilisateur> recupererUtilisateurs(@Param("profession") Profession profession, @Param("date") Date date, @Param("theme") Thematique theme);


    }