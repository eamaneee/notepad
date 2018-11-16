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
                    System.out.println();

            }}
    }

    private static void exit() {
    }

    private static void showList() {
    }

    private static void showHelp() {
    }

    private static void createPerson() {
    }
}
