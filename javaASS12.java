There are no posts awaiting moderation.
Reports
Posts ()
Members ()
Notebook
import java.util.*;
class Main{
	public static void main(String []args)
	{
        System.out.println(args);
		Main obj=new Main();
        //1----------------
		obj.first("hi hi hi hellow");
        //2-----------------
		String [] str1={"hi","hello","sowmi"};
		String [] str2={" hello","hi","sow"};
		obj.second(str1,str2);
        //3-----------------
         //first-----
		    obj.firstMethod("hello");
         //second----
		    obj.secondMethod("hello");
         //third-----
		    obj.thirdMethod("hello");
         //four------
		    obj.fourthMethod("hello");
         //five------
            obj.fifthMethod("hello");
         //sixth-----
            obj.sixthMethod("hello");
         //seventh----
             obj.seventhMethod("hello");
        //4------------------
         
            obj.palinDrome("civic");
            obj.palinDromeStringbuffer("civic");
            obj.palinDromeStringBuilder("civic");
        //5--------------
            
            obj.permutation("ABC","");
	}
//1----------------------------------------------------------------
 void first(String str){
    str=str.toLowerCase();
   int count=0;
   String str1;
 	String [] words=str.split(" ");
  Set<String> set= new HashSet<String>();
 	for(int i=0; i<words.length; i++){
        for(int j=1; j<words.length; j++){
        	if(words[i].equals(words[j]) && i!=j){
        	if(words[i]!="same")
                 set.add(words[i]);
                 count++;
                 words[i]="same";
                 words[j]="same";
        	}
        }
 	}
 	String result1 = String.join(" ",set);
    System.out.println("1.");
 	System.out.println("The dublicate word : "+result1);
 	System.out.println("Count of the duplicate words : "+count);
 	System.out.println(" ");
 }
//2----------------------------------------------------------------
 void second(String []str1,String[] str2){
 	String string1 = String.join(" ",str1);
 	String string2 = String.join(" ",str2);
 	String s = string1.concat(string2);
      s=s.toLowerCase();
 	System.out.println(s);
 	String str="";
   
 	String [] words=s.split(" ");
  Set<String> set1= new HashSet<String>();
 	for(int i=0; i<words.length; i++){
        for(int j=1; j<words.length; j++){
        	   set1.add(words[i]);
        	if(words[i].equals(words[j]) && i!=j){
                if(words[i]!="same")
                set1.remove(words[i]);
                 words[i]="same";
                 words[j]="same";
        	}
        }
           
            set1.remove("same");
        
 	}
 	String result = String.join(" ",set1);
    System.out.println("2.");
 	System.out.println("Remove duplicate : "+result);
 	System.out.println(" ");
 }
 //3----------------------------------------------------------------
 //first---------------
 	void firstMethod(String s){
       
        System.out.println("3.");
         s=s.toLowerCase();
 		 char[] try1 = s.toCharArray();
         System.out.println("First Reversed String : ");
        for (int i = try1.length - 1; i >= 0; i--){
              System.out.print(try1[i]);
          }
          System.out.println(" ");
            System.out.println("");
    }
 //second--------------
    void secondMethod(String s1){
         s1=s1.toLowerCase();
    	String [] str3=s1.split("");
 		 String[] try2 = new String[s1.length()];
         System.out.println("Second Reversed String : ");
        for (int i=0; i<str3.length; i++){
               
               try2[i]=str3[str3.length-i-1];
          }
          String result = String.join("",try2);
          System.out.println(result);
            System.out.println("");
    }
    //third----------------
    void thirdMethod(String s2){
         s2=s2.toLowerCase();
    	 System.out.println("Third Reversed Method in StringBuffer : ");
    	StringBuffer str = new StringBuffer(s2);
    	// str.append(s2);
        str.reverse();
        System.out.println(str);
        
          System.out.println("");
    }
    //Fourth-----------------
    void fourthMethod(String s){
         s=s.toLowerCase();
 System.out.println("Fourth Reversed Method in StringBuilder : ");
    	StringBuilder str = new StringBuilder(s);
        str.reverse();
        System.out.println(str);
          System.out.println("");
    }
    //Fifth----------------
 void fifthMethod(String st){
     st=st.toLowerCase();
      String string = "";
    System.out.println("Fifth Reversed String : ");
        
    for (int i = 0; i < st.length(); i++) {
      string = st.charAt(i) + string;
    }
    
    System.out.println(string);
     System.out.println("");
}
  //Sixth--------------
  void sixthMethod(String s){
        
         s=s.toLowerCase();
         byte[] bytes = s.getBytes();
 
        for (int l = 0;  l < s.length() - 1; l++)
        {
            byte temp = bytes[l];
            bytes[l] = bytes[s.length() - 1-l];
            bytes[s.length() - 1-l] = temp;
        }
 
         System.out.println("Sixth Reversed String : ");
        System.out.println(new String(bytes));
          System.out.println("");
  }
  //Seven-------------------
  void seventhMethod(String s){
     int n=s.length();    
     System.out.println("Seventh Reversed String : ");
     while(n >0)
     {
        System.out.print(s.charAt(n -1)); 
           n--;
     }
       System.out.println("");
       System.out.println("");
   }
//4----------------------------------------------------------------
   //String------
    void palinDrome(String s){
         System.out.println("4.");
        s=s.toLowerCase();
    String string = "";
    System.out.println("Palindrome : ");
        
    for (int i = 0; i < s.length(); i++) {
      string = s.charAt(i) + string;
    }
    
    if(s.equals(string)){
       System.out.println("It is palindrome");
    }
    else{
       System.out.println("It is not palindrome");
    }
                System.out.println("");
    }
   //StringBuffer--------
     void palinDromeStringbuffer(String s2){
         s2=s2.toLowerCase();
         System.out.println("palindrome in StringBuffer : ");
        StringBuffer str = new StringBuffer(s2);
        str.reverse();
    if(s2.equals(str.toString())){
       System.out.println("It is palindrome");
    }
    else{
       System.out.println("It is not palindrome");
    }
         System.out.println("");
    }
   //StringBuilder--------
     void palinDromeStringBuilder(String s2){
         s2=s2.toLowerCase();
        System.out.println("palindrome in StringBuilder : ");
        StringBuilder str = new StringBuilder(s2);
        str.reverse();
    if(s2.equals(str.toString())){
       System.out.println("It is palindrome");
    }
    else{
       System.out.println("It is not palindrome");
    }
        
         System.out.println("");
    }
//5------------------------------------------
            void permutation(String str, String empty)
    {
 
        
        if (str.length() == 0) {
            System.out.println(empty + " ");
            return;
        }
 
        for (int i = 0; i < str.length(); i++) {
 
           
            char a = str.charAt(i);
 
            String s1 = str.substring(0, i) +
                        str.substring(i + 1);
 
            
            permutation(s1, empty + a);
        }
    }
  }