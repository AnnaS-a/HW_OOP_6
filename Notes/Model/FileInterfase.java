package Notes.Model;

import java.util.List;

public interface FileInterfase {
    
    List<String> readAllLines();

    void saveAllLines(List<String> lines);
}
