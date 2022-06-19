# Estágio Compass.uol

Atividade avaliativa Sprint 2

Questão 9 – (JDBC) - Crie uma entidade produto, com os seguintes atributos:

• id
• nome
• desrição
• desconto
• preço
• data inicio

Sua aplicação deve oferecer no método main ao menos 5 opções no console usando a
classe Scanner.
A primeira opção deve permitir o cadastro de ofertas, porém ao selecioná-la pela primeira
vez, devem ser cadastrados automaticamente 3 ofertas com atributos diferentes;
A segunda opção é “atualizar oferta”, onde a atualização será feita através do id.
A terceira opção será “excluir oferta” pelo id;
A quarta opção deverá listar pelo menos 3 produtos , de acordo com a string passada pelo
Scanner. Além disso, os produtos que serão mostrados, podem conter a palavra no início, meio ou
fim de um registro do banco. Se por exemplo eu passar “xpto notebook”, deveria mostrar algo
assim:
id: 13 – notebook gamer
id 18 – tela de notebook gamer
id 22 – notebook de loja de geladeira
A quinta opção terá a função de “Sair” ao digitar uma tecla específica. Pode ser por exemplo
o “0”.

Obrigatório: É importante ter uma validação se o id já existe antes de executar qualquer
operação. Por exemplo, se for update em um id que não existe, automaticamente deve-se
implementar um insert, já que o id passado não existe.
Se o id existir, segue a operação normalmente.


Questão 10 – (JDBC ou JPA) - Emoticons são símbolos usados para expressar o sentimento de quem
escreve uma mensagem. Scott Fahlman, um professor de uma universidade americana, foi o
primeiro a propor o uso das sequências de caracteres :-) e :-(, que viraram respectivamente
símbolos para “divertido” e “chateado”.
Nosso cliente, está criando uma aplicação que basicamente quer saber como seus
funcionários estão se sentindo baseado nos emoticons citados acima e digitados por eles.
Dada uma mensagem composta por uma cadeia de caracteres, escreva um programa para
determinar o sentimento expresso na mensagem. O seu programa deve usar a classe Scanner para
ler uma linha de entrada e a partir dessa linha, devolver o sentimento expresso e salvar no banco
de dados.
a) neutro: se o número de símbolos “divertido” é igual ao número de símbolos
“chateado”
b) divertido: se o número de símbolos “divertido” é maior do que número de símbolos
“chateado”
c) chateado: se o número de símbolos “chateado” é maior do que número de símbolos
“divertido”.


Exemplos de entrada/saida:
Entrada: Achei o filme muito divertido. Saída: neutro
Entrada: :-):-(:-(:-) . Saída: neutro
Entrada: Sonhei com Java. :-( (vou estudar). Saída: chateado

-Implementações obrigatórias:
Questão 9 utilizar JDBC
Questão 10 utilizar JDBC ou JPA;
Criação do projeto em Maven;
Implementar tratamento de exceção e criar exceções personalizadas.
Utilize POO para criar o código, e considerar as dicas repassadas no feedback de melhoria. Já
implementou todos os requisitos e quer realizar um plus? Será muito bem recebido!

Criem um único projeto utilizando Java 11 e separem as atividades por pacotes.
