package net.salesianos.lacuesta.actividades.actividad4;

import java.io.*;
import java.util.ArrayList;

public class Static implements Serializable {
    private OutputStream outputFile;
    private BufferedOutputStream bufferedOutputStream;
    private ObjectOutput objectOutput;

    private InputStream inputFile=new FileInputStream("d:\\Escritorio\\Desarrollo de aplicaciones multiplataforma\\Programación\\Tema 6\\Ficheritos\\src\\net\\salesianos\\lacuesta\\ficheros\\ficheroAct4-Persistencia y recuperación de objetos.txt")
    ;

    private BufferedInputStream bufferedInputStream=new BufferedInputStream(inputFile);



    private ObjectInput objectInput=new ObjectInputStream(bufferedInputStream);

    private ArrayList arrayObjetos=new ArrayList<>();



    public void guardaMesaEnFichero(Mesa mesa) throws IOException {
        try{
            outputFile=new FileOutputStream("d:\\Escritorio\\Desarrollo de aplicaciones multiplataforma\\Programación\\Tema 6\\Ficheritos\\src\\net\\salesianos\\lacuesta\\ficheros\\ficheroAct4-Persistencia y recuperación de objetos.txt");
            bufferedOutputStream=new BufferedOutputStream(outputFile);
            objectOutput.writeObject(mesa);
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }
        arrayObjetos.add(mesa);
    }

    public String mostrarMesasAlmacenadas(){
        /*try{
            Mesa m=(Mesa) objectInput.readObject()
        }*/
    }
}


+