
package cauculadora;

import javax.swing.JOptionPane;
public class Cauculadora {

  
    public static void main(String[] args) {  
       String Fisternumber = 
           JOptionPane.showInputDialog("digite o Fisternumber");
        
       String Secondnumber = 
           JOptionPane.showInputDialog("digite o Secondnumber");
        
        double operacao=0;
        
        int numero1= Integer.parseInt(Fisternumber);
        int numero2= Integer.parseInt(Secondnumber);
        
                
      
        String resp =
            JOptionPane.showInputDialog("escolha uma operação:"
                    + " 1-para soma" +
" 2-para subtração" +
" 3-para multiplicação" +
" 4-para divisão");
        
                
        if(resp.equals("1")){
            double soma=numero1+numero2;
            operacao=soma;
        }else{
            if(resp.equals("2")){
                double subtracao=numero1-numero2;
                operacao=subtracao;
            }else{
                if(resp.equals("3")){
                    double multi=numero1*numero2;
                    operacao=multi;
                }else{
                    if(resp.equals("4")){
                        double divisao=numero1/numero2;
                        operacao=divisao;
                    }
                }
                
            }
        }
        
        JOptionPane.showMessageDialog(null,"O resultado da operação escolhida é:"+operacao);
        
        
        
        
        
        
        
    }
    
}
