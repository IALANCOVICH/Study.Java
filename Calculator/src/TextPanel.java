import java.awt.FlowLayout;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class TextPanel extends JPanel {
		
		private JTextField txtNumber;
	
		public TextPanel() {
			setLayout (new FlowLayout());
			
			txtNumber = new JTextField(15);
			txtNumber.setHorizontalAlignment(JTextField.RIGHT);
			txtNumber.setEnabled(false);
			add(txtNumber);

		}

		public JTextField getTxtNumber() {
			return txtNumber;
		}
}