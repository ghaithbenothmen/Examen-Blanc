package com.ghaith.benothmenghaith_examenblanc.Controllers;

import com.ghaith.benothmenghaith_examenblanc.Entities.Profession;
import com.ghaith.benothmenghaith_examenblanc.Entities.Thematique;
import com.ghaith.benothmenghaith_examenblanc.Entities.Utilisateur;
import com.ghaith.benothmenghaith_examenblanc.Services.UtilisateurServiceImp;
import lombok.AllArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/utilisateurs")
public class UtilisateurController {

    UtilisateurServiceImp utilisateurServiceImp;


    @PostMapping
    public Utilisateur ajouterUtilisateur(@RequestBody Utilisateur u){
        return utilisateurServiceImp.addUtilisateur(u);
    }

    @GetMapping
    public List<Utilisateur> getAllUtilisateur(){
        return utilisateurServiceImp.getAllUtilisateur();
    }

    @PutMapping("/desaffecterProgToUsr/{prNom}/{usrNom}")
    public void desaffecterProgrammeAUtilisateur(@PathVariable("prNom")  String prNom,@PathVariable("usrNom")  String usrNom){
        utilisateurServiceImp.desaffecterProgrammeDeUtilisateur(prNom,usrNom);
    }

    @PutMapping("/affecterProgToUsr/{prNom}/{usrNom}")
    public void affecterProgrammeAUtilisateur(@PathVariable("prNom")  String prNom,@PathVariable("usrNom")  String usrNom){
        utilisateurServiceImp.affecterProgrammeDeUtilisateur(prNom,usrNom);
    }


    @GetMapping("/recuperer/{profession}/{theme}/{date}")
    public List<Utilisateur> recupererUtilisateurs(@PathVariable("profession") Profession profession,@PathVariable("theme")  Thematique theme ,@PathVariable("date") @DateTimeFormat(pattern = "dd-MM-yyyy") Date date){
        return  utilisateurServiceImp.recupererUtilisateurs(profession,date,theme);
    }

}
