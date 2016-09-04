/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.iofactorypattern;

import java.io.File;

/**
 *
 * @author Lenovo
 */
public class DirCommand extends DosCommand {

    @Override
    public void execute(String[] tokens) {
        if (tokens[0].equalsIgnoreCase("dir")) {
            if (tokens.length > 1) {
                File folder = new File(tokens[1]);
                File[] listOfFiles = folder.listFiles();
                for (int i = 0; i < listOfFiles.length; i++) {
                    if (listOfFiles[i].isFile()) {
                        System.out.println("File " + listOfFiles[i].getName());
                    } else if (listOfFiles[i].isDirectory()) {
                        System.out.println("Directory " + listOfFiles[i].getName());
                    }

                }
            }
        }
    }
}
