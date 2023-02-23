package unit;

import price.IOService;

import java.util.List;

public class IOServiceSpy implements IOService {
    private final List<String> actualFlow;
    private int inputCall = 1;

    public IOServiceSpy(List<String> actualFlow) {
        this.actualFlow = actualFlow;
    }
   @Override
   public void outputString(String message){
       actualFlow.add(message);
   }
   @Override
   public String[] inputStringMassive(){
        String str;
        //actualFlow.add("inputStringMassive вызван " +
        //       (inputCall==1 ? "впервые" : "второй раз"));
       switch (inputCall) {
           case (1):
               actualFlow.add("inputStringMassive вызван впервые");
               break;
           case (2):
               actualFlow.add("inputStringMassive вызван второй раз");
               break;
           case (3):
               actualFlow.add("inputStringMassive вызван третий раз");
               break;
           case (4):
               actualFlow.add("inputStringMassive вызван четвертый раз");
               break;
           case (5):
               actualFlow.add("inputStringMassive вызван пятый раз");
               break;
           case (6):
               actualFlow.add("inputStringMassive вызван шестой раз");
               break;
       }

       // Если вызывали метод чтения строки первый раз, то считаем, что ожидается n
       if (inputCall==1) {
           inputCall = 2;
           str = "6 rub";
           return str.split(" ");
       } else if (inputCall==2) {
           inputCall = 3;
           str = "kasjfg rub";
           return str.split(" ");
       } else if (inputCall==3) {
           inputCall = 4;
           str = "-1 rub";
           return str.split(" ");
       } else if (inputCall==4) {
           inputCall = 5;
           str = "376285765948679258 rub";
           return str.split(" ");
       } else if (inputCall==5) {
           inputCall = 6;
           str = "3762 sgfj";
           return str.split(" ");
       }
       // иначе, команда "exit"
       str = "exit";
       return str.split(" ");
   }

}
