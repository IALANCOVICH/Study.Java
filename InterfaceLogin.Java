package view;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import java.awt.TextField;
import java.awt.TextArea;
import java.awt.ScrollPane;
import javax.swing.JToolBar;
import javax.swing.JDesktopPane;
public class primeiratela {
	private JFrame frame;
	private JTextField textLogin;
	private JPasswordField txtSenha;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					primeiratela window = new primeiratela();
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
	public primeiratela() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 334);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Login");
		lblNewLabel.setBounds(51, 76, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		textLogin = new JTextField();
		textLogin.setBounds(51, 101, 147, 20);
		frame.getContentPane().add(textLogin);
		textLogin.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Senha");
		lblNewLabel_1.setBounds(51, 137, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Entrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				if(checkLogin(textLogin.getText(), new String(txtSenha.getPassword()))) {
					
					JOptionPane.showMessageDialog(null, "Bem vindo ao Sistema!");
					
				}else {
					
					JOptionPane.showMessageDialog(null, "Dados inválidos!", "Alerta", JOptionPane.WARNING_MESSAGE);
				}
			
			}
			
		});
		btnNewButton.setBounds(189, 235, 89, 23);
		frame.getContentPane().add(btnNewButton);
		txtSenha = new JPasswordField();
		txtSenha.setBounds(51, 165, 147, 20);
		frame.getContentPane().add(txtSenha);
	}

	public boolean checkLogin(String login, String senha) {
		return login.equals("usuario") && senha.equals("1234");
	}
}
