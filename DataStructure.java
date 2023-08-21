import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class DataStructure extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DataStructure frame = new DataStructure();
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
	public DataStructure() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 603, 341);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(245, 245, 245));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel CADS = new JLabel("Choose An Datastructure");
		CADS.setForeground(new Color(255, 51, 153));
		CADS.setFont(new Font("Algerian", Font.BOLD, 14));
		CADS.setBounds(205, 11, 203, 21);
		contentPane.add(CADS);
		
		JButton array = new JButton("Array");
		array.setForeground(new Color(0, 102, 204));
		array.setBackground(new Color(102, 255, 153));
		array.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Array().setVisible(true);
			}
		});
		array.setFont(new Font("Verdana", Font.BOLD, 14));
		array.setBounds(269, 57, 89, 23);
		contentPane.add(array);
		
		JButton stack = new JButton("Stack");
		stack.setForeground(new Color(0, 102, 255));
		stack.setBackground(new Color(102, 255, 153));
		stack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Stack().setVisible(true);
			}
		});
		stack.setFont(new Font("Verdana", Font.BOLD, 14));
		stack.setBounds(269, 144, 89, 23);
		contentPane.add(stack);
		
		JButton Queue = new JButton("Queue");
		Queue.setForeground(new Color(0, 102, 255));
		Queue.setBackground(new Color(102, 255, 153));
		Queue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Queue().setVisible(true);
			}
		});
		Queue.setFont(new Font("Verdana", Font.BOLD, 14));
		Queue.setBounds(113, 104, 89, 23);
		contentPane.add(Queue);
		
		JButton CQ = new JButton("Circular Queue");
		CQ.setForeground(new Color(0, 102, 255));
		CQ.setBackground(new Color(102, 255, 153));
		CQ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new CircularQueue().setVisible(true);
			}
		});
		CQ.setFont(new Font("Verdana", Font.BOLD, 14));
		CQ.setBounds(401, 102, 147, 27);
		contentPane.add(CQ);
		
		JButton SLL = new JButton("Singly Linked List");
		SLL.setForeground(new Color(0, 102, 255));
		SLL.setBackground(new Color(102, 255, 153));
		SLL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new SinglyLinkedList().setVisible(true);
			}
		});
		SLL.setFont(new Font("Verdana", Font.BOLD, 14));
		SLL.setBounds(75, 206, 167, 27);
		contentPane.add(SLL);
		
		JButton DLL = new JButton("Doubly Linked List");
		DLL.setForeground(new Color(0, 102, 255));
		DLL.setBackground(new Color(102, 255, 153));
		DLL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new DoublyLinkedList().setVisible(true);
			}
		});
		DLL.setFont(new Font("Verdana", Font.BOLD, 14));
		DLL.setBounds(385, 206, 175, 27);
		contentPane.add(DLL);
	}
}
