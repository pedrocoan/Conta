package exxpoo3pt2.com;


// Nessa classe será aplicada toda lógica e criado os metodos pra instanciar em outra classe/*

public class ContaBancaria {
	private double saldo;
	private int consulta;
	
	// Criando o construtor e colondo o saldo inicial como parametro que depois vai pertencer ao objeto/*
	
	public ContaBancaria (double saldoinicial) {
		this.saldo = saldoinicial;
		this.consulta =0;
	}
	// Criando o metodo de deposito e aplicando a logica /*
	
	
	public void depositar(double valor) {
		 if (valor > 0) {
		 double taxa = valor * 0.01;
		  saldo += (valor - taxa);
		  System.out.printf("Depósito de R$%.2f realizado com sucesso. Taxa de R$%.2f cobrada.%n", valor, taxa);
		 } else {
		    System.out.println("O valor do depósito deve ser maior que zero.");
		        }
		    }
	// Criando o metodo de saque/*
	
	  public void sacar(double valor) {
	        if (valor > 0) {
	            double taxa = valor * 0.005;
	            double totalSaque = valor + taxa;
	            if (totalSaque <= saldo) {
	                saldo -= totalSaque;
	                System.out.printf("Saque de R$%.2f realizado com sucesso. Taxa de R$%.2f cobrada.%n", valor, taxa);
	            } else {
	                System.out.println("Saldo insuficiente para realizar o saque.");
	            }
	        } else {
	            System.out.println("O valor do saque deve ser maior que zero.");
	        }
	    }
	  
	  
	  // Criando o metodo de consulta de saque para se cobrar a taxa depois/*
	  
	  public void consultarSaldo() {
	        consulta++;
	        if (consulta % 5 == 0) {
	        	saldo -= 0.10;
	        	System.out.println("Taxa de R$0,10 cobrada por exceder o limite de consultas.");
	        	System.out.printf("Saldo atual: R$%.2f%n", saldo);
	       
	        }
	    }
	  
	    // Criando os getters and setters/*
	  
	    public int getConsultasRealizadas() {
	        return consulta;
	    }
	    
	  
	    public double getSaldo() {
	        return saldo;
	    }
	   
	    public void setSaldo(double saldo) {
	        this.saldo = saldo;
	    }
	

}
