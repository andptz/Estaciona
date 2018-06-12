package grafico.utilidade;


import de.javasoft.plaf.synthetica.SyntheticaAluOxideLookAndFeel;

import java.awt.Image;
import java.awt.Toolkit;
import java.text.ParseException;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;


public class Grafico {
    
    public static void lookAndFeel()
    {
        try{
            UIManager.setLookAndFeel(new SyntheticaAluOxideLookAndFeel());
        }       
        catch (ParseException ex) {
            ex.printStackTrace();
        }   
        catch (UnsupportedLookAndFeelException ex) {
            ex.printStackTrace();
        }
    }
}
