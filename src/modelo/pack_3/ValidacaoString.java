
package modelo.pack_3;

public class ValidacaoString {
 
    public static class ValidacaoSTR{
        
        private static final int TAMANHO_CPF = 11;
        private static final int TAMANHO_DATA = 10;
        private static final int TAMANHO_CEP = 9;
        private static final int TAMANHO_CNPJ = 14;
        private static final int TAMANHO_CNH = 11;
   
        
        //VALIDA DATA COM BASE EM STR;
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
        
        //VALIDA CPF COM BASE EM STR;
        public static boolean validaCPF(String str){
        
            return str.length() == TAMANHO_CPF;
                 
        }
        
        //VALIDA CEP COM BASE EM STR;
        public static boolean validaCEP(String str){
        
            return str.length() == TAMANHO_CEP;
        }
        
        //VALIDA CNPJ COM BASE EM STR;
        public static boolean validaCNPJ(String str){
           return str.length() == TAMANHO_CNPJ;
        }
        
        //VALIDA CNH COM BASE EM STR;
        public static boolean validaCNH(String str){
            
            return str.length() == TAMANHO_CNH;
        }
        
    }
    
    
    
}