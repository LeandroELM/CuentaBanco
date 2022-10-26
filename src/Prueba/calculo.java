package Prueba;

public class calculo {

	public static void main(String[] args) {
		CuentadeBanco cuentaJuan=new CuentadeBanco();
		
		
		
		cuentaJuan.ponerNCliente("Juan Martinez");
		cuentaJuan.poneremail("juan.martinez@gmail.com");
		cuentaJuan.ponerNodeCuenta("65246546");
		cuentaJuan.ponerNoTelefono("89654214");
		
		cuentaJuan.retirar(50.00);
		cuentaJuan.Depositar(150.00);
		cuentaJuan.Depositar(500.00);
		cuentaJuan.retirar(50.00);
		
		CuentadeBanco cuentaMaria=new CuentadeBanco();
		cuentaMaria.mostrarDatos();

	}

}
