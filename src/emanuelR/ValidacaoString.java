
package emanuelR;

public class ValidacaoString {
 
    
    public static class ValidacaoSTR{
        
        private static final int TAMANHO_CPF = 11;
        private static final int TAMANHO_DATA = 10;
        private static final int TAMANHO_CEP = 9;
        
        public static boolean validaData(String str){
            
            //Verfica o Tamanho da STR;
            if(str.length()== TAMANHO_DATA){

                //Verifica o formato;
                if((str.charAt(2) == '/') && (str.charAt(4)== '/') ||
                    (str.charAt(2) == '-') && (str.charAt(4) == '-')){

                    return true;
                }
            }
            return false;
        }
        
        public static boolean validaCPF(String str){
        
            return str.length() == TAMANHO_CPF;
                 
        }
        
        public static boolean validaCEP(String str){
        
            return str.length() == TAMANHO_CEP;
        }
   
        
    
    }
    
    
    
}
