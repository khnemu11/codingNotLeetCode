import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
		
		int a= Integer.valueOf(br.readLine());
		int b = Integer.valueOf(br.readLine());
		
		bw.write(String.valueOf(a+b));
		bw.flush();
		bw.close();
		br.close();
	}
}
