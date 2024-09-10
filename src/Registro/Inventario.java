package Registro;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JFormattedTextField;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import javax.swing.JTextPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JEditorPane;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;
import javax.swing.JInternalFrame;
import java.awt.TextArea;
import javax.swing.JSlider;
import javax.swing.JSeparator;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollBar;
import javax.swing.JTextArea;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.SwingConstants;

public class Inventario {

	private JFrame frame;
	private JTable tableInventario;
	private JTextField textField;
	private JLabel lbInventario;
	private DefaultTableModel model;
	static JPanel panel;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inventario window = new Inventario();
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
	public Inventario() {
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
		
		panel = new JPanel();
		panel.setBounds(0, 0, 1536, 794);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		model = new DefaultTableModel();
		model.addColumn("Codigo de Barra");
        model.addColumn("Nombre de producto");
        model.addColumn("Categoria");
        model.addColumn("Marca");
        model.addColumn("Precio Compra");
        model.addColumn("Precio Venta");
        model.addColumn("Stock");
        model.addColumn("Descripcion");
		
		tableInventario = new JTable(model);
		
		JScrollPane scrollPane = new JScrollPane(tableInventario);
		scrollPane.setBounds(10, 131, 1516, 653);
		panel.add(scrollPane);
		
		textField = new JTextField();
		textField.setBounds(509, 67, 400, 28);
		panel.add(textField);
		textField.setColumns(10);
		
		lbInventario = new JLabel("INVENTARIO DE PRODUCTOS");
		lbInventario.setFont(new Font("Roboto Black", Font.BOLD, 30));
		lbInventario.setBounds(65, 49, 434, 50);
		panel.add(lbInventario);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(Inventario.class.getResource("/imagenes4/inventory_FILL1_wght400_GRAD0_opsz48.png")));
		lblNewLabel_4.setBounds(10, 27, 60, 82);
		panel.add(lblNewLabel_4);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(Color.LIGHT_GRAY);
		panel_1.setBounds(919, 67, 158, 28);
		panel.add(panel_1);
		
		JLabel lblBuscarProducto = new JLabel("Buscar Producto");
		lblBuscarProducto.setVerticalAlignment(SwingConstants.TOP);
		lblBuscarProducto.setIcon(new ImageIcon(Inventario.class.getResource("/imagenes4/search_FILL1_wght400_GRAD0_opsz24.png")));
		lblBuscarProducto.setFont(new Font("Roboto Light", Font.PLAIN, 15));
		lblBuscarProducto.setBounds(0, 0, 148, 20);
		panel_1.add(lblBuscarProducto);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBackground(Color.LIGHT_GRAY);
		panel_1_1.setBounds(1115, 67, 167, 31);
		panel.add(panel_1_1);
		
		JLabel lblExportarListado = new JLabel("Exportar listado");
		lblExportarListado.setBounds(0, 0, 161, 30);
		panel_1_1.add(lblExportarListado);
		lblExportarListado.setIcon(new ImageIcon(Inventario.class.getResource("/imagenes4/upgrade_FILL1_wght400_GRAD0_opsz40.png")));
		lblExportarListado.setFont(new Font("Roboto Light", Font.PLAIN, 15));
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setLayout(null);
		panel_1_1_1.setBackground(new Color(128, 255, 0));
		panel_1_1_1.setBounds(1326, 67, 185, 31);
		panel.add(panel_1_1_1);
		
		JLabel lblAgregarProductos = new JLabel("Agregar Producto");
		lblAgregarProductos.setIcon(new ImageIcon(Inventario.class.getResource("/imagenes4/add_FILL1_wght400_GRAD0_opsz40.png")));
		lblAgregarProductos.setBounds(0, 0, 162, 30);
		panel_1_1_1.add(lblAgregarProductos);
		lblAgregarProductos.setFont(new Font("Roboto Light", Font.PLAIN, 15));
	}
	
	public static JPanel getContentPane() {
	    return panel; // Devuelve el panel principal de la ventana
	}
}