<h1> Design Pattern Alura <h1>

<h2>Strategy<h2>

Este padrão pode ser utilizado quando há diversos possíveis algoritmos para uma ação (como calcular imposto, por exemplo). Nele, nós separamos cada um dos possíveis algoritmos em classes separadas.

A existência de diversos algoritmos para uma ação, resultando na possibilidade de vários ifs.

<h2>Chain of Responsibility<h2>

Se eu precisar editar um pedaço de código, para implementar uma nova funcionalidade, as chances de quebrar funcionalidades existentes são grandes

Sempre que uma nova funcionalidade for implementada, o ideal é que possamos criar código novo e editar o mínimo possível de código já existente. Este é um dos principais pontos do princípio Aberto-Fechado (Open-Closed Principle) do SOLID. Ao editar código existente, podemos acabar quebrando funcionalidades já implementadas e funcionais.

<h2>Template Method <h2>

Com a criação de um método concreto na classe “mãe”, que chama métodos abstratos implementados nas classes “filhas”
Reaproveitar trechos de códigos comuns, evitando duplicações

O padrão Template Method favorece o reaproveitamento de códigos comuns entre classes, evitando assim duplicações de códigos.

<h2>State<h2>

State resolve um problema muito parecido com um problema resolvido pelo padrao Strategy
reduzindo uso de if's no codigo baseados por estados da requisição, é possível que um objeto se comporte de formas diferentes, dependendo do seu estado

Se o resultado de uma chamada de método depende do estado, podemos delegar esta ação para uma classe específica do estado atual

<h2>Command e  Command Handler<h2>

GerarPedidos e GerarPedidosHandler
Representaçao de um comando que precisa ser executado

O padrão de projetos Command é, provavelmente, um dos que mais gera confusão, principalmente no mundo de desenvolvimento web em geral, já que alguns conceitos mais específicos pro mundo da web surgiram e são diferentes dos existentes em aplicações desktop.

Um Command Handler tem como responsabilidade, normalmente, apenas orquestrar as tarefas a serem executadas, ou seja, chamar as classes necessárias que realizam as tarefas desejadas. No nosso caso, o Command Handler tinha todo o código do fluxo em seu corpo.

<h2>Observer<h2>

A ideia do Observer é eu ter classes que estao observando um determinado evento, no caso seria EnviarEmailPedido, como se fosse inversao de controller ao inves de chamar classes por classes, disparamos eventos e as classes listener serao notificadas


Decorator

Permite adicionar novos comportamentos a um objeto, tornando o código bastante flexível e dinâmico, no projeto foi aplicado na classes de IMPOSTO para que possa calcular mais de 1 tipo de imposto em uma só classe sem ter que criar novas classes para calcular cada tipo de imposto


<h2>Facade<h2>

Quando quero realizar uma transferencia sem que o cliente saiba quais Classes, Metodos vou chamar
Em determinados casos, nós podemos precisar de um acesso simplificado a uma parte complexa ou grande do nosso sistema, como autenticação, acesso a sistema de arquivos, cache, etc. Uma classe de fachada, contendo apenas a funcionalidade desejada, pode ser bastante útil
Implementado no metodo   executar();

Que podemos pegar um sub-sistema e expor parte de suas funcionalidades através de uma classe;

Que a classe responsável por ser essa fachada implementa o padrão Facade.


<h2>Proxy Cache<h2>

Podemos utilizar o padrão Proxy para interceptar classes e executar regras de segurança.
Usado tambem para fazer cache, o metodo de exemplo em questao foi o getValor(); com Thread sleep 2seg, ele demora para efetuar a primeira requisição e logo em seguida ele devolve as informaçoes mais rapido devido ao cacheamento



