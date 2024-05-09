package s21204_00;
public class S21204_99_Pizza {
   
   int size;
   String type;
   public S21204_99_Pizza() {
      size = 12;
      type ="슈퍼슈프림";
   }
   public S21204_99_Pizza(int s, String t) {
      size = s;
      type = t;
   }
   public static void main(String[] args)  {
      S21204_99_Pizza obj1 = new S21204_99_Pizza();
      System.out.println("sizel:"+ obj1.size + " type: "+obj1.type);
      
      S21204_99_Pizza obj2 = new S21204_99_Pizza(21, "포테이도");
      System.out.println("size2:"+ obj2.size + " type: "+obj2.type);
      
      
   }
}
