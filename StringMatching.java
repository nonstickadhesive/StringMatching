package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class StringMatching {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        StringTokenizer st = new StringTokenizer(br.readLine());
        String str = st.nextToken();

        st = new StringTokenizer(br.readLine());
        String substring = st.nextToken();

        int len = str.length();
        int sublen = substring.length();


        int count = 0;
        for(int startIndex = 0; startIndex <= len - sublen; startIndex++) {
            boolean matches = true;
            for (int substringIndex = 0; substringIndex < sublen; substringIndex++) {
                if (!(str.charAt(startIndex + substringIndex) == substring.charAt(substringIndex))) {
                    matches = false;
                    break;
                }
            }

            if(matches) {
                count++;
            }
        }

        pw.println(count);
        pw.close();
    }
}
