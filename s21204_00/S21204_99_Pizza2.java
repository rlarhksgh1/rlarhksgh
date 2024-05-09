package s21204_00;
public class S21204_99_Pizza2 {
   
   int size;
   String type;
   public S21204_99_Pizza2() {
      size = 12;
      type ="슈퍼슈프림";
      
   }
   public S21204_99_Pizza2(int s, String t) {
      size = s;
      type = t;
      
      if( size >= 25) {
    	  size += 2;
    	  type += "+감자칩";
      }
   }
   public static void main(String[] args)  {
      S21204_99_Pizza2 obj1 = new S21204_99_Pizza2();
      System.out.println("sizel:"+ obj1.size + " type: "+obj1.type);
      
      S21204_99_Pizza2 obj2 = new S21204_99_Pizza2(25, "포테이도");
      System.out.println("size2:"+ obj2.size + " type: "+obj2.type);
      
      
   }
}
