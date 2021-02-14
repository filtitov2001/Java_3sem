package Lab13_14_22p2;

import javax.swing.*;
import java.awt.*;
import java.util.Random;
import java.util.Scanner;

public class Main extends JFrame {
    SortingStudentsByGPA studentsByGPA = new SortingStudentsByGPA();
    Search search = new Search();
    private static Data[] data;
    private JTextArea textArea = new JTextArea();
    private JTextArea Info = new JTextArea();
    private JTextArea Info1 = new JTextArea();
    private JTextArea Info2 = new JTextArea();
    private JTextArea Info3 = new JTextArea();
    private JTextArea Input = new JTextArea();
    private JButton sortButton = new JButton("Отсортировать данные");
    private JButton findButton = new JButton("Найти студента");
    private JButton mergeSortButton = new JButton("Сортировка слиянием");
    private JButton quickSortButton = new JButton("Быстрая сортировка");
    private JButton BinSearchButton = new JButton("Бинарный поиск");
    private JButton LinSearchButton = new JButton("Линейный поиск");
    private JButton back = new JButton("Назад");
    private JButton FindbyName = new JButton("Поиск по ФИО");
    private JButton Push = new JButton("Далее");
    private JTextArea CountUsers = new JTextArea();
    private JTextArea textId = new JTextArea();
    private JTextArea textGPA = new JTextArea();
    private JTextArea textName = new JTextArea();

    private boolean push = false;
    private int count = 0;

    static void IDshort(int mas[]) {
        boolean flag = false;
        int buf;
        while (!flag) {
            flag = true;
            for (int i = 0; i < mas.length - 1; i++) {
                if (mas[i] > mas[i + 1]) {
                    flag = false;
                    buf = mas[i];
                    mas[i] = mas[i + 1];
                    mas[i + 1] = buf;
                }
            }
        }
    }

    Main()
    {
        setTitle("Практическая работа №22");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000,600);
        setLayout(null);
        getContentPane().setBackground(Color.GREEN);
        Info.setBounds(430,30,300,20);
        Info.setText("Введите количество студентов");
        Info1.setText("Введите ID:");
        Info2.setText("Введите GPA:");
        Info3.setText("Введите Имя:");
        Info1.setBounds(150,60,170,20);
        Info1.setBackground(Color.GREEN);
        Info1.setVisible(false);
        Info2.setBounds(430,60,170,20);
        Info2.setBackground(Color.GREEN);
        Info2.setVisible(false);
        Info3.setBounds(700,60,170,20);
        Info3.setBackground(Color.GREEN);
        Info.setBackground(Color.GREEN);
        Info3.setVisible(false);
        CountUsers.setBounds(410,100,170,20);
        textId.setBounds(150,100,150,20);
        textId.setVisible(false);
        textGPA.setBounds(430,100,150,20);
        textGPA.setVisible(false);
        textName.setBounds(700,100,150,20);
        textName.setVisible(false);
        Push.setBounds(410,150,170,20);
        add(CountUsers);
        add(textId);
        add(textGPA);
        add(textName);
        add(Push);
        Rectangle left=new Rectangle(300,100,170,20);
        Rectangle right=new Rectangle(530,100,170,20);
        back.setBounds(0,10,100,20);
        back.setVisible(false);
        textArea.setBounds(350,150,400,300);
        Input.setBounds(430,150,150,20);
        textArea.setBackground(Color.ORANGE);
        Info.setEditable(false);
        textArea.setVisible(false);
        textArea.setEditable(false);
        Input.setVisible(false);
        sortButton.setBounds(left);
        findButton.setBounds(right);
        mergeSortButton.setBounds(left);
        quickSortButton.setBounds(right);
        BinSearchButton.setBounds(430,100,170,20);
        LinSearchButton.setBounds(150,100,170,20);
        FindbyName.setBounds(700,100,170,20);
        add(Info);
        add(textArea);
        add(Input);
        add(back);
        add(Info1);
        add(Info2);
        add(Info3);
        add(sortButton);
        add(findButton);
        add(mergeSortButton);
        add(quickSortButton);
        add(BinSearchButton);
        add(LinSearchButton);
        add(FindbyName);
        mergeSortButton.setVisible(false);
        quickSortButton.setVisible(false);
        BinSearchButton.setVisible(false);
        LinSearchButton.setVisible(false);
        FindbyName.setVisible(false);

        back.setVisible(false);
        findButton.setVisible(false);
        sortButton.setVisible(false);
        Push.addActionListener(e->{
            if (!push) {
                try {
                    data = new Data[CheckInputInf(CountUsers)];
                    push = true;
                    CountUsers.setVisible(false);
                    textId.setVisible(true);
                    textGPA.setVisible(true);
                    textName.setVisible(true);
                    Info1.setVisible(true);
                    Info2.setVisible(true);
                    Info3.setVisible(true);
                    Info.setText("Введите данные студента №"+(count+1));
                } catch (java.lang.Exception ex) {
                    JOptionPane.showMessageDialog(null,"Введено неверное значение! Повторите попытку!");
                    CountUsers.setText("");
                }
            }
            else {
                if (textName.getText().length() != 0) {

                    try {
                        data[count] = new Student(CheckInputInf(textId), textName.getText(), CheckInputInf(textGPA));
                    ++count;
                    textId.setText("");
                    textGPA.setText("");
                    textName.setText("");
                    if(count==data.length){
                        Info.setText("Выберете операцию:");
                        Info1.setVisible(false);
                        Info2.setVisible(false);
                        Info3.setVisible(false);
                        textId.setVisible(false);
                        textGPA.setVisible(false);
                        textName.setVisible(false);
                        Push.setVisible(false);
                        findButton.setVisible(true);
                        sortButton.setVisible(true);
                    }
                    else Info.setText("Введите данные студента №"+(count+1));
                    } catch (java.lang.Exception exception) {
                        textId.setText("");
                        textGPA.setText("");
                        textName.setText("");
                        JOptionPane.showMessageDialog(null,"Введено неверное значение! Повторите попытку!");
                    }
                }
            }
        });
        back.addActionListener(e -> {
            Info.setText("Выберете операцию:");
            mergeSortButton.setVisible(false);
            quickSortButton.setVisible(false);
            BinSearchButton.setVisible(false);
            LinSearchButton.setVisible(false);
            FindbyName.setVisible(false);
            back.setVisible(false);
            textArea.setVisible(false);
            Input.setVisible(false);
            findButton.setVisible(true);
            sortButton.setVisible(true);
            Info1.setVisible(false);
            Info2.setVisible(false);
            Info3.setVisible(false);
        });
        sortButton.addActionListener(e -> {
            Info.setText("Выберете метод сортировки");
            findButton.setVisible(false);
            sortButton.setVisible(false);
            FindbyName.setVisible(false);
            mergeSortButton.setVisible(true);
            quickSortButton.setVisible(true);
            back.setVisible(true);
        });
        mergeSortButton.addActionListener(e -> {
            data = studentsByGPA.sortMerge(data);
            output();
        });
        quickSortButton.addActionListener(e -> {
            studentsByGPA.quickSort(data,0,data.length-1);
            output();
        });
        findButton.addActionListener(e -> {
            Info.setText("Выберете метод поиска");
            Info1.setVisible(true);
            Info2.setVisible(true);
            Info3.setVisible(true);
            findButton.setVisible(false);
            sortButton.setVisible(false);

            BinSearchButton.setVisible(true);
            LinSearchButton.setVisible(true);
            FindbyName.setVisible(true);

            back.setVisible(true);
            Input.setVisible(true);
        });
        BinSearchButton.addActionListener(e->{
            try {
                output2(search.Binary_search(data,CheckInputInf(Input),0,data.length));
            }
            catch (java.lang.Exception ex) {
                output2(-1);
            }
        });
        LinSearchButton.addActionListener(e->{
            try {
                output2(search.Lin_search(data, CheckInputInf(Input)));
            }
            catch (java.lang.Exception ex) {
                output2(-1);
            }
        });
        FindbyName.addActionListener(e->{
            try {
                output2(search.Lin_search_name(data,Input.getText()));
            }
            catch (java.lang.Exception ex) {
                output2(-1);
            }
        });

    }


    public static void main(String[] args) {
        new Main().setVisible(true);
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
       /* Student students[] = new Student[10];
        int iDNumber[] = new int[10];
        int iD;
        String names[] = {"Феликс", "Эмиль", "Антон", "Вова", "Слава","Артем","Саша","Егор","Леша","Сергей"};

        for (int i = 0; i < 10; ++i) {
            iD = rand.nextInt(1000) + 1000 + rand.nextInt(1000) + 1000;
            iDNumber[i] = iD;
            students[i] = new Student(iD, names[i] , rand.nextInt(5) + 1);
        }

        System.out.println("Сортировка ID:");
        System.out.print("До:\n[");
        for (int i = 0; i < 10; ++i) {
            System.out.print(iDNumber[i]);
            if (i != (iDNumber.length - 1)) {
                System.out.print(", ");
            } else {
                System.out.print("\n\nПосле:\n");
            }
        }
        IDshort(iDNumber);
        String sortedId = Arrays.toString(iDNumber);
        System.out.println(sortedId);
        System.out.println("Сортировка студентов по рейтингу:");
        System.out.println("\n"+"--------------------------------------------------"+"\n\nДо:\n");
        for (Student o : students) {
            System.out.print(o.toString() + "\n");
        }

        System.out.println("Алгоритм линейного поиска: ");
        Search search = new Search() ;
        System.out.print("Введите ID студента для поиска: ");
        int sID = scan.nextInt();
        search.Lin_search(students,sID);

        SortingStudentsByGPA sort = new SortingStudentsByGPA();
        System.out.println("Выберете метод сортировки:\n1 - Слияние, 2 - Быстрая\n");

        switch (scan.nextInt()){
            case 1:
                sort.mergeSort(students, 0,9);
                break;
            case 2:
                sort.quickSort(students, 0, 9);
                break;
            default:
                System.out.print("\nВведено неверное значение! Повторите попытку!\n");
        }
        System.out.println("\n"+"------------------------------------------------"+"\n\nПосле:\n");
        for (Student o : students) {
            System.out.print(o.toString() + "\n");
        }




        System.out.println("\n\nАлгоритм бинарного поиска: ");
        System.out.print("Введите ID студента для поиска: ");
        sID = scan.nextInt();
        search.Binary_search(students,sID,0,9); */
    }


    private int CheckInputInf(JTextArea text) throws java.lang.Exception {
        String s=text.getText();
        if(s.length()==0)
            throw new java.lang.Exception("Нужно ввести целочисленное значение!");
        int id=0;
        for(int i=0;i<s.length();++i){
            if(s.toCharArray()[i]>='0'&& s.toCharArray()[i]<='9')
                id=id*10+s.toCharArray()[i]-'0';
            else if(!(s.toCharArray()[i]==' ' || s.toCharArray()[i]=='\n'))
                throw new java.lang.Exception("Нужно ввести целочисленное значение!");
        }
        return id;
    }

    private void output(){
        back.setVisible(true);
        textArea.setVisible(true);
        textArea.setText("ID\tИмя\t\tЗНО\n\n");
        for(Data o: data){
            textArea.append(o.getID()+"\t"+o.getName()+"\t\t"+o.getGPA()+"\n");
        }
    }
    private void output2(int index){
        textArea.setVisible(true);
        if(index==-1)
            textArea.setText("Студент не найден");
        else{
            textArea.setText("Cтудент:\n");
            textArea.append("ID\tИмя\t\tЗНО\n\n");
            textArea.append(data[index].getID()+"\t"+data[index].getName()+"\t\t"+data[index].getGPA());
        }
    }
}
