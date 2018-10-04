package fr.sgcib.kata;

import java.util.stream.Stream;

public class Kata {
	public static void main(String[] args){

        Stream.Builder<String> builder = Stream.builder();
	    for(int i=1 ; i <= 100; i++){
	          builder.add(doKata(i));
	    }

        Stream<String> stm = builder.build();
        stm.forEach(System.out::println);
  }


  public static String doKata(int i){

	  	String strValue="" +i;
        String data="";
        boolean found=false;

  		if(i % 3 == 0){
  	        data = data +"Foo";
  	        found=true;
          }

          if(strValue.contains("3")){
             data = data +"Foo";
             found=true;
          }
          
          double rs = Double.valueOf(i) / 11l;
          if(rs == 3){
              data = data +"Foo";
              found=true;
           }

          if(i % 5 == 0){
             data= data +"Bar";
             found=true;
          }

          if(strValue.contains("5")){
             data= data +"Bar";
             found=true;
          }
          
          if((i / 11) == 5){
              data = data +"Bar";
              found=true;
           }

          if(strValue.contains("7")){
             data= data + "Qix";
             found=true;
          }
          if((i / 11) == 7){
              data = data +"Qix";
              found=true;
           }
          
          if(i > 10 && (i % 3) != 0 && (i % 5) != 0){
        	  if (Integer.valueOf(strValue.charAt(1)) < Integer.valueOf(strValue.charAt(0))){
        		  data="";
        		  found=false;
        		  if(strValue.contains("7")){
     	             data= data +"Qix";
     	             found=true;
        		  }
        		  if(strValue.contains("5")){
        	             data= data +"Bar";
        	             found=true;
        	       }
        		  
        		  if(strValue.contains("3")){
        	             data= data +"Foo";
        	             found=true;
        	       }
        	  }
          }
        	  

          if(!found){
             data= strValue;
          }

          return data;
    }
}
 
