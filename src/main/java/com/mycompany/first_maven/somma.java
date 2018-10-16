/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.first_maven;

import java.util.Scanner;

/**
 *
 * @author Christian
 */
public class somma {
    public static void main(String[] args) {
        Scanner tast = new Scanner(System.in);
        int a,b;
        System.out.println("Inserire primo numero: ");
        a = tast.nextInt();
        System.out.println("Inserire secondo numero: ");
        b = tast.nextInt();
        System.out.println("somma: "+(a+b));
       
    }
}
