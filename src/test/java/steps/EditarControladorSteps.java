package steps;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pages.CadastroPage;

public class EditarControladorSteps extends CadastroPage {

	@Quando("clico em filtros")
	public void clico_em_filtros() {

		clicarFiltro();

	}

	@Quando("informo o nome do controlador cadastrado")
	public void informo_o_nome_do_controlador_cadastrado() {

		nomeControlador();
		pesquisar();
	}

	@Quando("clico no botão editar")
	public void clico_no_botão_editar() {

		editar();

	}

	@Quando("altero o nome do controlador")
	public void altero_o_nome_do_controlador() {

		alterarNomeControlador();

	}

	@Quando("clico no botão salvar")
	public void clico_no_botão_salvar() {

		salvar();
	}

	@Quando("valido que o nome do controlador foi editado com sucesso")
	public void valido_que_o_nome_do_controlador_foi_editado_com_sucesso() {

		pesquisarNovoNome();
	}

	@Entao("finalizo a edição")
	public void finalizo_a_edição() {

		validarMensagem();

	}
}
