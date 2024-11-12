public static void main(String[] args) {
        
    int agencia = 0;
    String nome;
    int conta;
    int saldo;
    int viniSaldo = 500;
    int vitorSaldo = 400;
    int saldoGastar =0;
    
     nome = JOptionPane.showInputDialog(null, "Informe seu nome: ");
     
     String stringAgencia = JOptionPane.showInputDialog(null, "Informe sua agencia: ");
     agencia = Integer.parseInt(stringAgencia);
     
     String stringConta = JOptionPane.showInputDialog(null, "Informe numero da conta:");
     conta = Integer.parseInt(stringConta);
     
        if (nome.equals("vinicius") && agencia == 10 && conta == 4) {
            saldo = viniSaldo;
            JOptionPane.showMessageDialog(null, "Bem vindo," +nome+ " seu saldo:" +saldo );
            
            String stringSaldoGastar = JOptionPane.showInputDialog(null, "Quanto voce deseja sacar");
            saldoGastar = Integer.parseInt(stringSaldoGastar);
            
            if(saldoGastar>saldo){
              
            JOptionPane.showMessageDialog(null, "Saldo insuficiente, seu saldo atual: " +saldo );

            }else if (saldo>saldoGastar){
                saldo= saldo - saldoGastar;
                viniSaldo = saldo;
                JOptionPane.showMessageDialog(null, "Voce gastou: "+saldoGastar+ " Seu saldo atual:" +saldo );
            }
        }
        
        
        if (nome.equals("vitor") && agencia == 1 && conta == 1) {
            saldo = vitorSaldo;
            JOptionPane.showMessageDialog(null, "Bem vindo," +nome+ " seu saldo:" +saldo );
        }
        
     
     
    }