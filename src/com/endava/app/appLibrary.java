package com.endava.app;

import org.omg.CORBA.portable.InputStream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class appLibrary {
    public void loadData() {
        loadAuthors();
    }

    public void saveData() {

    }

    public void menu() {

    }

    private void loadAuthors() {
        BufferedReader br = null;
        FileReader fr = null;
        try {
            fr = new FileReader("C:\\Users\\sarredondo\\IdeaProjects\\Library\\Data\\Data\\Authors");
            br = new BufferedReader(fr);
            String sCurrentLine;
            while ((sCurrentLine = br.readLine()) != null) {
                String[]
                System.out.println(sCurrentLine);
            }
        } catch (IOException e) {
            e.printStackTrace();

        } finally {
            try {
                if (br != null)
                    br.close();
                if (fr != null)
                    fr.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

}
