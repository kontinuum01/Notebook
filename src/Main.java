import Model.Notebook;
import Presenter.NotebookPresenter;

public class Main {
    public static void main(String[] args) {

        Notebook model = new Notebook();
        NotebookPresenter presenter = new NotebookPresenter(model, view);
        ConsoleUi consoleUi = new ConsoleUi(scanner, presenter, menu);
        consoleUi.start();
    }
}