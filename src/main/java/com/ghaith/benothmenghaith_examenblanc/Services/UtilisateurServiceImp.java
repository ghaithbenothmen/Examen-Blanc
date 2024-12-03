package com.ghaith.benothmenghaith_examenblanc.Services;

import com.ghaith.benothmenghaith_examenblanc.Entities.Profession;
import com.ghaith.benothmenghaith_examenblanc.Entities.Programme;
import com.ghaith.benothmenghaith_examenblanc.Entities.Thematique;
import com.ghaith.benothmenghaith_examenblanc.Entities.Utilisateur;
import com.ghaith.benothmenghaith_examenblanc.Repository.ProgrammeRepository;
import com.ghaith.benothmenghaith_examenblanc.Repository.UtilisateurRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
@AllArgsConstructor
public class UtilisateurServiceImp implements IUtilisateurService{

    UtilisateurRepository utilisateurRepository;

    ProgrammeRepository programmeRepository;


    @Override
    public Utilisateur addUtilisateur(Utilisateur utilisateur) {
        return utilisateurRepository.save(utilisateur);
    }

    @Override
    public Utilisateur getUtilisateurById(Long idUtilisateur) {
        return utilisateurRepository.findById(idUtilisateur).get();
    }

    @Override
    public Utilisateur updateUtilisateur(Utilisateur utilisateur) {
        return utilisateurRepository.save(utilisateur);
    }

    @Override
    public void deleteUtilisateur(Utilisateur utilisateur) {
        utilisateurRepository.delete(utilisateur);

    }

    @Override
    public List<Utilisateur> getAllUtilisateur() {
        return utilisateurRepository.findAll();
    }

    @Override
    public void deleteUtilisateurById(Long idUtilisateur) {
    utilisateurRepository.deleteById(idUtilisateur);
    }

    @Override
    public void affecterProgrammeAUtilisateur(String prNom, String usrNom) {
        Utilisateur utilisateur = utilisateurRepository.getUtilisateurByUsrNom(usrNom);
        Programme programme = programmeRepository.getProgrammeByPrNom(prNom);

        List<Programme> programmes =new ArrayList<>();

        if(utilisateur.getProgrammes()!=null){
            programmes=utilisateur.getProgrammes();
        }

        programmes.add(programme);
        utilisateur.setProgrammes(programmes);

        utilisateurRepository.save(utilisateur);

    }

    @Override
    public void desaffecterProgrammeDeUtilisateur(String prNom, String usrNom) {
    Programme programme = programmeRepository.getProgrammeByPrNom(prNom);
    Utilisateur utilisateur=utilisateurRepository.getUtilisateurByUsrNom(usrNom);

    utilisateur.getProgrammes().remove(programme);
    utilisateurRepository.save(utilisateur);
    }

    @Override
    public List<Utilisateur> recupererUtilisateurs(Profession p, Date d, Thematique t) {
        return utilisateurRepository.recupererUtilisateurs(p,d,t);
    }
}
