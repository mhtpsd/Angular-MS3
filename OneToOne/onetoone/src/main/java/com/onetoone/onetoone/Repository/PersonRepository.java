package com.onetoone.onetoone.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.onetoone.onetoone.Entity.Person;

import jakarta.transaction.Transactional;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
    // Person findPersonByPassportId(String passportId);
    // Person deletePersonByPassportId(String passportId);

    // @Query("select p from Person p join p.passport pass where pass.passportId = :passportId")
    // Person findPersonByPassportId(@Param("passportId") String passportId);

    Person findByPassportId(String passportId);

    @Modifying
    @Transactional
    @Query("delete from Person p where p.passport.passportId = :passportId")
    void deletePersonByPassportId(@Param("passportId") String passportId);

}
