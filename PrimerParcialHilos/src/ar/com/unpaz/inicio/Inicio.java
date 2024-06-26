package ar.com.unpaz.inicio;

import ar.com.unpaz.hilos.LeerArchivoHilo;

public class Inicio {
    public static void main(String[] args) {
        String filePath = "D:\\PrimerParcial\\PrimerParcial_Alejo\\archivo.txt";

        LeerArchivoHilo fileReadingThread = new LeerArchivoHilo(filePath);
        fileReadingThread.start();

        for (int i = 0; i < 15; i++) {
            System.out.println("LECTURA DEL HILO: " + i);
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                System.err.println("EL HILO FUE INTERRUMPIDO.");
                Thread.currentThread().interrupt();
            }
        }
    }
}
