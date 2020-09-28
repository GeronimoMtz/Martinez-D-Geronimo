import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Fibbos extends JFrame {

	private JPanel contentPane;
	private JTextField txtInicio;
	private JTextField txtFinal;
	private JTextField txtIncremento;
	private JTextField cbSerie;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Fibbos frame = new Fibbos();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Fibbos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNumInicial = new JLabel("Num. Inicial");
		lblNumInicial.setBounds(14, 31, 72, 14);
		contentPane.add(lblNumInicial);
		
	
		
	
		
		txtInicio = new JTextField();
		txtInicio.setBounds(88, 28, 86, 20);
		contentPane.add(txtInicio);
		txtInicio.setColumns(10);
		
		

		
		JComboBox cbSerie = new JComboBox();
		cbSerie.setEnabled(false);
		cbSerie.setBounds(88, 132, 90, 20);
		contentPane.add(cbSerie);
		
		JLabel lblSerie = new JLabel("Serie");
		lblSerie.setBounds(21, 135, 46, 14);
		contentPane.add(lblSerie);
		
		JButton btnGenerar = new JButton("Generar");
		btnGenerar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnGenerar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				
			
			   
					int strNumero1;
		            int serie = 0;
		            int b = 0, c = 1;
                    strNumero1=Integer.parseInt(txtInicio.getText());
                    cbSerie.addItem(0);				    
				    for(int x=0; x<=strNumero1; x++)
				    {
                        serie = b + c;
                        c = b;
                        b = serie;
				    	cbSerie.addItem(serie);
				    }
				    //setEnable activa o descativa un boton, combo, etc
				    cbSerie.setEnabled(true);
			    	
			    
			    
			    
			
			}
		});
		btnGenerar.setBounds(14, 186, 89, 23);
		contentPane.add(btnGenerar);
		
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cbSerie.removeAllItems();
				
			}	
		});
		btnLimpiar.setBounds(139, 186, 89, 23);
		contentPane.add(btnLimpiar);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
				
			}
		});
		btnSalir.setBounds(266, 186, 89, 23);
		contentPane.add(btnSalir);
	}
}