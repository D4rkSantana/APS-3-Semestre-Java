/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import jplay.Scene;
import jplay.URL;
import jplay.Window;

/**
 *
 * @author Aluno
 */
public class CenarioMata {
    
    private Window janela;
    private Scene cenario;
    
    public CenarioMata(Window window){
        
        janela = window;
        cenario = new Scene();
        cenario.loadFromFile("src//res//cenariomata.scn");
        run();
    }
    
    public void run(){
        while(true){
            cenario.draw();
            janela.update();
        }
    }
    
}
