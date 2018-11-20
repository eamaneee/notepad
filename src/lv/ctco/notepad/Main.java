package lv.ctco.notepad;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static List<Person> records = new ArrayList<>();

    public static void main(String[] args) {
        for(;;) {
            System.out.println("cmd: ");
            String cmd = scanner.next();
            switch (cmd) {
                case "create":
                    createPerson();
                    break;
                case "help":
                    showHelp();
                    break;
                case "showList":
                    showList();
                    break;
                case "exit":
                    exit();
                    break;
                default:
                    System.out.println("wrong");

            }}
    }

    private static void exit() {
    }

    private static void showList() {
        records.forEach(r -> System.out.println(r));
    }

    private static void showHelp() {
    }

    private static void createPerson() {
       // System.out.println("BEFORE");
        Person p = new Person();
        //System.out.println("AFTER");

        System.out.print("First name: ");
        p.setFirstName(scanner.next());

        System.out.print("Last name: ");
        p.setLatsName(scanner.next());

        System.out.print("email: ");
        p.setEmail(scanner.next());

        records.add(p);
    }
}
