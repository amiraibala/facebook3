package faceboookexp;


import java.util.Observable;
import java.util.Observer;

public interface FacebookView extends Observer{

	//void update(String notification);

	void update(Observable o, Object notif);
	
}

