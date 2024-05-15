public class Client {
    public static void main(String[] args) {
        File file0 = new File(18);
        File file1 = new File(76);
        File file2 = new File(78);

        
        Directory directory_0 = new Directory();
        Directory root = new Directory();

        root.add(directory_0);
        root.add(file0);
        root.add(file1);
        dir1.add(file2);

        System.out.println(root.fs());

    }
}
