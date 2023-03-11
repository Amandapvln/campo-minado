# Campo Minado em Java

<h3>Este projeto consiste em uma implementação do jogo Campo Minado em Java. O objetivo do jogo é desvendar todas as células sem detonar uma bomba.</h3>
O jogo é implementado utilizando a biblioteca gráfica Swing e possui três níveis de dificuldade: fácil (9x9 com 10 bombas), médio (16x16 com 40 bombas) e difícil (30x16 com 99 bombas).

<h2>Como jogar</h2>

Para jogar, basta clicar em "Run" na sua IDE e o jogo iniciará no console. Será feita a seguinte pergunta: "Digite (x, y):" o usuário irá digitar em qual linha ou coluna deseja fazer uma ação, sendo 1 - Abrir ou 2 - (Des)Marcar.
Para sair do jogo, digite "sair" e irá encerrar o jogo.

<h3>Ao escolher uma linha e coluna, pode acontecer uma das seguintes situações:</h3>
<ul>
<li>Se a célula escolhida contém uma bomba, o jogo acaba e o jogador perde.</li>
<li>Se a célula escolhida não contém uma bomba, será exibido um número indicando a quantidade de bombas nas células vizinhas. Se todas as células que não contém bombas forem reveladas, o jogador vence o jogo.</li>
</ul>


Este projeto foi desenvolvido por Amanda Lino.
