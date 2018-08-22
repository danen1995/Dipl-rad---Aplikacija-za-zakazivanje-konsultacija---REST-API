package rs.ac.bg.fon.silab.AppKons.dao;

import java.math.BigDecimal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import rs.ac.bg.fon.silab.AppKons.entities.Konsultacije;
import rs.ac.bg.fon.silab.AppKons.entities.KorisnickiNalog;
import rs.ac.bg.fon.silab.AppKons.entities.Student;

public interface KorisnickiNalogRepository extends JpaRepository<KorisnickiNalog, BigDecimal> {

    @Query("SELECT k FROM KorisnickiNalog k WHERE k.korisnickoIme = ?1 and k.lozinka = ?2")
    public KorisnickiNalog login(String korisnickoIme, String korisnickaSifra);

    @Query("SELECT k FROM KorisnickiNalog k where k.korisnickoIme = ?1")
    KorisnickiNalog findByKorisnickoIme(String korisnickoIme);
}
