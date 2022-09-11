package client;

import java.util.Properties;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.Message;
import javax.jms.MessageConsumer;
import javax.jms.MessageListener;
import javax.jms.ObjectMessage;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.swing.*;

import org.apache.log4j.BasicConfigurator;

public class ReceiverApp {

	public static JTextArea motto1;

	public static void main(String[] args) throws Exception {
		JFrame f = new JFrame("The Twilight Zone");

		// set size and location of frame
		f.setSize(390, 300);
		f.setLocation(100, 150);

		// make sure it quits when x is clicked
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel labelM = new JLabel("Receive message: ");
		labelM.setBounds(50, 50, 200, 30);
		motto1 = new JTextArea();

		// set size of the text box
		motto1.setBounds(50, 100, 200, 30);

		// add elements to the frame
		f.add(labelM);
		f.add(motto1);
		f.setLayout(null);
		f.setVisible(true);

//		****************************************************

		BasicConfigurator.configure();
		Properties settings = new Properties();
		settings.setProperty(Context.INITIAL_CONTEXT_FACTORY, "org.apache.activemq.jndi.ActiveMQInitialContextFactory");
		settings.setProperty(Context.PROVIDER_URL, "tcp://localhost:61616");
		Context ctx = new InitialContext(settings);
		// lookup JMS connection factory
		Object obj = ctx.lookup("ConnectionFactory");
		ConnectionFactory factory = (ConnectionFactory) obj;
		// lookup destination
		Destination destination = (Destination) ctx.lookup("dynamicQueues/lavominhquan");
		Connection con = factory.createConnection("admin", "admin");
		con.start();
		Session session = con.createSession(/* transaction */false, /* ACK */Session.CLIENT_ACKNOWLEDGE);
		MessageConsumer receiver = session.createConsumer(destination);
		// blocked-method for receiving message - sync
		System.out.println("T was listened on queue...");
		receiver.setMessageListener(new MessageListener() {

			public void onMessage(Message msg) {
				try {
					if (msg instanceof TextMessage) {
						TextMessage tm = (TextMessage) msg;
						String txt = tm.getText();
						System.out.println("Nhan duoc: " + txt);
						motto1.setText(txt);
						msg.acknowledge();
					} else if (msg instanceof ObjectMessage) {
						ObjectMessage om = (ObjectMessage) msg;
						System.out.println(om);
					}
					// others message type....
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}
}