/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.iofactorypattern;

/**
 *
 * @author Lenovo
 */
public class CDCommand extends DosCommand {

    @Override
    public void execute(String[] tokens) {
      if(tokens[0].equalsIgnoreCase("cd")){
          if(tokens.length>1){
              
              
          }
      }
    }
    
}
