package Registro;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ronads {

    private JFrame frame;
    private JPanel panel;
    private JTextField txtIngrese;
    private JPasswordField passwordField;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    ronads login = new ronads();
                    login.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public ronads() {
        initialize();
    }

    public void initialize() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 100, 1548, 823);
        frame.setBackground(new Color(255, 255, 255));
        frame.setForeground(new Color(255, 255, 255));

        panel = new JPanel();
        panel.setBounds(0, 0, 1548, 823);
        frame.getContentPane().add(panel);
        panel.setLayout(null);

        JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setIcon(new ImageIcon(ronads.class.getResource("/imagenes/4-5-jpg-data.jpg")));
        lblNewLabel.setBounds(0, 10, 873, 786);
        panel.add(lblNewLabel);

        JLabel lblNewLabel_1 = new JLabel("Nombre de Usuario");
        lblNewLabel_1.setFont(new Font("Roboto Light", Font.BOLD, 15));
        lblNewLabel_1.setBounds(936, 387, 142, 29);
        panel.add(lblNewLabel_1);

        JLabel lblNewLabel_1_1 = new JLabel("Contraseña");
        lblNewLabel_1_1.setFont(new Font("Roboto Light", Font.BOLD, 15));
        lblNewLabel_1_1.setBounds(936, 508, 95, 29);
        panel.add(lblNewLabel_1_1);

        txtIngrese = new JTextField();
        txtIngrese.setFont(new Font("Roboto", Font.PLAIN, 14));
        txtIngrese.setForeground(new Color(192, 192, 192));
        txtIngrese.setBackground(new Color(255, 255, 255));
        txtIngrese.setText("Ingrese su nombre de usuario");
        txtIngrese.setBounds(979, 418, 512, 41);
        panel.add(txtIngrese);
        txtIngrese.setColumns(10);
        txtIngrese.setBorder(null);

        JLabel lblNewLabel_2 = new JLabel("INICIAR SESIÓN");
        lblNewLabel_2.setFont(new Font("Roboto Medium", Font.BOLD, 40));
        lblNewLabel_2.setBounds(1057, 280, 304, 80);
        panel.add(lblNewLabel_2);

        JSeparator separator_1 = new JSeparator();
        separator_1.setBackground(Color.BLACK);
        separator_1.setBounds(936, 578, 555, 2);
        panel.add(separator_1);

        passwordField = new JPasswordField();
        passwordField.setToolTipText("*******");
        passwordField.setForeground(new Color(0, 0, 0));
        passwordField.setBackground(new Color(255, 255, 255));
        passwordField.setBounds(969, 547, 522, 29);
        panel.add(passwordField);
        passwordField.setBorder(null);

        JLabel lblNewLabel_3 = new JLabel("Entrar");
        lblNewLabel_3.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		 ronaldagain ventanaPrincipal = new ronaldagain();
     	        // Hacer visible la ventana de ronaldagain
     	        ventanaPrincipal.getFrame().setVisible(true);
     	        // Cerrar la ventana actual (opcional, dependiendo de tus necesidades)
     	       dispose();
        		
        	}
        });
        lblNewLabel_3.setBounds(1150, 657, 114, 60);
        panel.add(lblNewLabel_3);
        lblNewLabel_3.setFont(new Font("Rockwell Condensed", Font.BOLD, 18));
        lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);

        JPanel panel_1 = new JPanel();
        panel_1.setBackground(new Color(215, 163, 87));
        panel_1.setBounds(1150, 657, 114, 60);
        panel.add(panel_1);
        panel_1.setLayout(null);

        JSeparator separator_1_1 = new JSeparator();
        separator_1_1.setBackground(Color.BLACK);
        separator_1_1.setBounds(936, 464, 555, 2);
        panel.add(separator_1_1);

        JLabel lblNewLabel_4 = new JLabel("");
        lblNewLabel_4.setIcon(new ImageIcon(ronads.class.getResource("/imagenes/person_FILL0_wght600_GRAD0_opsz40.png")));
        lblNewLabel_4.setBounds(929, 418, 40, 48);
        panel.add(lblNewLabel_4);

        JLabel lblNewLabel_4_1 = new JLabel("");
        lblNewLabel_4_1.setIcon(new ImageIcon(ronads.class.getResource("/imagenes/lock_FILL0_wght600_GRAD0_opsz40.png")));
        lblNewLabel_4_1.setBounds(931, 539, 40, 41);
        panel.add(lblNewLabel_4_1);

        JLabel lblNewLabel_5 = new JLabel("");
        lblNewLabel_5.setIcon(new ImageIcon(ronads.class.getResource("/imagenes/sneakers store brand logo sneaker store logo - Hecho con PosterMyWall (6).jpg")));
        lblNewLabel_5.setBounds(1057, 32, 271, 253);
        panel.add(lblNewLabel_5);

        frame.setVisible(true);
    }
    protected void dispose() {
		// TODO Auto-generated method stub
		
	}

	public JFrame getFrame() {
		return getFrame();
	}
    public JPanel getContentPane() {
	    return panel; // Devuelve el panel principal de la ventana
	}
}
