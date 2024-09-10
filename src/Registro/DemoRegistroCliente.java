package Registro;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.JMenuBar;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class DemoRegistroCliente {

	private JFrame frame;
	JPanel PanelFondo;
	DefaultTableModel modo;
	private JScrollPane scrollPane;
	private JLabel lblNewLabel;
	private JTextField textField;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JButton BtnCancelarOperacion_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DemoRegistroCliente window = new DemoRegistroCliente();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public DemoRegistroCliente() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, 1550, 831);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		JPanel panel = new JPanel();
		panel.setForeground(new Color(0, 0, 0));
		panel.setBackground(new Color(221, 213, 200));
		panel.setBounds(0, 0, 1267, 719);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(526, 180, 741, 539);
		panel.add(scrollPane);


        modo = new DefaultTableModel(
                new Object[][]{},
                new String[]{"ID del Cliente", "Cedula del Cliente", "Nombre", "Apellido", "Telefono", "Direccion", "Fecha de Creacion"}
        );
        
        JLabel Label7 = new JLabel("CLIENTES");
		Label7.setHorizontalAlignment(SwingConstants.CENTER);
		Label7.setFont(new Font("Roboto Black", Font.PLAIN, 24));
		Label7.setBounds(0, 0, 1536, 89);
		
		panel.add(Label7);
		
		lblNewLabel = new JLabel("Buscar Cliente");
		lblNewLabel.setIcon(new ImageIcon(DemoRegistroCliente.class.getResource("/imagenes/search_FILL1_wght400_GRAD0_opsz24.png")));
		lblNewLabel.setBounds(983, 130, 137, 20);
		lblNewLabel.setFont(new Font("Roboto Light", Font.PLAIN, 15));
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(573, 130, 400, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		lblNewLabel_1 = new JLabel("Cedula");
		lblNewLabel_1.setIcon(new ImageIcon(DemoRegistroCliente.class.getResource("/imagenes/id_card_FILL1_wght400_GRAD0_opsz24.png")));
		lblNewLabel_1.setBounds(10, 120, 117, 24);
		lblNewLabel_1.setFont(new Font("Roboto Light", Font.PLAIN, 15));
		panel.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Nombre");
		lblNewLabel_2.setIcon(new ImageIcon(DemoRegistroCliente.class.getResource("/imagenes/face_FILL1_wght400_GRAD0_opsz24.png")));
		lblNewLabel_2.setBounds(10, 154, 117, 34);
		lblNewLabel_2.setFont(new Font("Roboto Light", Font.PLAIN, 15));
		panel.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("Apellido");
		lblNewLabel_3.setIcon(new ImageIcon(DemoRegistroCliente.class.getResource("/imagenes/person_book_FILL1_wght400_GRAD0_opsz24.png")));
		lblNewLabel_3.setBounds(10, 198, 117, 34);
		lblNewLabel_3.setFont(new Font("Roboto Light", Font.PLAIN, 15));
		panel.add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("Telefono");
		lblNewLabel_4.setIcon(new ImageIcon(DemoRegistroCliente.class.getResource("/imagenes/call_FILL1_wght400_GRAD0_opsz24.png")));
		lblNewLabel_4.setBounds(10, 262, 117, 20);
		lblNewLabel_4.setFont(new Font("Roboto Light", Font.PLAIN, 15));
		panel.add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("Direccion");
		lblNewLabel_5.setIcon(new ImageIcon(DemoRegistroCliente.class.getResource("/imagenes/map_FILL1_wght400_GRAD0_opsz24.png")));
		lblNewLabel_5.setBounds(10, 300, 117, 20);
		lblNewLabel_5.setFont(new Font("Roboto Light", Font.PLAIN, 15));
		panel.add(lblNewLabel_5);
		
		textField_1 = new JTextField();
		textField_1.setBounds(174, 130, 175, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(174, 174, 175, 20);
		panel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(174, 218, 175, 20);
		panel.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setBounds(174, 262, 175, 20);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(174, 306, 175, 20);
		panel.add(textField_5);
		textField_5.setColumns(10);
		
		JButton BtnGuardarDatosProveedor = new JButton("Guardar");
		BtnGuardarDatosProveedor.setBounds(10, 500, 130, 40);
		BtnGuardarDatosProveedor.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel.add(BtnGuardarDatosProveedor);
		
		JButton BtnCancelarOperacion = new JButton("Cancelar");
		BtnCancelarOperacion.setBounds(290, 500, 130, 40);
		BtnCancelarOperacion.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel.add(BtnCancelarOperacion);
		
		JButton BtnModificarDatosProveedor = new JButton("Modificar");
		BtnModificarDatosProveedor.setBounds(150, 500, 130, 40);
		BtnModificarDatosProveedor.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel.add(BtnModificarDatosProveedor);
		
		BtnCancelarOperacion_1 = new JButton("Cancelar");
		BtnCancelarOperacion_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		BtnCancelarOperacion_1.setBounds(150, 578, 130, 40);
		panel.add(BtnCancelarOperacion_1);
		
	}

}