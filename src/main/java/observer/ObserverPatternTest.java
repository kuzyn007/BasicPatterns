package observer;

/**
 * Created by Seweryn on 2017-03-13.
 * http://www.journaldev.com/1540/decorator-design-pattern-in-java-example
 */
public class ObserverPatternTest {

    public static void main(String[] args) {
        //create subject
        MyTopic topic = new MyTopic();

        //create observers
        Observer obj1 = new MyTopicSubscriber("Obj1");
        Observer obj2 = new MyTopicSubscriber("Obj2");
        Observer obj3 = new MyTopicSubscriber("Obj3");

        //register observers to the subject
        topic.register(obj1);
        topic.register(obj2);
        topic.register(obj3);

        //attach observer to subject
        obj1.setSubject(topic);
        obj2.setSubject(topic);
        obj3.setSubject(topic);

        //check if any update is available
        obj1.update();

        topic.unregister(obj3);
        //now send message to subject
        topic.postMessage("1New Message");
        topic.postMessage("2New Message");
        //System.out.println(topic.getUpdate(obj1));
    }

}
