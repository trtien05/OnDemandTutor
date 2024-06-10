/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mytutor.repositories;

import com.mytutor.entities.Education;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author vothimaihoa
 */
@Repository
public interface EducationRepository extends JpaRepository<Education, Integer> {

    @Query("SELECT e FROM Education e WHERE e.account.id = :accountId ORDER BY e.degreeType DESC")
    List<Education> findByAccountId(@Param("accountId") Integer tutorId);
}
