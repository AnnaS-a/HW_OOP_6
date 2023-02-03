package Notes;

import Notes.Controllers.Controller;
import Notes.Model.FileActions;
import Notes.Model.FileInterfase;
import Notes.Model.Repository;
import Notes.Model.RepositoryFile;

import Notes.Utilities.Validate;
import Notes.View.ViewUser;

public class Main {
    public static void main(String[] args) {
        FileInterfase fileInterfase = new FileActions("book.txt");
        Repository repository = new RepositoryFile(fileInterfase);
        Validate validate = new Validate();
        Controller controller = new Controller(repository, validate);
        ViewUser view = new ViewUser(controller, validate);
        view.run();
    }
}
