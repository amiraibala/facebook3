package faceboookexp;



import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class FBNotificationCenter extends Observable{
	
	public void addNotification(String notification) {
		
		setChanged();
		notifyObservers(notification);
	}

	public void removeObserver(Observer observer) {
		// TODO Auto-generated method stub
		
	}
}
