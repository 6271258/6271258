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

public class Stack extends JFrame {

	private JPanel contentPane;
	private JTextField SizeField;
	private JTextField element;
	private JTextField displaybox;
	private int s[];
	private int size;
	private int top=-1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Stack frame = new Stack();
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
	public Stack() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 955, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 240, 245));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel SD = new JLabel("Stack DataStructure");
		SD.setForeground(new Color(0, 0, 205));
		SD.setFont(new Font("Algerian", Font.BOLD, 14));
		SD.setBounds(311, 11, 171, 19);
		contentPane.add(SD);
		
		JLabel ETSS = new JLabel("Enter The Stack Size :");
		ETSS.setForeground(new Color(128, 0, 128));
		ETSS.setFont(new Font("Verdana", Font.BOLD, 12));
		ETSS.setBounds(110, 54, 145, 16);
		contentPane.add(ETSS);
		
		SizeField = new JTextField();
		SizeField.setBounds(272, 53, 145, 20);
		contentPane.add(SizeField);
		SizeField.setColumns(10);
		
		JButton create = new JButton("Create Stack");
		create.setBackground(new Color(175, 238, 238));
		create.setForeground(new Color(165, 42, 42));
		create.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			size=Integer.valueOf(SizeField.getText());
			s=new int[size];
			String message="Stack of size"+size+"created";
			JOptionPane.showMessageDialog(contentPane,message);
			SizeField.setText("");
			}
		});
		create.setFont(new Font("Verdana", Font.BOLD, 12));
		create.setBounds(444, 52, 117, 25);
		contentPane.add(create);
		
		JLabel EAE = new JLabel("Enter An Element :");
		EAE.setForeground(new Color(128, 0, 128));
		EAE.setFont(new Font("Verdana", Font.BOLD, 12));
		EAE.setBounds(127, 100, 122, 16);
		contentPane.add(EAE);
		
		element = new JTextField();
		element.setBounds(272, 99, 145, 20);
		contentPane.add(element);
		element.setColumns(10);
		
		JButton push = new JButton("PUSH");
		push.setBackground(new Color(175, 238, 238));
		push.setForeground(new Color(165, 42, 42));
		push.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int elem;
				if(top==size-1) {
					JOptionPane.showMessageDialog(contentPane, "Push not Possbile");
				}
				else {
					elem=Integer.valueOf(element.getText());
					++top;
					s[top]=elem;
					element.setText("");
				}
			}
		});
		push.setFont(new Font("Verdana", Font.BOLD, 12));
		push.setBounds(444, 98, 89, 23);
		contentPane.add(push);
		
		JButton pop = new JButton("POP");
		pop.setBackground(new Color(175, 238, 238));
		pop.setForeground(new Color(165, 42, 42));
		pop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(top==-1) {
					JOptionPane.showMessageDialog(contentPane, "Pop is not possible");
				}
				else {
					String message="Element is deleted:"+s[top];
					JOptionPane.showMessageDialog(contentPane, message);
					--top;
					}
				
			}
		});
		pop.setFont(new Font("Verdana", Font.BOLD, 12));
		pop.setBounds(305, 140, 89, 23);
		contentPane.add(pop);
		
		JButton display = new JButton("Display");
		display.setBackground(new Color(175, 238, 238));
		display.setForeground(new Color(165, 42, 42));
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String msg="";
				if(top==-1) {
					JOptionPane.showMessageDialog(contentPane, "Display not possible");
				}
				else {
					for(int i=top;i>=0;i--) {
						msg=msg+" "+s[top];
						}
					displaybox.setText(msg);
				}
			}
		});
		display.setFont(new Font("Verdana", Font.BOLD, 12));
		display.setBounds(305, 178, 89, 23);
		contentPane.add(display);
		
		displaybox = new JTextField();
		displaybox.setBounds(196, 212, 286, 20);
		contentPane.add(displaybox);
		displaybox.setColumns(10);
	}
}
