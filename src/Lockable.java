public interface Lockable {
    public void setKey(int newKey);
    public void lock(int key);
    public void unlock(int key);
    public boolean locked();
}