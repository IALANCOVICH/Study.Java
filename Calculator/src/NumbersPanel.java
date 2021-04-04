import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class NumbersPanel extends JPanel implements ActionListener {
	
	@SuppressWarnings("unused")
	private JTextField txtText;
	
	public NumbersPanel(JTextField txtText) {
		this.txtText = txtText;
		
		setLayout(new GridLayout(4, 3));
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(this);
		add (btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(this);
		add (btn2);

		JButton btn3 = new JButton("3");
		btn3.addActionListener(this);
		add (btn3);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(this);
		add (btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(this);
		add (btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(this);
		add (btn6);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(this);
		add (btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(this);
		add (btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(this);
		add (btn9);
		
		JButton btnEmpty1 = new JButton();
		btnEmpty1.setEnabled(false);
		add(btnEmpty1);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(this);
		add (btn0);
		
		JButton btnEmpty2 = new JButton();
		btnEmpty2.setEnabled(false);
		add(btnEmpty2);
				
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	
	if(txtText.getText().length() == 10) {
		return;
	}	
	
	JButton btn = (JButton) e.getSource();
	String number = btn.getText();
	txtText.setText(txtText.getText() + number);
		
	}
}