package com.company;

import static java.lang.Thread.sleep;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        while (true) {
            try {
                System.out.println("I am trying download");
                DataDownloader.downloadFileFromUrl("http://urldownload");
                System.out.println("Downloaded!");

                System.out.println("I am trying upload");
                DataUploader.doIt("http://urlupload");
                System.out.println("Uploeded!");

            } catch (Exception e) {
                System.out.println("General error");
            }
            sleep(10000);
        }
    }
}
