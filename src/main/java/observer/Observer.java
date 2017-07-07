package observer;

/**
 * Created by Seweryn on 2017-03-13.
 */
public interface Observer {

    //method to update the observer, used by subject
    public void update();

    //attach with subject to observe
    public void setSubject(Subject sub);
}