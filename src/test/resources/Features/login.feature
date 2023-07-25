  #language:pt
  # author: Joao Silva
  @login
  Funcionalidade: Login na plataforma Amazon
    Para testar a funcionalidade de login da plataforma " Amazon.com.br",serão considerados
    os seguintes aspectos:
    -Validar o fluxo comum (login/logout).
    -Validar os campos "E-mail e Senha".
    -Funcionalidade do Botão "Login".
    -Funcionalidade do Sistema
    -Validar Busca correta.

    @login-sucesso
    Cenario:Login com E-mail e Senha Correto
      Dado  que estou na tela inicial
      E clico botao faça seu login
      Quando digito email
      E clico botao continuar
      Quando digito senha
      E clico botao fazer login
      Então verifico se estou logado

    @login-EmailIncorreto
    Cenario:Login com E-mail Incorreto
      Dado  que estou na tela inicial
      E clico botao faça seu login
      Quando digito email incorreto
      E clico botao continuar
      Então exibo na tela mensagem erro

    @login-SenhaIncorreta
    Cenario:Login com Senha incorreta
      Dado  que estou na tela inicial
      E clico botao faça seu login
      Quando digito email
      E clico botao continuar
      Quando digito Senha Incorreta
      E clico botao fazer login
      Então exibo na tela mensagem erro

    @login-Logout
    Cenario: Deslogar o perfil do usuario
      Dado  que estou na tela inicial
      E clico botao faça seu login
      Quando digito email
      E clico botao continuar
      Quando digito senha
      E clico botao fazer login
      Então verifico se estou logado
      E desconecto perfil do usuario

    @login-BuscarProduto
    Cenario: Efetuar busca produto e Validar busca
      Dado  que estou na tela inicial
      E clico botao faça seu login
      Quando digito email
      E clico botao continuar
      Quando digito senha
      E clico botao fazer login
      Então faço uma busca por produto
      E clico botao pesquisar produto
      E verifico o produto








