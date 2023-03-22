class Pyramid4{
   public static void main(String args[]){
	   
        for(int i = 1; i<=9 ; i++){
	   
        for(int k=9 ; k>=i ; k--){
	       System.out.print(" ");
		}	   
	    for(int j = 1 ; j<=i ; j++)
	  {
	    System.out.print(j+ " ") ;
	  }
	  
	  int m=1 ;
	  for(int j=2 ;j<=i ;j++){
		  System.out.print((m - (j-i)));
		   System.out.print(" ");
	  }
	  m++;
	  System.out.println();
	}
      
   }


}