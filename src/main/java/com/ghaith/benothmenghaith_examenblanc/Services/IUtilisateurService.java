package com.ghaith.benothmenghaith_examenblanc.Services;

import com.ghaith.benothmenghaith_examenblanc.Entities.Profession;
import com.ghaith.benothmenghaith_examenblanc.Entities.Thematique;
import com.ghaith.benothmenghaith_examenblanc.Entities.Utilisateur;

import java.util.Date;
import java.util.List;

public interface IUtilisateurService {
    Utilisateur addUtilisateur(Utilisateur utilisateur);

    Utilisateur getUtilisateurById(Long idUtilisateur);

    Utilisateur updateUtilisateur(Utilisateur utilisateur);

    void deleteUtilisateur(Utilisateur utilisateur);

    List<Utilisateur> getAllUtilisateur();

    void deleteUtilisateurById(Long idUtilisateur);

    void affecterProgrammeAUtilisateur(String prNom, String usrNom);

    void desaffecterProgrammeDeUtilisateur(String prNom, String usrNom);

    List<Utilisateur> recupererUtilisateurs(Profession p, Date d, Thematique t);
}
