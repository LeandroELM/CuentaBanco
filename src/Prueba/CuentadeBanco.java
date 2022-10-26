package Prueba;

public class CuentadeBanco {
    
    	private String NodeCuenta;
    	private String NoTelefono;
    	private double saldo;
    	private String NCliente,email;
    	//Metodos funcionales
    	
  
    	public void Depositar(double montodeposito) {
        	this.saldo += montodeposito;
        	mostrarDatos();
        	System.out.println("**********************************************");
        	System.out.println("Realizando transaccion...");
        	System.out.println("El monto depositado fue de C$" + montodeposito);
        	System.out.println("Su saldo actual es de C$" + mostrarsaldo());
        	System.out.println("**********************************************");
    	}
    	public void retirar(double montoretiro) {
    		if(montoretiro > this.saldo) {
    			mostrarDatos();
    			System.out.println("**********************************************");
    			System.out.println("Saldo insuficiente.");
    			System.out.println("Su saldo actual es de C$" + mostrarsaldo());

    	} else {
    		System.out.println("**********************************************");
    		System.out.println("Realizando transaccion...");
    	    this.saldo -= montoretiro;
    	    System.out.println("el monto retirado fue de C$" + montoretiro);
    	    System.out.println("Su saldo actual es de C$" + mostrarsaldo());
    	    System.out.println("**********************************************");
    	}
    	}
    	public void mostrarDatos() {
    		
    		System.out.println("Nombre: " + mostrarNCliente());
    		System.out.println("Numero de cuenta: " + mostrarNodeCuenta());
    		System.out.println("Email: " + mostraremail());
    		System.out.println("Telefono: " + mostrarNoTelefono());
    	}
    		
    		
    		
    	
    	 //Metodos setters
    	public void ponerNodeCuenta(String NodeCuenta) {
    		this.NodeCuenta=NodeCuenta;
    	}
    	public String mostrarNodeCuenta() {
    		return this.NodeCuenta;
    	}
    	public void ponerNoTelefono(String NoTelefono) {
    		this.NoTelefono=NoTelefono;
    	}
    	public String mostrarNoTelefono() {
    		return this.NoTelefono;
    	}
    	public void ponersaldo(double saldo) {
    		this.saldo=saldo;
    	}
    	public double mostrarsaldo() {
    		return this.saldo;
    	}
    	public void ponerNCliente(String NCliente) {
    		this.NCliente=NCliente;
    	}
    	public String mostrarNCliente() {
    		return this.NCliente;
    		
    	}public void poneremail(String email) {
    		this.email=email;
    	}
    	public String mostraremail() {
    		return this.email;
    	}
    	
    	
     }

