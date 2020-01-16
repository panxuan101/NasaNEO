package nasa.resource;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebResource {

  @RequestMapping("/date/{start}/{end}")
  public String index(@PathVariable("start") String start, @PathVariable("end") String end) {
	  System.out.println("Start date is " + start + " end date is " + end);
	  String info = NasaService.getNEOInfo(start, end);
	  System.out.println(info);
    return info;
  }


}
