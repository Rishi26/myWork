package creationalPatterns;

public class MySingleton
{
   private static final MySingleton INSTANCE=new MySingleton();
   
   private MySingleton(){}
   
   public static MySingleton getInstance(){
      return INSTANCE;
   }
}
