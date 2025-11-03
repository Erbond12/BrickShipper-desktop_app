package BrickShipper;

public class AppContext {
	private static Service service;
	
	public static void init(Service s) {
		service = s;
	}
	
	public Service getService() {
		return service;
	}
}
