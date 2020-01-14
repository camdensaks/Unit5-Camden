public class Password implements Lockable{
    private int key;
    private boolean locked;
    private String phrase;

    public Password(int key, String phrase){
        this.key = key;
        locked = false;
        this.phrase = phrase;
    }

    public void setKey(int newKey){
        key = newKey;
    }

    public void lock(int key){
        if(this.key == key){
            locked = true;
        }
    }

    public void unlock(int key){
        if(this.key == key){
            locked = false;
        }
    }

    public boolean locked(){
        return locked;
    }

    public String toString(){
        if(locked){
            return "P is locked.";
        } else {
            return "P is unlocked.";
        }
    }
}