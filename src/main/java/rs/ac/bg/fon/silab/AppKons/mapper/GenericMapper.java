/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.ac.bg.fon.silab.AppKons.mapper;

import org.mapstruct.Mapper;
import rs.ac.bg.fon.silab.AppKons.dto.ClanstvoKomisijeDTO;
import rs.ac.bg.fon.silab.AppKons.dto.DogadjajDTO;
import rs.ac.bg.fon.silab.AppKons.dto.DogadjajPKDTO;
import rs.ac.bg.fon.silab.AppKons.dto.KalendarDTO;
import rs.ac.bg.fon.silab.AppKons.dto.KonsultacijeDTO;
import rs.ac.bg.fon.silab.AppKons.dto.KorisnickiNalogDTO;
import rs.ac.bg.fon.silab.AppKons.dto.NastavaDTO;
import rs.ac.bg.fon.silab.AppKons.dto.NastavnikDTO;
import rs.ac.bg.fon.silab.AppKons.dto.PokrivenostNastaveDTO;
import rs.ac.bg.fon.silab.AppKons.dto.PokrivenostNastavePKDTO;
import rs.ac.bg.fon.silab.AppKons.dto.PredmetDTO;
import rs.ac.bg.fon.silab.AppKons.dto.PrilogDTO;
import rs.ac.bg.fon.silab.AppKons.dto.SkolskaGodinaDTO;
import rs.ac.bg.fon.silab.AppKons.dto.StudentDTO;
import rs.ac.bg.fon.silab.AppKons.dto.StudentKonsultacijeDTO;
import rs.ac.bg.fon.silab.AppKons.dto.StudentKonsultacijePKDTO;
import rs.ac.bg.fon.silab.AppKons.dto.TipDogadjajaDTO;
import rs.ac.bg.fon.silab.AppKons.entities.ClanstvoKomisije;
import rs.ac.bg.fon.silab.AppKons.entities.Dogadjaj;
import rs.ac.bg.fon.silab.AppKons.entities.DogadjajPK;
import rs.ac.bg.fon.silab.AppKons.entities.Kalendar;
import rs.ac.bg.fon.silab.AppKons.entities.Konsultacije;
import rs.ac.bg.fon.silab.AppKons.entities.KorisnickiNalog;
import rs.ac.bg.fon.silab.AppKons.entities.Nastava;
import rs.ac.bg.fon.silab.AppKons.entities.Nastavnik;
import rs.ac.bg.fon.silab.AppKons.entities.PokrivenostNastave;
import rs.ac.bg.fon.silab.AppKons.entities.PokrivenostNastavePK;
import rs.ac.bg.fon.silab.AppKons.entities.Predmet;
import rs.ac.bg.fon.silab.AppKons.entities.Prilog;
import rs.ac.bg.fon.silab.AppKons.entities.SkolskaGodina;
import rs.ac.bg.fon.silab.AppKons.entities.Student;
import rs.ac.bg.fon.silab.AppKons.entities.StudentKonsultacije;
import rs.ac.bg.fon.silab.AppKons.entities.StudentKonsultacijePK;
import rs.ac.bg.fon.silab.AppKons.entities.TipDogadjaja;

@Mapper(componentModel = "spring")
public interface GenericMapper {

    KorisnickiNalogDTO korisnickiNalogToKorisnickiNalogDTO(KorisnickiNalog korisnickiNalog);

    KorisnickiNalog korisnickiNalogDTOToKorisnickiNalog(KorisnickiNalogDTO korisnickiNalogDTO);

    Student studentDTOToStudent(StudentDTO s);

    StudentDTO studentToStudentDTO(Student s);
    
    Nastava nastavaDTOToNastava(NastavaDTO nastavaDTO);

    NastavaDTO nastavaToNastavaDTO(Nastava nastava);
    
    ClanstvoKomisije clanstvoKomisijeDTOToClanstvoKomisije(ClanstvoKomisijeDTO clanstvoKomisjeDTO);

    ClanstvoKomisijeDTO clanstvoKomisijeToClanstvoKomisijeDTO(ClanstvoKomisije clanstvoKomisje);

    Nastavnik nastavnikDTOToNastavnik(NastavnikDTO s);

    NastavnikDTO nastavnikToNastavnikDTO(Nastavnik s);

    KonsultacijeDTO konsultacijeToKonsultacijeDTO(Konsultacije konsultacije);

    Konsultacije konsultacijeDTOToKonsultacije(KonsultacijeDTO konsultacijeDTO);

    Dogadjaj dogadjajDTOToDogadjaj(DogadjajDTO dogadjajDTO);

    DogadjajDTO dogadjajToDogadjajDTO(Dogadjaj dogadjaj);
    
    DogadjajPK dogadjajPKDTOToDogadjajPK(DogadjajPKDTO dogadjajPKDTO);

    DogadjajPKDTO dogadjajPKToDogadjajPKDTO(DogadjajPK dogadjajPK);

    Predmet predmetDTOToPredmet(PredmetDTO predmetDTO);

    PredmetDTO predmetToPredmetDTO(Predmet predmet);

    PrilogDTO prilogToPrilogDTO(Prilog predmet);

    Kalendar kalendarDTOToKalendar(KalendarDTO kalendarDTO);

    KalendarDTO kalendarToKalendarDTO(Kalendar kalendar);

    PokrivenostNastave pokrivenostNastaveDTOToPokrivenostNastave(PokrivenostNastaveDTO pokrivenostNastaveDTO);

    PokrivenostNastaveDTO pokrivenostNastaveToPokrivenostNastaveDTO(PokrivenostNastave pokrivenostNastave);

    PokrivenostNastavePK pokrivenostNastavePKDTOToPokrivenostNastavePK(PokrivenostNastavePKDTO pokrivenostNastavePKDTO);

    PokrivenostNastavePKDTO pokrivenostNastavePKToPokrivenostNastavePKDTO(PokrivenostNastavePK pokrivenostNastavePK);

    SkolskaGodina skolskaGodinaDTOToSkolskaGodina(SkolskaGodinaDTO skolskaGodinaDTO);

    SkolskaGodinaDTO skolskaGodinaToSkolskaGodinaDTO(SkolskaGodina skolskaGodina);

    TipDogadjaja tipDogadjajaDTOToTipDogadjaja(TipDogadjajaDTO tipDogadjajaDTO);

    TipDogadjajaDTO tipDogadjajaToTipDogadjajaDTO(TipDogadjaja tipDogadjaja);

    StudentKonsultacijeDTO studentKonsultacijeToStudentKonsultacijeDTO(StudentKonsultacije studentKonsultacije);

    StudentKonsultacije studentKonsultacijeDTOToStudentKonsultacije(StudentKonsultacijeDTO studentKonsultacijeDTO);

    StudentKonsultacijePK studentKonsultacijePKDTOToStudentKonsultacijePK(StudentKonsultacijePKDTO studentKonsultacijePKDTO);

    StudentKonsultacijePKDTO studentKonsultacijePKToStudentKonsultacijePKDTO(StudentKonsultacijePK studentKonsultacijePK);

    default String map(byte[] bytes) {
        return bytes != null ? new String(bytes) : null;
    }

    default byte[] map(String value) {
        return value != null ? value.getBytes() : null;
    }
}
