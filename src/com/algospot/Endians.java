import java.util.Scanner;

public class Endians {

	public static void main(String[] args) {

		int n;
		Scanner scanner;
		
		scanner = new Scanner(System.in);
		n = scanner.nextInt();
		
		if (n < 1 || n > 10000) {
			scanner.close();
			return;
		}
		
		while (n-- > 0) {
			int head;
			int tail;
			long num;
			long converted;
			
			num = scanner.nextLong();
			char[] chars = String.format("%08X", num).toCharArray();			
	
			head = 0;
			tail = chars.length - 1;
			reverse(chars, head, tail);
			
			for (int i = 0; i < chars.length; i+=2) {
				reverse(chars, i, i+1);
			}

			converted = Long.parseLong(new String(chars), 16);
			
			System.out.println(converted);
		}
		
		scanner.close();
	}
	
	private static void reverse(char[] chars, int head, int tail) {

		while (tail > head) {
			char c;
		
			c = chars[head];
			chars[head] = chars[tail];
			chars[tail] = c;
			
			head++;
			tail--;
		}
		
		return;
	}
}
