/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mytutor.exceptions;

/**
 *
 * @author Nguyen Van Dat
 */
public class QuestionNotFoundException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public QuestionNotFoundException(String message) {
        super(message);
    }

}
