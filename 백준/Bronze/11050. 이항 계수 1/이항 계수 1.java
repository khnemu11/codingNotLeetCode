import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String arg[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.valueOf(st.nextToken());
		int k = Integer.valueOf(st.nextToken());
		
		int [][] arr = new int[n+1][k+1];
		boolean [][] visited = new boolean[n+1][k+1];
		
		int result = binomialCoef(arr,visited,n,k);
		
		bw.write(String.valueOf(result));
		bw.newLine();
		bw.flush();
		br.close();
		bw.close();
	}
	//이항정리 : n개중에 k개를 고르는 방법 개수는 n-1번째 고르기 횟수에서 k-1개를 고르고 n번째에서 1개를 고를 방법의 수와 
	//n-1번째 고르기 횟수에서 k개를 고르고 n번째에서 0개를 고를 방법의 수와 같다 -> top-bottom형태의 dp로 풀자
	public static int binomialCoef(int [][] arr,boolean[][] visited,int rest,int pick) {
		if(rest == 0 || pick==0) {
			visited[rest][pick] = true;
			
			if(pick==0) {
				return 1;
			}
			else {
				return 0;
			}
		}
		else if(!visited[rest][pick]) {
			arr[rest][pick]=binomialCoef(arr,visited,rest-1,pick)+binomialCoef(arr,visited,rest-1,pick-1);
		}
		
		visited[rest][pick] = true;
		
		return arr[rest][pick]; 
	}
}