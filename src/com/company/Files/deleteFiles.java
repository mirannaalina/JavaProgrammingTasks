package com.company.Files;

import java.io.File;

public class deleteFiles {

    public static void main(String[] args) {
        try {
            File f = new File("C:\\Users\\A737860\\Desktop\\j.txt");

            if (f.delete()) {
                System.out.println(f.getName() + " is deleted");
            } else {
                System.out.println("delete op failed");
            }
        } catch (Exception ec) {
            ec.printStackTrace();
        }
    }
}
