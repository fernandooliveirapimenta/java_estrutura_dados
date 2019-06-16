package br.com.apisnativas.file;

import java.io.*;

public class LendoArquivoFileInputStream {

    public static void main(String[] args) throws IOException {

        FileInputStream in = new FileInputStream("memento.css");
        BufferedInputStream bin = new BufferedInputStream(in);
        DataInputStream din = new DataInputStream(bin);

        while (din.available() != 0) {
            System.out.println(din.readLine());
        }
    }
}
