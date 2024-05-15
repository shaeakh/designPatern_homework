public class POWERSHELL implements Terminal{

    @Override
    public void run(String CMD, String USER) {
        System.out.println(CMD + " run as " + USER + " successfully");
    }

}
