package com.ghaith.benothmenghaith_examenblanc.Services;

import com.ghaith.benothmenghaith_examenblanc.Entities.Chaine;

import java.util.List;

public interface IChaineService {
    Chaine addChaine(Chaine chaine);

    Chaine getChaineById(Long idChaine);

    Chaine updateChaine(Chaine chaine);

    void deleteChaine(Chaine chaine);

    List<Chaine> getAllChaine();

    void deleteChaineById(Long idChaine);


}
