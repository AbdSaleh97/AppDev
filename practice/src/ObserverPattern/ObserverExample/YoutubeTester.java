/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ObserverPattern.ObserverExample;

/**
 *
 * @author Abdsaleh
 */
public class YoutubeTester {
	public static void main(String []args)
	{
		MyYoutubeChannel m1 = new MyYoutubeChannel();
		Abdelrahman a = new Abdelrahman(m1);
		
//		m1.subscribe(a);
		m1.notifiy();
		a.newVideoMessage("Hi there");
		a.unSubscribe();
		System.out.println(m1.getListOfSub());
		m1.subscribe(a);
		m1.notifiy();
		System.out.println(m1.getListOfSub());	
	}
	
}
