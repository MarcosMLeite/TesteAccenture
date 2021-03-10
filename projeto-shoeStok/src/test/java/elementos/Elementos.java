package elementos;

import org.openqa.selenium.By;

public class Elementos {

	public By btnPesquisar = By.name("q");

	public By btnLupa = By
			.cssSelector("#header-content > header > div > div > section.search > section > form > div > button");

	public By btnShoe = By.cssSelector("#item-list > div.wrapper > div:nth-child(1) > div.item-card__images > a > img");

	public By btnNumeroSapato = By
			.cssSelector("#buy-box > section.product-size-selector > div > ul > li:nth-child(3) > a");

	public By btnComprar = By.cssSelector("#buy-button-now > span");

	public By btnCarrinho = By.cssSelector(
			"body > div.main > div.cart.breakpoint.main > div.cart__content > div.cart__items > h1");
	public By btnResumo = By.cssSelector("body > div.main > div.cart.breakpoint.main > div.cart__content > div.cart__summary > h1");
	
	public By btnExcluirSacola = By
			.cssSelector("body > div.main > div.cart.breakpoint.main > div.cart__content > div.cart__items > div.product-items > div > i");
	public By btnCarrinhoVazio = By
			.cssSelector("body > div.main > div.cart.breakpoint.empty > div.cart__content > div > h1");
	
}
