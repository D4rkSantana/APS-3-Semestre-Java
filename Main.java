package Model;

import javax.swing.JOptionPane;
import jplay.GameImage;
import jplay.Keyboard;
import jplay.Window;

/**
 *
 * @author D4kSantana
 */
public class Main {
    
    public static void main(String[] args) {
        
        //Janela e Menu inicial
        //608 = 19 tiles de 32p
        //800 = 25 tiles de 32p
        Window janela = new Window(800,608);
        GameImage plano = new GameImage("src//res//menu.png");
        //Funcionalidade do botão enter para iniciar o game (pós-menu)
        Keyboard teclado = janela.getKeyboard();
        //
        //
        //
        //Este é o Loop infinito que possibilita o jogo continuar rodando até ser fechado.
        while(true){
            plano.draw();
            janela.update();
            
            if(teclado.keyDown(Keyboard.ENTER_KEY)){
                JOptionPane.showMessageDialog(null,"Bem Vindo ao Game :D");
            }
        }
    }

}
