package org.example;

/*
    Есть 3 вида резюме:
    Резюме содержащее только фамилию, имя, отчество
    Резюме содержащее фамилию, имя, отчество, возраст, профессию
    Резюме содержащее е фамилию, имя, отчество, возраст, профессию и опыт работы в годах.
    Реализуйте функцию getResume(), принимающую все 3 вида резюме и выводящую в консоль резюме целиком.

 */
public class Resume {
    public static void main(String[] args) {
        getResume("Иванов", "Иван", "Иванович");
        getResume("Масляков", "Георгий", "Александрович", 24, "Тракторист");
        getResume("Киркорова", "Елена", "Максимовна", 50, "Фрилансер", 30);
    }

    public static void getResume(String lastName, String firstName, String patronymic) {
        System.out.println(resumeToString(lastName, firstName, patronymic, null, null, null));
    }

    public static void getResume(String lastName, String firstName, String patronymic, Integer age, String profession) {
        System.out.println(resumeToString(lastName, firstName, patronymic, age, profession, null));
    }

    public static void getResume(
            String lastName,
            String firstName,
            String patronymic,
            Integer age,
            String profession,
            Integer experience) {
        System.out.println(resumeToString(lastName, firstName, patronymic, age, profession, experience));
    }

    private static String resumeToString(
            String lastName,
            String firstName,
            String patronymic,
            Integer age,
            String profession,
            Integer experience) {
        return "Фамилия: " + lastName +
                "\nИмя: " + firstName +
                "\nОтчество: " + patronymic +
                "\nВозраст: " + age +
                "\nПрофессия: " + profession +
                "\nОпыт работы: " + experience + "\n";
    }


}
