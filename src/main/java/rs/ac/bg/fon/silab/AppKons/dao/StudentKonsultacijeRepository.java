package rs.ac.bg.fon.silab.AppKons.dao;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import rs.ac.bg.fon.silab.AppKons.entities.StudentKonsultacije;
import rs.ac.bg.fon.silab.AppKons.entities.StudentKonsultacijePK;

public interface StudentKonsultacijeRepository extends JpaRepository<StudentKonsultacije, StudentKonsultacijePK> {

    public List<StudentKonsultacije> findByBrojIndeksaStudenta(String brojIndeksa);

    @Query("SELECT sk FROM StudentKonsultacije sk INNER JOIN Konsultacije k on sk.konsultacije.dogadjajPK.idDogadjaja = k.dogadjajPK.idDogadjaja INNER JOIN Dogadjaj d on k.dogadjajPK.idDogadjaja = d.dogadjajPK.idDogadjaja INNER JOIN Kalendar k on d.dogadjajPK.idKalendara = k.idKalendara INNER JOIN Nastavnik n on k.nastavnik = n.jmbg WHERE n.jmbg =?1")
    public List<StudentKonsultacije> findByJMBGNastavnika(String JMBGNastavnika);

}
