Java Basics
THE OCA EXAM TOPICS COVERED IN THIS PRACTICE TEST INCLUDE
THE FOLLOWING:

1 Java basics                                                                           Chapters 1 and 3
1.1 Define the scope of variables                                                       Section 3.1
1.2 Define the structure of a Java class                                                Section 1.1
1.3 Create executable Java applications with a main method; 
    run a Java program from the command line, including console output                  Section 1.2
1.4 Import other Java packages to make them accessible in your code                     Section 1.3
1.5 Compare and contrast the features and components of Java, such as platform inde-
pendence, object orientation, encapsulation, and so on                                  Section 1.6


Disclaimer
The information in this chapter is sourced from Oracle.com, public websites, and userforums.  Input  has  been  taken  from  real  people  who  have  earned  Java  certification,including the author. All efforts have been made to maintain the accuracy of the content, but the details of the exam—including the exam objectives, pricing, exam passscore, total number of questions, maximum exam duration, and others—are subjectto change per Oracle’s policies. The author and publisher of the book shall not beheld responsible for any loss or damage accrued due to any information contained inthis book or due to any direct or indirect use of this information.

Imagine you’re setting up a new IT organization that works with multiple developers.To  ensure  smooth  and  efficient  working,  you’ll define a structure for your organiza-tion  and  a  set  of  departments  with  separate  responsibilities.  These  departments  willinteract with each other whenever required. Also, depending on confidentiality require-ments, your organization’s data will be available to employees on an as-needed basis,or you may assign special privileges to only some employees of the organization. Thisis an example of how organizations might work with a well-defined structure and a setof rules to deliver the best results.  Similarly, Java has a well-defined structure and hierarchy. The organization’s struc-ture  and  components  can  be  compared  with  Java’s  class  structure  and  components,and the organization’s departments can be compared with Java packages. Restrictingaccess  to  some  data  in  the  organization  can  be  compared  to  Java’s  access  modifiers.An organization’s special privileges can be compared to nonaccess modifiers in Java.  In the OCA Java SE 8 Programmer I exam, you’ll be asked questions on the struc-ture  of  a  Java  class,  packages,  importing  classes,  and  applying  access  and  nonaccessmodifiers and features and components of Java. Given that information, this chapterwill cover the following: 

The structure and components of a Java class
Understanding executable Java applications
Understanding Java packages
Importing Java packages into your code
Applying access and nonaccess modifiers
Features and components of Java

1.1 The structures of a Java class and a source code file
###1.2 [1.2]   Define the structure of a Java class

###NOTE When you see a certification objective callout such as the preceding one,it means that in this section we’ll cover this objective. The same objective maybe covered in more than one section in this chapter or in other chapters.

[PT] - Quando você vê um texto explicativo de objetivo de certificação como o anterior, significa que nesta seção abordaremos esse objetivo. O mesmo objetivo pode ser coberto em mais de uma seção neste capítulo ou em outros capítulos.


1.1.1 Structure of a Java classThe OCA Java SE 8 Programmer I exam will question you on the structure and com-ponents of a Java source file and the classes or interfaces that you can define in it. Fig-ure 1.2 shows the components of a Java class file (interfaces are covered in detail inchapter 6). In this section, I’ll discuss all Java class file components. Let’s get started with thepackage statement.

[PT] - 

java class component
Import statements
Comments 
Class declaration {
    Variables
    Comments
    Constructors
    Methods
    Nested classes    //Not included in OCA Java SE 8Programmer I exam
    Nested interfaces //Not included in OCA Java SE 8Programmer I exam
    Enum              //Not included in OCA Java SE 8Programmer I exam
}


WHAT ARE THE TYPES OR FORMATS OF QUESTIONS THAT I CAN EXPECT IN THE EXAM ?
The exam uses different formats of multiple choice questions, illustrated in this 
section by eight example questions with figures.
The examples for all these types of questions show how the following set of topics
might be tested using a different question format:

Correct declaration of the main method
Passing command-line parameters
Overloaded methods
Significance of method parameter names
Declaration of variables of varargs
    
Exam question type 1 (figure 4)—Includes simple code, but tricky or confusing answer
options.

Exam question type #1   = Simple code +  Tricky or confusing answer options


1. Which of the following method signatures is a valid declaration of an entry point in a
Java application?
A. public void main(String[] args)
B. public static void main()
C. private static void start(String[] mydata)
[D]. public final static void main(String[] mydata)

[pt] - D. Um ponto de entrada em um aplicativo Java consiste em um método main () com um único
Argumento [], tipo de retorno de void e modificadores public e static. O nome
da variável no argumento de entrada não importa. 
A opção A está ausente na estática
modificador, a opção 
B está ausente no argumento String [] e a opção 
C está incorreta modificador de acesso e nome do método. 
Somente a opção D atende a esses requisitos. 
[Nota] que o modificador final é opcional e pode ser adicionado a um método de ponto de entrada.

2. The following class diagram demonstrates the relationship between Gold and Silver ,
which extend the Metal class. Assume the attributes are all declared public . Which
statement about the diagram is not true?

                metal
                +weight
                +color
-------------------|------------------                
|                                     |      
gold                                Silver
+hue                                +luster


[A]. The diagram demonstrates platform independence in Java.
B. The diagram demonstrates object-oriented design in Java. 
C. The Gold and Silver classes inherit weight and color attributes from the Metal class.
D. Gold does not inherit the luster attribute.

[pt] A. O diagrama é um exemplo de design orientado a objetos em Java, tornando a Opção 
B uma declaração verdadeira. 
As opções C e D também são verdadeiras, pois seguem da herança modelo no diagrama. 
A opção A é a resposta correta, pois a independência da plataforma não tem nada a ver com o diagrama.

3. What is the proper filename extension for a Java bytecode compiled file?
A. .java
B. .bytecode
[C]. .class
D. .dll

[pt]  C. A extensão apropriada para um arquivo de bytecode compilado em Java é .class, tornando a Opção C a resposta correta.

4. Given that a Date class exists in both the java.util and java.sql packages, what is the
result of compiling the following class?

1: import java.util.*;
2: import java.sql.*;
3: public class BirthdayManager {
4:   private Date rob = new Date();
5:   private java.util.Date sharon = new java.util.Date();
6: }


A. The code does not compile because of lines 1 and 2.
B. The code does not compile because of line 4.
C. The code does not compile because of line 5.
D. The code compiles without issue.

[pt] B. O fato de a classe Date existir nos dois pacotes não afeta a capacidade de
importar os dois pacotes, para que as linhas 1 e 2 sejam compiladas sem problemas e a Opção A seja
incorreta. A linha 4 não será compilada porque a classe Date usada é ambígua, tornando
Opção B correta e Opção D incorreta. Finalmente, a opção C está incorreta porque a linha 5
compila, pois o nome completo da classe é usado.


5. Which of the following is not a facet of traditional object-oriented programming languages?
A. Objects are grouped as procedures, separate from the data they act on.
B. An object can take many forms via casting.
C. An object can hold data, referred to as attributes.
D. An object can perform actions, via methods.

[pt] A. As opções B, C e D são atributos da programação orientada a objetos tradicional.
A opção A está incorreta, pois um projeto orientado a objetos tende a agrupar dados e as ações
relacionados a esses dados em um único objeto.


6. Which variables have a scope limited to a method?
A. Interface variables
B. Class variables
C. Instance variables
D. Local variables

[pt] D. Somente variáveis locais têm um escopo tão pequeno, tornando a Opção D a resposta correta.

7. Which package is imported into every Java class by default?
A. java.util
B. java.lang
C. system.lang
D. java.system

[pt] B. O pacote java.lang é importado para todas as classes Java, portanto, a Opção B está correta. o
outras opções devem ser importadas explicitamente. A opção A existe, mas deve ser explicitamente
importado. As opções C e D não existem no Java Runtime padrão.

8. Which of the following is not a valid code comment in Java?
A. // Add 5 to the result
B. /*** TODO: Fix bug 12312 ***/
C. # Add configuration value
D. /* Read file from system ****/

[pt] C. Java aceita as opções A, B e D como comentários válidos. Observe que a sintaxe / * * / pode
possuem caracteres estrela (*) adicionais (e desiguais), como mostrado em B e D. A opção C é
incorreto como hashtag (#) não é um caractere de comentário válido em Java.


9. Which statement about a valid .java file is true?
A. It can only contain one class declaration.
B. It can contain one public class declaration and one public interface definition.
C. It must define at least one public class.
D. It may define at most one public class.

[pt] D. Um arquivo .java válido pode definir qualquer número de classes ou interfaces, mas tem no máximo
uma classe pública. Também não pode definir nenhuma classe pública. Por esses motivos, a opção
A, B e C estão incorretos, deixando a opção D como a única resposta correta.

10. Given the following application, fill in the missing values in the table starting from the top and going downward.
package competition;

public class Robot {
static String weight = "A lot";
/* default */ double ageMonths = 5, ageDays = 2;
private static boolean success = true;
public void main(String[] args) {
final String retries = "1";
// P1
}
}

Variable Type Number of Variables Accessible at P1
Class _______
Instance _______
Local _______
A. 2, 0, 1
B. 2, 2, 1
C. 1, 0, 1
D. 0, 2, 1

[PT] B. Observe nesta pergunta que main () não é um método estático, portanto, ele pode acessar
variáveis ​​de classe e instância. Como existem duas variáveis ​​de classe e duas instâncias
variáveis ​​definidas, a opção B é a resposta correta.


11. Which statement about import statements is true?
A. The class will not compile if it contains unused import statements.
B. Unused import statements can be removed from the class without causing a class to become unable to be compiled.
C. The class will not compile if a duplicate import statement is present.
D. If a class contains an import statement for a class used in the program that cannot be found, it can still compile.

[PT] B. Uma classe será compilada se tiver instruções de importação não utilizadas ou redundantes,
As opções A e C estão incorretas. A opção D também está incorreta, pois o compilador deve poder
localize a classe da instrução de importação. A resposta correta é a opção B. Removendo
instruções de importação não utilizadas não fazem com que uma classe não possa ser compilada.


12. What is the result of compiling and executing the following class?
1: public class ParkRanger {
2: int birds = 10;
3: public static void main(String[] data) {
4: int trees = 5;
5: System.out.print(trees+birds);
6:}
7: }

A. It does not compile.
B. It compiles but throws an exception at runtime.
C. It compiles and outputs 5 .
D. It compiles and outputs 15 .

[PT] A. O código não é compilado devido à linha 5, tornando a Opção A a resposta correta.
Para esta pergunta, ajuda a entender o escopo variável. O método main () é estático
e não tem acesso a nenhuma variável de instância de classe. A variável aves não é
estático e requer uma variável de instância de classe para acessar. Portanto, o código não
compilar quando o método estático tenta acessar uma variável não estática sem um
instância da classe.


13. Which statements about Java are true?
I. The java command can execute .java and .class files.
II. Java is not object oriented.
III. The javac command compiles directly into native machine code.
A. I only
B. III only
C. II and III
D. None are true.

[PT] D. O comando java só pode executar arquivos .class compilados, então eu sou falso. Java é
certamente orientado a objetos, um dos principais princípios de design, portanto II também é falso. o
O comando javac é compilado no bytecode, que deve ser executado em uma máquina virtual Java
(JVM) e não é um código de máquina nativo, portanto III também é falso. Como nenhum dos
declarações são verdadeiras, a opção D é a resposta correta.

14. Which of the following lines of code is not allowed as the first line of a Java class file?
A. import widget.*;
B. // Widget Manager
C. package sprockets;
D. int facilityNumber;

[PT] D. Uma classe pode começar com um comentário, uma instrução de pacote opcional ou uma importação
declaração se não houver declaração de pacote. Não pode começar com uma definição de variável,
tornando a opção D a resposta correta.


15. Which one of the following statements is true about using packages to organize your code in Java?
A. Every class is required to include a package declaration.
B. To create a new package, you need to add a package.init file to the directory.
C. Packages allow you to limit access to classes, methods, or data from classes outside
the package.
D. It is not possible to restrict access to objects and methods within a package.

[PT] C. As classes podem ser definidas sem uma declaração de pacote e são colocadas no padrão
pacote, portanto, a opção A está incorreta. A opção B é uma declaração completamente falsa, pois não existe
é necessário em Java. A opção C está correta, pois é um dos principais motivos para
organizando seu aplicativo em pacotes. A opção D está incorreta como pacote privado
permite que o acesso a métodos e variáveis ​​seja limitado a essas classes na mesma
pacote.

16. Given that the current directory is /user/home , with an application Java file in
/user/home/Manager.java that uses the default package, which are the correct
commands to compile and run the application in Java?
A. javac Manager java Manager
B. javac Manager.java java Manager
C. javac Manager java Manager.class
D. javac Manager.java java Manager.class

[PT] B. O comando de compilação requer o nome completo ou relativo do arquivo, incluindo
a extensão .java, tornando as opções A e C incorretas. O comando de execução
requer o nome da classe sem uma extensão de nome de arquivo, tornando a Opção D incorreta.
A opção B é o único conjunto correto de comandos de compilação e execução.


17. Structuring a Java class such that only methods within the class can access its
instance variables is referred to as _______.
A. platform independence
B. object orientation
C. inheritance
D. encapsulation

[PT] D. Encapsulamento é a técnica de remover o acesso às variáveis ​​de instância de uma classe
de processos fora da classe, fazendo da Opção D a resposta correta.


18. What is the output of the following code snippet?
String tree = "pine";
int count = 0;
if (tree.equals("pine")) {
int height = 55;
count = count + 1;
}
System.out.print(height + count);

A. 1
B. 55
C. 56
D. It does not compile.

[PT] D. A variável height é declarada no bloco de instrução if-then. Portanto,
não pode ser referenciado fora da instrução if-then e o código não é compilado.

19. Which of the following is true of a Java bytecode file?
A. It can be run on any computer with a compatible JVM.
B. It can only be executed on the same type of computer that it was created on.
C. It can be easily read and modified in a standard text editor.
D. It requires the corresponding .java that created it to execute.


[PT] A. Um arquivo de bytecode Java é um conjunto de instruções codificadas em binários projetadas para serem executadas em
qualquer computador com uma JVM compatível, tornando a opção A a única resposta correta. Por
JVM compatível, queremos dizer um capaz de executar o arquivo de classe. Por exemplo, um Java 6
A JVM pode ter problemas ao executar um arquivo compilado Java 8. A opção B está incorreta e é
mais uma faceta das aulas de programação compiladas em linguagem de máquina. A opção C também é
incorreto como dados binários não é particularmente legível por humanos. Finalmente, a opção D é
incorreto, pois o arquivo compilado pode ser distribuído sem o arquivo de origem .java e
executar sem problema.


20. What is the correct character for terminating a statement in Java?
A. A colon ( : )
B. An end-of-line character
C. A tab character
D. A semicolon ( ; )

[PT] D. Ao contrário de outras linguagens de programação, a maneira correta de terminar uma linha
do código está com ponto e vírgula (;), tornando D a única resposta correta.

21. What is the result of compiling and executing the following class?
1: public class Tolls {
2:      private static int yesterday = 1;
3:      int tomorrow = 10;
4: public static void main(String[] args) {
5:       Tolls tolls = new Tolls();
6:       int today=20, tomorrow = 40;
7:       System.out.print(today + tolls.tomorrow + tolls.yesterday);
8:  }
9: }


A. The code does not compile due to line 6.
B. The code does not compile due to line 7.
C. 31
D. 61

[PT] C. O código é compilado e executado sem problemas, portanto, as opções A e B estão incorretas. 
A pergunta depende da sua capacidade de entender o escopo variável. A variável today tem
escopo local para o método em que é executado. A variável tomorrow é declarada novamente
no método, mas a referência usada na linha 7 é para a variável de instância com um valor
de 10. Finalmente, a variável tomorrow é static. Ao usar uma referência de instância para
acessar uma variável static não é recomendado, não impede que a variável
sendo lido. O resultado é que a linha 7 avalia e imprime (20 + 10 + 1) = 31, tornando C o
resposta correta.


22. Given the following class definition, which is the only line that does not contain a
compilation error?
1: public ThisClassDoesNotCompile {
2: double int count;
3: void errors() {}
4: static void private limit; }
A. Line 1
B. Line 2
C. Line 3
D. Line 4

[PT] C. A linha 1 está ausente da palavra-chave da classe. A linha 2 contém dois tipos para o mesmo
variável. A linha 3 é uma definição válida para um método, tornando C a resposta correta.
Por fim, a linha 4 contém um modificador de acesso, privado, após o tipo de retorno, que não é
permitido. Além disso, void é um tipo inválido para variáveis.

23. Which of the following features allows a Java class to be run on a wide variety of
computers and devices?
A. Encapsulation
B. Object oriented
C. Inheritance
D. Platform independence

[PT] D. Independência de plataforma é a propriedade do Java que permite que ele seja executado em uma variedade
de dispositivos diferentes.

24. Which of the following is not a property of a JVM?
A. It prevents Java bytecode from being easily decoded/decompiled.
B. It supports platform independence.
C. It manages memory for the application.
D. It translates Java instructions to machine instructions.

[PT] A. As opções B, C e D são instruções corretas sobre JVMs. A opção A está incorreta.
Além de não ser uma declaração sobre JVMs, é realmente falsa, pois o bytecode Java pode
freqüentemente são facilmente decodificados / descompilados.


25. Which of the following variables are always in scope for the entire program?
A. Package variables
B. Class variables
C. Instance variables
D. Local variables

[PT] B. Não existem variáveis ​​de pacote, portanto a Opção A está incorreta. A opção C é
incorreto, pois a variável está no escopo apenas dentro de uma instância específica da classe. Opção
D também está incorreto, pois a variável está apenas no escopo de um único método definido
A opção B é a única resposta correta, pois as variáveis ​​de classe estão no escopo dentro do
programa.


26. Given the following wildcard import statements, which class would be included in the
import?import television.actor.*;
import movie.director.*;
A. television.actor.recurring.Marie
B. movie.directors.John
C. television.actor.Package
D. movie.NewRelease

[PT] C. A opção A está incorreta, pois o subpacote recorrente não está incluído na importação
afirmações. A opção B também está incorreta, pois usa os diretores plurais em vez do
diretor singular usado nas declarações de importação. A opção D está incorreta como o curinga
é aplicado ao subpacote movie.director, não ao filme do pacote. Finalmente, opção C
está correto, pois é uma classe válida acessível a partir da importação de curinga.


27. Which is the correct order of statements for a Java class file?
A. import statements, package statement, class declaration
B. package statement, class declaration, import statement
C. class declaration, import statements, package declaration
D. package statement, import statements, class declaration

[PT] D. As classes Java são definidas nesta ordem: instrução de pacote, instrução de importação, classe
declaração, tornando a opção D a única resposta correta. Observe que nem todos esses
instruções são necessárias. Por exemplo, uma classe pode não ter uma instrução de pacote, mas se
faz, ele deve vir primeiro no arquivo.

28. Given the following class definition, what is the maximum number of import
statements that can be discarded and still have the code compile? For this question,
assume that the Blackhole class is defined only in the stars package.
package planetarium;
import java.lang.*;
import stars.*;
import java.lang.Object;
import stars.Blackhole;
public class Observer {
public void find(Blackhole blackhole) {}
}
A. Zero
B. One
C. Two
D. Three

[PT] D. As declarações de importação de estrelas. * E estrelas.Blackhole são importações redundantes
instruções, uma vez que apenas a classe Blackhole é usada e, portanto, uma delas pode ser
removido com segurança. As instruções de importação java.lang. * E java.lang.Object são ambas
não é necessário, pois o java.lang é importado automaticamente em todas as classes Java. Portanto,
três das quatro instruções de importação podem ser removidas com segurança, fazendo a resposta correta
Opção D.


29. Given the following class definition, which command will cause the application to
output the message White-tailed ?
package forest;
public class Deer {
public static void main(String... deerParams) {
System.out.print(theInput[2]);
}
}
A. java forest.Deer deer 5 "White-tailed deer"
B. java forest.Deer "White-tailed deer" deer 3
C. java forest.Deer Red deer White-tailed deer
D. java forest.Deer My "deer White-tailed"

[PT] C. O aplicativo imprime o terceiro argumento dos métodos de entrada. Note que o dobro
aspas "" argumentos de entrada do grupo. Portanto, o terceiro argumento da opção A é White-
veado de cauda. O terceiro argumento da opção B é 3. O terceiro argumento da opção C é
Cauda branca, tornando-a a resposta correta. Por fim, a opção D possui apenas dois argumentos de entrada, levando a uma ArrayIndexOutOfBoundsException tentando ler o terceiro
argumento em tempo de execução.


30. Which of the following is a true statement?
A. The java command compiles a .java file into a .class file.
B. The javac command compiles a .java file into a .class file.
C. The java command compiles a .class file into a .java file.
D. The javac command compiles a .class file into a .java file.

[PT] B. O comando javac compila um arquivo .java em um arquivo .class bytecode, tornando
Opção B, a resposta correta.

31. Which of the following statements about Java is true?
A. Java is a procedural programming language.
B. Java allows method overloading.
C. Java allows operator overloading.
D. Java allows direct access to objects in memory.

[PT] B. Java é orientado a objetos, não processual; portanto, a opção A é uma declaração falsa. Java permite
método de sobrecarga nas subclasses, portanto, a opção B está correta. A sobrecarga do operador é
permitido em linguagens como C ++, não Java; portanto, a opção C também é falsa. Finalmente, opção
D não é uma afirmação verdadeira, pois a JVM gerencia a localização dos objetos na memória que
pode mudar e é transparente para o aplicativo Java.


32. Given the following code, what values inserted in order into the blank lines, allow the
code to compile?
_______agent;
public _______Banker {
private static _______getMaxWithdrawal() {
return 10;
}
}
A. import , class , null
B. import , interface , void
C. package , int , int
D. package , class , long

[PT] D. A opção A está incorreta, pois o tipo de retorno do método não pode ser nulo. A opção B é
também incorreto, pois o tipo de retorno não pode ser anulado se o método usar uma instrução de retorno.
A opção C também está incorreta, pois a palavra-chave da classe é substituída por int. A opção D está correta
porque é a única resposta que permite que o código seja compilado sem problemas. Observe que
outros valores são possíveis para esta pergunta. Por exemplo, int ou long pode ser
inserido no último espaço em branco. A chave aqui é que apenas uma das opções de resposta disponíveis
permite que o código seja compilado.


33. What is the output of the following application?
public class Airplane {
static int start = 2;
final int end;
public Airplane(int x) {
x = 4;
end = x;
}
public void fly(int distance) {
System.out.print(end-start+" ");
System.out.print(distance);
}
public static void main(String... start) {
new Airplane(10).fly(5);
}
} 
    
A. 2 5
B. 8 5
C. 6 5
D. The code does not compile.

33. A. O código é compilado para que a Opção D esteja incorreta. A entrada para o construtor é ignorada,
tornando a atribuição de fim 4. Como o início é 2, a subtração de 4 por 2 resulta
no aplicativo, imprimindo 2, seguido de 5, tornando a opção A a resposta correta.


34. What is one of the most important reasons that Java supports extending classes via
inheritance?
A. Inheritance requires that a class that extends another class be in the same package.
B. The program must spend extra time/resources at runtime jumping through
multiple layers of inheritance to determine precise methods and variables.
C. Method signature changes in parent classes may break subclasses that use overloaded methods.
D. Developers minimize duplicate code in new classes by sharing code in a common parent class.

34. D. A opção A é uma afirmação falsa, enquanto as opções B e C são na verdade argumentos contra
usando herança. A opção D é um dos motivos mais importantes que o Java suporta
herança, para permitir maior reutilização de código entre as classes.


35. Which of the following is a valid code comment in Java?
A. //////// Walk my dog
B. #! Go team!
C. / Process fails at runtime /
D. None of the above

35. A. A sintaxe de barra dupla (//) pode ter qualquer número de barras como comentário, desde que
como começa com dois deles, tornando a opção A a resposta correta. O (#) não é um
caractere de comentário em Java, independentemente de ser seguido por um (!), portanto, a opção B é
incorreta. A opção C está incorreta, pois uma única barra (/) não é um comentário válido em Java.
Finalmente, a opção D está incorreta, pois a opção A é um comentário válido.


36. Which of the following method signatures is not a valid declaration of an entry point
in a Java application?
A. public static void main(String... arguments)
B. public static void main(String arguments)
C. public static final void main(String[] arguments)
D. public static void main(String[] arguments)

36. B. Um ponto de entrada em um aplicativo Java consiste em um método main () com um único
Argumento [], tipo de retorno de void e modificadores public e static. A opção D é
a sintaxe típica desse método, embora as Opções A e C também sejam formas válidas de
este método. Observe que o final do modificador é opcional e pode ser adicionado ao método
assinatura. Além disso, o método main () pode levar um vararg ou array. A opção B é a
somente declaração inválida, pois não leva uma matriz como argumento.

37. Given the file Magnet.java below, which of the marked lines can you independently
insert the line public String color; into and still have the code compile?
// line a1
public class Magnet {
// line a2
public void attach() {
// line a3
}
// line a4
}
A. a1 and a3
B. a2 and a4
C. a2 , a3 , and a4
D. a1 , a2 , a3 , and a4


[pt] B. A linha de código não pode ser inserida em a1 porque nenhuma variável é permitida fora de
a declaração de classe neste arquivo, tornando as Opções A e D incorretas. A linha de código
também não pode ser inserido em a3, pois as variáveis ​​locais definidas nos métodos não podem ter
modificadores de acesso como público, tornando a Opção C incorreta. O código pode ser inserido
independentemente em A2 e A4 como variáveis ​​de instância podem ser definidas em qualquer lugar da classe
fora de um método. Portanto, a opção B é a escolha correta. A. 


38. What is required to define a valid Java class file?
A. A class declaration
B. A package statement
C. At least one import statement
D. The public modifier

[pt] A opção A é a única resposta correta, pois uma definição de classe é a única necessária
componente em um arquivo de classe Java. Observe que dissemos um arquivo de classe Java aqui; Java também permite
interfaces e enumerações a serem definidas em um arquivo. Uma declaração de pacote e importação
As instruções são opcionais para declarar uma classe, tornando as Opções B e C incorretas. UMA
A classe também pode ser definida com acesso em nível de pacote em um arquivo, tornando a Opção D uma
resposta incorreta.

39. What is the proper filename extension for a Java source file?
A. .jav
B. .class
C. .source
D. .java


[pt] D. A extensão apropriada para um arquivo de bytecode compilado em Java é .java, tornando a Opção D
a resposta correta.


40. Given that a Math class exists in both the java.lang and pocket.complex packages,
what is the result of compiling the following class?

1: package pocket;
2: import pocket.complex.*;
3: import java.util.*;
4: public class Calculator {
5: public static void main(String[] args) {
6:  System.out.print(Math.floor(5));
7: }
8: }
A. The code does not compile because of line 2.
B. The code does not compile because of line 3.
C. The code does not compile because of line 6.
D. The code compiles without issue.

[pt] C. Lembre-se de que o java.lang é importado automaticamente em todas as classes Java, portanto
java.lang.Math e pocket.complex.Math são importados para essa classe.
A importação dos dois conjuntos de pacotes não causa problemas de compilação, tornando
Opção A incorreta. A linha 3 é uma importação desnecessária, mas sua inclusão não impede a
classe da compilação, tornando a Opção B incorreta. Embora as duas versões do Math possam ser
importado para a classe, o uso da classe Math requer um nome de pacote. Porque
disso, a linha 6 não é compilada porque a referência de classe é ambígua, tornando a opção C
a resposta correta e a opção D incorreta.


41. Given a class that uses the following import statements, which class would not be
automatically accessible within the class without using its full package name?
import dog.*;
import dog.puppy.*;
A. dog.puppy.female.KC
B. dog.puppy.Georgette
C. dog.Webby
D. java.lang.Object42. _______is the technique of structuring programming data as a unit consisting of
attributes, with actions defined on the unit.

[PT] 41. A. As opções B e C são acessíveis dentro da classe, pois são cobertas pela importação
afirmações. A opção D também é boa, pois java.lang.Object está disponível sem um explícito
importar. A única classe que não é acessível automaticamente dentro da classe sem o total
O nome do pacote é dog.puppy.female.KC, pois as instruções de importação não incluem sub-
pacotes; portanto, a opção A é a resposta correta.

42. _______is the technique of structuring programming data as a unit consisting of
attributes, with actions defined on the unit.
A. Encapsulation
B. Object orientation
C. Platform independence
D. Polymorphism

[PT] 42. B. A programação orientada a objetos é a técnica de estruturar dados em objetos,
que pode conter dados e um conjunto de ações que operam sobre os dados, tornando a opção B
a resposta correta.

43. Given the following class definition, what is the maximum number of import
statements that can be discarded and still have the code compile? For this question,
assume that the Broccoli class is in the food.vegetables package, and the Apple class
is the food.fruit package.
package food;
import food.vegetables.*;
import food.fruit.*;
import java.util.Date;
public class Grocery {
Apple a; Broccoli b; Date c;
}

A. 0
B. 1
C. 2
D. 3

[PT] 43. A. Todas as instruções de importação nesta classe são necessárias. A remoção de qualquer um deles
faça com que a classe não seja compilada, fazendo da Opção A a resposta correta.

44. Given the following application, what is the expected output?
public class Keyboard {
private boolean numLock = true;
static boolean capLock = false;
public static void main(String... shortcuts) {
System.out.print(numLock+" "+capLock);
}
}
A. true false
B. false false
C. It does not compile.
D. It compiles but throws an exception at runtime.

[PT] 44. C. A variável numLock não está acessível no método estático main () sem um
instância da classe Keyboard; portanto, o código não é compilado e a opção C é
a resposta correta.


45. What is the result of compiling and executing the following class?
public class RollerSkates {
static int wheels = 1;
int tracks = 5;
public static void main(String[] arguments) {RollerSkates s = new RollerSkates();
int feet=4, tracks = 15;
System.out.print(feet + tracks + s.wheels);
}
}
A. The code does not compile.
B. 5
C. 10
D. 20

[PT] 45. D. O código é compilado e executado sem problemas, portanto a Opção A está incorreta. A questão
envolve entender o valor e o escopo de cada variável na instrução print ().
As variáveis ​​pés e faixas têm escopo local e são definidas como 4 e 15, respectivamente,
ignorando o valor das faixas 5 na instância da classe. Finalmente, o estático
A variável s.wheels possui um valor 1. O resultado é que o valor combinado é 20, tornando
Opção D, a resposta correta.


46. What is the result of compiling and executing the following class?
package sports;
public class Bicycle {
String color = "red";
private void printColor(String color) {
color = "purple";
System.out.print(color);
}
public static void main(String[] rider) {
new Bicycle().printColor("blue");
}
}
A. red
B. purple
C. blue
D. It does not compile.

[PT] 46. ​​B. Primeiro, a variável de cor definida na instância e definida como vermelho é ignorada no
O método printColor () como o escopo local substitui o escopo da instância; portanto, a Opção A está incorreta.
O valor da cor passado para o método printColor () é azul, mas isso é perdido pelo
atribuição a roxo, tornando a opção B a resposta correta e a opção C incorreta.
A opção D está incorreta, pois o código é compilado e executado sem problemas. 


47. Which statements about calling the compilation command javac and the execution
command java are true?
I. java may use a period . to separate packages.
II. javac takes a .java file and returns a .class file.
III. java may use a slash ( /) to separate packages.
A. I only
B. II only
C. I and II
D. I, II, and III

[PT] 47. C. O comando javac pega um arquivo .java baseado em texto e retorna um bytecode binário
arquivo .class, tornando II uma afirmação verdadeira. O comando java usa um ponto (.) Para
pacotes separados, não uma barra (/), tornando eu uma afirmação verdadeira e III uma afirmação falsa.
Por esses motivos, a opção C é a resposta correta.

48. What is the result of compiling and executing the following application?
package forecast;
public class Weather {
private static boolean heatWave = true;
public static void main() {
boolean heatWave = false;
System.out.print(heatWave);
}
}
A. true
B. false
C. It does not compile.
D. It compiles but throws an error at runtime.


[PT] 48. D. O aplicativo é compilado sem problemas, portanto a opção C está incorreta. A aplicação
embora não seja executado, pois o método main () não possui o método correto
assinatura. Está faltando o argumento de entrada necessário, uma matriz de String. Tentando
executar o aplicativo sem um ponto de entrada adequado produz um erro, tornando a Opção
D a resposta correta.

49. Given the following class diagram, which Java implementation most closely matches
this structure?      
                    Book
                    -----------------
                    +numberOfPages
                    -----------------
                    +getRating()


A. public class Book {
public int numOfPages;

B. public class Book {
public String getRating() {return null;} }

C. public class Book {
public int numberOfPages;
public String getRating() {return null;} }

D. public class Book {
void numberOfPages; }

[PT] 49. C. A opção A não é compilada porque está faltando o colchete de fechamento da classe.
A opção D também não é compilada, pois void não é um tipo válido para uma variável. Independentemente,
As opções A e D estão incorretas porque estão faltando o método getRating (). Observe que
A opção A também usa uma abreviação para numberOfPages. A opção B está incorreta, pois é
faltando o atributo numberOfPages. A opção C é a resposta correta, pois corretamente
define o atributo numberOfPages e o método getRating ().


50. Which statement about the JVM is true?
A. The JVM schedules garbage collection on a predictable schedule.
B. The JVM ensures that the application will always terminate.
C. The JVM requires a properly defined entry point method to execute the
application.
D. A Java compiled code can be run on any computer.

[PT] C. A coleta de lixo pode ocorrer a qualquer momento enquanto um aplicativo está em execução,
especialmente se a memória disponível ficar subitamente baixa, tornando a Opção A incorreta.
A opção B também está incorreta, pois é trivial criar um aplicativo Java com um número infinito
loop que nunca termina. A opção D está incorreta porque o computador deve poder
para executar a JVM para executar uma classe Java. A opção C é a única resposta correta, pois
a JVM requer um método de ponto de entrada para começar a executar o aplicativo.