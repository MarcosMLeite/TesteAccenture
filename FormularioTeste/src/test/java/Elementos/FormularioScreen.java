package Elementos;

import org.openqa.selenium.By;

public class FormularioScreen {

	public By make = By.id("make");
	public By marca = By.cssSelector("#make > option:nth-child(5)");
	public By model = By.id("model");
	public By modelo = By.cssSelector("#model > option:nth-child(2)");
	public By cylinder = By.id("cylindercapacity");
	public By engine = By.id("engineperformance");

	public By date = By.id("opendateofmanufacturecalender");
	public By dia = By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[4]/td[3]/a");

	public By numberSeats = By.id("numberofseats");
	public By number = By.cssSelector("#numberofseats > option:nth-child(4)");
	public By no = By
			.cssSelector("#insurance-form > div > section:nth-child(1) > div:nth-child(7) > p > label:nth-child(2)");

	public By Seats = By.id("numberofseatsmotorcycle");
	public By numero = By.cssSelector("#numberofseatsmotorcycle > option:nth-child(3)");
	public By fuelType = By.id("fuel");
	public By fuel = By.cssSelector("#fuel > option:nth-child(4)");
	public By Payload = By.id("payload");
	public By totalWeight = By.id("totalweight");
	public By listPrice = By.id("listprice");
	public By license = By.id("licenseplatenumber");
	public By annual = By.id("annualmileage");
	public By next = By.id("nextenterinsurantdata");
	// segunda pagina
	public By firstName = By.id("firstname");
	public By lastName = By.id("lastname");
	public By Aniversario = By.id("birthdate");
	public By sexo = By
			.cssSelector("#insurance-form > div > section:nth-child(2) > div:nth-child(4) > p > label:nth-child(1)");
	public By streetAddress = By.id("streetaddress");
	public By país = By.id("country");
	public By zipCode = By.id("zipcode");
	public By city = By.id("city");
	public By occupation = By.id("occupation");
	public By official = By.xpath("//*[@id=\"occupation\"]/option[3]");
	public By hobbies = By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[1]");
	public By website = By.id("website");
	public By open = By.id("open");
	public By next1 = By.id("nextenterproductdata");
	public By country = By.cssSelector("#country > option:nth-child(32)");
	// terceira pagina
	public By startDate = By.id("startdate");
	public By Insurance = By.id("insurancesum");
	public By valor = By.cssSelector("#insurancesum > option:nth-child(2)");
	public By merit = By.id("meritrating");
	public By bonus = By.cssSelector("#meritrating > option:nth-child(3)");
	public By damage = By.id("damageinsurance");
	public By damageInsurence = By.xpath("//*[@id=\"damageinsurance\"]/option[4]");
	public By optionalProduct = By.xpath(
			"//*[@id=\"insurance-form\"]/div/section[3]/div[5]/p/label[1]/span");
	public By courtesy = By.id("courtesycar");
	public By car = By.cssSelector("#courtesycar > option:nth-child(3)");
	public By next3 = By.id("nextselectpriceoption");
	public By silver = By.xpath("//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[1]/span");
	public By next4 = By.id("nextsendquote");
	// Quarta pagina
	
	public By btnEnviar = By.id("sendemail");
	public By btnMsg = By.xpath("/html/body/div[4]/h2");
	

}
