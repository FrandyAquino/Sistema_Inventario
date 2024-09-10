package Registro;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

//import FacturacionTabla.Filas.TableActionCellEditor;
//import FacturacionTabla.Filas.TableActionCellRender;
//import FacturacionTabla.Filas.TableActionEvent;
import javax.swing.border.EmptyBorder;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class DemoFrameFacturacion {
    private JFrame frame;
    private JTable table;
   static JPanel panel; // Cambiado a GradientPanel
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    DemoFrameFacturacion window = new DemoFrameFacturacion();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public DemoFrameFacturacion() {
        initialize();
    
        
    }

    private void initialize() {
        frame = new JFrame();
        frame.setBounds(0, 0, 1550, 850);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        JMenuBar menuBar = new JMenuBar();
        frame.setJMenuBar(menuBar);
        
        JMenu mnNewMenu = new JMenu("New menu");
        menuBar.add(mnNewMenu);
        
        panel = new JPanel(); // Cambiado a GradientPanel
        panel.setBounds(0, 0, 1536, 770);
        frame.getContentPane().add(panel);
        panel.setLayout(null);
        
		JLabel Facturacion_2 = new JLabel("Facturacion");
		Facturacion_2.setHorizontalAlignment(SwingConstants.CENTER);
		Facturacion_2.setForeground(Color.BLACK);
		Facturacion_2.setFont(new Font("Roboto Black", Font.BOLD, 30));
		Facturacion_2.setBackground(Color.WHITE);
		Facturacion_2.setBounds(0, 0, 1536, 50);
		panel.add(Facturacion_2);
        
        JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.CYAN);
		panel_1.setBounds(0, 267, 500, 503);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("PRODUCTOS");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Roboto Black", Font.BOLD, 19));
		lblNewLabel.setBounds(0, 0, 500, 35);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Codigo de Producto");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Roboto", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(10, 65, 151, 30);
		panel_1.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(180, 65, 139, 30);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Comprobar");
		btnNewButton.setBounds(354, 65, 136, 30);
		panel_1.add(btnNewButton);
		
		JLabel lblNewLabel_1_1 = new JLabel("DESCRIPCION");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Roboto", Font.PLAIN, 15));
		lblNewLabel_1_1.setBounds(10, 125, 151, 30);
		panel_1.add(lblNewLabel_1_1);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(180, 125, 310, 150);
		panel_1.add(scrollPane_1);
		
		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		scrollPane_1.setViewportView(textArea);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("STOCK");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1.setFont(new Font("Roboto", Font.PLAIN, 15));
		lblNewLabel_1_1_1.setBounds(10, 305, 151, 30);
		panel_1.add(lblNewLabel_1_1_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(180, 305, 310, 30);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(0, 0, 310, 30);
		panel_2.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("CANTIDAD A VENDER");
		lblNewLabel_1_1_1_1.setFont(new Font("Roboto", Font.PLAIN, 15));
		lblNewLabel_1_1_1_1.setBounds(10, 365, 151, 30);
		panel_1.add(lblNewLabel_1_1_1_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(180, 365, 139, 30);
		panel_1.add(textField_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panel_3.setLayout(null);
		panel_3.setBounds(84, 463, 100, 30);
		panel_1.add(panel_3);
		
		JLabel lblNewLabel_3 = new JLabel("FACTURAR");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3.setBounds(0, 0, 100, 30);
		panel_3.add(lblNewLabel_3);
		
		JPanel panel_3_1 = new JPanel();
		panel_3_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panel_3_1.setLayout(null);
		panel_3_1.setBounds(300, 463, 100, 30);
		panel_1.add(panel_3_1);
		
		JLabel lblNewLabel_4 = new JLabel("LIMPIAR");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_4.setBounds(0, 0, 100, 30);
		panel_3_1.add(lblNewLabel_4);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBorder(null);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(500, 50, 1036, 524);
		panel.add(scrollPane);
		
		table = new JTable();
		table.setSelectionBackground(SystemColor.activeCaption);
		table.setRowHeight(40);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null}
			},
			new String[] {
				"Codigo Producto", "Cantidad", "Descripcion", "Precio", "Importe", "Opciones"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false, true
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.setBackground(Color.WHITE);
		scrollPane.setViewportView(table);
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setBackground(SystemColor.inactiveCaption);
		panel_1_1_1.setBounds(0, 50, 500, 217);
		panel.add(panel_1_1_1);
		panel_1_1_1.setLayout(null);
		
		JLabel lblCliente = new JLabel("CLIENTE");
		lblCliente.setHorizontalAlignment(SwingConstants.CENTER);
		lblCliente.setFont(new Font("Roboto Black", Font.BOLD, 19));
		lblCliente.setBounds(0, 0, 500, 35);
		panel_1_1_1.add(lblCliente);
		
		JLabel lblNewLabel_1_2 = new JLabel("Codigo de Cliente");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setFont(new Font("Roboto", Font.PLAIN, 15));
		lblNewLabel_1_2.setBounds(10, 65, 151, 30);
		panel_1_1_1.add(lblNewLabel_1_2);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(180, 65, 139, 30);
		panel_1_1_1.add(textField_2);
		
		JButton btnNewButton_1 = new JButton("Comprobar");
		btnNewButton_1.setBounds(354, 65, 136, 30);
		panel_1_1_1.add(btnNewButton_1);
		
		JLabel lblNewLabel_1_1_1_2 = new JLabel("NOMBRE");
		lblNewLabel_1_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_2.setFont(new Font("Roboto", Font.PLAIN, 15));
		lblNewLabel_1_1_1_2.setBounds(10, 120, 151, 30);
		panel_1_1_1.add(lblNewLabel_1_1_1_2);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setLayout(null);
		panel_2_1.setBounds(180, 120, 310, 30);
		panel_1_1_1.add(panel_2_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setBounds(0, 0, 310, 30);
		panel_2_1.add(lblNewLabel_2_1);
		
		JPanel panel_3_2_1 = new JPanel();
		panel_3_2_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panel_3_2_1.setLayout(null);
		panel_3_2_1.setBounds(300, 177, 100, 30);
		panel_1_1_1.add(panel_3_2_1);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("LIMPIAR");
		lblNewLabel_3_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3_1_1.setBounds(0, 0, 100, 30);
		panel_3_2_1.add(lblNewLabel_3_1_1);
		
		JPanel panel_3_2 = new JPanel();
		panel_3_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(null, "Hola");
			}
		});
		panel_3_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panel_3_2.setLayout(null);
		panel_3_2.setBounds(85, 177, 100, 30);
		panel_1_1_1.add(panel_3_2);
		
		JLabel lblNewLabel_3_1 = new JLabel("GUARDAR");
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3_1.setBounds(0, 0, 100, 30);
		panel_3_2.add(lblNewLabel_3_1);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBounds(845, 710, 190, 50);
		panel.add(panel_4);
		
		JButton btnNewButton_2 = new JButton("CANCELAR VENTA");
		btnNewButton_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_2.setActionCommand("");
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_2.setContentAreaFilled(false);
		btnNewButton_2.setBorder(new EmptyBorder(0, 0, 0, 0));
		btnNewButton_2.setBounds(0, 0, 190, 50);
		panel_4.add(btnNewButton_2);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBounds(500, 584, 1036, 40);
		panel.add(panel_6);
		panel_6.setLayout(null);
		
		JLabel lblNewLabel_4_1 = new JLabel("Subtotal:");
		lblNewLabel_4_1.setBounds(5, 0, 105, 40);
		lblNewLabel_4_1.setFont(new Font("Roboto Black", Font.BOLD, 24));
		panel_6.add(lblNewLabel_4_1);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(Color.WHITE);
		panel_5.setBounds(150, 5, 185, 30);
		panel_6.add(panel_5);
		panel_5.setLayout(null);
		
		JLabel lblNewLabel_8 = new JLabel("New label");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_8.setBounds(0, 0, 185, 30);
		panel_5.add(lblNewLabel_8);
		
		JLabel lblNewLabel_6 = new JLabel("Itbs:");
		lblNewLabel_6.setFont(new Font("Roboto Black", Font.BOLD, 24));
		lblNewLabel_6.setBounds(417, 0, 55, 40);
		panel_6.add(lblNewLabel_6);
		
		JPanel panel_5_1 = new JPanel();
		panel_5_1.setBackground(Color.WHITE);
		panel_5_1.setBounds(497, 5, 50, 30);
		panel_6.add(panel_5_1);
		panel_5_1.setLayout(null);
		
		JLabel lblNewLabel_5 = new JLabel("18%");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setBounds(0, 0, 50, 30);
		panel_5_1.add(lblNewLabel_5);
		
		JLabel lblNewLabel_7 = new JLabel("Total a pagar:");
		lblNewLabel_7.setFont(new Font("Roboto Black", Font.BOLD, 24));
		lblNewLabel_7.setBounds(645, 0, 161, 40);
		panel_6.add(lblNewLabel_7);
		
		JPanel panel_5_2 = new JPanel();
		panel_5_2.setBackground(Color.WHITE);
		panel_5_2.setBounds(846, 5, 185, 30);
		panel_6.add(panel_5_2);
		panel_5_2.setLayout(null);
		
		JLabel lblNewLabel_9 = new JLabel("New label");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_9.setBounds(0, 0, 185, 30);
		panel_5_2.add(lblNewLabel_9);
		
		JPanel panel_4_1 = new JPanel();
		panel_4_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panel_4_1.setLayout(null);
		panel_4_1.setBounds(510, 710, 190, 50);
		panel.add(panel_4_1);
		
		JButton btnNewButton_2_1 = new JButton("GENERAR VENTA");
		btnNewButton_2_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_2_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_2_1.setContentAreaFilled(false);
		btnNewButton_2_1.setBorder(new EmptyBorder(0, 0, 0, 0));
		btnNewButton_2_1.setBounds(0, 0, 190, 50);
		panel_4_1.add(btnNewButton_2_1);
		
		JPanel panel_4_2 = new JPanel();
		panel_4_2.setLayout(null);
		panel_4_2.setBounds(1171, 710, 355, 50);
		panel.add(panel_4_2);
		
		JButton btnNewButton_2_2 = new JButton("CALCULAR CANTIDAD A DEVOLVER");
		btnNewButton_2_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_2_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_2_2.setContentAreaFilled(false);
		btnNewButton_2_2.setBorder(new EmptyBorder(0, 0, 0, 0));
		btnNewButton_2_2.setActionCommand("");
		btnNewButton_2_2.setBounds(0, 0, 354, 50);
		panel_4_2.add(btnNewButton_2_2);
	
    }
	public JFrame getFrame() {
		return frame;
	}
	public static JPanel getContentPane() {
	    return panel; // Devuelve el panel principal de la ventana
	}
}
