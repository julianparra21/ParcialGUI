package operaciones;

public class Procesos {

	public void imprimirUsuarios(String nombre, String apellido, int edad, int telefono, String tipo) {
		// TODO Auto-generated method stub
	System.out.println("El nombre es: "+nombre+"\nel apellido es: "+apellido+"\nSu edad es: "+edad+"\nsu telefono es: "+telefono+"\nel tipo de usuario es: "+tipo);
	System.out.println("*******************************************************************");
	
	}

	public void registarCompra(String nombre_producto, Double valorUnitario, int cantProductos) {
		// TODO Auto-generated method stub
		
		
		double total=cantProductos*valorUnitario;
		System.out.println("Producto: "+nombre_producto+"\nvalor producto "+valorUnitario+"\nCantidad de productos "+cantProductos);
		System.out.println("El precio total es: "+total);
		System.out.println("***************************************************");
		
	}

}
