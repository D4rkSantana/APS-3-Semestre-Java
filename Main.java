/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import javax.swing.JOptionPane;
import jplay.GameImage;
import jplay.Keyboard;
import jplay.URL;
import jplay.Window;

/**
 *
 * @author D4kSantana
 */
public class Main {
    
    public static void main(String[] args) {
        
        //Janela e Menu inicial
        Window janela = new Window(800,600);
        GameImage plano = new GameImage(URL.sprite("menu.png"));
        //Funcionalidade do botão enter para iniciar o game (pós-menu)
        Keyboard teclado = new janela.getKeyboard();
        //
        //
        //
        //Este é o Loop infinito que possibilita o jogo continuar rodando até ser fechado.
        while(true){
            plano.draw();
            janela.update();
            
            if(teclado.keyDown(Keyboard.ENTER_KEY)){
                JOptionPane.showMessageDialog(null,"Funcionando Man");
            }
        }
    }
    
}
