Chapter 2
Working with Java Data Types
THE OCA EXAM TOPICS COVERED IN THIS PRACTICE TEST INCLUDE
THE FOLLOWING:
Working with Java Data Types
Declare and initialize variables (including casting of primitive data types)
Differentiate between object reference variables and primitive variables
Know how to read or write to object fields
Explain an Object’s Lifecycle (creation, “dereference by reassignment” and garbage
collection)
Develop code that uses wrapper classes such as Boolean, Double, and Integer


1. Which of the following declarations does not compile?
A. double num1, int num2 = 0;
B. int num1, num2;
C. int num1, num2 = 0;
D. int num1 = 0, num2 = 0;

2. What is the output of the following?
public static void main(String... args) {
String chair, table = "metal";
chair = chair + table;
System.out.println(chair);
}

A. metal
B. metalmetal
C. nullmetal
D. The code does not compile.

3. Which is correct about an instance variable of type String ?
A. It defaults to an empty string.
B. It defaults to null .
C. It does not have a default value.
D. It will not compile without initializing on the declaration line.

4. Which of the following is not a valid variable name?
A. _blue
B. 2blue
C. blue$
D. Blue

5. Which of these class names best follows standard Java naming conventions?
A. fooBar
B. FooBar
C. FOO_BAR
D. F_o_o_B_a_r

6. How many of the following methods compile?
public String convert(int value) {
return value.toString();}
public String convert(Integer value) {
return value.toString();
}
public String convert(Object value) {
return value.toString();
}
A. None
B. One
C. Two
D. Three

7. Which of the following does not compile?
A. int num = 999;
B. int num = 9_9_9;
C. int num = _9_99;
D. None of the above; they all compile.

8. Which of the following is a wrapper class?
A. int
B. Int
C. Integer
D. Object

9. What is the result of running this code?
public class Values {
integer a = Integer.valueOf("1");
public static void main(String[] nums) {
integer a = Integer.valueOf("2");
integer b = Integer.valueOf("3");
System.out.println(a + b);
}
}
A. 4
B. 5
C. The code does not compile.
D. The code compiles but throws an exception at runtime.

10. Which best describes what the new keyword does?
A. Creates a copy of an existing object and treats it as a new oneB. Creates a new primitive
C. Instantiates a new object
D. Switches an object reference to a new one

11. Which is the first line to trigger a compiler error?
double d1 = 5f; //P1
double d2 = 5.0; //P2
float f1 = 5f; //P3
float f2 = 5.0; //P4
A. p1
B. p2
C. p3
D. p4

12. Which of the following lists of primitive types are presented in order from smallest to
largest data type?
A. byte , char , float , double
B. byte , char , double , float
C. char , byte , float , double
D. char , double , float , bigint

13. Which of the following is not a valid order for elements in a class?
A. Constructor, instance variables, method names
B. Instance variables, constructor, method names
C. Method names, instance variables, constructor
D. None of the above: all orders are valid.

14. Which of the following lines contains a compiler error?
String title = "Weather"; // line x1
int hot, double cold; // line x2
System.out.println(hot + " " + title); // line x3
A. x1
B. x2
C. x3
D. None of the above

15. How many instance initializers are in this code?
1:public class Bowling {
2:{ System.out.println(); }
3:public Bowling () {
4:System.out.println();
5:}
6:static { System.out.println(); }
7:{ System.out.println(); }
8:}

A. None
B. One
C. Two
D. Three

16. Of the types double , int , and short , how many could fill in the blank to have this code
output 0 ?
public static void main(String[] args) {
_______defaultValue;
System.out.println(defaultValue);
}
A. None
B. One
C. Two
D. Three

17. What is true of the finalize() method?
A. It may be called zero or one times.
B. It may be called zero or more times.
C. It will be called exactly once.
D. It may be called one or more times.

18. Which of the following is not a wrapper class?
A. Double
B. Integer
C. Long
D. String

19. Suppose you have the following code. Which of the images best represents the state of
the references right before the end of the main method, assuming garbage collection hasn’t run?
1: public class Link {
2: private String name;
3: private Link next;
4: public Link(String name, Link next) {
5: this.name = name;
6: this.next = next;
7: }
8: public void setNext(Link next) {
9: this.next = next;
10: }
11: public Link getNext() {
12: return next;
13: }
14: public static void main(String... args) {
15: Link link1 = new Link("x", null);
16: Link link2 = new Link("y", link1);
17: Link link3 = new Link("z", link2);
18: link2.setNext(link3);
19: link3.setNext(link2);
20: link1 = null;
21: link3 = null;
22: }
23: }


A. Option A
B. Option B
C. Option C
D. Option D


20. Which type can fill in the blank?
_______ pi = 3.14;
A. byte
B. float
C. double
D. short

21. What is the first line in the following code to not compile?
public static void main(String[] args) {
int Integer = 0; // k1
Integer int = 0; // k2
Integer ++; // k3
int++; // k4
}
A. k1
B. k2
C. k3
D. k4

22. Suppose foo is a reference to an instance of a class. Which of the following is not true about foo.bar ?
A. bar is an instance variable.
B. bar is a local variable.
C. It can be used to read from bar .
D. It can be used to write to bar .

23. Which of the following is not a valid class declaration?
A. class building {}
B. class Cost$ {}
C. class 5MainSt {}
D. class _Outside {}

24. Which of the following can fill in the blanks to make this code compile?
_______d = new_______ (1_000_000_.00);
A. double , double
B. double , Double
C. Double , double
D. None of the above

25. Which is correct about a local variable of type String ?
A. It defaults to an empty string.
B. It defaults to null .
C. It does not have a default value.
D. It will not compile without initializing on the declaration line.

26. Of the types double , int , long , and short , how many could fill in the blank to have this
code output 0 ?
static
_______defaultValue;
public static void main(String[] args) {
System.out.println(defaultValue);
}
A. One
B. Two
C. Three
D. Four

27. Which of the following is true about primitives?
A. You can call methods on a primitive.
B. You can convert a primitive to a wrapper class object simply by assigning it.
C. You can convert a wrapper class object to a primitive by calling valueOf() .
D. You can store a primitive directly into an ArrayList .

28. What is the output of the following?
Integer integer = new Integer(4);
System.out.print(integer.byteValue());
System.out.print("-");
int i = new Integer(4);
System.out.print(i.byteValue());
A. 4-0
B. 4-4
C. The code does not compile.
D. The code compiles but throws an exception at runtime.

29. Given the following code, fill in the blank to have the code print bounce .
public class TennisBall {
public TennisBall() {
System.out.println("bounce");
}
public static void main(String[] slam) {_____________________
}

}
A. TennisBall;
B. TennisBall();
C. new TennisBall;
D. new TennisBall();

30. Which of the following correctly assigns animal to both variables?
I. String cat = "animal", dog = "animal";
II. String cat = "animal"; dog = "animal";
III. String cat, dog = "animal";
IV. String cat, String dog = "animal";
A. I
B. I, II
C. I, III
D. I, II, III, IV

31. Which two primitives have wrapper classes that are not merely the name of the
primitive with an uppercase letter?
A. byte and char
B. byte and int
C. char and int
D. None of the above

32. Which of the following is true about String instance variables?
A. They can be set to null .
B. They can never be set from outside the class they are defined in.
C. They can only be set in the constructor.
D. They can only be set once per run of the program.

33. Which statement is true about primitives?
A. Primitive types begin with a lowercase letter.
B. Primitive types can be set to null .
C. String is a primitive.
D. You can create your own primitive types.34. How do you force garbage collection to occur at a certain point?

34. How do you force garbage collection to occur at a certain point?
A. Call System.forceGc()
B. Call System.gc()
C. Call System.requireGc()
D. None of the above

35. How many of the String objects are eligible for garbage collection right before the end of the main method?
public static void
String fruit1 =
String fruit2 =
String fruit3 =
main(String[] fruits) {
new String("apple");
new String("orange");
new String("pear");
fruit3 = fruit1;
fruit2 = fruit3;
fruit1 = fruit2;
}
A. None
B. One
C. Two
D. Three

36. Which of the following can fill in the blanks to make this code compile?
_______d = new_______ (1_000_000.00);
A. double , double
B. double , Double
C. Double , double
D. None of the above

37. What does the following output?
1: public class InitOrder {
2: public String first = "instance";
3: public InitOrder() {
4: first = "constructor";
5: }
6: { first = "block"; }
7: public void print() {
8: System.out.println(first);
9: }
10: public static void main(String... args) {
11:new InitOrder().print();
12:}
13: }

A. block
B. constructor
C. instance
D. The code does not compile.

38. How many of the following lines compile?
int i = null;
Integer in = null;
String s = null;
A. None
B. One
C. Two
D. Three

39. Which pairs of statements can accurately fill in the blanks in this table?
Variable Type Can be called within the class from what type of method
Instance Blank 1:_______
Static Blank 2: _______
A. Blank 1: an instance method only, Blank 2: a static method only
B. Blank 1: an instance or static method, Blank 2: a static method only
C. Blank 1: an instance method only, Blank 2: an instance or static method
D. Blank 1: an instance or static method, Blank 2: an instance or static method

40. Which of the following does not compile?
A. double num = 2.718;
B. double num = 2._718;
C. double num = 2.7_1_8;
D. None of the above; they all compile.

41. Which of the following lists of primitive numeric types is presented in order from
smallest to largest data type?
A. byte , short , int , long
B. int , short , byte , long
C. short , byte , int , long
D. short , int , byte , long42. Fill in the blank to make the code compile:
package animal;
public class Cat {
public String name;
public static void main(String[] meow) {
Cat cat = new Cat();
______________ = "Sadie";
}
}


42. Fill in the blank to make the code compile:
package animal;
public class Cat {
public String name;
public static void main(String[] meow) {
Cat cat = new Cat();
______________ = "Sadie";
}
}

A. cat.name
B. cat-name
C. cat.setName
D. cat[name]

43. Which of the following is the output of this code, assuming it runs to completion?
package store;
public class Toy {
public void play() {
System.out.print("play-");
}
public void finalizer() {
System.out.print("clean-");
}
public static void main(String[] fun) {
Toy car = new Toy();
car.play();
System.gc();
Toy doll = new Toy();
doll.play();
}
}
A. play-
B. play-play-
C. play-clean-play-
D. play-play-clean-clean-

44. Which is the most common way to fill in the blank to implement this method?
public class Penguin {
private double beakLength;
public static void setBeakLength(Penguin p, int b) {
_____________________________
}
}
A. p.beakLength = b;B. p['beakLength'] = b;
C. p[beakLength] = b;
D. None of the above

45. Fill in the blanks to indicate whether a primitive or wrapper class can be assigned
without the compiler using the autoboxing feature.
_______first = Integer.parseInt("5");
_______second = Integer.valueOf("5");
A. int , int
B. int , Integer
C. Integer , int
D. Integer , Integer

46. How many objects are eligible for garbage collection right before the end of the main method?
1: public class Person {
2: public Person youngestChild;
3: public static void main(String... args) {
4: Person elena = new Person();
5: Person diana = new Person();
7: elena.youngestChild = diana;
8: diana = null;
9: Person zoe = new Person();
10: elena.youngestChild = zoe;
11: zoe = null;
12: }
13: }

A. None
B. One
C. Two
D. Three

47. Which is a valid constructor for this class?
public class TennisBall {
}
A. public TennisBall static create() { return new TennisBall(); }
B. public TennisBall static newInstance() { return new TennisBall():}
C. public TennisBall() {}
D. public void TennisBall() {}

48. Which of the following is not a possible output of this code, assuming it runs to
completion?
package store;
public class Toy {
public void play() {
System.out.print("play-");
}
public void finalize() {
System.out.print("clean-");
}
public static void main(String[] args) {
Toy car = new Toy();
car.play();
System.gc();
Toy doll = new Toy();
doll.play();
}
}
A. play-
B. play-play-
C. play-play-clean-
D. play-play-clean-clean-

49. Which converts a primitive to a wrapper class object without using autoboxing?
A. Call the asObject() method
B. Call the constructor of the wrapper class
C. Call the convertToObject() method
D. Call the toObject() method

50. What is the output of the following?
package beach;
public class Sand {
public Sand() {
System.out.print("a");
}
public void Sand() {
System.out.print("b");
}
public void run() {
new Sand();
Sand();
}
public static void main(String... args) {
new Sand().run();
}
}
A. aB. ab
C. aab
D. None of the above


#COmments Question 
[pt]
1. A. A opção A não compila porque o Java não permite declarar tipos diferentes como
parte da mesma declaração. As outras três opções mostram várias combinações legais
de combinar várias variáveis ​​nas mesmas declarações com valores padrão opcionais.

2. D. A variável da tabela é inicializada como "metal". No entanto, a cadeira não é inicializada. Dentro
Java, a inicialização é por variável e não para todas as variáveis ​​em uma única declaração.
Portanto, a segunda linha tenta referenciar uma variável local não inicializada e faz
não compilar, o que torna a opção D correta.

3. B. As variáveis ​​da instância têm um valor padrão com base no tipo. Para qualquer não primitivo,
incluindo String, esse tipo é uma referência a null. Portanto, a opção B está correta. Se o
variável fosse uma variável local, a opção C estaria correta.

4. B. Um nome de identificador deve começar com uma letra, $ ou _. Os números são permitidos apenas para
caracteres subseqüentes. Portanto, a opção B não é um nome de variável válido.

5. B. Em Java, os nomes de classe começam com uma letra maiúscula por convenção. Então eles usam
minúsculas, com exceção de novas palavras. A opção B segue esta convenção e é
corrigir. A opção A segue a convenção para nomes de variáveis. A opção C segue o
convenção para constantes. A opção D não segue nenhuma convenção Java.

6. C. Os objetos têm métodos de instância, enquanto os primitivos não. Como int é um primitivo, você
não pode chamar métodos de instância nele. Inteiro e String são ambos objetos e têm
métodos de instância. Portanto, a opção C está correta.

7. C. Sublinhados são permitidos entre dois dígitos em um literal numérico. Sublinhados
não são permitidos no início ou no final do literal, tornando a opção C a correta
responda.

8. C. A opção A está incorreta porque int é uma primitiva. A opção B está incorreta porque é
não é o nome de uma classe em Java. Embora a Opção D seja uma classe em Java, não é um wrapper
classe porque não mapeia para uma primitiva. Portanto, a opção C está correta.

9. C. Não existe uma classe chamada número inteiro. Existe um int primitivo e uma classe Inteiro.
Portanto, o código não é compilado e a opção C está correta. Se o tipo foi alterado
para Inteiro, a opção B estaria correta.

10. C. A nova palavra-chave é usada para chamar o construtor de uma classe e instanciar um
instância da classe. Uma primitiva não pode ser criada usando a nova palavra-chave. Lidando
com referências acontece depois que o objeto criado por new é retornado.

11. D. Java usa o sufixo f para indicar que um número é flutuante. Java amplia automaticamente um
, permitindo que um ponto flutuante seja atribuído a um ponto flutuante ou duplo. Isso faz com que ambos
as linhas p1 e p3 são compiladas. A linha p2 é compilada sem um sufixo. A linha p4 não
compilar sem sufixo e, portanto, é a resposta.

12. A. Um byte é menor que um caractere, tornando a Opção C incorreta. bigint não é um primitivo, tornando a Opção D incorreta. Um double usa o dobro de memória que uma variável float,
portanto, a opção A está correta.

13. D. As variáveis ​​de instância, construtor e nomes de métodos podem aparecer em qualquer ordem
dentro de uma declaração de classe.

14. B. Java não permite que vários tipos de dados Java sejam declarados na mesma declaração,
tornando a opção B a resposta correta. Se o dobro fosse removido, tanto o quente quanto o frio
seja do mesmo tipo. Em seguida, o erro do compilador estaria no x3 por causa de uma referência a um
variável não inicializada.

15. C. As linhas 2 e 7 ilustram os inicializadores de instância. A linha 6 é um inicializador estático. Linhas 3 a 5
é um construtor.

16. A. Como defaultValue é uma variável local, ela não é inicializada automaticamente. Que significa
o código não será compilado com nenhum tipo. Portanto, a opção A está correta. Se isso foi um
variável de instância, a opção C estaria correta, pois int e short seriam inicializados em 0
enquanto o dobro seria inicializado como 0,0.

17. A. O método finalize () não pode ser chamado, como se o seu programa travasse.
No entanto, é garantido que não será chamado mais de uma vez.

18. D. String é uma classe, mas não é uma classe de wrapper. Para ser uma classe de wrapper, o
A classe deve ter um mapeamento individual com um primitivo.

19. C. As linhas 15 a 17 criam os três objetos. As linhas 18–19 alteram as referências para que o link2
e link3 apontam um para o outro. As linhas 20–21 apagam duas das referências originais.
Isso significa que o objeto com nome como x está inacessível.

20. C. As opções A e D estão incorretas porque byte e short não armazenam valores com
pontos decimais. A opção B é tentadora. No entanto, 3.14 é automaticamente um duplo. isto
requer que a transmissão flutue ou escreva 3.14f para ser atribuída a uma flutuação. Portanto,
A opção C está correta.

21. B. Inteiro é o nome de uma classe em Java. Embora seja uma prática ruim usar o nome de um
classe como o nome da variável local, isso é legal. Portanto, o k1 compila. Não é
legal usar uma palavra reservada como um nome de variável. Todas as primitivas, incluindo int, são
Palavras reservadas. Portanto, k2 não compila e a opção B é a resposta. Linha k4
também não compila, mas a pergunta é sobre a primeira linha a não compilar.

22. B. A notação de ponto é usada para variáveis ​​de instância de leitura e gravação, assumindo que
estão no escopo. Ele não pode ser usado para fazer referência a variáveis ​​locais, tornando a Opção B a
resposta correta.

23. C. Os nomes das classes seguem os mesmos requisitos que outros identificadores. Sublinhados e
cifrões são permitidos. Os números são permitidos, mas não como o primeiro caractere de um
identificador. Portanto, a opção C está correta. Observe que os nomes das classes começam com um
letra maiúscula por convenção, mas isso não é um requisito.

24. D. Esta questão é complicada, pois parece ser sobre classes primitivas vs. classes de wrapper. Olhando atentamente, há um sublinhado logo antes do ponto decimal. Isso é ilegal, pois
o sublinhado em um literal numérico pode aparecer apenas entre dois dígitos.

25. C. Variáveis ​​locais não têm um valor de inicialização padrão. Se eles são referenciados
Antes de ser definido como um valor, o código não é compilado. Portanto, a opção C está correta.
Se a variável fosse uma variável de instância, a Opção B estaria correta. A opção D é complicada.
Uma variável local será compilada sem uma inicialização se não for referenciada em nenhum lugar ou
é atribuído um valor antes de ser referenciado.

26. C. Como defaultValue é uma variável de instância, ela é automaticamente inicializada no
valor correspondente para esse tipo. Para o dobro, esse valor é 0,0. Por outro lado, é 0 para
int, longo e curto. Portanto, a opção C está correta.

27. B. A opção B é um exemplo de caixa automática. Java converterá automaticamente de
primitivo para tipos de classe de wrapper e vice-versa. A opção A está incorreta porque você pode
chame apenas métodos em um objeto. A opção C está incorreta porque esse método é usado para
convertendo para uma classe de wrapper a partir de uma String. A opção D está incorreta porque a caixa automática
irá converter o primitivo em um objeto antes de adicioná-lo ao ArrayList.

28. C. Java não permite chamar um método em um primitivo. Embora a caixa automática permita
a atribuição de um número inteiro a um int, ele não permite chamar um método de instância
em um primitivo. Portanto, a última linha não compila.

29. D. Para chamar um construtor, você deve usar a nova palavra-chave. Não pode ser chamado como
se fosse um método normal. Isso exclui as opções A e B. Além disso, a opção C é
incorreto porque os parênteses são obrigatórios.

30. A. A opção A (I) atribui corretamente o valor a ambas as variáveis. II não compila como cão
não tem um tipo Observe o ponto-e-vírgula nessa linha, que inicia uma nova instrução.
III compila, mas apenas atribui o valor ao cão, uma vez que uma declaração atribui apenas a um
variável em vez de tudo na declaração. IV não compila porque o
O tipo deve ser especificado apenas uma vez por declaração.

31. C. A classe de wrapper para int é Integer e a classe de wrapper para char é Character. Todos
outras primitivas têm o mesmo nome. Por exemplo, a classe de wrapper para booleano é
Boleano .

32. A. Supondo que as variáveis ​​não sejam primitivas, elas permitem uma atribuição nula. O outro
declarações são falsas.

33. A. Um exemplo de um tipo primitivo é int. Todos os tipos primitivos são minúsculos, tornando
Opção A correta. Diferentemente das variáveis ​​de referência de objeto, as primitivas não podem fazer referência a nulo.
String não é uma primitiva, como evidenciado pela letra maiúscula no nome e no fato
que podemos chamar métodos nele. Você pode criar suas próprias classes, mas não primitivas.

34. D. Embora você possa sugerir à JVM que talvez queira executar uma coleta de lixo
ciclo, a JVM é livre para ignorar sua sugestão. A opção B é como fazer isso
sugestão. Como não é garantido que a coleta de lixo seja executada, a Opção D está correta.

35. C. Todas as três referências apontam para a maçã String. Isso torna as outras duas String
objetos elegíveis para coleta de lixo e a opção C correta.

36. B. Um construtor só pode ser chamado com um nome de classe em vez de um primitivo, tornando
As opções A e C estão incorretas. O objeto Double recém-construído pode ser atribuído a
um duplo ou um duplo, graças à caixa automática. Portanto, a opção B está correta.

37. B. A primeira linha 2 é executada e define a variável usando a declaração. Então a instância
inicializador na linha 6 é executado. Finalmente, o construtor é executado. Como o construtor é o último
executar dos três, esse é o valor definido quando imprimimos o resultado, portanto, a opção B é
corrigir.

38. C. Os objetos podem ter uma referência nula, enquanto os primitivos não. int é um
primitivo, portanto, atribuir nulo a ele não é compilado. Inteiro e String são ambos
objetos e, portanto, pode ser atribuída uma referência nula. Portanto, a opção C está correta.

39. C. Uma variável de instância só pode ser referenciada a partir de métodos de instância na classe. UMA
variável estática pode ser referenciada a partir de qualquer método. Portanto, a opção C está correta.

40. B. Sublinhados são permitidos entre dois dígitos em um literal numérico. Sublinhados
não são permitidos adjacentes a um ponto decimal, tornando a opção B a resposta correta.

41. A. Esses quatro tipos representam valores não decimais. Embora você não precise conhecer o
tamanhos exatos, você precisa solicitá-los do maior para o menor. Um byte é
menor. Um curto vem a seguir, seguido de int e depois longo. Portanto, a opção A é
corrigir.

42. A. Java usa notação de ponto para referenciar variáveis ​​de instância em uma classe, tornando a Opção A
corrigir.

43. B. Se houvesse um método finalize (), essa seria uma história diferente. No entanto, o
O método aqui é finalizador. Complicado! Esse é apenas um método normal que não é chamado
automaticamente. Portanto, limpeza nunca é emitida.

44. A. As opções B e C não são compiladas. Em Java, chaves são para matrizes, em vez de instância
variáveis. A opção A é a resposta correta. Ele usa notação de ponto para acessar a instância
variável. Também mostra que uma variável privada está acessível na mesma classe e que uma variável
Um tipo mais estreito pode ser atribuído a um tipo mais amplo.

45. B. Os métodos parseInt () retornam uma primitiva. Os métodos valueOf () retornam um
objeto da classe wrapper. No código real, a caixa automática permitiria atribuir o valor de retorno a
uma classe primitiva ou wrapper. Em termos do que é retornado diretamente, a Opção B é
corrigir.

46. ​​B. Na linha 9, todos os três objetos têm referências. Os objetos elena e zoe têm um efeito direto
referência. O objeto diana é referenciado através do objeto elena. Na linha 10, o
a referência ao objeto diana é substituída por uma referência ao objeto zoe. Portanto, o
O objeto diana é elegível para coleta de lixo e a opção B está correta.

47. C. As opções A e B são métodos estáticos, e não construtores. A opção D é um método que tem o mesmo nome da classe. Não é um construtor porque
construtores não têm tipos de retorno.

48. A. Lembre-se de que a coleta de lixo não é garantida para execução sob demanda. Se não
executado, a opção B seria exibida. Se for executado no ponto solicitado, a opção C será
ser produzido. Se ele for executado no final do método main (), a opção D será exibida.
A opção A é a resposta correta, porque o jogo é definitivamente chamado duas vezes. Note que você
é improvável que você veja todos esses cenários se você executar esse código porque não usamos
memória suficiente para a coleta de lixo valer a pena ser executada. No entanto, você ainda precisa
ser capaz de responder ao que poderia acontecer, independentemente de ser improvável.

49. B. Cada classe de wrapper possui um construtor que aceita o equivalente primitivo. o
Os métodos mencionados nas Opções A, C e D não existem.

50. C. O método main () chama o construtor