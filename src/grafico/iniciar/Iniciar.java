package grafico.iniciar;

import grafico.utilidade.Grafico;
import grafico.telas.Login;


public class Iniciar {
    
    public static void main(String[] args){
            Grafico.lookAndFeel();
            Login principal = new Login();
            principal.setVisible(true);
       }
}
 
