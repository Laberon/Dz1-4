public class Main {
    public static void main(String[] args) {

        {System.out.println("Задание 1");}
        int i=1;
        while (i<=10){
            System.out.print(" "+i);
            i++;
        }
        System.out.println();
        for(i=10;i>=1;i--){
            System.out.print(" "+i);
        }
        System.out.println();

        {System.out.println("Задание 2");}
        int friday=7;
        for (friday=7;friday<31;friday++){
            if(friday%7==0){
            System.out.println("Сегодня пятница, "+friday+"-е число. Необходимо подготовить отчет.");
        }}

        {System.out.println("Задание 3");}
        int nowYear=2022;
        int cometFly=nowYear-200;
        int year=0;
        do {
            if(year>=cometFly&&year<=nowYear){
                System.out.println(year);
            }
            year+=79;
        }
        while (year<=nowYear);
            System.out.println(year);

        /* подсмотрел у других
        int currentYear = 2022;
        int period = 79;
        for (int c = 0; c < currentYear + period; c += period) {
            if (c > currentYear - 200) {
                System.out.println(c);
            }
        }
        */
    }
}