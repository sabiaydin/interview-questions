package algorithmicQuestions;

public class Animal<T> {
  public  static <K> void getArray(K[] elements){
      for(K data : elements ){
          System.out.println(data);
      }
  }
}
