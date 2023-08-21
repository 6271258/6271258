import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class DoublyLinkedList extends JFrame {

	private JPanel contentPane;
	private JTextField element;
	private JTextField element2;
	private JTextField displaybox;
	private Node first;
	class Node{
		int data;
		Node nextlink;
		Node prelink;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DoublyLinkedList frame = new DoublyLinkedList();
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
	public DoublyLinkedList() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 638, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 240, 245));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel DLLDS = new JLabel("Doubly Linked List DataStructure");
		DLLDS.setForeground(new Color(255, 51, 153));
		DLLDS.setFont(new Font("Algerian", Font.BOLD, 14));
		DLLDS.setBounds(208, 11, 266, 19);
		contentPane.add(DLLDS);
		
		JLabel ETE1 = new JLabel("Enter The Element :");
		ETE1.setForeground(new Color(30, 144, 255));
		ETE1.setFont(new Font("Verdana", Font.BOLD, 12));
		ETE1.setBounds(105, 63, 129, 16);
		contentPane.add(ETE1);
		
		JLabel ETE2 = new JLabel("Enter The Element :");
		ETE2.setForeground(new Color(30, 144, 255));
		ETE2.setFont(new Font("Verdana", Font.BOLD, 12));
		ETE2.setBounds(105, 101, 129, 16);
		contentPane.add(ETE2);
		
		JButton insert1 = new JButton("Insert Rear");
		insert1.setBackground(new Color(152, 251, 152));
		insert1.setForeground(new Color(199, 21, 133));
		insert1.setFont(new Font("Verdana", Font.BOLD, 12));
		insert1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Node temp;
				int elem =Integer.valueOf(element.getText());
				Node newnode = new Node();
				newnode.data=elem;
				newnode.prelink=null;
				newnode.nextlink=null;
				if(first==null) {
					first=newnode;
					JOptionPane.showMessageDialog(contentPane, "Insertion is not possbile");
					}
				else {
					temp=first;
					while(temp.nextlink!=null) {
						temp = temp.nextlink;
					}
					temp.nextlink=newnode;
					newnode.prelink=temp;
					}
				element.setText("");
			}
		});
		insert1.setBounds(434, 97, 107, 25);
		contentPane.add(insert1);
		
		JButton insert2 = new JButton("Insert Front");
		insert2.setBackground(new Color(152, 251, 152));
		insert2.setForeground(new Color(199, 21, 133));
		insert2.setFont(new Font("Verdana", Font.BOLD, 12));
		insert2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int elem=Integer.valueOf(element2.getText());
				Node newnode = new Node();
				newnode.nextlink=null;
				newnode.prelink=null;
				newnode.data=elem;
				if(first==null) {
					first=newnode;
					JOptionPane.showMessageDialog(contentPane, "Insertion is not possbile");
					}
				else {
					newnode.nextlink=first;
					first.prelink=newnode;
					first=newnode;
					element2.setText("");
				}
			}
		});
		insert2.setBounds(434, 59, 111, 25);
		contentPane.add(insert2);
		
		element = new JTextField();
		element.setBounds(244, 100, 159, 20);
		contentPane.add(element);
		element.setColumns(10);
		
		element2 = new JTextField();
		element2.setBounds(244, 62, 159, 20);
		contentPane.add(element2);
		element2.setColumns(10);
		
		JButton delete1 = new JButton("Delete Rear");
		delete1.setBackground(new Color(152, 251, 152));
		delete1.setForeground(new Color(199, 21, 133));
		delete1.setFont(new Font("Verdana", Font.BOLD, 12));
		delete1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Node temp;
				if(first==null) {
					JOptionPane.showMessageDialog(contentPane, "Deletion is not possible");
				}
				else if(first.nextlink==null) {
					String message = "Deleted element is:"+first.data;
					JOptionPane.showMessageDialog(contentPane, message);
					first=null;
				}
				else {
					temp=first;
				while(temp.nextlink.nextlink!=null) {
					temp=temp.nextlink;
				}
				String message="Deleted element is:"+temp.nextlink.data;
				JOptionPane.showMessageDialog(contentPane, message);
				temp.nextlink=null;
				}
			}
		});
		delete1.setBounds(258, 133, 111, 25);
		contentPane.add(delete1);
		
		JButton delete2 = new JButton("Delete Front");
		delete2.setBackground(new Color(152, 251, 152));
		delete2.setForeground(new Color(199, 21, 133));
		delete2.setFont(new Font("Verdana", Font.BOLD, 12));
		delete2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(first==null) {
				JOptionPane.showMessageDialog(contentPane,"Deletion is not possible");
				}
				else if(first.nextlink==null) {
					String message="Deleted element is:"+first.data;
					JOptionPane.showMessageDialog(contentPane, message);
					first=null;
				}
				else {
					first=first.nextlink;
					String message="Deleted element is:"+first.nextlink.data;
					JOptionPane.showMessageDialog(contentPane, message);
					first.prelink=null;
				}
			}
		});
		delete2.setBounds(258, 167, 115, 25);
		contentPane.add(delete2);
		
		JButton display1 = new JButton("Display Froward");
		display1.setBackground(new Color(152, 251, 152));
		display1.setForeground(new Color(199, 21, 133));
		display1.setFont(new Font("Verdana", Font.BOLD, 12));
		display1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Node temp;
				String msg="";
				if(first==null) {
					JOptionPane.showMessageDialog(contentPane, "Display is not possible");
				}
				else if(first.nextlink==null) {
					JOptionPane.showMessageDialog(contentPane, first.data);
				}
				else {
					temp=first;
					while(temp!=null) {
						msg=msg+" "+temp.data;
						temp=temp.nextlink;
						}
					displaybox.setText(msg);
					}
				
				}
		});
		display1.setBounds(146, 199, 141, 25);
		contentPane.add(display1);
		
		displaybox = new JTextField();
		displaybox.setBounds(117, 235, 401, 20);
		contentPane.add(displaybox);
		displaybox.setColumns(10);
		
		JButton display2 = new JButton("Display Reverse");
		display2.setBackground(new Color(152, 251, 152));
		display2.setForeground(new Color(199, 21, 133));
		display2.setFont(new Font("Verdana", Font.BOLD, 12));
		display2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Node temp;
				String msg="";
				if(first==null) {
					JOptionPane.showMessageDialog(contentPane, "Display is not possible");
				}
				else if(first.nextlink==null) {
					JOptionPane.showMessageDialog(contentPane, first.data);
				}
				else {
					temp=first;
					while(temp.nextlink!=null) {
						temp=temp.nextlink;
					}
					while(temp!=null) {
						msg=msg+" "+temp.data;
						temp=temp.prelink;
					}
					displaybox.setText(msg);
				}
				}
		});
		display2.setBounds(344, 199, 139, 25);
		contentPane.add(display2);
	}

}
