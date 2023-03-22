class Stat{
  int i = 2 ;
  static int j =4 ;
  
  void non(){
      System.out.println(" ");
	  
	  //jar method non static asel tar tyat static 
	  System.out.println(" Static cha j ="+ Stat.j);
	  
	  //jar method non static aani tyat non static
	  System.out.println("Non static " + i);
	  
  }
  
  static void non1(){
      System.out.println(" ");
	  
	  //jar method non static asel tar tyat static 
	  System.out.println(" Static cha j ="+ j);
	  
	  Stat s2 = new Stat();
	  System.out.println(" non Static cha i ="+ s2.i);
	  //jar method non static aani tyat non static
	  System.out.println("Non static " + s2.i);
	  
  }
  
  public static void main(String args[]){
	  
    //1.jar method static asel tar tyat static variable aani static method Classname in call karaych
	System.out.println(" Static cha j ="+ Stat.j);
	
	//2.Jar method static aahe aani tyat non static variable call karaych ahe tr object banva
	Stat s1 = new Stat();
	System.out.println(" non Static cha i ="+ s1.i);
	s1.non() ;
	Stat s2 = new Stat();
	s2.non();
	//s2.i ;
	s2.non1();
  
  }

}