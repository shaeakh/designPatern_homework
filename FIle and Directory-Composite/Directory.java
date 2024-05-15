import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystemComponent {
    private int Size;
    private List<FileSystemComponent> CHILDREN;

    public Directory() {

        this.Size = 0;

        CHILDREN = new ArrayList<>();

    }

    public void add(FileSystemComponent component){

        CHILDREN.add(component);

    }

    @Override
    public int fs() {

        for (FileSystemComponent component : CHILDREN) {

            Size += component.fs();
            
        }
        return Size;
    }

}
