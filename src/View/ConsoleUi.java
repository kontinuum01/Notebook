package View;

import Model.Note;
import Presenter.NotebookPresenter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

public class ConsoleUi implements View{

    private final Scanner scanner;
    private static NotebookPresenter presenter;
    private static boolean exit;
    private final Menu menu;

    public ConsoleUi() {
        scanner = new Scanner(System.in);
        presenter = new NotebookPresenter(this);
        exit = true;
        menu = new Menu(this);
    }

    @Override
    public void start() {
        while (exit) {
            hello("Добрый день! Выберите одно из действий:");
            printMenu();
            execute();
        }
    }

    private static void hello(String x) {
        System.out.println(x);
    }

    private void printMenu() {
        printAnswer(menu.menu());
    }

    private void execute() {
        String line = scanner.nextLine();
        if (checkTextForInt(line)) {
            int numCommand = Integer.parseInt(line);
            if (checkCommand(numCommand)) {
                menu.execute(numCommand);
            }
        }
    }

    private boolean checkCommand(int numCommand) {
        if (numCommand <= menu.getSize()) {
            return true;
        } else {

            return false;
        }
    }
    private boolean checkTextForInt(String text) {
        return text.matches("[0-9]+");
    }
    public void showError(String x) {
        System.out.println(x);
    }
    public static void finish() {
        exit = false;
        System.out.println("Всего доброго!");
    }


    public static void addNote() {presenter.addNote();
    }
    public static void showNotesForDay(){
        presenter.showNotesForDay();
    }

    public static void showNotesForWeek() {presenter.showNotesForWeek();
    }
    public static void saveNotes(){
        presenter.saveNotes();
    }

    public static void loadNotes(){presenter.loadNotes();}

    @Override
    public void printAnswer(String answer) {
        hello(answer);
    }

    @Override
    public void showNotes(List<Note> notes) {
        if (notes.isEmpty()) {
            System.out.println("Записи не найдены");
        } else {
            for (Note note : notes) {
                System.out.println(note);
            }
        }
    }

    @Override
    public void showMessage(String message) {
        System.out.println(message);
    }

    @Override
    public LocalDateTime getDateTimeInput() {
        System.out.println("Введите дату и время в формате:(yyyy-MM-dd'T'HH:mm):");
        String input = scanner.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        return LocalDateTime.parse(input, formatter);
    }

    @Override
    public String getDescriptionInput() {
        System.out.println("Введите описание записи: ");
        return scanner.nextLine();
    }

    @Override
    public String getFileNameInput() {
        System.out.println("Введите имя записи: ");
        return scanner.nextLine();
    }
}
