package com.libreflix.libreflixApp;

import android.content.Context;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class DAO {

    private final Context context;
    private final String fileName;

    public DAO(Context context, String fileName) {
        this.context = context;
        this.fileName = fileName;
    }

    private File getFile() {
        File directory = context.getFilesDir();
        return new File(directory, fileName);
    }

    public void writeData(String data) {
        try (FileOutputStream fileOutputStream = new FileOutputStream(getFile())) {
            fileOutputStream.write(data.getBytes());
        } catch (IOException e) {
            // Handle exceptions (e.g., logging, showing an error message)
            e.printStackTrace();
        }
    }

    public String readData() {
        StringBuilder stringBuilder = new StringBuilder();
        try (FileInputStream fileInputStream = new FileInputStream(getFile());
             InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
             BufferedReader bufferedReader = new BufferedReader(inputStreamReader)) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                stringBuilder.append(line).append('\n');
            }
        } catch (IOException e) {
            // Handle exceptions (e.g., logging, returning an empty string)
            e.printStackTrace();
        }
        return stringBuilder.toString();
    }
}
