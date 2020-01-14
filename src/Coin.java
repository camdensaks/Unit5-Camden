public class Coin implements Lockable{
    private String heads;
    private String tails;
    private int result;
    private int key;
    private boolean locked;

    public Coin(int key){
        this.key = key;
        locked = false;
        Flip();
    }

    public void Flip(){
        if(!locked) {
            result = (int) (Math.random() * 2);
        }
        else {
            System.out.println("Coin is locked");
        }
    }


    public String getResult(){
        if(result == 2){
            return heads;
        }
        else{
            return tails;
        }
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
        String faceName = "";
        faceName += "Result: " + result;
        return faceName;
    }
}