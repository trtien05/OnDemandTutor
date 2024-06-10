/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

package com.mytutor.repositories;

import com.mytutor.entities.Otp;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Nguyen Van Dat
 */
public interface OtpRepository extends JpaRepository<Otp, String> {
}
