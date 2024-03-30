public class Util {

  boolean compute(int... args) {
    if (args.length == 1) {
      return false; 
    }
    if (args.length %2 == 0) {
      return false;
    }
    int sum = 0;
    for (int i : args) {
      if (i == 0) {
        throw new RuntimeException();
      }
      sum += i;
    }
    for (int i : args) {
      if (sum % i == 0) {
        return true;
      }
    }
    return false;
  }  // method compute
}  // class Computation