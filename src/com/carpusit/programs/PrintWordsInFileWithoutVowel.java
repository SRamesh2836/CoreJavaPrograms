package com.carpusit.programs;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class PrintWordsInFileWithoutVowel {
	
	 static String checkVowelString(String str){
		 char ch [] = str.toCharArray();
		 int count = 0;
		 for(int i = 0;i<ch.length;i++){
			 if(ch[i] == 'a' || ch[i] == 'e' ||ch[i] == 'i' ||ch[i] == 'o' ||ch[i] == 'u')
				 count++;
		 }
		 if(count>0)
			 return null;
		 else
			 return str;
	}
	
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("d:/test.txt");
		BufferedReader br = new BufferedReader(fr);
		String line = "", str = "";

		while((line = br.readLine())!=null){
			str = line;
			StringTokenizer st = new StringTokenizer(str);
			while(st.hasMoreElements()){
				String s = checkVowelString(st.nextToken());
				if(s!=null){
					System.out.println(s);
				}
			}
		}
	}

}
