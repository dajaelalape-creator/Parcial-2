package presentacion;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import logica.Parcial;

public class Principal extends JFrame {

	private JLabel lblResultado;
	private JTextField intBase;
	private JTextField intExponente;
	private JButton btnCalcular;
	private Parcial parcial;
	
	public Principal() {
		this.parcial = new Parcial();
		this.setTitle("Examen Hector Florez");
		this.setSize(300, 200);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout());
				
		lblResultado = new JLabel("0", JLabel.CENTER);
		lblResultado.setFont(new Font("Arial", Font.BOLD, 32));		
		intBase = new JTextField();
		intExponente = new JTextField();
		btnCalcular = new JButton("Calcular");

		JPanel panelCentro = new JPanel(new GridLayout(2, 2));
		panelCentro.add(new JLabel("Base:"));
		panelCentro.add(intBase);
		panelCentro.add(new JLabel("Exponente:"));
		panelCentro.add(intExponente);
		
		this.add(lblResultado, BorderLayout.NORTH);
		this.add(panelCentro, BorderLayout.CENTER);
		this.add(btnCalcular, BorderLayout.SOUTH);
		
		btnCalcular.addActionListener(e -> calcular());
	}
	
	public void calcular() {
		try {
			int base = Integer.parseInt(intBase.getText());	
			int exponente = Integer.parseInt(intExponente.getText());
			
			int resultado = parcial.calcularPotencia(base, exponente);
			lblResultado.setText(String.valueOf(resultado));
		} catch (Exception e) {
			JOptionPane.showMessageDialog(this, e.getMessage());
		}	
	}
	
	public static void main(String[] args) {
		Principal ventana = new Principal();
		ventana.setVisible(true);
	}
	
}
