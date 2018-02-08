package arr;

import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class main extends JFrame{
	public main(){
		setTitle("Быки и коровы");
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setSize(300, 300);
		setVisible(true);
	}
	

	public static void main(String[] args) {
		main m = new main();
		int[] arr_w = new int[4];
		int[] arr_user = new int[4];
		int token = 0;
		arr_w = num_win();
		check(arr_w);
		System.out.println("Ура победа!");
	
	}
	public static void check(int arr_w[])
	{
		int[] arr_user = new int[4];
		int token = 0;
		while(token != 4) {
			arr_user = num_user();
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
    {//создаем раномное число в заданном диапозоне
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
		System.out.println("Введите число");
		Scanner scn = new Scanner(System.in);
		String a = scn.nextLine(); //считываем строку 
		int token = 0;
		int b = a.length();// узнаем длину строки
		int[] num_user = new int[4];
		while(token == 0) {
					//проверяем строку на количество введенных знаков	
			if (b != 4) {
				System.out.println("Введите 4х значное число");
				a = scn.nextLine();
				b = a.length();
						}
			else{token = 1;}
		}
	//Переводим строковую переменную в массив
		for(int i = 0; i < 4; i++ ) {
	char ch = a.charAt(i); //вычисляем каждый отдельный символ		
	int int_ch = Character.getNumericValue(ch); // переводим символ в инт
		num_user[i] = int_ch;
		}
					return num_user;
	}

}
