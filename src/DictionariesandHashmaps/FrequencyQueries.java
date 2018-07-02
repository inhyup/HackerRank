package DictionariesandHashmaps;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class FrequencyQueries {
    // Complete the solve function below.
    static int[] solve(int[][] queries) {
    	
    	Map<Integer, Integer> map = new HashMap<>();
    	List<Integer> list = new ArrayList<>();
    	List<Integer> temp = new ArrayList<>();
    	int n = 0;
    	for (int i = 0; i < queries.length; i++) {
    		if (queries[i][0] == 3) {
    			n++;
    		}
    	}
    	
    	
    	int[] ans = new int[n];
    	
    	
    	for (int i = 0; i < queries.length; i++) {
    		if (queries[i][0] == 1) {
    			map.put(i, queries[i][1]);
    		}
    		if (queries[i][0] == 2) {
    			map.remove(new Integer(queries[i][1]));
    		}
    		if (queries[i][0] == 3) {

    			if (xx == queries[i][1]) {
    				temp.add(0);
    			} else {
    				temp.add(1);
    			}
    		}
    	}
    	
    	for (int i = 0; i < n; i++) {
    		ans[i] = temp.get(i);
    	}
    	
    	return ans;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[][] queries = new int[q][2];

        for (int i = 0; i < q; i++) {
            String[] queriesRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 2; j++) {
                int queriesItem = Integer.parseInt(queriesRowItems[j]);
                queries[i][j] = queriesItem;
            }
        }

        int[] ans = solve(queries);

        for (int i = 0; i < ans.length; i++) {
        	scanner.nextInt(ans[i]);
//            bufferedWriter.write(String.valueOf(ans[i]));

            if (i != ans.length - 1) {
            	scanner.next("\n");
//                bufferedWriter.write("\n");
            }
        }
        scanner.nextLine();
//        bufferedWriter.newLine();

//        bufferedWriter.close();

        scanner.close();
    }
}
