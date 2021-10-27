Chapter 7
Working with Inheritance
THE OCA EXAM TOPICS COVERED IN THIS PRACTICE TEST INCLUDE
THE FOLLOWING:
Working with Inheritance
Describe inheritance and its benefits
Develop code that makes use of polymorphism; develop code that overrides
methods; differentiate between the type of a reference and the type of an object
Determine when casting is necessary
Use super and this to access objects and constructors
Use abstract classes and interfaces



1. C. O código não é compilado, portanto a Opção A está incorreta. Este código não compila para
duas razões. Primeiro, a variável name é marcada como privada na classe Cinema, que
significa que não pode ser acessado diretamente na classe Movie. Em seguida, a classe Movie define um
construtor que está faltando uma instrução super () explícita. Como o Cinema não
incluir um construtor sem argumento, o super () sem argumento não pode ser inserido
automaticamente pelo compilador sem um erro de compilação. Por esses dois motivos, o
o código não é compilado e a opção C é a resposta correta.
2. D. Todos os métodos abstratos de interface são implicitamente públicos, tornando a Opção D a correta
responda. A opção A está incorreta porque os conflitos protegidos com o público implícito
modificador. Como os métodos estáticos devem ter um corpo e os métodos abstratos não podem ter
um corpo, a opção B está incorreta. Finalmente, a opção C está incorreta. Um método, seja em
interface ou classe, não pode ser declarado final e abstrato, pois isso seria
impedir que seja implementado.
3. C. Uma classe não pode conter dois métodos com a mesma assinatura de método, mesmo que um seja
estático e o outro não é. Portanto, o código não é compilado porque os dois
declarações de playMusic () entram em conflito, tornando a opção C a correta
responda.
4. A. A herança costuma melhorar a reutilização do código, permitindo que as subclasses
herdar atributos e métodos comumente usados ​​das classes pai, tornando a Opção A
a resposta correta. A opção B está incorreta. A herança pode levar a processos mais simples ou
código mais complexo, dependendo de quão bem ele está estruturado. A opção C também está incorreta.
Embora todos os objetos herdam métodos de java.lang.Object, isso não se aplica a
primitivos. Finalmente, a opção D está incorreta porque os métodos que se referem a si mesmos
não são uma faceta da herança.
5. A. Lembre-se de que isso se refere a uma instância da classe atual. Portanto, qualquer superclasse
Canine pode ser usado como um tipo de retorno do método, incluindo o próprio Canine, tornando
Opção C: resposta incorreta. A opção B também está incorreta porque o Canine implementa
a interface Pet. Uma instância de uma classe pode ser atribuída a qualquer referência de interface que
herda. A opção D está incorreta porque Object é a superclasse de instâncias em Java.
Finalmente, a opção A é a resposta correta. Canine não pode ser retornado como uma instância de
Class porque não herda Class.
6. B. A chave aqui é entender quais desses recursos do Java permitem que um desenvolvedor
para criar seu aplicativo em torno do código de outro desenvolvedor, mesmo que esse código não seja
Já pronto. Para esse problema, uma interface é a melhor escolha. Se as duas equipes concordarem em
interface comum, um desenvolvedor pode escrever código que usa a interface, enquanto outro
desenvolvedor escreve código que implementa a interface. Assumindo que nenhuma mudança de equipe
Na interface, o código pode ser facilmente integrado quando as duas equipes estiverem concluídas. Para estes
motivos, a opção B é a resposta correta.
7. B. O método drive () na classe Car não substitui a versão na classe Automobil, pois o método não é visível para a classe Car.
Portanto, o atributo final na classe Automobile não impede que a classe Car implemente um método com
a mesma assinatura. O método drive () na classe ElectricCar é uma substituição válida de
o método na classe Car, com o modificador de acesso em expansão na subclasse. Para
Por esses motivos, o código é compilado e a opção D está incorreta. No método main (), o método
O objeto criado é um ElectricCar, mesmo que esteja atribuído a uma referência de carro. Devido a
polimorfismo, o método do ElectricCar será invocado, tornando a opção B
a resposta correta.
8. D. Embora o Java não permita que uma classe estenda mais de uma classe, ele permite que um
classe para implementar qualquer número de interfaces. A herança múltipla é, portanto, apenas
permitido via interfaces, tornando a opção D a resposta correta.
9. C. Há três problemas com essa substituição de método. Primeiro, o método watch () é
marcado final na aula de televisão. O modificador final teria que ser removido
da definição do método na classe Television para que o método seja compilado
na classe LCD. Segundo, os tipos de retorno void e Object não são covariantes. Um de
eles precisariam ser alterados para que a substituição fosse compatível. Finalmente, o acesso
O modificador na classe filho deve ser o mesmo ou mais amplo que na classe pai. Desde a
package-private é mais estreito que protegido, o código não será compilado. Para estes
motivos, a opção C é a resposta correta.

10. C. Primeiro, os tipos de retorno de um método substituído devem ser covariantes. Em seguida, é
verdade que o modificador de acesso deve ser o mesmo ou mais amplo no método filho. Usando um
O modificador de acesso mais restrito na classe filho não permitiria a compilação do código.
Os métodos substituídos não devem lançar nenhuma exceção verificada nova ou mais ampla que a
método na superclasse. Por esses motivos, as opções A, B e D são declarações verdadeiras.
A opção C é a declaração falsa. Um método substituído não é necessário para lançar um
exceção verificada definida na classe pai.
11. C. O método process () é declarado final na classe Computer. A classe Laptop
Em seguida, tenta substituir esse método, resultando em um erro de compilação, tornando
Opção C, a resposta correta.
12. A. O código é compilado sem problemas, portanto, a Opção D está incorreta. A regra para substituir um
O método com exceções é que a subclasse não pode lançar nenhuma verificação nova ou mais ampla
exceções. Como FileNotFoundException é uma subclasse de IOException, é considerado
uma exceção mais restrita e, portanto, o método substituído é permitido. Devido a
polimorfismo, a versão substituída do método no HighSchool é usada, independentemente
do tipo de referência e 2 é impresso, fazendo da Opção A a resposta correta. Observe que
a versão do método que utiliza as varargs não é usada neste aplicativo.
13. B. Os métodos de interface são implicitamente públicos, tornando as Opções A e C incorretas. Interface
métodos também não podem ser declarados finais, sejam eles estáticos, padrão ou abstratos
métodos, tornando a opção D incorreta. A opção B é a resposta correta porque um
O método da interface pode ser declarado estático .14. C. Ter uma classe implementando duas interfaces que definem o mesmo padrão
A assinatura do método leva a um erro do compilador, a menos que a classe substitua o padrão
método. Nesse caso, a classe Sprint substitui o método walk () corretamente,
portanto, o código é compilado sem problemas e a opção C está correta.
15. B. As interfaces podem estender outras interfaces, tornando a Opção A incorreta. No outro
Por outro lado, uma interface não pode implementar outra interface, tornando a Opção B a correta
responda. Uma classe pode implementar qualquer número de interfaces, tornando a Opção C incorreta.
Finalmente, uma classe pode estender outra classe, tornando a Opção D incorreta.
16. D. O código não é compilado porque super.height não é visível na classe Rocket,
tornando a opção D a resposta correta. Mesmo que a classe Rocket defina uma altura
valor, a super palavra-chave procura uma versão herdada. Como não há, o código
não compila. Observe que super.getWeight () retorna 3 da variável no
classe pai, como polimorfismo e substituição não se aplica a variáveis ​​de instância.
17. D. Uma classe abstrata pode conter métodos abstratos e concretos, enquanto uma classe
A interface pode conter apenas métodos abstratos. Com o Java 8, as interfaces agora podem ter
métodos estáticos e padrão, mas a pergunta os exclui especificamente, tornando
Opção D, a resposta correta. Observe que classes concretas não podem conter nenhum resumo
métodos.
18. C. O código não é compilado, portanto a opção D está incorreta. O Triângulo Isósceles
classe é abstrata; portanto, não pode ser instanciado na linha g3. Somente classes concretas
pode ser instanciado, para que o código não seja compilado e a opção C seja a resposta correta.
O restante das linhas de código é compilado sem problemas. Uma classe concreta pode estender uma
classe abstrata e uma classe abstrata podem estender uma classe concreta. Além disso, observe que o
A substituição de getDescription () possui um modificador de acesso ampliado, o que é bom para o
regras de substituição de métodos.
19. D. O método play () é substituído no saxofone para o Horn e o Woodwind, então o
O tipo de retorno deve ser covariante com ambos. Infelizmente, os métodos herdados devem
também ser compatíveis entre si. Como Integer não é uma subclasse de Short e vice
versa, não há subclasse que possa ser usada para preencher o espaço em branco que permitiria
código para compilar. Em outras palavras, a classe saxofone não pode compilar independentemente de sua
implementação de play (), tornando a opção D a resposta correta.
20. C. Uma classe pode implementar uma interface, não estendê-la. Como alternativa, uma classe estende um
classe abstrata. Portanto, a opção C é a resposta correta.

21. A. O código compila e executa sem problemas, tornando as Opções C e D incorretas.
Embora super.material e this.material sejam más escolhas no acesso a estática
variáveis, são permitidas. Como super é usado para acessar a variável em
getMaterial (), o valor papyrus é retornado, tornando a opção A a resposta correta.
Além disso, observe que o construtor Book (String) não é usado na classe Encyclopedia.
22. B. As opções A e C são ambas afirmações verdadeiras. Referência de unknownBunny
A variável é igual ao tipo de objeto ou pode ser convertida explicitamente no tipo de objeto Bunny, fornecendo acesso a todos os seus membros. Esta é a principal distinção entre
tipos de referência e tipos de objetos. Atribuir uma nova referência não altera o
objeto subjacente. A opção D também é uma afirmação verdadeira, já que qualquer superclasse que Bunny
estende ou interface que implementa pode ser usado como o tipo de dados para unknownBunny.
A opção B é a afirmação falsa e a resposta correta. Um objeto pode ser atribuído a um
tipo de variável de referência que ele herda, como Object unknownBunny = new Bunny ().
23. D. Um método abstrato não pode incluir o método final ou privado. Se uma classe
continha um desses modificadores, nenhuma subclasse concreta seria capaz de
substitua-os por uma implementação. Por esses motivos, as opções A e B são
incorreta. A opção C também está incorreta porque a palavra-chave padrão se aplica a concreto
métodos de interface, não métodos abstratos. Finalmente, a opção D está correta. O protegido,
Os modificadores de acesso público e privado do pacote podem ser aplicados a métodos abstratos.
24. D. A declaração do Sphere é compilada sem problemas, portanto a opção C está incorreta. Marte
declaração de classe é inválida porque Marte não pode estender Sphere, uma interface, nem pode
Marte implementa o Planet, uma classe. Em outras palavras, eles são revertidos. Como o código não
não compilar, a opção D é a resposta correta. Observe que se Sphere e Planet fossem
trocado na definição de classe de Marte, o código seria compilado e a saída seria
Marte, tornando a opção A a resposta correta.
25. B. Uma referência a uma classe pode ser implicitamente atribuída a uma referência de superclasse sem um
classe explícita, tornando a opção B a resposta correta. Atribuindo uma referência a uma subclasse,
no entanto, requer uma conversão explícita, tornando a Opção A incorreta. A opção C também está incorreta
porque uma interface não herda de uma classe. Uma referência a uma interface requer
um elenco explícito a ser atribuído a uma referência de qualquer classe, mesmo que implemente
a interface. Uma referência de interface requer que uma conversão explícita seja atribuída a uma classe
referência. Finalmente, a opção D está incorreta. Uma conversão explícita não é necessária para atribuir uma
referência a uma classe que implementa uma interface para uma referência da interface.
26. B. As variáveis ​​de interface são implicitamente públicas, estáticas e finais. Variáveis ​​não podem ser
declarado como abstrato em interfaces, nem em classes.
27. C. A classe é carregada primeiro, com o bloco de inicialização estático chamado e 1 é
emitido primeiro. Quando o BlueCar é criado no método main (), a superclasse
a inicialização acontece primeiro. Os blocos de inicialização da instância são executados antes do
construtor, então 32 é gerado a seguir. Finalmente, a classe é carregada com a instância
blocos de inicialização sendo chamados novamente antes do construtor, produzindo 45. o
O resultado é que 13245 é impresso, tornando a opção C a resposta correta.
28. C. Os métodos sobrecarregados compartilham o mesmo nome, mas uma lista diferente de parâmetros e uma
tipo de retorno opcionalmente diferente, enquanto métodos substituídos compartilham exatamente o mesmo nome,
lista de parâmetros e tipo de retorno. Para ambos, o único ponto em comum é que eles
compartilhe o mesmo nome do método, fazendo da Opção C a resposta correta.
29. A. Embora o elenco seja um pouco demais, o objeto em questão é um SoccerBall. Desde a
O SoccerBall estende a Bola e implementa o Equipamento, que pode ser explicitamente convertido para qualquer um desses tipos, para que nenhum erro de compilação ocorra. Em tempo de execução, o objeto é passado
devido ao polimorfismo, pode ser lido usando qualquer uma dessas referências desde
objeto subjacente é um SoccerBall. Em outras palavras, convertê-lo para uma referência diferente
A variável não modifica o objeto ou faz com que ele perca seu SoccerBall subjacente
em formação. Portanto, o código é compilado sem problemas e a opção A está correta.

30. C. Ambas as descrições se referem a métodos variáveis ​​e estáticos, respectivamente,
tornando a opção C correta. Somente métodos de instância podem ser substituídos, tornando as Opções A
e B incorreto. A opção D também está incorreta porque substituir não é um termo real neste
contexto.
31. B. O código não é compilado, portanto a opção D está incorreta. A questão aqui é que o
a substituição de getEqualSides () no Square é inválida. Um método estático não pode substituir um
método não estático e vice-versa. Por esse motivo, a opção B é a resposta correta.
32. C. O aplicativo não é compilado, mas não por qualquer motivo relacionado ao elenco
no método main (). A classe Rotorcraft inclui um método abstrato, mas a classe
em si não é marcado como abstrato. Somente interfaces e classes abstratas podem incluir resumo
métodos. Como o código não é compilado, a opção C é a resposta correta.
33. B. Uma classe pode ser trivialmente atribuída a uma variável de referência da superclasse, mas requer um
conversão explícita a ser atribuída a uma variável de referência da subclasse. Por esses motivos, a opção
B está correto.
34. C. Uma classe concreta é a primeira subclasse não abstrata que estende uma classe abstrata e
implementa quaisquer interfaces herdadas. É necessário implementar todo resumo herdado
métodos, tornando a opção C a resposta correta.
35. D. Antes de tudo, as interfaces podem conter apenas métodos abstratos, finais e padrão. o
O método fly () definido no CanFly não está marcado como estático ou padrão e define um
implementação, um {} vazio, significando que não pode ser assumido como abstrato;
portanto, o código não compila. Em seguida, a implementação do fly (int speed) em
a classe Bird também não compila, mas não por causa da assinatura. O método
body falha ao retornar um valor int. Como é um método sobrecarregado, se ele retornar um
valor que ele compilaria sem problemas. Finalmente, a classe Eagle não compila
porque estende a classe Bird, que é marcada como final e, portanto, não pode ser
estendido. Por esses três motivos, a opção D é a resposta correta.
36. B. As classes e interfaces abstratas podem conter métodos estáticos e abstratos, conforme
bem como variáveis ​​estáticas, mas apenas uma interface pode conter métodos padrão.
Portanto, a opção B está correta.
37. C. Java não permite herança múltipla, portanto, ter uma classe estende duas interfaces
que ambos definem a mesma assinatura de método padrão leva a um erro do compilador, a menos que
a classe substitui o método Nesse caso, porém, o método talk (String ...)
definido na classe Performance não é uma versão substituída do método definido no
interfaces porque as assinaturas não coincidem. Portanto, a classe Performance não
não compila, pois a classe herda dois métodos padrão com a mesma assinatura e38. R. Em Java, apenas métodos não estáticos, não finais e não privados são considerados
virtual e capaz de ser substituído em uma subclasse. Por esse motivo, a opção A é a
resposta correta.
39. B. Uma interface só pode estender outra interface, enquanto uma classe só pode estender
outra classe. Uma classe também pode implementar uma interface, embora essa comparação seja
não faz parte do texto da pergunta. Portanto, a opção B é a resposta correta.
40. A. O código é compilado sem problemas, portanto, a opção D está incorreta. Java permite métodos para
ser substituído, mas não variáveis. Portanto, marcá-los como finais não impede
eles sejam reimplementados em uma subclasse. Além disso, o polimorfismo não
aplica-se da mesma maneira que aplicaria aos métodos e às variáveis. Em particular, o
O tipo de referência determina a versão da variável secreta selecionada, tornando
a saída 2 e a opção A a resposta correta.

41. D. As opções A e C estão incorretas porque um método substituído não pode reduzir o
visibilidade do método herdado. A opção B está incorreta porque um método substituído
não pode declarar uma exceção verificada mais ampla que o método herdado. Finalmente, opção
D é a resposta correta. A remoção da exceção verificada, a aplicação de um
modificador de acesso mais amplo, e a adição do atributo final é permitida para
métodos substituídos.
42. C. O método setAnimal () requer um objeto que seja Dog ou uma subclasse de Dog. Desde a
Husky extende Dog, as opções A e B permitem que o código seja compilado. A opção D também é
válido porque um valor nulo não possui um tipo e pode ser atribuído a qualquer referência
variável. A opção C é o único valor que impede a compilação do código porque
Lobo não é uma subclasse de Cão. Mesmo que Wolf possa ser atribuído à instância Canine
variável, o setter requer um parâmetro compatível.
43. A. Um método de interface pode ser abstrato e não ter um corpo, ou pode ser padrão ou
estático e ter um corpo. Um método de interface não pode ser final, tornando Option
A resposta correta.
44. A. Parece que getSpace () na classe Room é uma substituição inválida da versão no diretório
Classe House, já que package-private é um modificador de acesso mais restritivo que protegido,
mas a lista de parâmetros muda; portanto, esse é um método sobrecarregado, não um
substituído. Além disso, a classe Ballroom é abstrata, portanto, nenhum objeto é
instanciado, mas não há exigência de que uma classe abstrata não possa conter um
método main () executável. Por esses motivos, o código compila e executa sem problemas,
tornando a opção A correta.
45. D. Truque de pergunta! A opção A parece ser a resposta correta, mas a segunda parte do
A sentença é falsa, independentemente de você inserir sobrecarregado ou substituído.
Os métodos substituídos devem ter tipos de retorno covariantes, que podem não ser exatamente o
mesmo que o tipo na classe pai. Portanto, a opção D é a resposta correta. B. Se uma classe pai não incluir um construtor sem argumento, uma classe filha ainda poderá
declarar explicitamente um; ele apenas precisa chamar um construtor pai apropriado com
super (), tornando a opção A incorreta. Se uma classe pai não incluir um argumento sem argumento
construtor, a classe filho deve declarar explicitamente um construtor, pois o compilador
não poderá inserir o construtor sem argumento padrão, tornando a Opção B
corrigir. A opção C está incorreta porque uma classe pai pode ter um argumento sem argumento
construtor, enquanto suas subclasses não. Se a opção C fosse verdadeira, todas as classes seriam
necessário ter construtores sem argumento, pois todos eles estendem java.lang.Object,
que tem um construtor sem argumento. A opção D também está incorreta. O padrão
O construtor de argumentos pode ser inserido em qualquer classe que estenda diretamente uma classe que
possui um construtor sem argumento. Portanto, nenhum construtor na subclasse é
requeridos.
47. D. O tipo de objeto refere-se aos atributos do objeto que existem na memória, enquanto
o tipo de referência determina como o objeto pode ser usado pelo chamador. Para estes
motivos, a opção D está correta.
48. A. O método play () é substituído no Violin para o MusicCreator e
StringInstrument, portanto, o tipo de retorno deve ser covariante com ambos. Long é uma subclasse de
Number e, portanto, é covariante com a versão no MusicCreator. Desde que
corresponde ao tipo em StringInstrument, ele pode ser inserido no espaço em branco e o código
compilaria. Enquanto Inteiro é uma subclasse de Number, significa a substituição de
MusicCreator é válido, não é uma subclasse de Long usada em StringInstrument. Portanto,
usar Inteiro faria com que o código não fosse compilado. Finalmente, Number é compatível com
a versão do método no MusicCreator, mas não com a versão em
StringInstrument, porque Number é uma superclasse de Long, não uma subclasse. Para estes
razões, Long é a única classe que permite que o código seja compilado, tornando a Opção A a
resposta correta.
49. B. A principal motivação para adicionar métodos de interface padrão ao Java foi para
compatibilidade com versões anteriores. Esses métodos permitem que os desenvolvedores atualizem classes mais antigas com
uma versão mais recente de uma interface sem interromper a funcionalidade nas classes existentes,
tornando a opção B a resposta correta. A opção A é absurda e não é a correta
responda. As opções C e D parecem plausíveis, mas ambas podem ser realizadas com estática
métodos de interface sozinho.
50. C. A regra para substituir um método com exceções é que a subclasse não pode lançar
quaisquer exceções verificadas novas ou mais amplas. Como IOException é uma superclasse de
EOFException, a partir da descrição da pergunta, vemos que essa é uma exceção mais ampla
e, portanto, não é compatível. Por esse motivo, o código não é compilado e Option
C é a resposta correta.