package lambda;
	interface Addable{  
	    int add(int a,int b);  
	}  
	
public class MultipleParameters {

	public static void main(String[] args) {
		/*Addable ad1=(a,b)->
		{
			return a+b;
		};*/
		
		
		 Addable ad1=(a,b)->(a+b); 
			        System.out.println(ad1.add(10,20));  
		          
			        // Multiple parameters with data type in lambda expression  
			        Addable ad2=(int a,int b)->(a+b);  
			        System.out.println(ad2.add(100,200));  
			    }  
			}  
