import java.util.Observable;
import java.util.Observer;

// Concrete Observable Class
public class Counter extends Observable {
    private int count;

    // Method to increment the count
    public void increment() {
        count++;
        setChanged(); // Mark this object as changed
        notifyObservers(count); // Notify all registered observers with the new count
    }

    // Get the current count
    public int getCount() {
        return count;
    }

    public static void main(String[] args) {
        Counter counter = new Counter();

        // Create and add observers
        Observer observer1 = new Observer() {
            @Override
            public void update(Observable o, Object arg) {
                System.out.println("Observer 1: Count changed to " + arg);
            }
        };

        Observer observer2 = new Observer() {
            @Override
            public void update(Observable o, Object arg) {
                System.out.println("Observer 2: Count changed to " + arg);
            }
        };

        counter.addObserver(observer1);
        counter.addObserver(observer2);

        // Increment the counter and notify observers
        counter.increment();
        counter.increment();
    }
}

/* setChanged(): This method is called to mark the Counter object as having been changed. This is necessary because notifyObservers() will only notify observers if setChanged() has been called.

notifyObservers(): This method is used to notify all registered observers. When called, it triggers each observer’s update() method. The notifyObservers() method can take an optional argument, which is passed to the update() method of each observer. In this example, it passes the new count.

notifyObservers(Object arg): This overloaded version of notifyObservers() allows you to pass an argument to the observers. In this example, the argument is the new count.

addObserver(Observer o): Registers an observer to receive notifications. The Observer interface must be implemented by any class that wants to listen for changes.

deleteObserver(Observer o): Removes an observer from the list. The removed observer will no longer receive updates
*/


/*
How notifyObservers() and update() Are Called
increment() Method:

The increment() method in the Counter class increases the count.
It then calls setChanged() to mark the Counter object as changed.
Finally, it calls notifyObservers(count), passing the new count as an argument.
notifyObservers(count):

This method iterates over all registered observers.
It calls the update() method of each observer, passing the new count as an argument.
Observer’s update() Method:

Each observer’s update() method is called with the Counter object and the new count.
The observers handle the update by printing the new count to the console in this example.


*/
