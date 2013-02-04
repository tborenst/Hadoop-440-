package testing;

import processManager.NodeManager;
import networking.*;

public class Testing {
	
	public static void main(String[] args) throws InterruptedException{
		NodeManager manager = new NodeManager(5, 5000);
		Thread.sleep(1000);
		final SIOClient client1 = new SIOClient("localhost", 4313);
		client1.on("quit", new SIOCommand(){
			public void run(){
				System.out.println("OOOH NOOO!");
				System.out.println("Client disconnected.");
				client1.close();
			}
		});
		Thread.sleep(1000);
		manager.quit();
		Thread.sleep(1000);
		final SIOClient client2 = new SIOClient("192.168.1.16", 4313);
		client2.on("quit", new SIOCommand(){
			public void run(){
				System.out.println("Oh well!");
				client2.close();
			}
		});
		Thread.sleep(1000);
		manager.quit();
	}
}
