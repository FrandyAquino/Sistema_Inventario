package Registro;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import Vista.cliente1;

import javax.swing.border.BevelBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ronaldagain{

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    JFrame frame;
    JPanel panel5;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    ronaldagain mariconaso = new ronaldagain();
                    mariconaso.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    public ronaldagain() {
		initialize();
	}

    public void initialize() {
    	frame = new JFrame();
		frame.setBounds(0, 0, 1550, 831);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		JPanel PanelFondo = new JPanel();
		PanelFondo.setBackground(new Color(215, 163, 87));
		PanelFondo.setBounds(0, 0, 1, 794);
        frame.getContentPane().add(PanelFondo);
        PanelFondo.setLayout(null);
        
        JPanel panel = new JPanel();
        panel.setBackground(new Color(215, 163, 87));
        panel.setBounds(0, 0, 257, 794);
        frame.getContentPane().add(panel);
        panel.setLayout(null);
        
        JPanel panel_2 = new JPanel();
        panel_2.setBackground(new Color(215, 163, 87));
        panel_2.setBounds(0, 0, 340, 161);
        panel.add(panel_2);
        panel_2.setLayout(null);
        
        JLabel lblNewLabel_1 = new JLabel("");
        lblNewLabel_1.setBounds(25, 0, 200, 169);
        panel_2.add(lblNewLabel_1);
        lblNewLabel_1.setIcon(new ImageIcon(ronaldagain.class.getResource("/imagenes/sneakers store brand logo sneaker store logo (1) - Hecho con PosterMyWall (1).jpg")));
        
        JPanel panel_3 = new JPanel();
        panel_3.setBackground(new Color(215, 163, 87));
        panel_3.setBounds(10, 197, 237, 38);
        panel.add(panel_3);
        panel_3.setLayout(null);
        
        JLabel lblNewLabel = new JLabel("Inicio");
        lblNewLabel.setBounds(0, 0, 154, 40);
        panel_3.add(lblNewLabel);
        lblNewLabel.setBackground(new Color(0, 0, 0));
        lblNewLabel.setForeground(new Color(0, 0, 0));
        lblNewLabel.setFont(new Font("Roboto", Font.BOLD, 30));
        lblNewLabel.setIcon(new ImageIcon(ronaldagain.class.getResource("/imagenes/home_FILL1_wght400_GRAD-25_opsz40.png")));
        
        JPanel panel_3_1 = new JPanel();
        panel_3_1.setBackground(new Color(215, 163, 87));
        panel_3_1.setBounds(10, 255, 237, 48);
        panel.add(panel_3_1);
        panel_3_1.setLayout(null);
        
        JLabel lblNewLabel_2 = new JLabel(" Proveedores");
        lblNewLabel_2.setForeground(new Color(0, 0, 0));
        lblNewLabel_2.setBounds(0, 10, 226, 34);
        panel_3_1.add(lblNewLabel_2);
        lblNewLabel_2.setIcon(new ImageIcon(ronaldagain.class.getResource("/imagenes/local_shipping_FILL1_wght400_GRAD0_opsz40.png")));
        lblNewLabel_2.setFont(new Font("Roboto", Font.BOLD, 30));
        
        JPanel panel_3_2 = new JPanel();
        panel_3_2.setBackground(new Color(215, 163, 87));
        panel_3_2.setBounds(10, 325, 237, 48);
        panel.add(panel_3_2);
        panel_3_2.setLayout(null);
        
        JLabel lblNewLabel_3 = new JLabel(" Facturacion");
        lblNewLabel_3.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
          		DemoFrameFacturacion Facturacion = new DemoFrameFacturacion();
                // Limpiar el panel5 antes de agregar la nueva ventana
                panel5.removeAll();
                // Agregar la ventana de clientes al panel5
                panel5.add(DemoFrameFacturacion.getContentPane());
                // Actualizar el panel5
                panel5.revalidate();
                panel5.repaint();
        	}
        });
        lblNewLabel_3.setForeground(new Color(0, 0, 0));
        lblNewLabel_3.setBounds(0, 10, 217, 34);
        panel_3_2.add(lblNewLabel_3);
        lblNewLabel_3.setIcon(new ImageIcon(ronaldagain.class.getResource("/imagenes/receipt_long_FILL1_wght0_GRAD0_opsz40.png")));
        lblNewLabel_3.setFont(new Font("Roboto", Font.BOLD, 30));
        
        JPanel panel_3_3 = new JPanel();
        panel_3_3.setBackground(new Color(215, 163, 87));
        panel_3_3.setBounds(10, 460, 237, 48);
        panel.add(panel_3_3);
        panel_3_3.setLayout(null);
        
        JLabel lblNewLabel_6 = new JLabel("Usuarios");
        lblNewLabel_6.setForeground(new Color(0, 0, 0));
        lblNewLabel_6.setBounds(0, 10, 179, 34);
        panel_3_3.add(lblNewLabel_6);
        lblNewLabel_6.setIcon(new ImageIcon(ronaldagain.class.getResource("/imagenes/person_FILL1_wght300_GRAD0_opsz40.png")));
        lblNewLabel_6.setFont(new Font("Roboto", Font.BOLD, 30));
        
        JPanel panel_3_4 = new JPanel();
        panel_3_4.setBackground(new Color(215, 163, 87));
        panel_3_4.setBounds(10, 538, 237, 48);
        panel.add(panel_3_4);
        panel_3_4.setLayout(null);
        
        JLabel lblNewLabel_4 = new JLabel(" Contabilidad");
        lblNewLabel_4.setForeground(new Color(0, 0, 0));
        lblNewLabel_4.setBounds(0, 10, 226, 34);
        panel_3_4.add(lblNewLabel_4);
        lblNewLabel_4.setIcon(new ImageIcon(ronaldagain.class.getResource("/imagenes/request_quote_FILL1_wght300_GRAD0_opsz40.png")));
        lblNewLabel_4.setFont(new Font("Roboto", Font.BOLD, 30));
        
        JPanel panel_3_5 = new JPanel();
        panel_3_5.setBackground(new Color(215, 163, 87));
        panel_3_5.setBounds(10, 610, 237, 48);
        panel.add(panel_3_5);
        panel_3_5.setLayout(null);
        
        JLabel lblNewLabel_6_1 = new JLabel(" Productos");
        lblNewLabel_6_1.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		Inventario inventario = new Inventario();
                // Limpiar el panel5 antes de agregar la nueva ventana
                panel5.removeAll();
                // Agregar la ventana de clientes al panel5
                panel5.add(inventario.getContentPane());
                // Actualizar el panel5
                panel5.revalidate();
                panel5.repaint();
      	       
        	}
        });
        lblNewLabel_6_1.setForeground(new Color(0, 0, 0));
        lblNewLabel_6_1.setBounds(0, 10, 199, 34);
        panel_3_5.add(lblNewLabel_6_1);
        lblNewLabel_6_1.setIcon(new ImageIcon(ronaldagain.class.getResource("/imagenes/steps_FILL1_wght300_GRAD0_opsz40.png")));
        lblNewLabel_6_1.setFont(new Font("Roboto", Font.BOLD, 30));
        
        JPanel panel_3_6 = new JPanel();
        panel_3_6.setBackground(new Color(215, 163, 87));
        panel_3_6.setBounds(10, 394, 237, 48);
        panel.add(panel_3_6);
        panel_3_6.setLayout(null);
        
        JLabel lblNewLabel_5 = new JLabel(" Clientes");
        lblNewLabel_5.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		cliente1 cliente = new cliente1();
                  // Limpiar el panel5 antes de agregar la nueva ventana
                  panel5.removeAll();
                  // Agregar la ventana de clientes al panel5
                  panel5.add(cliente.getContentPane());
                  // Actualizar el panel5
                  panel5.revalidate();
                  panel5.repaint();
        		
        		
        	}
        });
        lblNewLabel_5.setForeground(new Color(0, 0, 0));
        lblNewLabel_5.setBounds(0, 10, 169, 34);
        panel_3_6.add(lblNewLabel_5);
        lblNewLabel_5.setIcon(new ImageIcon(ronaldagain.class.getResource("/imagenes/person_search_FILL1_wght300_GRAD0_opsz40.png")));
        lblNewLabel_5.setFont(new Font("Roboto", Font.BOLD, 30));
        
        JPanel panel_3_7 = new JPanel();
        panel_3_7.setBackground(new Color(215, 163, 87));
        panel_3_7.setBounds(10, 683, 237, 48);
        panel.add(panel_3_7);
        panel_3_7.setLayout(null);
        
        JLabel lblNewLabel_6_1_1 = new JLabel("Registro");
        lblNewLabel_6_1_1.setForeground(new Color(0, 0, 0));
        lblNewLabel_6_1_1.setBounds(0, 10, 169, 34);
        panel_3_7.add(lblNewLabel_6_1_1);
        lblNewLabel_6_1_1.setIcon(new ImageIcon(ronaldagain.class.getResource("/imagenes/app_registration_FILL0_wght400_GRAD0_opsz40.png")));
        lblNewLabel_6_1_1.setFont(new Font("Roboto", Font.BOLD, 30));
        
        JLabel lblNewLabel_8 = new JLabel("FootBill Software Proyect");
        lblNewLabel_8.setFont(new Font("Roboto Light", Font.PLAIN, 15));
        lblNewLabel_8.setBounds(42, 748, 169, 43);
        panel.add(lblNewLabel_8);
        
        JPanel panel_1 = new JPanel();
        panel_1.setBackground(new Color(215, 163, 87));
        panel_1.setBounds(257, 0, 1279, 79);
        frame.getContentPane().add(panel_1);
        panel_1.setLayout(null);
        
        JPanel panel_4 = new JPanel();
        panel_4.setBackground(new Color(221, 213, 200));
        panel_4.setBounds(1127, 23, 149, 34);
        panel_1.add(panel_4);
        panel_4.setLayout(null);
        
        JLabel lblNewLabel_7 = new JLabel(" Cerrar sesion");
        lblNewLabel_7.setBounds(0, 0, 149, 34);
        panel_4.add(lblNewLabel_7);
        lblNewLabel_7.setIcon(new ImageIcon(ronaldagain.class.getResource("/imagenes/logout_FILL1_wght300_GRAD0_opsz24.png")));
        lblNewLabel_7.setFont(new Font("Roboto", Font.BOLD, 15));
        
        panel5 = new JPanel();
        panel5.setBounds(257, 79, 1279, 715);
        frame.getContentPane().add(panel5);
        panel5.setLayout(null);
        

      
       
     
     

    }
    public JFrame getFrame() {
    	return frame;
    }
    	
	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}

}
