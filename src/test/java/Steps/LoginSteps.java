package Steps;

import PageObjects.LoginPage;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class LoginSteps {

    LoginPage login = new LoginPage();

    @Dado("que estou na tela inicial")
    public void que_estou_na_tela_inicial() {
        login.acessarTelaInicial();

    }

    @E("clico botao faça seu login")
    public void clico_botao_faça_seu_login() {
        login.clicobotaofaçaseulogin();
    }

    @Quando("digito email")
    public void digito_email() {
        login.digitoEmail();
    }

    @E("clico botao continuar")
    public void clico_botao_continuar() {
        login.clicobotaoContinue();
    }

    @Quando("digito senha")
    public void digito_senha() {
        login.digitoSenha();
    }

    @E("clico botao fazer login")
    public void clico_botao_fazer_login() {
        login.clicobotaoFazerlogin();
    }

    @Então("verifico se estou logado")
    public void verifico_se_estou_logado() {
        login.verificoSeEstouLogado();

    }

    @Quando("digito email incorreto")
    public void digito_email_incorreto() {
        login.digitoEmailIncorreto();
    }

    @Quando("digito Senha Incorreta")
    public void digito_senha_incorreta() {
        login.digitoSenhaIncorreta();

    }

    @Então("exibo na tela mensagem erro")
    public void exibo_na_tela_mensagem_erro() {
        login.exiboNaTelaMensagemErro();
    }

    @Então("desconecto perfil do usuario")
    public void desconecto_perfil_do_usuario() {
        login.desconectoPerfilDoUsuario();
    }


    @E("clico botao pesquisar produto")
    public void clico_botao_pesquisar_produto() {
        login.clicobotaoPesquisarProduto();
    }

    @Então("faço uma busca por produto")
    public void faço_uma_busca_por_produto() {
        login.facoBuscaPorProduto();
    }

    @Então("verifico o produto")
    public void verifico_o_produto() {
        login.verificoOProduto();

    }
}