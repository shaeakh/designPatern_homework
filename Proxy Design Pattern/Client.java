public class Client {
    public static void main(String[] args) {

        PROXYSHELL PROXYSHELL = new PROXYSHELL();
        PROXYSHELL.run("mkdir design pattern", "user");
        PROXYSHELL.run("rm -rf", "user");
        PROXYSHELL.run("rm -rf", "admin");
        
    }
}
