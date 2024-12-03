package com.ghaith.benothmenghaith_examenblanc.Repository;

import com.ghaith.benothmenghaith_examenblanc.Entities.Programme;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProgrammeRepository extends JpaRepository<Programme,Long> {

    Programme getProgrammeByPrNom(String prNom);
}
