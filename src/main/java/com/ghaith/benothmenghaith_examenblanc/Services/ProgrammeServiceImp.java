package com.ghaith.benothmenghaith_examenblanc.Services;

import com.ghaith.benothmenghaith_examenblanc.Entities.Chaine;
import com.ghaith.benothmenghaith_examenblanc.Entities.Programme;
import com.ghaith.benothmenghaith_examenblanc.Repository.ChaineRepository;
import com.ghaith.benothmenghaith_examenblanc.Repository.ProgrammeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProgrammeServiceImp implements IProgrammeService{

    ProgrammeRepository programmeRepository;
ChaineRepository chaineRepository;


    @Override
    public Programme addProgramme(Programme programme) {
        return programmeRepository.save(programme);
    }

    @Override
    public Programme getProgrammeById(Long idProgramme) {
        return programmeRepository.findById(idProgramme).get();
    }

    @Override
    public Programme updateProgramme(Programme programme) {
        return programmeRepository.save(programme);
    }

    @Override
    public void deleteProgramme(Programme programme) {
        programmeRepository.delete(programme);
    }

    @Override
    public List<Programme> getAllProgramme() {
        return programmeRepository.findAll();
    }

    @Override
    public void deleteProgrammeById(Long idProgramme) {
        programmeRepository.deleteById(idProgramme);
    }

    @Override
    public Programme ajouterProgrammeEtAffecterChaine(Programme p, Long chId) {
        Chaine chaine=chaineRepository.findById(chId).get();

        programmeRepository.save(p);
        p.setChaine(chaine);

        return programmeRepository.save(p);
    }
}
