
package emanuelR;

public class ValidacaoString {
 
    
    public static class ValidacaoSTR{
        
        public static boolean validaData(String str){
            
            //Verfica o Tamanho da STR;
            if(str.length()== 10){

                //Verifica 
                if((str.charAt(2) == '/') && (str.charAt(4)== '/') ||
                    (str.charAt(2) == '-') && (str.charAt(4) == '-')){

                    return true;
                }
            }
            return false;
        }
        
   
        
    
    }
    
    
    
}
