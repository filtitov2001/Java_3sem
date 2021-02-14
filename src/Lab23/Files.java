package Lab23;

import java.io.File;
import java.util.ArrayList;

public class Files {
    private String path;
    private ArrayList<String> directoryContent;

    public Files(String path) throws Exception2 {
        if (!new File(path).exists())
            throw new Exception2(path);

        this.path = path;
        directoryContent = new Convertation().toList(new File(path).list());
    }

    public String getPath(){
        return path;
    }

    public void setPath(String path) throws Exception2 {
        if (!new File(path).exists())
            throw new Exception2(path);

        this.path = path;
        directoryContent = new Convertation().toList(new File(path).list());
    }

    public ArrayList<String> getDirectoryContent() {
        return directoryContent;
    }
}