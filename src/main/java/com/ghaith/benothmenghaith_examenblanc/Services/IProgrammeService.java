package com.ghaith.benothmenghaith_examenblanc.Services;

import com.ghaith.benothmenghaith_examenblanc.Entities.Programme;

import java.util.List;

public interface IProgrammeService {

    Programme addProgramme(Programme programme);

    Programme getProgrammeById(Long idProgramme);

    Programme updateProgramme(Programme programme);

    void deleteProgramme(Programme programme);

    List<Programme> getAllProgramme();

    void deleteProgrammeById(Long idProgramme);

    Programme ajouterProgrammeEtAffecterChaine(Programme p,Long chId);


}
