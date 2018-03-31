package lambda;

	interface Drawable{  
	    public int draw();  
	}  
	  

public class Noargument {

	public static void main(String[] args) {

        int width=10;  
          
       /* Drawable d2=new Drawable(){
        	public void draw(){
            System.out.println("Drawing "+width); 
        	}
        }; */
        //with lambda  
        /*Drawable d2=()->{  
            return width;  
        };  */
        Drawable d2=()->width;  
       
       // System.out.println(d2.draw());  
        int a=d2.draw();
        System.out.println(a);
    }  
	
}
