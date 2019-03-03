package ru.mail.polis.open.task1;

public class SolutionTaradaev implements FizzBuzz {
  @Override
  public void print(int from, int to) {
    String FIZZ = "FIZZ";
    String BUZZ = "BUZZ";
//решение

    for (int i = from; i < to + 1; i++) {

      String Results = "";
      if (i % 3 == 0 && i != 0) Results = BUZZ;
      if (i % 5 == 0 && i != 0) Results += FIZZ;
      if (Results.equals("")) {
        System.out.println(i);
      } else System.out.println(Results);

    }

  }
}
