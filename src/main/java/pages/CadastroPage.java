package pages;

import static core.DriverFactory.getDriver;

import org.openqa.selenium.By;


public class CadastroPage {

	By btn_cadastro = By.xpath("//a[@title='Cadastros']");
	By btn_negocios = By.xpath("//span[text()='Negócios']");
	By opcao_controlador = By.xpath("//span[text()='Controlador']");
	By btn_adicionar = By.xpath("//button[@class='btn btn-block btn-sm btn-success ng-star-inserted']");
	By txt_nome = By.xpath("//input[@name='name']");
	By txt_identificacao = By.xpath("//input[@name='register']");
	By btn_salvar = By.xpath("/html/body/modal-container/div/div/app-reseller-modal/div/div[3]/button[1]");
	By txt_mensagem = By.xpath("/html/body/app-root/div/simple-notifications/div");
	By btn_filtro = By.xpath("//h3[text()='Filtros']");
	By txt_nome_filtro = By.xpath("/html/body/app-root/div/div/app-tabs/tabset/div/tab[2]/div/app-reseller-list/section[2]/div/div/div[1]/div[2]/div[1]/div/input");
	By btn_pesquisar = By.xpath("//button[text()='Pesquisar']");
	By btn_editar = By.xpath("//a[text()='EDITAR']");
	By btn_deletar = By.xpath("//a[text()='DELETAR']");
	By btn_sim = By.xpath("//button[text()='Sim']");

	public void clicarCadastro() {

		getDriver().findElement(btn_cadastro).click();

	}

	public void clicarNegocios() {

		getDriver().findElement(btn_negocios).click();
	}

	public void opcaoControlador() throws InterruptedException {

		Thread.sleep(2000);
		getDriver().findElement(opcao_controlador).click();
	}

	public void adicionar() {

		getDriver().findElement(btn_adicionar).click();

	}

	public void incluirRegistro(String nome, String identificacao) {

		getDriver().findElement(txt_nome).sendKeys(nome);
		getDriver().findElement(txt_identificacao).sendKeys(identificacao);

	}

	public void salvar() {

		getDriver().findElement(btn_salvar).click();
	}

	public void validarMensagem() {

		String Text = getDriver().findElement(txt_mensagem).getText();
		System.out.println(Text);

	}

	
	public void clicarFiltro() {
		getDriver().findElement(btn_filtro).click();
	}
	
	public void nomeControlador() {
		
		getDriver().findElement(txt_nome_filtro).click();
		getDriver().findElement(txt_nome_filtro).sendKeys("Matheus2022");
	}

	public void pesquisar() {
		getDriver().findElement(btn_pesquisar).click();
	}

	public void editar() {
		getDriver().findElement(btn_editar).click();
		
	}
	
	public void alterarNomeControlador() {
		
		getDriver().findElement(txt_nome).click();
		getDriver().findElement(txt_nome).clear();
		getDriver().findElement(txt_nome).sendKeys("Controlador novo cas");
	}
	
	public void pesquisarNovoNome() {
		
		getDriver().findElement(txt_nome_filtro).click();
		getDriver().findElement(txt_nome_filtro).sendKeys("Controlador novo cas");
		getDriver().findElement(btn_pesquisar).click();
		
	}
	
	public void deletar() {
		
		getDriver().findElement(btn_deletar).click();
		
	}
	
	public void opcaoSim() {
		getDriver().findElement(btn_sim).click();
	}
	

}
