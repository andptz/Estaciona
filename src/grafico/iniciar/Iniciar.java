package grafico.iniciar;

import grafico.utilidade.Grafico;
import grafico.telas.Main;


public class Iniciar {
    
    public static void main(String[] args){
            Grafico.lookAndFeel();
            Main principal = new Main();
            principal.setVisible(true);
       }
}
 
