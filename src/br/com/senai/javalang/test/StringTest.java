package br.com.senai.javalang.test;

import java.util.Locale;

public class StringTest {
    public static void main(String[] args) {
        String nome = "Alura";
//        String outra = nome.replace("A","a");
//        String outra = nome.toUpperCase(Locale.ROOT);
//        System.out.println(outra);
//
//        char c = 'A';
//        char d = 'a';
//        String string = nome.replace(c,d);
//        System.out.println(string);

//        char c = nome.charAt(0);
//        System.out.println(c);

        int pos = nome.indexOf("ur");
        System.out.println(pos);

        String sub = nome.substring(1);
        System.out.println(sub);

        System.out.println(nome.length());
        for (int i = 0; i < nome.length(); i++) {
            System.out.println(nome.charAt(i));
        }

        String vazio = "";
        String outroVazio = vazio.trim();
        System.out.println(vazio.isEmpty());

        System.out.println(vazio.contains("Alura"));
    }
}