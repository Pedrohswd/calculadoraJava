/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tp.utils;

import javax.swing.JTextField;

/**
 *
 * @author pedro
 */
public class Utils {

    public double valorUm=0;
    public double valorDois=0;

    public double somar() {
        return valorUm = valorUm + valorDois;
    }

    public double subtrair() {
        return valorUm = valorUm - valorDois;
    }

    public double multiplicar() {
        return valorUm = valorUm * valorDois;
    }

    public double dividir() {
        return valorUm = valorUm / valorDois;
    }

    public double porcentagem() {
        return valorUm = (valorUm / 100) * valorDois;
    }

    public double potenciacao() {
        return Math.pow(valorUm,valorDois);
    }

    public double radiciacao() {
        if (valorUm >=0){
            valorUm = Math.pow(valorUm, (1.0 / valorDois));
             return valorUm;
        } else{
            if(valorDois%2==0){
                return valorUm=0;
            } else{
                valorUm = valorUm * -1;
            valorUm = Math.pow(valorUm, (1.0 / valorDois));
            valorUm = valorUm * -1;
             return valorUm;
            }
            
        }
       
    }

    public void clearC() {
        valorUm = 0;
        valorDois = 0;
    }

}
