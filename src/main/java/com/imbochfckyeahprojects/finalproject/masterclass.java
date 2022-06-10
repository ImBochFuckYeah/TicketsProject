/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.imbochfckyeahprojects.finalproject;
import java.util.ArrayList;
/**
 *
 * @author imbochfuckyeah
 */
public class masterclass {
    
public static ArrayList<newusers> users;
public static ArrayList<newteam> team;
public static ArrayList<newticket> ticket;

    public static void main(String[] args) {
        users = new ArrayList<>();
        team = new ArrayList<>();
        ticket = new ArrayList<>();
        login a = new login();
        a.setVisible(true);
    }
}
