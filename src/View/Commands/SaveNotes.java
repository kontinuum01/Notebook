package View.Commands;

import View.ConsoleUi;

public class SaveNotes extends Command{
    public SaveNotes(ConsoleUi consoleUi){
        super(consoleUi);
        description = "Сохранить запись";

    }
    @Override
    public void execute(){
        ConsoleUi.saveNotes();
    }
}
