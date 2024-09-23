package exxpoo3pt2.com;

//Nessa classse vai ser aplicado os metodos da classe ContaBancaria/*
public class AplicacaoContabancaria {

	public static void main(String[] args) {
		//Criando o objeto e setando o parametro de saldo inicial/*
		 ContaBancaria conta = new ContaBancaria(1000.0);  
		 
        // Testando os metodos de deposito saque e consulta/*
	        conta.depositar(100);  
	        conta.consultarSaldo(); 
	        conta.sacar(50);  
	        conta.consultarSaldo();  	       
	        conta.consultarSaldo(); 
	        conta.consultarSaldo();
	        conta.consultarSaldo(); 

	}

}
