Chapter 6
Working with Methods and Encapsulation
THE OCA EXAM TOPICS COVERED IN THIS PRACTICE TEST INCLUDE THE
FOLLOWING:
Working with Methods and Encapsulation
Create methods with arguments and return values; including overloaded methods
Apply the static keyword to methods and fields
Create and overload constructors; differentiate between default and user defined
constructors
Apply access modifiers
Apply encapsulation principles to a class
Determine the effect upon object references and primitive values when they are
passed into methods that change the values


1. Fill in the blanks: The____________ access modifier allows access to everything
the ____________access modifier does and more.
A. package-private, protected
B. protected , public
C. protected , package-private
D. private , package-private

2. What is the command to call one constructor from another constructor in the same
class?
A. super()
B. this()
C. that()
D. construct()


3. What is the output of the following application?
package stocks;
public class Bond {
    private static int price = 5;
    public boolean sell() {
    if(price<10) {
        price++;
        return true;
    } else if(price>=10) {
        return false;
    }
}

public static void main(String[] cash) {
new Bond().sell();
new Bond().sell();
new Bond().sell();
System.out.print(price);
}
}
A. 5
B. 6
C. 8
D. The code does not compile.


4. What is true about the following program?
package figures;
public class Dolls {public void nested() { nested(2,true); } // g1
public int nested(int level, boolean height) { return nested(level); }
public int nested(int level) { return level+1; }; // g2
    public static void main(String[] outOfTheBox) {
        System.out.print(new Dolls().nested());
    }
}
A. It compiles successfully and prints 3 at runtime.
B. It does not compile because of line g1 .
C. It does not compile because of line g2 .
D. It does not compile for some other reason.

5. Fill in the blank: Java uses ___________ to send data into a method.
A. pass-by-null
B. pass-by-value
C. both pass-by-value and pass-by-reference
D. pass-by-reference

6. Which of the following is a valid JavaBean method signature?
A. public void getArrow()
B. public void setBow()
C. public void setRange(int range)
D. public String addTarget(String target)

7. Which of the following statements about calling this() in a constructor is not true?
A. If this() is used, it must be the first line of the constructor.
B. If super() and this() are both used in the same constructor, super() must appear
on the line immediately after this() .
C. If arguments are provided to this() , then there must be a constructor in the class
able to take those arguments.
D. If the no-argument this() is called, then the class must explicitly implement the
no-argument constructor.

8. Which of the following can fill in the blank to make the class compile?
package ai;
public class Robot {
____________ compute() { return 10; }
}
A. Public intB. Long
C. void
D. private String

9. Fill in the blank: A ____________variable is always available to all instances of the
class.
A. public
B. local
C. static
D. instance

10. Which line of code, inserted at line p1 , causes the application to print 5 ?
package games;
public class Jump {
    private int rope = 1;
    protected boolean outside;
    public Jump() {
    // p1
    outside = true;
    }
    public Jump(int rope) {
    this.rope = outside ? rope : rope+1;
    }
    
    public static void main(String[] bounce) {
        System.out.print(new Jump().rope);
    }
}
A. this(4);
B. new Jump(4);
C. this(5);
D. rope = 4;

11. Which of the following statements is not true?
A. An instance of one class may access an instance of another class’s attributes if it
has a reference to the instance and the attributes are declared public .
B. An instance of one class may access package-private attributes in a parent class,
provided the parent class is not in the same package.
C. Two instances of the same class may access each other’s private attributes.
D. An instance of one class may access an instance of another class’s attributes if both
classes are located in the same package and marked protected .

12. Given the following class, what should be inserted into the two blanks to ensure theclass data is properly encapsulated?
package storage;
public class Box {
    public String stuff;
        ____________String____________ () {
        return stuff;
    }
    public void setStuff(String stuff) {
         this.stuff = stuff;
    }
}
A. public and getStuff
B. private and isStuff
C. public and setStuff
D. None of the above

13. Which statement about a no-argument constructor is true?
A. The Java compiler will always insert a default no-argument constructor if you do
not define a no-argument constructor in your class.
B. In order for a class to call super() in one of its constructors, its parent class must
explicitly implement a no-argument constructor.
C. If a class extends another class that has only one constructor that takes a value,
then the child class must explicitly declare at least one constructor.
D. A class may contain more than one no-argument constructor.

14. Which of the following method signatures does not contain a compiler error?
A. public void sing(String key, String... harmonies)
B. public void sing(int note, String... sound, int music)
C. public void sing(String... keys, String... pitches)
D. public void sing(String... notes, String melodies)

15. Given the following application, which diagram best represents the state of the
mySkier , mySpeed , and myName variables in the main() method after the call to the
slalom() method?
package slopes;
public class Ski {
    private int age = 18;
    private static void slalom(Ski racer, int[] speed, String name) {
    racer.age = 18;
    name = "Wendy";
    speed = new int[1];
    speed[0] = 11;racer = null;
}

public static void main(String... mountain) {
    final Ski mySkier = new Ski();
    mySkier.age = 16;
    final int[] mySpeed = new int[1];
    final String myName = "Rosie";
    slalom(mySkier,mySpeed,myName);
    }
}

A. 
mySkier ----------> null
myName ----------> "Rosie" int []
mySpeed ----------> 18

B.
mySkier ----------> Ski -> age: 18
myName ----------> "Wendy" int []
mySpeed ----------> 11

C.
mySkier ----------> Ski -> age: 18
myName ----------> "Rosie" int []
mySpeed ----------> 0

D.
mySkier ----------> Ski -> age: 16
myName ----------> "Wendy" int []
mySpeed ----------> 0

16. Given the class below, which method signature could be successfully added to the
class as an overloaded version of the findAverage() method?
public class Calculations {
    public Integer findAverage(int sum) { return sum; }
}

A. public Long findAverage(int sum)
B. public Long findAverage(int sum, int divisor)
C. public Integer average(int sum)
D. private void findAverage(int sum)

17. Which of the following is not a reason to use encapsulation when designing a class?
A. Promote usability by other developers.
B. Maintain class data integrity of data elements.
C. Prevent users from modifying the internal attributes of a class.
D. Increase concurrency and improve performance.

18. Which of the following data types can be modified after they are passed to a method as
an argument?
A. int[]
B. String
C. long
D. boolean

19. What is the best way to call the following method from another class in the same
package, assuming the class using the method does not have any static imports?
package useful;
public class MathHelper {
public static int roundValue(double d) {
// Implementation omitted
}
}A. MathHelper:roundValue(5.92)
B. MathHelper.roundValue(3.1)
C. roundValue(4.1)
D. useful.MathHelper.roundValue(65.3)

20. Given a method with one of the following return types, which data type prevents the
return statement from being used within the method?
A. byte
B. String
C. void
D. None of the above

21. How many final modifiers would need to be removed for this application to compile?
package end;
public final class Games {
    public final static int finish(final int score) {
        final int win = 3;
        final int result = score++ < 5 ? 2 : win;
        return result+=win;
    }
    
    public static void main(final String[] v) {
        System.out.print(finish(Integer.parseInt(v[0])));
    }
}
A. None
B. One
C. Two
D. The code will not compile regardless of the number of final modifiers that are
removed.

22. Fill in the blanks: ____________is used to call a constructor in the parent class,
while ____________is used to reference a member of the parent class.
A. super and this()
B. super and super()
C. super() and this
D. super() and super

23. Given the following method signature, which classes can call it?
void run(String government)
A. Classes in other packages
B. Classes in the same package
C. Subclasses in a different package
D. All classes

24. Which statement(s) about the following class would help to properly encapsulate the
data in the class?
package shield;
public class Protect {
private String material;
    protected int strength;
        public int getStrength() {
    return strength;
    }
    public void setStrength(int strength) {
        this.strength = strength;
    }
}
I. Change the access modifier of strength to private .
II. Add a getter method for material .
III. Add a setter method for material .
A. I
B. II and III
C. I, II, and III
D. None, the data in the class is already encapsulated.

25. Which of the following is a valid method name in Java?
A. Go_$Outside$2()
B. have-Fun()
C. new()
D. 9enjoyTheWeather()

26. Which of the following lines of code can be inserted in the line below that would allow
the class to compile?
package farm;
public class Coop {
    public final int static getNumberOfChickens() {
    // INSERT CODE HERE
    }
}
A. return 3.0;
B. return 5L;
C. return 10;
D. None of the above

27. Which of the following is a true statement about passing data to a method?
A. A change made to a primitive value passed to a method is reflected in the calling method.
B. A change made to the data within an object passed to a method is reflected in the calling method.
C. Reassigning an object reference passed to a method is reflected in the calling method.
D. A change made to a boolean value passed to a method is reflected in the calling method.

28. What is a possible output of the following application?
package wrap;
public class Gift {
    private final Object contents;
        protected Object getContents() {
        return contents;
    }
    protected void setContents(Object contents) {
        this.contents = contents;
    }
    public void showPresent() {
        System.out.print("Your gift: "+contents);
    }
    public static void main(String[] treats) {
        Gift gift = new Gift();
        gift.setContents(gift);
        gift.showPresent();
    }
}
A. Your gift: wrap.Gift@29ca2745
B. Your gift: Your gift:
C. It does not compile.
D. It compiles but throws an exception at runtime.

29. Which of the following is a valid JavaBean method prefix?
A. is
B. gimme
C. request
D. put

30. Given the following two classes, each in a different package, which line inserted below
allows the second class to compile?
package clothes;
    public class Store {
        public static String getClothes() { return "dress"; }
    }
    
    package wardrobe;
    // INSERT CODE HERE
    public class Closet {
        public void borrow() {
        System.out.print("Borrowing clothes: "+getClothes());
    }
}
A. static import clothes.Store.getClothes;
B. import clothes.Store.*;
C. import static clothes.Store.getClothes;
D. import static clothes.Store;

31. What access modifier is used to mark class members package-private?
A. private
B. default
C. protected
D. None of the above

32. How many lines of the following program contain compilation errors?
package sky;
public class Stars {
    private int inThe = 4;
        public void Stars() {
        super();
    }
    public Stars(int inThe) {
        this.inThe = this.inThe;
    }
    public static void main(String[] endless) {
        System.out.print(new sky.Stars(2).inThe);
    }
}
A. None
B. One
C. Two
D. Three

33. Which of the following statements is true?
A. An instance method is allowed to reference a static variable.
B. A static method is allowed to reference an instance variable.
C. A static initialization block is allowed to reference an instance variable.
D. A final static variable may be set in a constructor.


34. Given the following method declaration, which line can be inserted to make the
code compile?
public short calculateDistance(double lat1, double lon1,
double lat2, double lon2) {
// INSERT CODE HERE
}
A. return new Integer(3);
B. return new Byte((byte)6);
C. return 5L;
D. return new Short(4).longValue();

35. Which of the following statements about overloaded methods are true?
I. Overloaded methods must have the same name.
II. Overloaded methods must have the same return type.
III. Overloaded methods must have a different list of parameters.
A. I
B. I and II
C. I and III
D. I, II, and III

36. How many lines of code would need to be removed for the following class to compile?
package work;
public class Week {
private static final String monday;
String tuesday;
final static wednesday = 3;
final protected int thursday = 4;
}
A. One
B. Two
C. Three
D. The code will not compile regardless of the number of lines removed.37. What is the output of the following application?
package pet;
public class Puppy {
public static int wag = 5;
// q1
public void Puppy(int wag) { // q2
this.wag = wag;
}
public static void main(String[] tail) {
System.out.print(new Puppy(2).wag); // q3
}
}
A. 2
B. It does not compile because of line q1 .
C. It does not compile because of line q2 .
D. It does not compile because of line q3 .

38. Fill in the blanks: The ____________access modifier allows access to everything
the ____________access modifier does and more.
A. public , private
B. private , package-private
C. package-private, protected
D. private , public

39. What is the output of the following application?

package ship;
public class Phone {
    private int size;
    public Phone(int size) {this.size=size;}
    public static void sendHome(Phone p, int newSize) {
    p = new Phone(newSize);
    p.size = 4;
}

    public static final void main(String... params) {
        final Phone phone = new Phone(3);
        sendHome(phone,7);
        System.out.print(phone.size);
    }
}

A. 3
B. 4
C. 7
D. The code does not compile.

40. Given the following class, which line of code when inserted below would prevent the
class from compiling?
public class Drink {
public static void water() {}
public void get() {
// INSERT CODE HERE
}
}
A. water();
B. this.Drink.water();
C. this.water();
D. Drink.water();


41. Given the following method declaration signature, which of the following is a valid call
of this method?
public void call(int count, String me, String... data)
A. call(9,"me",10,"Al")
B. call(5)
C. call(2,"home","sweet")
D. call("answering","service")

42. Which statement about a static variable is true?
A. The value of a static variable must be set when the variable is declared or in a
static initialization block.
B. It is not possible to read static final variables outside the class in which they are
defined.
C. It is not possible to reference static methods using static imports.
D. A static variable is always available in all instances of the class.

43. Which of the following is not a true statement?
A. The first line of every constructor is a call to the parent constructor via the super()
command.
B. A class does not have to have a constructor explicitly defined.
C. A constructor may pass arguments to the parent constructor.
D. A final instance variable whose value is not set when they are declared or in an
initialization block should be set by the constructor.

44. How many final modifiers would need to be removed for this application to compile?package park;
public class Tree {
    public final static long numberOfTrees;
    public final double height;
    static {}
    { 
        final int initHeight = 2;
        height = initHeight;
    }
    static {
    numberOfTrees = 100;
    height = 4;
    }
}
A. None
B. One
C. Two
D. The code will not compile regardless of the number of final modifiers removed.

45. What is the output of the following application?
package jungle;
public class RainForest extends Forest {
public RainForest(long treeCount) {
this.treeCount = treeCount+1;
}
public static void main(String[] birds) {
System.out.print(new RainForest(5).treeCount);
}
}
class Forest {
public long treeCount;
public Forest(long treeCount) {
this.treeCount = treeCount+2;
}
}
A. 5
B. 6
C. 8
D. The code does not compile.

46. What is the output of the following application?
public class ChooseWisely {
public ChooseWisely() { super(); }
public int choose(int choice) { return 5; }
public int choose(short choice) { return 2; }
public int choose(long choice) { return 11; }
public static void main(String[] path) {
System.out.print(new ChooseWisely().choose((byte)2+1));
}}
A. 5
B. 2
C. 11
D. The code does not compile.

47. What is the output of the following application?
package sports;
public class Football {
public static Long getScore(Long timeRemaining) {
return 2*timeRemaining; // m1
}
public static void main(String[] refs) {
final int startTime = 4;
System.out.print(getScore(startTime)); // m2
}
}
A. 8
B. The code does not compile because of line m1 .
C. The code does not compile because of line m2 .
D. The code compiles but throws an exception at runtime.

48. Which of the following is a valid method name in Java?
A. $sprint()
B. \jog13()
C. walk#()
D. %run()

49. Assume there is a class Bouncer with a protected variable. Methods in which class can
access this variable?
A. Only subclasses of Bouncer
B. Any subclass of Bouncer or any class in the same package as Bouncer
C. Only classes in the same package as Bouncer
D. Any superclass of Bouncer

50. Given the following two classes, each in a different package, which line inserted below
allows the second class to compile?
package commerce;
public class Bank {
public void withdrawal(int amountInCents) {}
public void deposit(int amountInCents) {}}
package employee;
// INSERT CODE HERE
public class Teller {
public void processAccount(int depositSlip, int withdrawalSlip) {
withdrawal(withdrawalSlip);
deposit(depositSlip);
}
}
A. import static commerce.Bank.*;
B. static import commerce.Bank.*;
C. import static commerce.Bank;
D. None of the above

Capítulo 6: Trabalhando com métodos e encapsulamento
1. C. O modificador protegido permite o acesso de subclasses e membros dentro do mesmo
pacote, enquanto o modificador privado do pacote permite acesso apenas aos membros do
mesmo pacote. Portanto, o modificador de acesso protegido permite acesso a tudo
o modificador de acesso privado ao pacote, além de subclasses, tornando a Opção C a correta
responda. As opções A, B e D estão incorretas porque o primeiro termo é mais restritivo
modificador de acesso que o segundo termo.

2. B. A instrução super () é usada para chamar um construtor em uma classe pai, enquanto o
Esta instrução () é usada para chamar um construtor da mesma classe, tornando a Opção B
correta e a opção A incorreta. As opções C e D estão incorretas porque não estão
construtores.

3. D. O método sell () não é compilado porque não retorna um valor se ambos
as expressões condicionais das instruções if-then são avaliadas como falsas. Embora logicamente, é
verdade que o preço é menor que 10 ou maior que ou igual a 10, o compilador
não sabia disso. Apenas sabe que, se ambas as declarações if-then forem falsas,
não possui um valor de retorno, portanto, não é compilado.

4. D. As três versões sobrecarregadas de nested () são compiladas sem problemas, pois cada
O método utiliza um conjunto diferente de argumentos de entrada, tornando as Opções B e C incorretas.
O código não é compilado, devido à primeira linha do método main (), tornando
Opção A incorreta. A versão sem argumento do método nested () não retorna
um valor e tentar gerar um tipo de retorno nulo no método print () lança um
exceção em tempo de execução.

5. B. Java usa a passagem por valor para copiar primitivas e referências de objetos em um método.
Isso significa que as alterações no valor primitivo ou na referência no método não são realizadas
para o método de chamada. Dito isto, os dados dentro de um objeto podem mudar, mas não o
própria referência original. Portanto, a opção B é a resposta correta e as opções C e
D estão incorretos. A opção A não é um termo real.

6. C. A opção A está incorreta porque o getter deve retornar um valor. A opção B está incorreta
porque o levantador deve assumir um valor. A opção D está incorreta porque o setter deve
comece com set e não deve retornar um valor. A opção C é uma declaração correta do setter
porque recebe um valor, usa o tipo de retorno nulo e usa a nomenclatura correta
convenção.

7. B. As opções A, C e D são declarações verdadeiras sobre como chamar this () dentro de um construtor.
A opção B está incorreta porque um construtor só pode chamar isso () ou super () na primeira
linha do construtor, mas nunca os dois no mesmo construtor. Se ambos os construtores
fosse permitido chamar, haveria duas chamadas separadas para super (), levando a
inicialização duplicada de construtores pai, já que o outro construtor referenciado
por isso () também chamaria super () (ou seria acorrentado a um que eventualmente chama super ()).

8. B. A opção A está incorreta porque o modificador de acesso público começa com um marcador minúsculo. As opções C e D estão incorretas porque os tipos de retorno, void e String, são
incompatível com o corpo do método que retorna um valor inteiro 10. A opção B é
correto e possui acesso privado ao pacote. Ele também usa um tipo de retorno Long que o
o valor inteiro 10 pode ser facilmente atribuído sem uma conversão explícita.

9. C. As únicas variáveis ​​sempre disponíveis para todas as instâncias da classe são aquelas declaradas
estático; portanto, a opção C é a resposta correta. A opção A pode parecer correta, mas
variáveis ​​públicas só estão disponíveis se uma referência ao objeto for mantida entre todas
instâncias. A opção B está incorreta porque não há palavra-chave local em Java. A opção D é
também incorreto porque uma variável de instância privada é acessível apenas dentro do
instância que o criou.

10. A. Primeiro, todas as linhas são compiladas, mas produzem vários resultados diferentes.
Lembre-se de que a inicialização padrão de uma variável de instância booleana é falsa,
fazendo fora false na linha p1. Portanto, isso (4) fará com que o cabo seja definido como 5,
enquanto isso (5) fará com que a corda seja ajustada para 6. Como 5 é o número que estamos procurando,
A opção A está correta e a opção C está incorreta. A opção B está incorreta. Enquanto o
A instrução cria uma nova instância de Jump, com a corda tendo um valor de 5, que
instância é aninhada e o valor da corda não afeta a instância circundante de
Salte que o construtor foi chamado. A opção D também está incorreta. O valor atribuído
amarrar é 4, não o alvo 5.

11. B. As opções A, C e D são afirmações verdadeiras. Em particular, a opção C nos permite escrever
os métodos equals () entre dois objetos que comparam atributos particulares do
classe. A opção D é verdadeira porque o acesso protegido também fornece acesso privado ao pacote.
A opção B é falsa. Os atributos privados do pacote são visíveis apenas se as duas classes estiverem em
o mesmo pacote, independentemente de um estender o outro.

12. D. Os dados da classe, coisas, são declarados públicos, permitindo que qualquer classe modifique as coisas
variável e tornando a implementação inerentemente insegura para encapsulamento.
Portanto, não há valores que possam ser colocados nos dois espaços em branco para garantir que a classe
encapsula adequadamente seus dados, tornando a opção D correta. Observe que, se as coisas fossem
declaradas privadas, as opções A, B e C estariam corretas. Encapsulamento não
requer sintaxe JavaBean, apenas para que os atributos internos sejam protegidos de fora
acesso, que todos esses conjuntos de valores alcançam.

13. C. A opção A está incorreta porque Java somente insere um construtor sem argumento se houver
não há outros construtores na classe. A opção B está incorreta porque o pai pode
tem um construtor sem argumento padrão, que é inserido pelo compilador e
acessível na classe infantil. Finalmente, a opção D está incorreta. Uma classe que contém dois
construtores sem argumento não serão compilados porque teriam o mesmo
assinatura. Finalmente, a opção C está correta. Se uma classe estender uma classe pai que não
incluir um construtor sem argumento, o construtor padrão sem argumento não pode ser
automaticamente inserido na classe filho pelo compilador. Em vez disso, o desenvolvedor
deve declarar explicitamente pelo menos um construtor e definir explicitamente como a chamada para o
construtor pai é feito. A. Um método pode conter no máximo um parâmetro varargs e deve aparecer como o
último argumento da lista. Por esse motivo, a opção A está correta e as opções B, C e D
estão incorretos.

15. C. Para resolver esse problema, é bom lembrar que Java é uma linguagem de passagem por valor em
quais cópias de referências primitivas e de objetos são enviadas para métodos. Isso também significa
que os dados de um objeto podem ser modificados dentro de um método e compartilhados com o chamador, mas
não a referência ao objeto. Quaisquer alterações na referência do objeto dentro do
O método não é transferido para o chamador. No método slalom (), o objeto Ski é
atualizado com um valor de idade de 18 anos. Embora a última linha do método slalom ()
altera o valor da variável para nulo, não afeta o objeto ou a referência mySkier no
o método main (). Portanto, o objeto mySkier não é nulo e a variável age é definida
a 18, tornando as opções A e D incorretas. Em seguida, a variável name é reatribuída para o
Objeto Wendy, mas isso não altera a referência no método main (), então myName
permanece Rosie. Finalmente, a matriz de velocidade recebe um novo objeto e é atualizada. Desde o
matriz é atualizada depois que a referência é reatribuída, ela não afeta a matriz mySpeed
no método main (). O resultado é que o mySpeed ​​continua a ter um único elemento
com o valor int padrão 0. Por esses motivos, a opção B está incorreta e a opção C
está correto.

16. B. As opções A e D não permitiriam que a classe fosse compilada porque dois métodos no
classe não pode ter o mesmo nome e argumentos, mas um valor de retorno diferente. Opção
C permitiria que a classe fosse compilada, mas não é uma forma sobrecarregada válida de nossa
método findAverage (), pois usa um nome de método diferente. A opção B é um válido
versão sobrecarregada do método findAverage (), já que o nome é o mesmo, mas o
lista de argumentos difere.

17. D. A implementação do encapsulamento impede que atributos internos de uma classe sejam
modificado diretamente, portanto, a opção C é uma afirmação verdadeira. Ao impedir o acesso a informações internas
atributos, também podemos manter a integridade dos dados da classe entre os elementos, tornando o Option
B uma afirmação verdadeira. A opção A também é uma afirmação verdadeira sobre encapsulamento, uma vez que
classes encapsuladas são geralmente mais fáceis de usar. A opção D é uma declaração incorreta.
O encapsulamento não garante o desempenho e a simultaneidade.

18. A. A opção B está incorreta porque os valores da String são imutáveis ​​e não podem ser modificados.
As opções C e D também estão incorretas, pois as variáveis ​​são passadas por valor, não por referência,
em Java. A opção A é a resposta correta. O conteúdo de uma matriz pode ser modificado quando
passado para um método, uma vez que uma cópia da referência ao objeto é passada. Por exemplo,
o método pode alterar o primeiro elemento de uma matriz não vazia.

19. B. A opção A não é uma sintaxe válida em Java. A opção C estaria correta se houvesse uma
importação estática, mas a pergunta diz especificamente que não há. A opção D é quase
correto, pois é uma maneira de chamar o método, mas a pergunta pede a melhor maneira de
chame o método Nesse sentido, a opção B é a melhor maneira de chamar o método, uma vez que
é dado que duas classes estão no mesmo pacote, portanto, o nome do pacote
não é necessário.

20. D. As opções A e B estão incorretas porque um método com um tipo de retorno não nulo
requer que o método retorne um valor usando a instrução return. A opção C também é
incorreto, pois um método com um tipo de retorno nulo ainda pode chamar o comando return
sem valores e saia do método Portanto, a opção D é a resposta correta.

21. C. O método finish () modifica duas variáveis ​​marcadas como final, score e
resultado. A variável score é modificada pelo operador ++ pós-incremento, enquanto o
A variável result é modificada pelo operador de adição composta + =. Removendo ambos
modificadores finais permitem que o código seja compilado. Por esse motivo, a opção C é a correta
responda.

22. D. A instrução super () é usada para chamar um construtor na classe pai, enquanto super
é usado para referenciar um membro da classe pai. A instrução this () é usada para chamar
um construtor na classe atual, enquanto isso é usado para referenciar um membro do
classe atual. Por esses motivos, a opção D é a resposta correta.

23. B. A assinatura do método possui acesso por pacote privado ou padrão; Portanto, é
acessível para classes no mesmo pacote, tornando a opção B a resposta correta.

24. A. O modificador de acesso de força é protegido, significando subclasses e classes
dentro do mesmo pacote pode modificá-lo. Alterar o valor para privado melhoraria
encapsulamento, tornando a classe Protect a única capaz de modificar diretamente
isto. Por esses motivos, a primeira instrução está correta. Alternativamente, o segundo e o terceiro
As instruções não melhoram o encapsulamento da classe. Embora tenha getters e
setters para variáveis ​​privadas é útil, eles não são necessários. Encapsulamento é sobre
protegendo os elementos de dados. Com isso em mente, fica claro que a variável material é
já está protegido. Portanto, a opção A é a resposta correta.

25. A. A opção A está correta, pois os nomes dos métodos podem incluir o caractere sublinhado _ como
bem como o símbolo do dólar $. Observe que não há uma regra que exija um método que comece com
um caractere minúsculo; é apenas uma prática adotada pela comunidade. A opção B é
incorreto porque o caractere hífen pode não fazer parte do nome de um método. Opção C
está incorreto, pois new é uma palavra reservada em Java. Finalmente, a opção D está incorreta. UMA
O nome do método deve começar com uma letra, o símbolo do dólar $ ou um sublinhado _
personagem.

26. D. O código não compila, independentemente do que é inserido na linha, porque o
a assinatura do método é inválida. O tipo de retorno, int, deve ir antes do nome do método
e após qualquer acesso, modificadores finais ou estáticos. Portanto, a opção D é a correta
responda. Se o método foi corrigido, trocando a ordem de int e static no campo
declaração de método, a opção C seria a resposta correta. As opções A e B são
ainda está incorreto, pois cada um usa um tipo de retorno que não pode ser implicitamente
convertido para int.

27. B. Java usa passagem por valor, portanto, alterações feitas em valores primitivos e referências a objetos
passado para um método não são refletidos no método de chamada. Por esse motivo, as opções A
e C são declarações incorretas. A opção D também é uma declaração inválida porque é um caso especial da opção A. Finalmente, a opção B é a resposta correta. Alterações nos dados
dentro de um objeto são visíveis para o método de chamada, uma vez que o objeto copiado
pontos de referência para é o mesmo.

28. C. O código contém um problema de compilação em relação à instância do conteúdo
variável. A variável de instância de conteúdo está marcada como final, mas há um setContents ()
método de instância que pode alterar o valor da variável. Como esses dois são
incompatível, o código não é compilado e a opção C está correta. Se o modificador final
foi removido da declaração da variável content, a saída esperada seria
ter o formato mostrado na Opção A.

29. A. Os métodos JavaBean usam os prefixos get, set e são para valores booleanos, tornando
Opção A é a escolha correta.


30. C. A opção A está incorreta porque as palavras-chave static e import estão invertidas. o
A classe Closet usa o método getClothes () sem uma referência ao nome da classe
Armazene, portanto, é necessária uma importação estática. Por esse motivo, a opção B está incorreta
pois está faltando a palavra-chave estática. A opção D também está incorreta, pois as importações estáticas
são usados ​​com membros da classe, não com um nome de classe. Finalmente, a opção C é a correta
resposta, pois importa adequadamente o método para a classe usando uma importação estática.

31. D. Em Java, a falta de um modificador de acesso indica que o membro é privado de pacotes,
portanto, a opção D está correta. Observe que a palavra-chave padrão é usada para interfaces e
switch, e não é um modificador de acesso.

32. B. O código não é compilado, portanto a opção A está incorreta. A classe contém dois
construtores e um método. O primeiro método, Stars (), parece muito com um
construtor de argumento, mas como tem um valor de retorno nulo, é um método, não um
construtor. Como apenas os construtores podem chamar super (), o código não é compilado devido a
está linha. O único construtor nesta classe, que recebe um valor int como entrada,
executa uma atribuição inútil, atribuindo uma variável a si mesma. Embora essa tarefa
não tem efeito, não impede que o código seja compilado. Finalmente, o método main ()
compila sem problema, uma vez que inserimos o nome completo do pacote na classe
chamada do construtor. É assim que uma classe que não usa uma instrução de importação poderia chamar
o construtor. Como o método está na mesma classe e, portanto, o mesmo
pacote, é redundante incluir o nome do pacote, mas não é permitido. Porque apenas
uma linha faz com que a classe falhe na compilação, a opção B está correta.

33. A. Um método ou construtor de instância tem acesso a todas as variáveis ​​estáticas, tornando
Opção A correta. Por outro lado, métodos estáticos e inicializadores estáticos não podem
variáveis ​​de instância de referência, pois são definidas em todas as instâncias, tornando
Opções B e C incorretas. Observe que eles podem acessar variáveis ​​de instância se forem
passou uma referência a uma instância específica, mas não no caso geral. Finalmente, opção D
está incorreto porque variáveis ​​finais estáticas devem ser definidas quando declaradas ou em um
bloco de inicialização estática.

34. B. O método calculDistance () requer um tipo de retorno que possa ser facilmente convertido em um valor curto. As opções A, C e D estão incorretas porque cada uma delas usa um
tipo de dados maior que requer uma conversão explícita. A opção D também não compila porque
o construtor Short requer uma conversão explícita para converter o valor de 4, que é
assumido como int, a short, como mostra o novo Short ((short) 4). A opção B é a
resposta correta, pois um valor de byte pode ser facilmente promovido para curto e retornado pelo
método.

35. C. Os métodos sobrecarregados têm o mesmo nome, mas uma lista diferente de parâmetros, tornando
a primeira e a terceira afirmações são verdadeiras. A segunda declaração é falsa, pois sobrecarregada
Os métodos podem ter o mesmo ou diferentes tipos de retorno. Portanto, a opção C é o
resposta correta.

36. C. A declaração de segunda-feira não é compilada porque o valor de uma final estática
A variável deve ser definida quando declarada ou em um bloco de inicialização estático. o
declaração de terça-feira é boa e compila sem problema. A declaração de
quarta-feira não é compilado porque não há tipo de dados para a variável finalmente, o
declaração de quinta-feira não é compilada porque o modificador final não pode aparecer
antes do modificador de acesso. Por esses motivos, a opção C é a resposta correta.

37. D. A classe Puppy não declara um construtor, portanto o padrão sem argumento
O construtor é inserido automaticamente pelo compilador. O que parece um construtor em
a classe é realmente um método que possui um tipo de retorno nulo. Portanto, a linha no
O método main () para criar o novo objeto Puppy (2) não é compilado, pois não há
construtor capaz de obter um valor int, tornando a opção D a resposta correta.

38. A. O modificador público permite o acesso a membros da mesma classe, pacote, subclasse,
ou mesmo classes em outros pacotes, enquanto o modificador privado permite acesso apenas a
membros da mesma classe. Portanto, o modificador de acesso público permite o acesso a
tudo o que o modificador de acesso privado faz e mais, tornando a opção A a correta
responda. As opções B, C e D estão incorretas porque o primeiro termo é mais restritivo
modificador de acesso que o segundo termo.

39. A. O código é compilado sem problemas, portanto a opção D está incorreta. A chave aqui é que Java
usa passagem por valor para enviar referências a objetos para métodos. Desde a referência do telefone p
foi reatribuído na primeira linha do método sendHome (), qualquer alteração no p
foram feitas referências a um novo objeto. Em outras palavras, nenhuma alteração no sendHome ()
O método afetou o objeto que foi passado. Portanto, o valor do tamanho foi o
mesmo antes e depois da chamada do método, tornando a saída 3 e a opção A a correta
responda.

40. B. As opções A e D são equivalentes e permitiriam a compilação do código. Ambos são
maneiras apropriadas de acessar um método estático de dentro de um método de instância. A opção B é
a resposta correta. A classe não seria compilada porque this.Drink não tem significado
para o compilador. Finalmente, a opção C ainda permitiria a compilação do código, mesmo que
é considerado uma má prática de codificação. Enquanto membros estáticos devem ser acessados ​​em um
estática, não é necessária. 

41. C. A assinatura do método requer um valor int, seguido por exatamente uma String,
seguido por varargs String, que pode ser uma matriz de valores String ou zero ou mais
valores de String individuais. Somente a opção C está em conformidade com esses requisitos, tornando
a resposta correta.

42. D. A opção A é uma declaração sobre variáveis ​​estáticas finais, nem todas as variáveis ​​estáticas.
A opção B se aplica apenas a variáveis ​​estáticas marcadas como privadas, não finais. A opção C é falsa
porque importações estáticas podem ser usadas para referenciar variáveis ​​e métodos. Opção
D é a resposta correta porque uma variável estática é acessível a todas as instâncias do
classe.

43. A. A opção A é a resposta correta, porque a primeira linha de um construtor pode ser
this () ou super (), tornando-o uma afirmação falsa. A opção B é uma afirmação verdadeira
porque o compilador inserirá o construtor sem argumento padrão, se não houver
definiram. A opção C também é uma afirmação verdadeira, pois zero ou mais argumentos podem ser
passado para o construtor pai, se a classe pai definir esses construtores. Opção
D também é verdade. O valor de uma variável de instância final deve ser definido quando declarado,
em um bloco de inicialização ou em um construtor.

44. D. O último bloco de inicialização estática acessa height, que é uma variável de instância,
não é uma variável estática. Portanto, o código não será compilado, não importa quantas
modificadores são removidos, tornando a opção D a resposta correta. Observe que se a linha
altura = 4; foi removido, nenhum modificador final precisaria ser removido para
faça a classe compilar.

45. D. Como uma chamada de construtor não é a primeira linha do construtor RainForest (), o
O compilador insere a chamada super () sem argumento. Como a classe pai, Forest, não
definir um super construtor sem argumento, o construtor RainForest () não
compilar e a opção D está correta.

46. ​​A. O código é compilado sem problemas, portanto, a opção D está incorreta. No método main (),
o valor 2 é convertido primeiro em um byte. É então aumentado em um usando a adição +
operador. O operador de adição + promove automaticamente todos os bytes e valores curtos para
int. Portanto, o valor passado para o método choose () no método main () é um int. o
O método Choose (int) é chamado, retornando 5 e fazendo da Opção A a resposta correta.
Observe que, sem a operação de adição no método main (), o byte teria sido
usado como parâmetro para o método choose (), fazendo com que o select (short) seja
selecionado como o próximo tipo mais próximo e a saída 2, tornando a opção B a resposta correta.

47. C. A variável startTime pode ser convertida automaticamente em Inteiro pelo compilador,
mas Inteiro não é uma subclasse de Long. Portanto, o código não é compilado devido ao
tipo de variável errado sendo passado para o método getScore () na linha m2, e a opção C é
corrigir.

48. A. Os métodos Java devem começar com uma letra, o símbolo do dólar $ ou sublinhado _
personagem. Por esses motivos, as opções B e D estão incorretas e a opção A está correta.
A opção C está incorreta. O símbolo da hashtag (#) não pode ser incluído no nome de um método.

49. B. O modificador protegido permite o acesso por qualquer subclasse ou classe que esteja na mesma
pacote, portanto, a opção B é a resposta correta.

50. D. Uma importação estática é usada para importar membros estáticos de outra classe. Nesse caso,
os métodos de retirada () e depósito () na classe Banco não estão marcados como estáticos.
Eles exigem que uma instância do Bank seja usada e não pode ser importada como estática
métodos. Portanto, a opção D está correta. Se os dois métodos da classe Bank fossem
estático marcado, a opção A seria a resposta correta, pois os curingas podem ser
usado com importações estáticas para importar mais de um método. A opção B inverte o
estáticas e import, enquanto a Opção C importa incorretamente uma classe, que não pode
ser importado através de uma importação estática.









