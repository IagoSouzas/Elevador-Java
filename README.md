# Elevador-Java
<h1>  Um elevador em Java, com funcionalidades e informações  </h1>

<h2> Atividade pedida </h2>
<strong> A classe Elevador deve possuir os seguintes atributos: </strong>
<ul>
  
<li> andarAtual: representa o andar em que o elevador está no momento (o térreo é representado pelo valor 0). </li>
<li> totalAndares: indica o número total de andares atendidos pelo elevador. </li> </li>
<li> andaresAtendidos: contém os andares em que o elevador pode parar. </li> </li> </li>
<li> capacidadeMaxima: a capacidade máxima de pessoas que o elevador pode suportar. </li>
<li> pessoasPresentes: o número de pessoas atualmente presentes no elevador. </li>
  </ul>
  
<strong> A classe Elevador deve disponibilizar os seguintes métodos: </strong>
<ul>
<li> entra(): adiciona uma pessoa ao elevador, desde que haja espaço disponível. </li>
<li> sai(): remove uma pessoa do elevador, desde que haja alguém dentro dele. </li>
<li> sobe(): faz o elevador subir andares, caso não esteja no último andar atendido. </li>
<li> desce(): faz o elevador descer andares, caso não esteja no térreo ou subsolo. </li>
<li> Além disso, você deve realizar as seguintes tarefas: </li>
</ul>

<strong> Crie três instâncias da classe Elevador e as nomeie como "Elevador da Entrada", "Elevador do Átrio" e "Elevador da Biblioteca". </strong>
 
<li>Defina os andares atendidos por cada elevador, levando em consideração o exemplo do prédio do Senac Lapa Tito. Certifique-se de incluir o subsolo e o quinto andar, conforme a configuração "real". </li>
<li>Defina a capacidade máxima de cada elevador de acordo com as especificações do prédio. </li>
<li>Realize uma sequência de operações em cada elevador para simular seu funcionamento. Por exemplo, faça algumas pessoas entrarem e saírem do elevador, suba e desça alguns andares, exiba o andar atual e o número de pessoas presentes em cada operação. </li>
<li>Utilize mensagens amigáveis para orientar o usuário durante a simulação, utilizando o método <code> System.out.println(). </code> </li>
<li>Para garantir a qualidade do código, considere as seguintes boas práticas:  </li>
