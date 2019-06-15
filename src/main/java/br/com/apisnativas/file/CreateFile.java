package br.com.apisnativas.file;

import java.io.File;
import java.io.IOException;

public class CreateFile {

    public static void main(String[] args) throws IOException {
       File file = new File("Fernando.sh");
       if(file.createNewFile()){
           System.out.println("Criado");
       } else {
           System.out.println("Ja existe");
       }
    }
}
