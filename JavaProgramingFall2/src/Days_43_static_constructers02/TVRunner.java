package Days_43_static_constructers02;

public class TVRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TV myTV=new TV();//when we create new object we can say instantiation
TV smartTV=new TV("Sharp");
TV cTV= new TV ("HP");
System.out.println(myTV.isOn());
System.out.println(smartTV.isOn());
System.out.println(cTV.isOn());
myTV.turnOn();
smartTV.turnOn();
cTV.turnOn();
System.out.println(myTV.isOn());
System.out.println(smartTV.isOn());
System.out.println(cTV.isOn());

myTV.turnOn();

myTV.setChannel(200);
smartTV.setChannel(55);

System.out.println("My TV:" + myTV.getChannel());
System.out.println("smartTV :" + smartTV.getChannel());
System.out.println("cTV:" + cTV.getChannel());

myTV.channelUp();
smartTV.ChannelDown();

System.out.println("My TV:" + myTV.getChannel());
System.out.println("smartTV :" + smartTV.getChannel());

cTV.turnOff();
cTV.setChannel(22);

	}

}
