import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;


public class Array extends JFrame {

	private JPanel contentPane;
	private JTextField length;
	private JTextField element;
	private JTextField text;
	private JTextField DOP;
	private JTextField displaybox;
	private int arr[];
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Array frame = new Array();
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
	public Array() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 705, 313);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(230, 230, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel ADS = new JLabel("Array DataStructure");
		ADS.setForeground(new Color(0, 128, 128));
		ADS.setFont(new Font("Algerian", Font.BOLD, 14));
		ADS.setBounds(198, 11, 176, 19);
		contentPane.add(ADS);
		
		JLabel ETAS = new JLabel("Enter The Array Size  :");
		ETAS.setForeground(new Color(240, 128, 128));
		ETAS.setFont(new Font("Verdana", Font.BOLD, 12));
		ETAS.setBounds(43, 50, 149, 16);
		contentPane.add(ETAS);
		
		length = new JTextField();
		length.setBounds(202, 49, 107, 20);
		contentPane.add(length);
		length.setColumns(10);
		
		JButton create = new JButton("Create Array");
		create.setBackground(new Color(0, 250, 154));
		create.setForeground(new Color(199, 21, 133));
		create.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			int len=Integer.valueOf(length.getText());
			arr=new int[len];
			String message="Array Of Length"+len+"Created";
			JOptionPane.showMessageDialog(contentPane, message);
			length.setText("");
				
			}
			
		});
		create.setFont(new Font("Verdana", Font.BOLD, 12));
		create.setBounds(335, 46, 139, 25);
		contentPane.add(create);
		
		JLabel ETIE = new JLabel("Enter The Integer Element :");
		ETIE.setForeground(new Color(240, 128, 128));
		ETIE.setFont(new Font("Verdana", Font.BOLD, 12));
		ETIE.setBounds(10, 87, 182, 16);
		contentPane.add(ETIE);
		
		element = new JTextField();
		element.setBounds(202, 86, 107, 20);
		contentPane.add(element);
		element.setColumns(10);
		
		JButton insert = new JButton("Insert");
		insert.setBackground(new Color(0, 250, 154));
		insert.setForeground(new Color(199, 21, 133));
		insert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int elem=Integer.valueOf(element.getText());
				int POS=Integer.valueOf(text.getText());
				arr[POS]=elem;
				String message="Element"+elem+"inserted@Position"+POS;
				JOptionPane.showMessageDialog(contentPane, message);
				element.setText("");
				text.setText("");
				
			}
		});
		insert.setFont(new Font("Verdana", Font.BOLD, 12));
		insert.setBounds(545, 85, 89, 23);
		contentPane.add(insert);
		
		JLabel position = new JLabel("Position");
		position.setForeground(new Color(240, 128, 128));
		position.setFont(new Font("Verdana", Font.BOLD, 12));
		position.setBounds(335, 89, 53, 16);
		contentPane.add(position);
		
		text = new JTextField();
		text.setBounds(398, 87, 121, 20);
		contentPane.add(text);
		text.setColumns(10);
		
		JLabel ETP = new JLabel("Delete  Position :");
		ETP.setForeground(new Color(240, 128, 128));
		ETP.setFont(new Font("Verdana", Font.BOLD, 12));
		ETP.setBounds(79, 125, 113, 16);
		contentPane.add(ETP);
		
		DOP = new JTextField();
		DOP.setBounds(202, 124, 107, 20);
		contentPane.add(DOP);
		DOP.setColumns(10);
		
		JButton delete = new JButton("Delete");
		delete.setBackground(new Color(0, 250, 154));
		delete.setForeground(new Color(199, 21, 133));
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int Dele=Integer.valueOf(DOP.getText());
				arr[Dele]=0;
				String message="Element Deleted @ the Position"+Dele;
				JOptionPane.showMessageDialog(contentPane, message);
				DOP.setText("");
			}
			
		});
		delete.setFont(new Font("Verdana", Font.BOLD, 12));
		delete.setBounds(331, 123, 137, 25);
		contentPane.add(delete);
		
		displaybox = new JTextField();
		displaybox.setBounds(165, 197, 303, 20);
		contentPane.add(displaybox);
		displaybox.setColumns(10);
		
		JButton display = new JButton("Display");
		display.setBackground(new Color(0, 250, 154));
		display.setForeground(new Color(199, 21, 133));
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String msg="";
				for(int i=0;i<=arr.length-1;i++) {
					msg=msg+" "+arr[i];
				}
				displaybox.setText(msg);
			}
		});
		display.setFont(new Font("Verdana", Font.BOLD, 12));
		display.setBounds(251, 163, 89, 23);
		contentPane.add(display);
	}
}
