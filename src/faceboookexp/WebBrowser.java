package faceboookexp;



import java.util.List;
import java.util.Observable;

public class WebBrowser implements FacebookView {
	    private String notification;

	    public void connectTo(FBNotificationCenter notificationCenter) {
	        notificationCenter.addObserver((java.util.Observer) this);
	    }

	    @Override
	    public void update(Observable o ,Object notif) {
        
	    	notification=(String) notif;
	    	showNotifications();

	    }
	        public void showNotifications() {
	           
	         System.out.println(notification + "From Browser");
	        }
	}





