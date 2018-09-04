package rs.ac.bg.fon.silab.AppKons.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import rs.ac.bg.fon.silab.AppKons.entities.Student;

public interface StudentDAO extends JpaRepository<Student, String> {

    @Query("SELECT s FROM Student s WHERE s.brojIndeksa = ?1")
    public Student vratiStudenta(String brojIndeksa);

}
