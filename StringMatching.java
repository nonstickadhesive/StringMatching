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
        for(int i = 0; i <= len - sublen; i++) {
            if(substring.equals(str.substring(i, i+sublen))) {
                count++;
            }
        }

        pw.println(count);
        pw.close();
    }
}
