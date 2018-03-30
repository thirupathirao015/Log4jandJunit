package junitsrc;

import java.util.StringTokenizer;

public class Rev {

	public static String reverseWord(String str){  
		  
		StringBuilder result=new StringBuilder();  
        StringTokenizer tokenizer=new StringTokenizer(str," ");  
  
        while(tokenizer.hasMoreTokens()){  
        StringBuilder sb=new StringBuilder();  
        sb.append(tokenizer.nextToken());  
        sb.reverse();  
  
        result.append(sb);  
        result.append(" ");  
        }  
        return result.toString().trim();  
    }
	
	public static void main(String[] args) {
		
		String s1=reverseWord("I am Ram");
		System.out.println(s1);
	}

}
