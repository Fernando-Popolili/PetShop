
package Model;

import javax.swing.JOptionPane;
import view.Menu_GUI;

public class Login_DAO {
    
    
    public static String login = view.Login_GUI.nome_usuario.getText();
    public static String senha = view.Login_GUI.senha_txt.getText();
    
    
    public static void verificacaoLogin(){
        if(senha.equalsIgnoreCase("admin123") && login.equals("admin") ){
           //ignoreCase = ignora se é maiusculo ou minusculo
            view.Login_GUI.msg_login.setVisible(true);
            JOptionPane.showMessageDialog(null, "Seja bem vindo!");
            new Menu_GUI().setVisible(true);
            
        } else{
            JOptionPane.showMessageDialog(null, "Senha ou Login inválidos");
        }
    }
}
