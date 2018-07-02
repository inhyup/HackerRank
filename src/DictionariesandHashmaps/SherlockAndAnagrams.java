package DictionariesandHashmaps;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


public class SherlockAndAnagrams {
    // Complete the sherlockAndAnagrams function below.
	static boolean isAnagram(String s1, String s2) {
		int ch1[] = new int[26];
		int ch2[] = new int[26];
		
		for (int i = 0; i < s1.length(); i++) {
			ch1[s1.charAt(i)-97]++;
		}
		for (int i = 0; i < s2.length(); i++) {
			ch2[s2.charAt(i)-97]++;
		}
		
		for (int i = 0; i < 26; i++) {
			if (ch1[i] != ch2[i]) {
				return false;
			}
		}
		return true;
 	}
	
	
    static int sherlockAndAnagrams(String s) {
        int n = s.length();
        
        List<String> l = new ArrayList<String>();
        
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<=n;j++)
            {
               String str=s.substring(i,j);
                l.add(str);
            }
        }
        
        int count = 0;
        for (int i = 0; i < l.size(); i++) {
        	for (int j = 0; j < l.size(); j++) {
        		if (i == j) {
        			continue;
        		} else if (l.get(i).length() != l.get(j).length()) {
        			continue;
        		} else {
        			if (isAnagram(l.get(i), l.get(j))) {
        				count++;
        			}
        		}
        	}
        }
        

    	return count/2;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
 //       BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            int result = sherlockAndAnagrams(s);

//            bufferedWriter.write(String.valueOf(result));
//            bufferedWriter.newLine();
        }

//        bufferedWriter.close();

        scanner.close();
    }
}
