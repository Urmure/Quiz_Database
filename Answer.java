package com.example.quiz_database;

public class Answer {
    private int test_id;
    private int q_id;
    private int option;
    private String answer;
    boolean yes;

    private Answer(int test_id, int q_id, int option, String answer, boolean yes){
        this.test_id = test_id;
        this.q_id = q_id;
        this.option = option;
        this.answer = answer;
        this.yes = yes;
    }

    public static final Answer[] answers = {
            new Answer(1, 1, 1, "с развитием вычислительной техники", false),
            new Answer(1, 1, 2, "с развитием операционных систем", false),
            new Answer(1, 1, 3, "с повышением квалификации программистов", false),
            new Answer(1, 1, 4, "с расширением круга решаемых на ЭВМ задач", true),

            new Answer(1, 2, 1, "задачи с большим объемом сложных вычислений", false),
            new Answer(1, 2, 2, "задачи учета кадрового состава организации", true),
            new Answer(1, 2, 3, "задачи бухгалтерского учета", true),
            new Answer(1, 2, 4, "решение систем линейных уравнений", false),

            new Answer(1, 3, 1,"простая переменная", false),
            new Answer(1, 3, 2,"массив", false),
            new Answer(1, 3, 3,"запись", true),
            new Answer(1, 3, 4, "поле", true),

            new Answer(1, 4, 1,"простые переменные", true),
            new Answer(1, 4, 2,"элементы массива", true),
            new Answer(1, 4, 3,"файлы", true),
            new Answer(1, 4, 4, "поля", false),

            new Answer(1, 5, 1,"из простых переменных и полей", false),
            new Answer(1, 5, 2,"из элементов массива и переменных", false),
            new Answer(1, 5, 3,"из полей", true),
            new Answer(1, 5, 4, "из простых переменных", false),

            new Answer(1, 6, 1,"совокупность полей", false),
            new Answer(1, 6, 2,"совокупность логических записей", false),
            new Answer(1, 6, 3,"совокупность экземпляров логических записей", true),
            new Answer(1, 6, 4, "набор данных во внешней памяти ЭВМ", false),

            new Answer(1, 7, 1,"из полей", false),
            new Answer(1, 7, 2,"из элементов массива", false),
            new Answer(1, 7, 3,"из экземпляров логических записей", true),
            new Answer(1, 7, 4, "из переменных", false),

            new Answer(1, 8, 1,"экземпляр записи", false),
            new Answer(1, 8, 2,"поле", false),
            new Answer(1, 8, 3,"логическая запись", false),
            new Answer(1, 8, 4, "массив", true),

            new Answer(1, 9, 1,"проведение сложных математических вычислений", false),
            new Answer(1, 9, 2,"занесение данных во внешнюю память", true),
            new Answer(1, 9, 3,"чтение данных из внешней памяти", true),
            new Answer(1, 9, 4, "поиск неооходимых данных", true),

            new Answer(1, 10, 1,"поиск необходимых данных", true),
            new Answer(1, 10, 2,"змодификация данных", true),
            new Answer(1, 10, 3,"удаление данных", true),
            new Answer(1, 10, 4, "добавление данных", true),

            new Answer(1, 11, 1,"дублирование данных", true),
            new Answer(1, 11, 2,"большое время решения каждой задачи", false),
            new Answer(1, 11, 3,"высокая достоверность всей совокупности данных", false),
            new Answer(1, 11, 4, "потенциальная противоречивость данных", true),

            new Answer(1, 12, 1,"дублирование данных", true),
            new Answer(1, 12, 2,"большое время решения каждой задачи", false),
            new Answer(1, 12, 3,"высокая достоверность всей совокупности данных", false),
            new Answer(1, 12, 4, "потенциальная противоречивость данных", true),

            new Answer(1, 13, 1,"отдельный файл", false),
            new Answer(1, 13, 2,"набор отдельных файлов", false),
            new Answer(1, 13, 3,"набор экземпляров записей одного типа", false),
            new Answer(1, 13, 4, "набор экземпляров записей разных типов и связей между ними", true),

            new Answer(1, 14, 1,"файл", false),
            new Answer(1, 14, 2,"запись", false),
            new Answer(1, 14, 3,"экземпляр записи", false),
            new Answer(1, 14, 4, "связь между записями (файлами)", true),

            new Answer(1, 15, 1,"совокупность экземпляров записи одного типа", false),
            new Answer(1, 15, 2,"совокупность экземпляров записей разных типов", false),
            new Answer(1, 15, 3,"совокупность экземпляров записей разных типов и связей (отношений) между ними", true),
            new Answer(1, 15, 4, "поименованная совокупность логических записей", false),

            new Answer(1, 16, 1,"набор данных для решения отдельной задачи", false),
            new Answer(1, 16, 2,"набор отдельных файлов", false),
            new Answer(1, 16, 3,"набор связанных файлов", true),
            new Answer(1, 16, 4, "файловая система", false),

            new Answer(1, 17, 1,"отсутствие дублирования", false),
            new Answer(1, 17, 2,"минимальная избыточность", true),
            new Answer(1, 17, 3,"минимальное время решения всех задач", false),
            new Answer(1, 17, 4, "используется для решения ряда задач", true),

            new Answer(1, 18, 1,"минимальное дублирование данных", true),
            new Answer(1, 18, 2,"интеграция данных", true),
            new Answer(1, 18, 3,"каждая задача решается за минимально возможное время", false),
            new Answer(1, 18, 4, "отсутствие дублирования", false),
    };

    public String getAnswer(){
        return answer;
    }

    public boolean getYes(){
        return yes;
    }
}
