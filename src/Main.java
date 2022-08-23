import javax.sound.midi.Soundbank;

public class Main {
    public static void main(String[] args) {

        //Банк и клиенты
        int clientOS =0;
        int clientDeviceYear=2021;
        boolean isClientOS = clientOS==0;
        if (isClientOS) {if (clientDeviceYear > 2015) {
            System.out.println(" Установите версию приложения для IOS по ссылке");
        }else
            System.out.println(" Установите облегченную " +
                        "версию приложения для IOS по ссылке");
        }else         if (clientDeviceYear>2015) {
            System.out.println(" Установите версию приложения для IOS по ссылке");
        } else
            System.out.print("Установите облегченную версию " +
                    "приложения для Android по ссылке");


        //високостный год
        int year=2021;
        boolean isLeapYear = ((year % 4 == 0) && (year % 100 > 0) || (year %400 ==0 ));
        if (isLeapYear ) {
            System.out.println(year + "год високостный");
        }    else
            System.out.println(year + "год не високостный");

        // дата доставки
        int deliveryDistance = 95;
        if (deliveryDistance>100) {
            System.out.println("вы живете слишком далеко, свяжитесь с банком");
        }
        if (deliveryDistance<=20) {
            System.out.println("карта будет доставлена в течении суток");
        }else if (deliveryDistance>20&&deliveryDistance<60) {
            System.out.println("карта будет доставлена в течении двух суток");
        } else System.out.println("карта будет доставлена в течении трех суток");


        //Время года
         int monthNumber = 12;
         if (monthNumber<1||monthNumber>=13) {
             System.out.println("месяц указан неверно:"+monthNumber);
         }
         switch (monthNumber) {
             case 1:
                 System.out.println(monthNumber + "зимний месяц");
                 break;
             case 2:
                 System.out.println(monthNumber + "зимний месяц");
                 break;
             case 3:
                 System.out.println(monthNumber + "весенний месяц");
                 break;
             case 4:
                 System.out.println(monthNumber + "весенний месяц");
                 break;
             case 5:
                 System.out.println(monthNumber + "весенний месяц");
                 break;
             case 6:
                 System.out.println(monthNumber + "летний месяц");
                 break;
             case 7:
                 System.out.println(monthNumber + "летний месяц");
                 break;
             case 8:
                 System.out.println(monthNumber + "летний месяц");
                 break;
             case 9:
                 System.out.println(monthNumber + "осенний месяц");
                 break;
             case 10:
                 System.out.println(monthNumber + "осенний месяц");
                 break;
             case 11:
                 System.out.println(monthNumber + "осенний месяц");
                 break;
             case 12:
                 System.out.println(monthNumber + "зимний месяц");

         }




    }
}