package rs.ac.bg.fon.silab.AppKons.dao;

import java.awt.print.Pageable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import rs.ac.bg.fon.silab.AppKons.entities.DogadjajPK;
import rs.ac.bg.fon.silab.AppKons.entities.Konsultacije;
import rs.ac.bg.fon.silab.AppKons.entities.Prilog;

public interface PrilogRepository extends JpaRepository<Prilog, BigDecimal> {

  
}
