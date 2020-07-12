package com.company;

import pl.sebox.decathlon.tools.Network;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.stream.Stream;

public class DataUploader {
    public static void doIt(String jakisURL) {
        HashMap<String, String> parms = new HashMap<>();
        parms.put("content", readLineByLineJava8("C:\\pathtofile\\ulopadfile"));
        Network.post(jakisURL, parms);
    }

    private static String readLineByLineJava8(String filePath) {
        StringBuilder contentBuilder = new StringBuilder();

        try (Stream<String> stream = Files.lines(Paths.get(filePath), StandardCharsets.UTF_8)) {
            stream.forEach(s -> contentBuilder.append(s).append("\n"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return contentBuilder.toString();
    }
}
