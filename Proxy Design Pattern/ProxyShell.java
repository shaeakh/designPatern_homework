import java.util.ArrayList;
import java.util.List;

public class PROXYSHELL implements Terminal{
    private POWERSHELL POWERSHELL;
    private List<String> vulnerable_CMD;
    
    public PROXYSHELL() {
        POWERSHELL = new POWERSHELL();
        vulnerable_CMD = new ArrayList<>();
        vulnerable_CMD.add("rm -rf");
    }

    @Override
    public void run(String CMD, String USER) {
        if(vulnerable_CMD.contains(CMD) && USER != "admin"){
            System.out.println("Can't EXECUTE CMD: " + CMD);
        }
        else{
            POWERSHELL.run(CMD,USER);
        }
    }

}
