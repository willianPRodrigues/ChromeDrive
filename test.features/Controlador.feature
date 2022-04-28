# language: pt
Funcionalidade: Realizar cadastro, editação e exclusão de controlador

Contexto: 
		Dado que eu acesse o Residencial Smart
    Quando informo o usuario e senha
    E realizo o login com sucesso
    
@cadastro   
Esquema do Cenario: Realizar cadastro de controlador
	Quando clico em cadastros
	E clico em Negocios 
	E seleciono a opcao controlador
	E clico no botao adicionar
	E preencho as informacoes do registro <nome> <identificacao>
	E clico no botao salvar
	E valido que o registro foi criado com sucesso
	Entao finalizo o cadastro
	
	Exemplos:
	| nome 				| identificacao | 
	| Matheus2022 | MatheusQA			|
	
	@editar
 Cenario: editar nome do controlador
	Quando clico em cadastros
	E clico em Negocios 
	E seleciono a opcao controlador
	E clico em filtros	
	E informo o nome do controlador cadastrado
	E clico no botão editar
	E altero o nome do controlador
	E clico no botão salvar
	E valido que o nome do controlador foi editado com sucesso
	Entao finalizo a edição
	
	
	@excluir
 Cenario: excluir controlador
	E clico em cadastros
	E clico em Negocios 
	E seleciono a opcao controlador
	E clico em filtros	
	E informo o nome do controlador
	E clico no botão deletar
	E clico no botão sim
	Entao valido que o controlador foi excluido com sucesso
	
		
	
	
	
     
