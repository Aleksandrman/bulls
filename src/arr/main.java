package arr;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class main extends JFrame{
	private static JPanel panel;
	JButton b0, b1, b2, b3, b4, b5, b6, b7 ,b8 ,b9 ,Enter;
	ActionButton ab = new ActionButton();
	
	public main(){
		panel = new JPanel();
		ActionButton ab = new ActionButton();
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setSize(510,247);
		setLocationRelativeTo(null);
		setResizable(false);
		setTitle("bulls and cows");
		
		panel.setLayout(new FlowLayout());
		b0 = new JButton("0");
		b1 = new JButton("1");
		 b2 = new JButton("2");
		 b3 = new JButton("3");
		 b4 = new JButton("4");
		 b5 = new JButton("5");
		 b6 = new JButton("6");
		 b7 = new JButton("7");
		 b8 = new JButton("8");
		 b9 = new JButton("9");
		Enter = new JButton("Enter");
	
		panel.add(b0);
		panel.add(b1);
		panel.add(b2);
		panel.add(b3);
		panel.add(b4);
		panel.add(b5);
		panel.add(b6);
		panel.add(b7);
		panel.add(b8);
		panel.add(b9);
		panel.add(Enter, BorderLayout.SOUTH);
		setContentPane(panel);
		setVisible(true);
		b0.addActionListener(ab);
		b1.addActionListener(ab);
		b2.addActionListener(ab);
		b3.addActionListener(ab);
		b4.addActionListener(ab);
		b5.addActionListener(ab);
		b6.addActionListener(ab);
		b7.addActionListener(ab);
		b8.addActionListener(ab);
		b9.addActionListener(ab);
		Enter.addActionListener(ab);
		
		System.out.println(ab.numus());
	}
	
	
	
	
	
	
	public static void main(String[] args) {
	
	new main();
	
	
	
		//check(num_win());
		}

	public static void check(int arr_w[]) {
		
		int[] arr_user = new int[4];
		int token = 0;
		while(token != 4) {
		
			for(int x = 0; x< 4; x++) {
				for(int y = 0; y< 4; y++) {
					if (arr_user[x] == arr_w[y]) {
						if(arr_user[y] == arr_w[y]) {
							System.out.println("бык "+ arr_w[y]);
							token++;
						}
						else System.out.println("корова "+ arr_w[y]);
					}
				}
				}
			if (token != 4) {
				token = 0;
			}
		}		
	}

	public static int rnd(int min, int max)
    {
            max -= min;
            return (int) (Math.random() * ++max) + min;
    }
	public static int[] num_win() {
		//создаем 4е неповторяющихся числа в массиве
		int[] arr = new int[4];
		
		
		int k = 0;
			for(int i = 0; i < 4; i++) {
			arr[i] = rnd(0,9);
			for(int j = 0; j < i; j++) {
				if(arr[j] == arr[i]) {
					i--;
					break;
				}
				}
				}
				return arr;
	}

	public static int[] num_user()

	{   
		System.out.println("Введите 4-х значное число");
		Scanner scn = new Scanner(System.in);
		String a = scn.nextLine();  
		int token = 0;
		int b = a.length();
		int[] num_user = new int[4];
			
		while(token == 0) {
					
			if (b != 4) {
				System.out.println("Введите 4-х значное число");
				a = scn.nextLine();
						}
			else{token = 1;}
		}
	
		for(int i = 0; i < 4; i++ ) {
	char ch = a.charAt(i); 	
	int int_ch = Character.getNumericValue(ch); 
		num_user[i] = int_ch;
		}				
			return num_user;
	}




class ActionButton implements ActionListener{
		int number;
		int[] num_user = new int[4];
	@Override
	public void actionPerformed(ActionEvent act) {
		
		for(int i = 0; i<4 ;i++) {
		
		if (act.getSource() == b0)
			number = 0; 
		if (act.getSource() == b1)
			number = 1; 
		if (act.getSource() == b2)
			number = 2; 
		if (act.getSource() == b3)
			number = 3; 
		if (act.getSource() == b4)
			number = 4; 
		if (act.getSource() == b5) 
			number = 5; 
					
		if (act.getSource() == b6)
			number = 6; 
		if (act.getSource() == b7)
			number = 7; 
		if (act.getSource() == b8)
			number = 8; 
		if (act.getSource() == b9)
			number = 9; 
		
		num_user[i] = number;
		}
	}

	public String numus() {
	String num_us = ""+number;
	return num_us;
	}
}
}