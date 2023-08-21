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

public class SinglyLinkedList extends JFrame {

	private JPanel contentPane;
	private JTextField element;
	private JTextField element2;
	private JTextField displaybox;
	private Node first;
	class Node{
		int data;
		Node link;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SinglyLinkedList frame = new SinglyLinkedList();
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
	public SinglyLinkedList() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 571, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(152, 251, 152));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel SLLDS = new JLabel("Singly Linked List DataStructure");
		SLLDS.setForeground(new Color(0, 128, 128));
		SLLDS.setFont(new Font("Algerian", Font.BOLD, 14));
		SLLDS.setBounds(149, 7, 261, 19);
		contentPane.add(SLLDS);
		
		JLabel ETE1 = new JLabel("Enter The Element :");
		ETE1.setForeground(new Color(139, 0, 139));
		ETE1.setFont(new Font("Verdana", Font.BOLD, 12));
		ETE1.setBounds(49, 40, 129, 16);
		contentPane.add(ETE1);
		
		JLabel ETE2 = new JLabel("Enter The Element :");
		ETE2.setForeground(new Color(139, 0, 139));
		ETE2.setFont(new Font("Verdana", Font.BOLD, 12));
		ETE2.setBounds(49, 73, 129, 16);
		contentPane.add(ETE2);
		
		element = new JTextField();
		element.setBounds(188, 39, 167, 20);
		contentPane.add(element);
		element.setColumns(10);
		
		element2 = new JTextField();
		element2.setBounds(188, 71, 167, 20);
		contentPane.add(element2);
		element2.setColumns(10);
		
		JButton insert1 = new JButton("Insert Rear");
		insert1.setBackground(new Color(189, 183, 107));
		insert1.setForeground(new Color(139, 0, 0));
		insert1.setFont(new Font("Verdana", Font.BOLD, 12));
		insert1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Node temp;
				int elem=Integer.valueOf(element.getText());
				Node newnode=new Node();
				newnode.data=elem;
				newnode.link=null;
				if(first==null){
					first=newnode;
					JOptionPane.showMessageDialog(contentPane, "Insertion is not possible");
					
				}
				else {
					temp=first;
					while(temp.link!=null) {
						temp=temp.link;
					}
					temp.link=newnode;
					element.setText("");
				}
			}
		});
		insert1.setBounds(386, 37, 107, 25);
		contentPane.add(insert1);
		
		JButton insert2 = new JButton("Insert Front");
		insert2.setBackground(new Color(189, 183, 107));
		insert2.setForeground(new Color(139, 0, 0));
		insert2.setFont(new Font("Verdana", Font.BOLD, 12));
		insert2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int elem =Integer.valueOf(element2.getText());
				Node newnode = new Node();
				newnode.data=elem;
				newnode.link=null;
				if(first==null) {
					JOptionPane.showMessageDialog(contentPane, "Insertion is not Possible");
				}
				else {
					newnode.link=first;
					first=newnode;
					element2.setText("");
				}
			}
		});
		insert2.setBounds(386, 69, 111, 25);
		contentPane.add(insert2);
		
		JButton delete1 = new JButton("Delete Rear");
		delete1.setBackground(new Color(189, 183, 107));
		delete1.setForeground(new Color(139, 0, 0));
		delete1.setFont(new Font("Verdana", Font.BOLD, 12));
		delete1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Node temp;
				if(first==null) {
					JOptionPane.showMessageDialog(contentPane, "Deletion is not possible");
					}
				else if(first.link==null) {
					String message="Element deleted is:"+first.data;
					JOptionPane.showMessageDialog(contentPane,message);
				}
				else {
					temp=first;
					while(temp.link.link!=null) {
						temp=temp.link;
					}
					String message="Element is deleted:"+temp.link.data;
					JOptionPane.showMessageDialog(contentPane, message);
					temp.link=null;
				}
			}
		});
		delete1.setBounds(227, 117, 111, 25);
		contentPane.add(delete1);
		
		JButton delete2 = new JButton("Delete Front");
		delete2.setBackground(new Color(189, 183, 107));
		delete2.setForeground(new Color(139, 0, 0));
		delete2.setFont(new Font("Verdana", Font.BOLD, 12));
		delete2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(first==null) {
					JOptionPane.showMessageDialog(contentPane,"Deletion is not possible");
				}
				else if(first.link==null) {
					String message="Element deleted is:"+first.data;
					JOptionPane.showMessageDialog(contentPane, message);
				}
				else {
					String message="Element is deleted"+first.data;
					JOptionPane.showMessageDialog(contentPane, message);
					first=first.link;
				}
			}
			
		});
		delete2.setBounds(227, 153, 115, 25);
		contentPane.add(delete2);
		
		JButton display = new JButton("Display");
		display.setBackground(new Color(189, 183, 107));
		display.setForeground(new Color(139, 0, 0));
		display.setFont(new Font("Verdana", Font.BOLD, 12));
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String msg="";
				Node temp;
				if(first==null) {
					JOptionPane.showMessageDialog(contentPane, "Display is not possible");
				}
				else if(first.link==null) {
					JOptionPane.showMessageDialog(contentPane, first.data);
				}
				else {
					temp=first;
					while(temp!=null) {
						msg=temp.data+" ";
						temp=temp.link;
					}
					displaybox.setText(msg);
					}
				
			}
			
		});
		display.setBounds(237, 186, 89, 23);
		contentPane.add(display);
		
		displaybox = new JTextField();
		displaybox.setBounds(126, 220, 308, 20);
		contentPane.add(displaybox);
		displaybox.setColumns(10);
	}
}
