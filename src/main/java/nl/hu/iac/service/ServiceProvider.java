package nl.hu.iac.service;


public class ServiceProvider {
	private static WindmillServiceImpl windmillService = new WindmillServiceImpl();
	public static WindmillServiceImpl getWindmillServiceService() {
		return windmillService;
	}
}