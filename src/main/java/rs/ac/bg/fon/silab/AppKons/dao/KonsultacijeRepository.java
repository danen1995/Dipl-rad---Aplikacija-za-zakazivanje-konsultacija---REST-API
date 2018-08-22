package rs.ac.bg.fon.silab.AppKons.dao;

import java.math.BigInteger;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import rs.ac.bg.fon.silab.AppKons.entities.DogadjajPK;
import rs.ac.bg.fon.silab.AppKons.entities.Konsultacije;

public interface KonsultacijeRepository extends JpaRepository<Konsultacije, DogadjajPK> {

    @Query("SELECT s FROM Konsultacije s WHERE s.dogadjajPK.idDogadjaja = ?1")
    public Konsultacije vratiKonsultacije(BigInteger idDogadjaja);

    @Query("SELECT s FROM Konsultacije s INNER JOIN Kalendar k on s.dogadjajPK.idKalendara = k.idKalendara INNER JOIN Nastavnik n on k.nastavnik.jmbg = n.jmbg WHERE n.jmbg = ?1")
    public List<Konsultacije> vratiKonsultacijeZaNastavnika(String JMBGNastavnika);

}
