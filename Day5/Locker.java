package Day5;

public class Locker {

    private String lockerId;
    private boolean isLocked;
    private String passcode;

   
    private class SecurityManager {
        private boolean checkCode(String code) {
            return passcode.equals(code);
        }
    }

    public Locker(String id, String code) {
        lockerId = id;
        passcode = code;
        isLocked = true;
    }

    public void lock() {
        isLocked = true;
        System.out.println("Locker is locked.");
    }

    public void unlock(String code) {
        SecurityManager sm = new SecurityManager();
        if (sm.checkCode(code)) {
            isLocked = false;
            System.out.println("Locker is unlocked!");
        } else {
            System.out.println("Wrong code.");
        }
    }

    public boolean isLocked() {
        return isLocked;
    }

    public static void main(String[] args) {
        Locker locker = new Locker("L001", "1234");

        locker.unlock("1111"); 
        locker.unlock("1234"); 
        locker.lock();         
    }
}
       