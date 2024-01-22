package sg.edu.nus.iss.cicddemo.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.javafaker.Faker;
@RestController
public class DataController {
 @GetMapping("/")
 public String healthCheck() {
 return "HEALTH CHECK OK!";
 }
 @GetMapping("/version")
 public String version() {
 return "The actual version is 1.0.0";
 }
 @GetMapping("/nations")
 public JsonNode getRandomNations() {
 var objectMapper = new ObjectMapper();
 var faker = new Faker();
 var nations = objectMapper.createArrayNode();
 for (var i = 0; i < 10; i++) {
 var company = faker.company();
 nations.add(objectMapper.createObjectNode()
 .put("Name", company.name())
 .put("Industry", company.industry())
 .put("Profession", company.profession())
 .put("Logo", company.logo()));
 }
 return nations;
 }
 @GetMapping("/currencies")
 public JsonNode getRandomCurrencies() {
 var objectMapper = new ObjectMapper();
 var faker = new Faker();
 var currencies = objectMapper.createArrayNode();
 for (var i = 0; i < 20; i++) {
 var currency = faker.currency();
 currencies.add(objectMapper.createObjectNode()
		 .put("name", currency.name())
		 .put("code", currency.code()));
		 }
		 return currencies;
		 }
		}
 
