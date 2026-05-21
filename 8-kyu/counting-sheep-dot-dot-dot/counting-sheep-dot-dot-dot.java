public class Counter {
    public static int countSheeps(Boolean[] arrayOfSheeps) {
      int sum = 0;
      for (Boolean i : arrayOfSheeps){
        if(i != null && i){
          sum +=1;
        }
          
}
        
        return sum;
    }
}