package com.ghaith.benothmenghaith_examenblanc.Controllers;

import com.ghaith.benothmenghaith_examenblanc.Entities.Programme;
import com.ghaith.benothmenghaith_examenblanc.Services.ProgrammeServiceImp;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/programmes")
public class ProgrammeController {

    ProgrammeServiceImp programmeServiceImp;

    @PostMapping
    public Programme ajouterProgrammeEtChaine(@RequestBody Programme p){
        return  programmeServiceImp.addProgramme(p);
    }

    @GetMapping
    public List<Programme> getAllProgrammes(){
        return  programmeServiceImp.getAllProgramme();
    }

    @PostMapping("/progAffCh/{idch}")
    public Programme ajouterProgrammeEtAffecterChaine(@RequestBody Programme p,@PathVariable("idch") Long chId){
        return  programmeServiceImp.ajouterProgrammeEtAffecterChaine(p,chId);
    }

}
