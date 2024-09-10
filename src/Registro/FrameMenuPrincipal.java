package Registro;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;

public class FrameMenuPrincipal {
	JFrame FrameInicial;
	JPanel PanelFondo, PanelMenu, PanelImagen, PanelSuperior, PanelCerrarSesion,
		   PanelInicio, PanelProveedor, PanelFacturacion, PanelClientes, PanelUsuarios,
		   PanelContabilidad, PanelProductos, PanelRegistros, PanelContenido;
	JLabel LabelImg,  LabelCerrarSesion, LabelInicio, LabelProveedor, LabelFacturacion,
		   LabelCliente, LabelUsuario, LabelContabilidad, LabelProductos, LabelRegistros;
	
	void FrameInicial() {
		FrameInicial = new JFrame(); 
	    FrameInicial.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    FrameInicial.setExtendedState(JFrame.MAXIMIZED_BOTH);
	    FrameInicial.setLocationRelativeTo(null);
	    FrameInicial.setVisible(true);
	    
	    FrameInicial.add(PanelContenido);
	    FrameInicial.add(PanelSuperior);
	    FrameInicial.add(PanelMenu);
	    FrameInicial.add(PanelFondo);
	}
	
	void PanelFondo() {
		PanelFondo = new JPanel();
		PanelFondo.setBounds(0, 0, 1536, 794);
		PanelFondo.setBackground(Color.WHITE);
		PanelFondo.setLayout(null);
	}
	
	void PanelMenu() {
		PanelMenu = new JPanel();
		PanelMenu.setBackground(new Color(215, 163, 87));
		PanelMenu.setBounds(0, 0, 257, 794);
        PanelMenu.setLayout(null);
        
        PanelMenu.add(PanelRegistros);
        PanelMenu.add(PanelProductos);
        PanelMenu.add(PanelContabilidad);
        PanelMenu.add(PanelUsuarios);
        PanelMenu.add(PanelClientes);
        PanelMenu.add(PanelFacturacion);
        PanelMenu.add(PanelProveedor);
        PanelMenu.add(PanelImagen);
        PanelMenu.add(PanelInicio);
	}
	
	void PanelContenido() {
		PanelContenido = new JPanel();
		PanelContenido.setBounds(257, 79, 1279, 715);
        PanelContenido.setLayout(null);
	}
	
	void PanelRegistros() {
		PanelRegistros = new JPanel();
		PanelRegistros.setBackground(new Color(215, 163, 87));
		PanelRegistros.setBounds(10, 683, 237, 48);
		PanelRegistros.setLayout(null);
        
		LabelRegistros = new JLabel("Registro");
		LabelRegistros.setForeground(new Color(0, 0, 0));
		LabelRegistros.setBounds(0, 10, 169, 34);
        LabelRegistros.setIcon(new ImageIcon(FrameMenuPrincipal.class.getResource("/imagenes/app_registration_FILL0_wght400_GRAD0_opsz40.png")));
        LabelRegistros.setFont(new Font("Roboto", Font.BOLD, 30));
        
        PanelRegistros.add(LabelRegistros);
	}
	
	void PanelProductos() {
		PanelProductos = new JPanel();
		PanelProductos.setBackground(new Color(215, 163, 87));
		PanelProductos.setBounds(10, 610, 237, 48);
        PanelProductos.setLayout(null);
        PanelProductos.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
      	       
        	}
        });
        
        LabelProductos = new JLabel(" Productos");
        LabelProductos.setForeground(new Color(0, 0, 0));
        LabelProductos.setBounds(0, 10, 199, 34);
        LabelProductos.setIcon(new ImageIcon(FrameMenuPrincipal.class.getResource("/imagenes/steps_FILL1_wght300_GRAD0_opsz40.png")));
        LabelProductos.setFont(new Font("Roboto", Font.BOLD, 30));
        
        PanelProductos.add(LabelProductos);
	}
	
	void PanelContabilidad() {
		PanelContabilidad = new JPanel();
		PanelContabilidad.setBackground(new Color(215, 163, 87));
		PanelContabilidad.setBounds(10, 538, 237, 48);
		PanelContabilidad.setLayout(null);
        
		LabelContabilidad = new JLabel(" Contabilidad");
		LabelContabilidad.setForeground(new Color(0, 0, 0));
		LabelContabilidad.setBounds(0, 10, 226, 34);
        LabelContabilidad.setIcon(new ImageIcon(FrameMenuPrincipal.class.getResource("/imagenes/request_quote_FILL1_wght300_GRAD0_opsz40.png")));
        LabelContabilidad.setFont(new Font("Roboto", Font.BOLD, 30));
        
        PanelContabilidad.add(LabelContabilidad);
	}
	
	void PanelUsuarios() {
		PanelUsuarios = new JPanel();
		PanelUsuarios.setBackground(new Color(215, 163, 87));
		PanelUsuarios.setBounds(10, 460, 237, 48);
        PanelUsuarios.setLayout(null);
        
        LabelUsuario = new JLabel("Usuarios");
        LabelUsuario.setForeground(new Color(0, 0, 0));
        LabelUsuario.setBounds(0, 10, 179, 34);
        LabelUsuario.setIcon(new ImageIcon(FrameMenuPrincipal.class.getResource("/imagenes/person_FILL1_wght300_GRAD0_opsz40.png")));
        LabelUsuario.setFont(new Font("Roboto", Font.BOLD, 30));
        
        PanelUsuarios.add(LabelUsuario);
	}
	
	void PanelClientes() {
		PanelClientes = new JPanel();
		PanelClientes.setBackground(new Color(215, 163, 87));
		PanelClientes.setBounds(10, 394, 237, 48);
		PanelClientes.setLayout(null);
		PanelClientes.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		
        	}
        });
		
		LabelCliente = new JLabel(" Clientes");
		LabelCliente.setForeground(new Color(0, 0, 0));
		LabelCliente.setBounds(0, 10, 169, 34);
		LabelCliente.setIcon(new ImageIcon(FrameMenuPrincipal.class.getResource("/imagenes/person_search_FILL1_wght300_GRAD0_opsz40.png")));
		LabelCliente.setFont(new Font("Roboto", Font.BOLD, 30));
		
		PanelClientes.add(LabelCliente);
	}
	
	void PanelFacturacion() {
		PanelFacturacion = new JPanel();
		PanelFacturacion.setBackground(new Color(215, 163, 87));
		PanelFacturacion.setBounds(10, 325, 237, 48);
		PanelFacturacion.setLayout(null);
		PanelFacturacion.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {	
                
        	}
        });
        
		LabelFacturacion = new JLabel(" Facturacion");
        LabelFacturacion.setForeground(new Color(0, 0, 0));
        LabelFacturacion.setBounds(0, 10, 217, 34);
        LabelFacturacion.setIcon(new ImageIcon(FrameMenuPrincipal.class.getResource("/imagenes/receipt_long_FILL1_wght0_GRAD0_opsz40.png")));
        LabelFacturacion.setFont(new Font("Roboto", Font.BOLD, 30));
        
        PanelFacturacion.add(LabelFacturacion);
	}
	
	void PanelProveedor() {
		PanelProveedor = new JPanel();
		PanelProveedor.setBackground(new Color(215, 163, 87));
        PanelProveedor.setBounds(10, 255, 237, 48);
        PanelProveedor.setLayout(null);
        
        LabelProveedor = new JLabel(" Proveedores");
        LabelProveedor.setForeground(new Color(0, 0, 0));
        LabelProveedor.setBounds(0, 10, 226, 34);
        LabelProveedor.setIcon(new ImageIcon(FrameMenuPrincipal.class.getResource("/imagenes/local_shipping_FILL1_wght400_GRAD0_opsz40.png")));
        LabelProveedor.setFont(new Font("Roboto", Font.BOLD, 30));
        
        PanelProveedor.add(LabelProveedor);
	}
	
	void PanelInicio() {
		PanelInicio = new JPanel();
        PanelInicio.setBackground(new Color(215, 163, 87));
        PanelInicio.setBounds(10, 197, 237, 38);
        PanelInicio.setLayout(null);
        
        LabelInicio = new JLabel("Inicio");
        LabelInicio.setBounds(0, 0, 154, 40);
        LabelInicio.setBackground(new Color(0, 0, 0));
        LabelInicio.setForeground(new Color(0, 0, 0));
        LabelInicio.setFont(new Font("Roboto", Font.BOLD, 30));
        LabelInicio.setIcon(new ImageIcon(FrameMenuPrincipal.class.getResource("/imagenes/home_FILL1_wght400_GRAD-25_opsz40.png")));
        
        PanelInicio.add(LabelInicio);
	}
	
	void PanelImagen() {
		PanelImagen = new JPanel();
		PanelImagen.setBackground(new Color(215, 163, 87));
		PanelImagen.setBounds(0, 0, 340, 161);
		
		LabelImg = new JLabel("");
		LabelImg.setBounds(25, 0, 200, 169);
		LabelImg.setIcon(new ImageIcon(FrameMenuPrincipal.class.getResource("/imagenes/sneakers store brand logo sneaker store logo (1) - Hecho con PosterMyWall (1).jpg")));
        
		PanelImagen.add(LabelImg);
	}
	
	void PanelSuperior() {
		PanelSuperior = new JPanel();
		PanelSuperior.setBackground(new Color(215, 163, 87));
		PanelSuperior.setBounds(257, 0, 1279, 79);
        PanelSuperior.setLayout(null);
        
        PanelCerrarSesion = new JPanel();
        PanelCerrarSesion.setBackground(new Color(221, 213, 200));
        PanelCerrarSesion.setBounds(1127, 23, 149, 34);
        PanelCerrarSesion.setLayout(null);
        
        LabelCerrarSesion = new JLabel(" Cerrar sesion");
        LabelCerrarSesion.setBounds(0, 0, 149, 34);
        LabelCerrarSesion.setIcon(new ImageIcon(FrameMenuPrincipal.class.getResource("/imagenes/logout_FILL1_wght300_GRAD0_opsz24.png")));
        LabelCerrarSesion.setFont(new Font("Roboto", Font.BOLD, 15));
        
        PanelCerrarSesion.add(LabelCerrarSesion);
        PanelSuperior.add(PanelCerrarSesion);
	}
	
	FrameMenuPrincipal(){
		PanelSuperior();
		PanelImagen();
		PanelRegistros();
		PanelProductos();
		PanelContabilidad();
		PanelUsuarios();
		PanelClientes();
		PanelFacturacion();
		PanelProveedor();
		PanelInicio();
		PanelFondo();
		PanelMenu();
		PanelContenido();
		FrameInicial();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FrameMenuPrincipal e = new FrameMenuPrincipal();
	}
}
