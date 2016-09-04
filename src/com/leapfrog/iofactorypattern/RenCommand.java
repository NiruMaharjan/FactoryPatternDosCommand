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
public class RenCommand extends DosCommand {

    @Override
    public void execute(String[] tokens) {
        if(tokens[0].equals("ren")){
            if(tokens.length>1){
                File file=new File(tokens[1]);
                file.renameTo(new File(tokens[2]));
            
        }
        }
        else{
            System.out.println("command not found");
        }
    }
    
}
