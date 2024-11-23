package View.Commands;

import View.ConsoleUi;

public class Finish extends Command {

    public Finish(ConsoleUi consoleUi) {
        super(consoleUi);
        description = "Закончить работу";
    }

    public void execute() {
        ConsoleUi.finish();
    }
}