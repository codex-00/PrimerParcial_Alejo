package ar.com.unpaz.hilos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LeerArchivoHilo extends Thread {
    private String filePath;

    public LeerArchivoHilo(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public void run() {
        try {
            File file = new File(filePath);
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                System.out.println("LEYENDO LÍNEA: " + line);
                Thread.sleep(5000);
            }

            bufferedReader.close();
            fileReader.close();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}