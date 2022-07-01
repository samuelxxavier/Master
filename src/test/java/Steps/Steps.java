package Steps;


import Elementos.Elementos;
import Metodos.Metodos;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps  extends Metodos{
	
	Elementos e = new Elementos();

	@Given("^que acesse a Url \"([^\"]*)\"$")
	public void que_acesse_a_Url(String url) throws Throwable {
       executarNavegador(url);
      
	}

	@When("^selecionar o botao abrir nova conta$")
	public void selecionar_o_botao_abrir_nova_conta() throws Throwable {
      click(e.getBtnAbrirConta());
   
	
	}

	@When("^selecione o  botao abrir conta pf$")
	public void selecione_o_botao_abrir_conta_pf() throws Throwable {
    click(e.getBtnAbrirContaPf());
	}

	@When("^preencho o campo nome \"([^\"]*)\"$")
	public void preencho_o_campo_nome(String nome) throws Throwable {
        preencher(e.getCampoNome(), nome);
        
	}
	@When("^preencho o campo celular \"([^\"]*)\"$")
	public void preencho_o_campo_celular(String telefone) throws Throwable {
	    preencher(e.getCampoTelefone(), telefone);
	}

	@When("^preencho o campo email \"([^\"]*)\"$")
	public void preencho_o_campo_email(String email) throws Throwable {
	    preencher(e.getCampoEmail(), email);
	}

	@When("^preencho o campo cpf \"([^\"]*)\"$")
	public void preencho_o_campo_cpf(String cpf) throws Throwable {
	  preencher(e.getCampoCpf(), cpf);
	}

	@When("^seleciono o botao quero ser cliente$")
	public void seleciono_o_botao_quero_ser_cliente() throws Throwable {
       click(e.getBtnEnviar());
	}

	@Then("^realizo validacao de envio dos dados$")
	public void realizo_validacao_de_envio_dos_dados() throws Throwable {
        validatTexto("Feito",e.getTextoValidacao());
	}

}
