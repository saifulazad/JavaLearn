package generics;

/**
 * Created by Azad on 28-Apr-16.
 */
public class BoxRevisited <T extends Number > {
    private  T obj;

    public BoxRevisited(T obj) {

        this.obj = obj;
    }

    /**
     * This is a generic method
     * @return
     */
    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }
}
