package br.com.apisnativas.file;

import java.io.*;

public class LendoArquivoBufferedReader {

    public static void main(String[] args) throws IOException {
        File file = new File("memento.css");

        BufferedReader reader =
                new BufferedReader(new FileReader(file));

        String line;

        while ((line = reader.readLine())!= null) {
            System.out.println(line);
        }
        reader.close();
    }
}
