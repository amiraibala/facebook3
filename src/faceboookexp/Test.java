package faceboookexp;

public class Test {

	public static void main(String[] args) {
        FBNotificationCenter notificationCenter = new FBNotificationCenter();
        WebBrowser browser = new WebBrowser();
        SmartphoneApplication app = new SmartphoneApplication();
        browser.connectTo(notificationCenter);
        notificationCenter.addNotification("jmlhmd aime votre photo");
        notificationCenter.addNotification("trigui.houssem a commenté votre publication");
        app.connectTo(notificationCenter);
       // browser.showNotifications();
        //app.showNotifications();
        app.disconnect(notificationCenter);
        notificationCenter.addNotification("");
        //browser.showNotifications();
    }
}
