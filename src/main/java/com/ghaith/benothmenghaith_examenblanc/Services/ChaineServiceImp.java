package com.ghaith.benothmenghaith_examenblanc.Services;

import com.ghaith.benothmenghaith_examenblanc.Entities.Chaine;
import com.ghaith.benothmenghaith_examenblanc.Repository.ChaineRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ChaineServiceImp implements IChaineService{

    ChaineRepository chaineRepository;

    @Override
    public Chaine addChaine(Chaine chaine) {
        return chaineRepository.save(chaine);
    }

    @Override
    public Chaine getChaineById(Long idChaine) {
        return chaineRepository.findById(idChaine).get();
    }

    @Override
    public Chaine updateChaine(Chaine chaine) {
        return chaineRepository.save(chaine);
    }

    @Override
    public void deleteChaine(Chaine chaine) {
        chaineRepository.delete(chaine);
    }

    @Override
    public List<Chaine> getAllChaine() {
        return chaineRepository.findAll();
    }

    @Override
    public void deleteChaineById(Long idChaine) {
        chaineRepository.deleteById(idChaine);
    }
}
