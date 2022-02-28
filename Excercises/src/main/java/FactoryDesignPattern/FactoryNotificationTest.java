package FactoryDesignPattern;

public class FactoryNotificationTest {

	public Notification createChannel(String channel) {
		
		if(channel==null || channel.isEmpty()) {
		
		return null;
		}
		if("SMS".equals(channel)) {
			return new SMSNotification();
		}
		
		else if("Email".equals(channel)) {
			return new EmailNotification();
		}
		
		return null;
	}
		
}
