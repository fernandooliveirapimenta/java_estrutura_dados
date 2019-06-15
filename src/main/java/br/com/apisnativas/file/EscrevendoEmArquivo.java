package br.com.apisnativas.file;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

public class EscrevendoEmArquivo {

    public static void main(String[] args) throws IOException {
       File publicKey = new File("fernando.key");

        final boolean newFile = publicKey.createNewFile();

        if(!newFile) {
            final boolean delete = publicKey.delete();
            if(delete) {
                System.out.println(publicKey.createNewFile());
            }
        }

        FileOutputStream outputStream = new FileOutputStream(publicKey);

        int num = new Random().nextInt(50);

        StringBuilder escrever = new StringBuilder("Ola: ");
        while (num > 0) {

            escrever.append(num);
            num --;
        }
        outputStream.write(escrever.toString().getBytes());
        outputStream.flush();
        outputStream.close();

    }
}
