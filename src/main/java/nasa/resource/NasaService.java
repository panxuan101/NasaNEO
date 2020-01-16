package nasa.resource;

import org.springframework.web.client.RestTemplate;

public class NasaService {

	private static final String NASA_KEY = "D8P3GL9LdI0ohEp9IBVzsSaCHWLL45XcSG1c1cae";
	private static final String NASA_BASE_URL = "https://api.nasa.gov/neo/rest/v1/feed?";
	private static final String START = "start_date=";
	private static final String END = "&end_date=";
	private static final String API = "&api_key=";
	
	public static String getNEOInfo(String startDate, String endDate) {
		String url = new String(NASA_BASE_URL + START + startDate + END + endDate + API + NASA_KEY);
		 RestTemplate restTemplate = new RestTemplate();
		    String result = restTemplate.getForObject(url, String.class);
		return result;
	}
}
