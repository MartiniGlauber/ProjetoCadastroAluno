/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastroaluno;

import javax.swing.JFrame;

/**
 *
 * @author Glauber
 */
public class CadastroAluno extends JFrame{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        TelaCadAluno tl = new TelaCadAluno();
        tl.setDefaultCloseOperation(EXIT_ON_CLOSE);
        tl.setSize(615, 350);
        tl.setVisible(true);
    }
    
}
