package net.salesianos.lacuesta.actividades.actividad2;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FileWriter fw=new FileWriter("d:\\Escritorio\\Desarrollo de aplicaciones multiplataforma\\Programación\\Tema 6\\Ficheritos\\src\\net\\salesianos\\lacuesta\\ficheros\\ficheroAct2.txt");
        FileReader fr=new FileReader("d:\\Escritorio\\Desarrollo de aplicaciones multiplataforma\\Programación\\Tema 6\\Ficheritos\\src\\net\\salesianos\\lacuesta\\ficheros\\ficheroAct2.txt");
        String texto="Hola que tal";
        for(int i=0;i<texto.length();i++){
            fw.write(texto.charAt(i));
        }
        fw.close();
        texto="";
        int decimal;
        char caracter;

        do{
            decimal=fr.read();
            caracter=(char)decimal;
            if(decimal!=-1) {
                texto += caracter + "_" + decimal + ",";
            }
        }while(decimal!=-1);
        fr.close();
        System.out.println(texto);
    }
}
