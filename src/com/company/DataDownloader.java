package com.company;

import java.io.*;
import java.net.URL;

public class DataDownloader {

    public static void downloadFileFromUrl(String someURL) throws Exception {
        String destinyPath = "C:\\pathofile\\downloadfile";
        URL url = new URL(someURL);

        BufferedReader in = new BufferedReader(
                new InputStreamReader(url.openStream()));

        String inputLine;
        FileOutputStream file = new FileOutputStream(destinyPath, true);
        while ((inputLine = in.readLine()) != null) {
            inputLine = inputLine + "\n";
            file.write(inputLine.getBytes());
        }
        in.close();

        file.close();

    }
}
