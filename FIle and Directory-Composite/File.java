public class File implements FileSystemComponent{
    
    private int Size;


    public File(int Size) {

        this.Size = Size;

    }


    @Override

    public int fs() {

        return Size;

    }

}
