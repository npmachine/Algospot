import java.util.HashMap;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {

		int n;
		Scanner scanner;
		HashMap<String, String> uriMap;
		
		uriMap = new HashMap<String, String>();
		uriMap.put("%20", " ");
		uriMap.put("%21", "!");
		uriMap.put("%24", "$");
		uriMap.put("%25", "%");
		uriMap.put("%28", "(");
		uriMap.put("%29", ")");
		uriMap.put("%2a", "*");
		
		scanner = new Scanner(System.in);
		n = scanner.nextInt();
		
		while (n-- > 0) {
			String uri;
			StringBuilder sb;
			
			uri = scanner.next();
			
			if (uri == null || uri.length() < 1) {
				scanner.close();
				return;
			}
			
			sb = new StringBuilder();
			
			for (int i = 0; i < uri.length(); i++) {
				char c;
				String token;
				String converted = null;
				
				c = uri.charAt(i);
				
				if (c == '%') {
					token = uri.substring(i, i + 3);
					converted = uriMap.get(token);
				}
				
				if (converted == null) {
					sb.append(c);
				} else {
					i += 2;
					sb.append(converted);					
				}
			}
			
			System.out.println(sb.toString());
		}
		
		scanner.close();
	}
}
