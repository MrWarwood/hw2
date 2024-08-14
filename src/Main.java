public class Main {
    public static void main(String[] args) {
        System.out.println("Привет мир, проверь домашку!");


        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);
        var friend = 19;
        System.out.println("friend = " + friend);
        friend = friend + 2;
        System.out.println("friend = " + friend);
        friend = friend / 7;
        System.out.println("friend = " + friend);
        var frog = 3.5;
        System.out.println("frog = " + frog);
        frog = frog * 10;
        System.out.println("frog = " + frog);
        frog = frog / 3.5;
        System.out.println("frog = " + frog);
        frog = frog + 4;
        System.out.println("frog = " + frog);
        var boxerOne = 78.2;
        var boxerTwo = 83.7;
        var totalWeightBoxers = boxerOne + boxerTwo;
        var weightDifference = boxerTwo - boxerOne;
       System.out.println("Weight one boxer = " + boxerOne + "кг");
       System.out.println("Weight two boxer = " + boxerTwo + "кг");
       System.out.println("Total weight boxers = " + totalWeightBoxers + "кг");
       System.out.println("Weight difference boxers = " + weightDifference + "кг");
       var weightDifference2 = boxerTwo % boxerOne;
       System.out.println("Или узнаем разницу вот так = " + weightDifference2 + "кг");
       var totalHours = 640;
       var workForOnePerson = 8;
       var totalNumberOfEmployees = totalHours / workForOnePerson;
       System.out.println("Всего часов отработанно - " + totalHours + " ч.");
       System.out.println("Работы на одного сотрудника - " + workForOnePerson + " ч.");
       System.out.println("Всего работников в компании — " + totalNumberOfEmployees + " человек.");
       var employeesHaveBeenAdded94 = totalNumberOfEmployees + 94;
       var totalHours2 = employeesHaveBeenAdded94 * workForOnePerson;
       System.out.println("Если в компании работает " + employeesHaveBeenAdded94 + " человек, то всего "
               + totalHours2 + " часов работы может быть поделено между сотрудниками . ");



    }
}