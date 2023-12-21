package CodeTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.valueOf(br.readLine());
		for (int i =1; i<=n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int one = Integer.valueOf(st.nextToken());
			int two = Integer.valueOf(st.nextToken());
			bw.write("case #"+i+": "+String.valueOf(one+two)+"\n");
		}
		bw.flush();
	}
}
