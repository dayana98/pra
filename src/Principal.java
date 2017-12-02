/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 16550493
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("PALABRA yyzzza  "  + cLimpia("yyzzza"));
        System.out.println("PALABRA abbbbcdd  "  + cLimpia("abbbbcdd"));
        System.out.println("PALABRA abbbbcdd  "  + cLimpia("abbbbcdd"));
       
        
        
    }

    
    public static String cLimpia(String c){
        String str; 
         if(c.length()==0||c.length()==1){
             return c;
         }else{
             str = c.charAt(1) == c.charAt(0) ? "" : c.substring(0, 1);
         }        
               
         return str + cLimpia(c.substring(1));
        
}
}