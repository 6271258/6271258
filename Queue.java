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

public class Queue extends JFrame {

	private JPanel contentPane;
	private JTextField SizeField;
	private JTextField element;
	private JTextField displaybox;
	private int q[];
	private int size;
	private int r=-1;
	private int f=0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Queue frame = new Queue();
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
	public Queue() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 871, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(211, 211, 211));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel QDS = new JLabel("Queue DataStructure");
		QDS.setForeground(new Color(0, 128, 0));
		QDS.setFont(new Font("Algerian", Font.BOLD, 14));
		QDS.setBounds(303, 11, 172, 19);
		contentPane.add(QDS);
		
		JLabel ETQS = new JLabel("Enter The Queue Size :");
		ETQS.setForeground(new Color(199, 21, 133));
		ETQS.setFont(new Font("Verdana", Font.BOLD, 12));
		ETQS.setBounds(159, 43, 151, 16);
		contentPane.add(ETQS);
		
		SizeField = new JTextField();
		SizeField.setBounds(320, 41, 142, 20);
		contentPane.add(SizeField);
		SizeField.setColumns(10);
		
		JButton create = new JButton("Create Queue");
		create.setBackground(new Color(152, 251, 152));
		create.setForeground(new Color(128, 0, 128));
		create.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n;
				n=Integer.valueOf(SizeField.getText());
				q=new int[n];
				size=q.length;
				SizeField.setText("");
			}
		});
		create.setFont(new Font("Verdana", Font.BOLD, 12));
		create.setBounds(482, 41, 123, 25);
		contentPane.add(create);
		
		JLabel EAE = new JLabel("Enter An Element :");
		EAE.setForeground(new Color(199, 21, 133));
		EAE.setFont(new Font("Verdana", Font.BOLD, 12));
		EAE.setBounds(190, 94, 122, 16);
		contentPane.add(EAE);
		
		element = new JTextField();
		element.setBounds(317, 93, 145, 20);
		contentPane.add(element);
		element.setColumns(10);
		
		JButton insert = new JButton("Insertion");
		insert.setBackground(new Color(152, 251, 152));
		insert.setForeground(new Color(128, 0, 128));
		insert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int elem;
				if(r==size-1) {
					JOptionPane.showMessageDialog(contentPane, "Insertion is not possible");
				}
				else {
					elem=Integer.valueOf(element.getText());
					++r;
					q[r]=elem;
				    element.setText("");
				}
			}
		});
		insert.setFont(new Font("Verdana", Font.BOLD, 12));
		insert.setBounds(482, 92, 93, 25);
		contentPane.add(insert);
		
		JButton delete = new JButton("Deletion");
		delete.setBackground(new Color(152, 251, 152));
		delete.setForeground(new Color(128, 0, 128));
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(r==-1||f>r) {
					JOptionPane.showMessageDialog(contentPane, "Deletion is not possible");
					}
				else {
					String message="Deleted Element is"+q[f];
					JOptionPane.showMessageDialog(contentPane, message);
					++f;
					
				}
			}
		});
		delete.setFont(new Font("Verdana", Font.BOLD, 12));
		delete.setBounds(346, 131, 89, 23);
		contentPane.add(delete);
		
		JButton display = new JButton("Display");
		display.setBackground(new Color(152, 251, 152));
		display.setForeground(new Color(128, 0, 128));
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String msg="";
				if(r==-1||f>r) {
					JOptionPane.showMessageDialog(contentPane, "Display is not possible");
				}
				else {
					for(int i=f;i<=r;i++) {
						msg =msg+" "+q[i];
					}
					displaybox.setText(msg);
				}
			}
		});
		display.setFont(new Font("Verdana", Font.BOLD, 12));
		display.setBounds(346, 167, 89, 23);
		contentPane.add(display);
		
		displaybox = new JTextField();
		displaybox.setBounds(249, 201, 281, 20);
		contentPane.add(displaybox);
		displaybox.setColumns(10);
	}

}
