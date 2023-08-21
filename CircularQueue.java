import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class CircularQueue extends JFrame {

	private JPanel contentPane;
	private JTextField sizeField;
	private JTextField element1;
	private JTextField displaybox;
	private int cq[];
	private int size;
	private int r=-1;
	private int f=0;
	private int count=0;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CircularQueue frame = new CircularQueue();
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
	public CircularQueue() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 738, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(245, 255, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel CQDS = new JLabel("Circular Queue DataStructure");
		CQDS.setForeground(new Color(255, 0, 255));
		CQDS.setFont(new Font("Algerian", Font.BOLD, 14));
		CQDS.setBounds(262, 11, 245, 19);
		contentPane.add(CQDS);
		
		JLabel EACQS = new JLabel("Enter An Circular Queue Size :");
		EACQS.setForeground(new Color(30, 144, 255));
		EACQS.setFont(new Font("Verdana", Font.BOLD, 12));
		EACQS.setBounds(85, 54, 200, 16);
		contentPane.add(EACQS);
		
		sizeField = new JTextField();
		sizeField.setBounds(295, 53, 187, 20);
		contentPane.add(sizeField);
		sizeField.setColumns(10);
		
		JLabel EAE = new JLabel("Enter An Element :");
		EAE.setForeground(new Color(30, 144, 255));
		EAE.setFont(new Font("Verdana", Font.BOLD, 12));
		EAE.setBounds(163, 97, 122, 16);
		contentPane.add(EAE);
		
		element1 = new JTextField();
		element1.setBounds(295, 96, 187, 20);
		contentPane.add(element1);
		element1.setColumns(10);
		
		JButton insert = new JButton("Insert");
		insert.setBackground(new Color(211, 211, 211));
		insert.setForeground(new Color(0, 0, 255));
		insert.setFont(new Font("Verdana", Font.BOLD, 12));
		insert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int elem;
				if(count==size){
					JOptionPane.showMessageDialog(contentPane, "Insertion is not possible");
				}
				else {
					elem=Integer.valueOf(element1.getText());
					r=(r+1)%size;
					++count;
					cq[r]=elem;
					}
				element1.setText("");
			}
		});
		insert.setBounds(527, 94, 89, 23);
		contentPane.add(insert);
		
		JButton create = new JButton("Create CircularQueue");
		create.setBackground(new Color(211, 211, 211));
		create.setForeground(new Color(0, 0, 255));
		create.setFont(new Font("Verdana", Font.BOLD, 12));
		create.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n;
				n=Integer.valueOf(sizeField.getText());
			     cq=new int[n];
			     size=cq.length;
			     sizeField.setText("");
				
			}
		});
		create.setBounds(517, 50, 175, 25);
		contentPane.add(create);
		
		JButton delete = new JButton("Delete");
		delete.setBackground(new Color(211, 211, 211));
		delete.setForeground(new Color(0, 0, 255));
		delete.setFont(new Font("Verdana", Font.BOLD, 12));
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(count==0) {
					JOptionPane.showMessageDialog(contentPane, "Delete is not possible");
				}
				else{
					String message="Deleted element is"+cq[f];
					JOptionPane.showMessageDialog(contentPane, message);
					f=(f+1)%size;
				     count--;
				}
			}
		});
		delete.setBounds(333, 127, 89, 23);
		contentPane.add(delete);
		
		JButton display = new JButton("Display");
		display.setBackground(new Color(211, 211, 211));
		display.setForeground(new Color(0, 0, 255));
		display.setFont(new Font("Verdana", Font.BOLD, 12));
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int f1=f;
				String msg="";
				if(count==0) {
					JOptionPane.showMessageDialog(contentPane, "Display is not possible");
				}
				else {
					for(int i=1;i<=count;i++) {
						msg=msg+" "+cq[f1];
						f1=(f1+1)%size;
					}
					displaybox.setText(msg);
				}
			}
		});
		display.setBounds(333, 161, 89, 23);
		contentPane.add(display);
		
		displaybox = new JTextField();
		displaybox.setBounds(216, 200, 346, 20);
		contentPane.add(displaybox);
		displaybox.setColumns(10);
	}

}
