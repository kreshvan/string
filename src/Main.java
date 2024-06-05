public class Main {
    public static void main(String[] args) {
        //заданиее 1
        String firstName = "ivan";
        String lastName = "Ivanov";
        String middleName = "Ivanovich";
        String fullName = "Ф.И.О.";
        System.out.println(fullName + " " + "сотрудника" + " " + firstName + " " + middleName + " " + lastName);
        //задание 2
        String fullName1 = "Ivan Ivanovich Ivanov";
        String str = fullName1.toUpperCase();
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета —"+" " + str);
        //задание 3
        String fullName2 = "Иванов Семён Семёнович";
        String str1 = fullName2.replace("ё","е");
        System.out.println("Данные Ф. И. О. сотрудника —"+" "+str1);

    }
}