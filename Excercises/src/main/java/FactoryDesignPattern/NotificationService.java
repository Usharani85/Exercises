package FactoryDesignPattern;

public class NotificationService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		FactoryNotificationTest factoryNotificationTest=new FactoryNotificationTest();
		Notification notification=factoryNotificationTest.createChannel("Email");
		notification.notifyUser();
		Notification notification1=factoryNotificationTest.createChannel("SMS");
		notification1.notifyUser();
	}

}
