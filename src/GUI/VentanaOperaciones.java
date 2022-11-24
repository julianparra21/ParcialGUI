package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import operaciones.Procesos;
public class VentanaOperaciones extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField textNombre;
	private JTextField textApellido;
	private JTextField textTelefono;
	private JTextField textEdad;
	private JLabel lblNombre;
	private JLabel lblApellido;
	private JLabel lblEdad;
	private JLabel lblTelefono;
	private JLabel lblTipo;
	private JButton btnCompra;
	private JButton btnImprimirUsuarios;
	private JButton btnLimpiar;
	private JLabel lblFormularioPersona;
	private JLabel lblFormularioCompra;
	private JLabel lblNombreProducto;
	private JTextField textNProducto;
	private JTextField textValorUnitario;
	private JLabel lblValorUnitario;
	private JLabel lblCantProducto;
	private JTextField textCantProductos;
	private JTextField textTipo;
	Procesos misProcesos= new Procesos();
	public VentanaOperaciones() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 865, 528);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("DON APARATO");
		lblNewLabel.setFont(new Font("Source Serif Pro", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(382, 11, 119, 21);
		contentPane.add(lblNewLabel);
		
		textNombre = new JTextField();
		textNombre.setBounds(144, 67, 215, 20);
		contentPane.add(textNombre);
		textNombre.setColumns(10);
		
		textApellido = new JTextField();
		textApellido.setColumns(10);
		textApellido.setBounds(144, 98, 215, 20);
		contentPane.add(textApellido);
		
		textTelefono = new JTextField();
		textTelefono.setColumns(10);
		textTelefono.setBounds(144, 160, 215, 20);
		contentPane.add(textTelefono);
		
		textEdad = new JTextField();
		textEdad.setColumns(10);
		textEdad.setBounds(144, 129, 215, 20);
		contentPane.add(textEdad);
		
		lblNombre = new JLabel("NOMBRE:");
		lblNombre.setHorizontalAlignment(SwingConstants.CENTER);
		lblNombre.setFont(new Font("Source Serif Pro", Font.BOLD | Font.ITALIC, 15));
		lblNombre.setBounds(24, 65, 119, 21);
		contentPane.add(lblNombre);
		
		lblApellido = new JLabel("APELLIDO:");
		lblApellido.setHorizontalAlignment(SwingConstants.CENTER);
		lblApellido.setFont(new Font("Source Serif Pro", Font.BOLD | Font.ITALIC, 15));
		lblApellido.setBounds(34, 96, 119, 21);
		contentPane.add(lblApellido);
		
		lblEdad = new JLabel("EDAD:");
		lblEdad.setHorizontalAlignment(SwingConstants.CENTER);
		lblEdad.setFont(new Font("Source Serif Pro", Font.BOLD | Font.ITALIC, 15));
		lblEdad.setBounds(24, 127, 119, 21);
		contentPane.add(lblEdad);
		
		lblTelefono = new JLabel("TELEFONO: ");
		lblTelefono.setHorizontalAlignment(SwingConstants.CENTER);
		lblTelefono.setFont(new Font("Source Serif Pro", Font.BOLD | Font.ITALIC, 15));
		lblTelefono.setBounds(24, 158, 119, 21);
		contentPane.add(lblTelefono);
		
		lblTipo = new JLabel("TIPO:");
		lblTipo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTipo.setFont(new Font("Source Serif Pro", Font.BOLD | Font.ITALIC, 15));
		lblTipo.setBounds(24, 189, 119, 21);
		contentPane.add(lblTipo);
		
		 btnCompra = new JButton("REALIZAR COMPRA");
		btnCompra.addActionListener(this);
		btnCompra.setBounds(114, 251, 156, 23);
		contentPane.add(btnCompra);
		
		 btnImprimirUsuarios = new JButton("IMPRIMIR USUARIOS");
		 btnImprimirUsuarios.addActionListener(this);
		btnImprimirUsuarios.setBounds(331, 251, 156, 23);
		contentPane.add(btnImprimirUsuarios);
		
		 btnLimpiar = new JButton("LIMPIAR");
		btnLimpiar.setBounds(560, 251, 89, 23);
		contentPane.add(btnLimpiar);
		
		lblFormularioPersona = new JLabel("Formulario Persona");
		lblFormularioPersona.setHorizontalAlignment(SwingConstants.CENTER);
		lblFormularioPersona.setFont(new Font("Source Serif Pro", Font.BOLD | Font.ITALIC, 15));
		lblFormularioPersona.setBounds(182, 35, 148, 21);
		contentPane.add(lblFormularioPersona);
		
		lblFormularioCompra = new JLabel("Formulario Compra");
		lblFormularioCompra.setHorizontalAlignment(SwingConstants.CENTER);
		lblFormularioCompra.setFont(new Font("Source Serif Pro", Font.BOLD | Font.ITALIC, 15));
		lblFormularioCompra.setBounds(524, 42, 156, 21);
		contentPane.add(lblFormularioCompra);
		
		lblNombreProducto = new JLabel("NOMBRE PRODUCTO:");
		lblNombreProducto.setHorizontalAlignment(SwingConstants.CENTER);
		lblNombreProducto.setFont(new Font("Source Serif Pro", Font.BOLD | Font.ITALIC, 11));
		lblNombreProducto.setBounds(399, 67, 156, 21);
		contentPane.add(lblNombreProducto);
		
		textNProducto = new JTextField();
		textNProducto.setColumns(10);
		textNProducto.setBounds(561, 67, 186, 20);
		contentPane.add(textNProducto);
		
		textValorUnitario = new JTextField();
		textValorUnitario.setColumns(10);
		textValorUnitario.setBounds(560, 98, 191, 20);
		contentPane.add(textValorUnitario);
		
		lblValorUnitario = new JLabel("VALOR UNITARIO:");
		lblValorUnitario.setHorizontalAlignment(SwingConstants.CENTER);
		lblValorUnitario.setFont(new Font("Source Serif Pro", Font.BOLD | Font.ITALIC, 11));
		lblValorUnitario.setBounds(399, 101, 156, 21);
		contentPane.add(lblValorUnitario);
		
		lblCantProducto = new JLabel("CANTIDAD PRODUCTOS");
		lblCantProducto.setHorizontalAlignment(SwingConstants.CENTER);
		lblCantProducto.setFont(new Font("Source Serif Pro", Font.BOLD | Font.ITALIC, 11));
		lblCantProducto.setBounds(399, 132, 156, 21);
		contentPane.add(lblCantProducto);
		
		textCantProductos = new JTextField();
		textCantProductos.setColumns(10);
		textCantProductos.setBounds(560, 129, 51, 20);
		contentPane.add(textCantProductos);
		
		textTipo = new JTextField();
		textTipo.setColumns(10);
		textTipo.setBounds(144, 191, 51, 20);
		contentPane.add(textTipo);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnImprimirUsuarios) {
			imprimirUsuarios();
		}
		if(e.getSource()==btnCompra) {
			registrarCompra();
		}

	}

	private void registrarCompra() {
		
		
		String nombre_producto = textNProducto.getText();
		Double valorUnitario=Double.parseDouble(textValorUnitario.getText());
		int cantProductos=Integer.parseInt(textCantProductos.getText());
		misProcesos.registarCompra(nombre_producto,valorUnitario,cantProductos);
		
	}

	private void imprimirUsuarios() {
		
		
		
		
		String nombre=textNombre.getText();
		String apellido=textApellido.getText();
		int edad=Integer.parseInt(textEdad.getText());
		int telefono=Integer.parseInt(textTelefono.getText());
		String tipo=textTipo.getText();
		misProcesos.imprimirUsuarios(nombre,apellido,edad,telefono,tipo);
	
	}
	
}
