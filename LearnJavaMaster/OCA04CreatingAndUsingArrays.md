Chapter 4
Creating and Using Arrays
THE OCA EXAM TOPICS COVERED IN THIS PRACTICE TEST INCLUDE
THE FOLLOWING:
Creating and Using Arrays
Declare, instantiate, initialize and use a one-dimensional array
Declare, instantiate, initialize and use multi-dimensional arrays


1. What symbol is used for a varargs method parameter?
A. ..
B. ...
C. --
D. ---


2. Fill in the blank in the following code to get the first element from the varargs
parameter.
public void toss (Frisbee... f) {
Frisbee first = ____________;
}
A. f
B. f[0]
C. f[1]
D. None of the above


3. Which of the following are primitives?
int[] lowercase = new int[0];
Integer[] uppercase = new Integer[0];
A. Only lowercase
B. Only uppercase
C. Bother lowercase and uppercase
D. Neither lowercase nor uppercase


4. How many of the following are legal declarations?
[]double lion;
double[] tiger;
double bear[];
A. None
B. One
C. Two
D. Three


5. Given the following two methods, which method call will not compile?
public void printStormName(String... names) {
    System.out.println(Arrays.toString(names));
}
public void printStormNames(String[] names) {
    System.out.println(Arrays.toString(names));
}

A. printStormName("Arlene");
B. printStormName(new String[] { "Bret" });
C. printStormNames("Cindy");
D. printStormNames(new String[] { "Don" });


6. How do you determine the number of elements in an array?
A. buses.length
B. buses.length()
C. buses.size
D. buses.size()


7. Which of the following create an empty two-dimensional array with dimensions 2×2?
A. int[][] blue = new int[2, 2];
B. int[][] blue = new int[2], [2];
C. int[][] blue = new int[2][2];
D. int[][] blue = new int[2 x 2];


8. How many lines does the following code output?
String[] days = new String[] { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
    for (int i = 0; i < days.length; i++)
        System.out.println(days[i]);
        
A. Six
B. Seven
C. The code does not compile.
D. The code compiles but throws an exception at runtime.


9. What are the names of the methods to do searching and sorting respectively on
arrays?
A. Arrays.binarySearch() and Arrays.linearSort()
B. Arrays.binarySearch() and Arrays.sort()
C. Arrays.search() and Arrays.linearSort()
D. Arrays.search() and Arrays.sort()


10. What does this code output?
String[] nums = new String[] { "1", "9", "10" };
Arrays.sort(nums);
System.out.println(Arrays.toString(nums));
A. [1, 9, 10]
B. [1, 10, 9]
C. [10, 1, 9]
D. None of the above


11. Which of the following references the first and last element in a non-empty array?
A. trains[0] and trains[trains.length]
B. trains[0] and trains[trains.length - 1]
C. trains[1] and trains[trains.length]
D. trains[1] and trains[trains.length - 1]


12. How many of the following are legal declarations?
String lion [] = new String[] {"lion"};
String tiger [] = new String[1] {"tiger"};
String bear [] = new String[] {};
String ohMy [] = new String[0] {};

A. None
B. One
C. Two
D. Three

13. How many of the following are legal declarations?
float[] lion = new float[];
float[] tiger = new float[1];
float[] bear = new[] float;
float[] ohMy = new[1] float;

A. None
B. One
C. Two
D. Three


14. Which statement most accurately represents the relationship between searching and
sorting with respect to the Arrays class?
A. If the array is not sorted, calling Arrays.binarySearch() will be accurate, but slower than if it were sorted.
B. The array does not need to be sorted before calling Arrays.binarySearch() to get an accurate result.
C. The array must be sorted before calling Arrays.binarySearch() to get an accurate result.
D. None of the above

15. Which is not a true statement about an array?
A. An array expands automatically when it is full.
B. An array is allowed to contain duplicate values.
C. An array understands the concept of ordered elements.
D. An array uses a zero index to reference the first element.

16. Which line of code causes an ArrayIndexOutOfBoundsException ?
String[][] matrix = new String[1][2]; 
matrix[0][0] = "Don't think you are, know you are."; // m1
matrix[0][1] = "I'm trying to free your mind Neo"; // m2
matrix[1][0] = "Is all around you "; // m3
matrix[1][1] = "Why oh why didn't I take the BLUE pill?"; // m4

A. m1
B. m2
C. m3
D. m4

17. What does the following output?
String[] os = new String[] { "Mac", "Linux", "Windows" };
Arrays.sort(os);
System.out.println(Arrays.binarySearch(os, "Mac"));
A. 0
B. 1
C. 2
D. The output is not defined.


18. Which is the first line to prevent this code from compiling and running without error?
char[][] ticTacToe = new char[3,3]; // r1
ticTacToe[1][3] = 'X'; // r2
ticTacToe[2][2] = 'X';
ticTacToe[3][1] = 'X';
System.out.println(ticTacToe.length + " in a row!"); // r3

A. Line r1
B. Line r2
C. Line r3D. None of the above

19. How many objects are created when running the following code?
Integer[] lotto = new Integer[4];
lotto[0] = new Integer(1_000_000);
lotto[1] = new Integer(999_999);
A. Two
B. Three
C. Four
D. Five

20. How many of the following are legal declarations?
[][] String alpha;
[] String beta;
String[][] gamma;
String[] delta[];
String epsilon[][];
A. Two
B. Three
C. Four
D. Five

21. Which of the options in the graphic best represent the blocks variable?
char[][] blocks = new char[][] { { 'a', 'b', 'c' }, { 'd' }, { 'e', 'f' } };A. Option A
B. Option B
C. Option C
D. Option D

22. What happens when calling the following method with a non-null and non-empty array?
public static void addStationName(String[] names) {
    names[names.length] = "Times Square";
}

A. It adds an element to the array the value of which is Times Square .
B. It replaces the last element in the array with the value Times Square .
C. It does not compile.
D. It throws an exception.

23. How many lines does the following code output?
String[] days = new String[] { "Sunday", "Monday", "Tuesday",
"Wednesday", "Thursday", "Friday", "Saturday" };
for (int i = 0; i < days.size(); i++)
System.out.println(days[i]);
A. SixB. Seven
C. The code does not compile.
D. The code compiles but throws an exception at runtime.

24. How many dimensions does the array reference moreBools allow?
boolean[][][] bools, moreBools;
A. One dimension
B. Two dimensions
C. Three dimensions
D. None of the above

25. What is a possible output of the following code?
String[] strings = new String[2];
System.out.println(strings);
A. [null, null]
B. [,]
C. [Ljava.lang.String;@74a14482
D. None of the above

26. Which is the first line to prevent this code from compiling and running without error?
char[][] ticTacToe = new char[3][3]; // r1
ticTacToe[1][3] = 'X'; // r2
ticTacToe[2][2] = 'X';
ticTacToe[3][1] = 'X';
System.out.println(ticTacToe.length + " in a row!"); // r3
A. Line r1
B. Line r2
C. Line r3
D. None of the above

27. What is the result of running the following as java Copier ?
package duplicate;
public class Copier {
    public static void main(String... original) {
        String... copy = original;
        System.out.println(copy.length + " " + copy[0]);
    }
}
A. 0
B. 0 followed by an exception
C. 1 followed by an exception
D. The code does not compile.

28. What is the result of running the following program?
01: package fun;
02: public class Sudoku {
03:     static int[][] game = new int[6][6];
04:     public static void main(String[] args) {
05:         game[3][3] = 6;
06:         Object[] obj = game;
07:         obj[3] = "X";
08:         System.out.println(game[3][3]);
09:     }
10: }

A. X
B. The code does not compile.
C. The code compiles but throws a NullPointerException at runtime.
D. The code compiles but throws a different exception at runtime.

29. What does the following output?
String[] os = new String[] { "Mac", "Linux", "Windows" };
Arrays.sort(os);
System.out.println(Arrays.binarySearch(os, "RedHat"));
A. -1
B. -2
C. -3
D. The output is not defined.

30. What is the output of the following when run as java FirstName Wolfie ?
public class FirstName {
public static void main(String... names) {
System.out.println(names[0]);
}
}
A. FirstName
B. Wolfie
C. The code throws an ArrayIndexOutOfBoundsException .
D. The code throws a NullPointerException .

31. What is the output of the following when run as java Count 1 2 ?public class Count {
public static void main(String target[]) {
    System.out.println(target.length);
}
}
A. 0
B. 1
C. 2
D. The code does not compile.

32. What is the output of the following when run as java unix.EchoFirst seed flower ?
package unix;
import java.util.*;
public class EchoFirst {
public static void main(String[] args) {
String one = args[0];
Arrays.sort(args);
int result = Arrays.binarySearch(args, one);
System.out.println(result);
}
}
A. 0
B. 1
C. The code does not compile.
D. The code compiles but throws an exception at runtime.

33. Which of these four array declarations produces a different array than the others?
A. int[][] nums = new int[2][1];
B. int[] nums[] = new int[2][1];
C. int[] nums[] = new int[][] { { 0 }, { 0 } };
D. int[] nums[] = new int[][] { { 0, 0 } };

34. How do you access the array element with the value of "z" ?A. dimensions["three"][2]
B. dimensions["three"][3]
C. dimensions[2][2]
D. dimensions[3][3]

35. How many lines does the following code output?
String[] days = new String[] { "Sunday", "Monday", "Tuesday",
"Wednesday", "Thursday", "Friday", "Saturday" };
for (int i = 1; i <= days.length; i++)
System.out.println(days[i]);
A. Six
B. Seven
C. The code does not compile.
D. The code compiles but throws an exception at runtime.

36. What is the output of the following when run as java FirstName Wolfie ?
public class FirstName {
public static void main(String... names) {
System.out.println(names[1]);
}
}
A. FirstName
B. Wolfie
C. The code throws an ArrayIndexOutOfBoundsException .
D. The code throws a NullPointerException .

37. Which is the first line to prevent this code from compiling and running without error?
char[][] ticTacToe = new char[3][3]; // r1
ticTacToe[0][0] = 'X'; // r2
ticTacToe[1][1] = 'X';
ticTacToe[2][2] = 'X';
System.out.println(ticTacToe.length + " in a row!"); // r3
A. Line r1
B. Line r2
C. Line r3
D. None of the above

38. What is the output of the following when run as java Count 1 2 ?
public class Count {
public static void main(String target[]) {
System.out.println(target.length());
}
}
A. 0
B. 1
C. 2
D. The code does not compile.

39. How many dimensions does the array reference moreBools allow?
boolean[][] bools[], moreBools;
A. One dimension
B. Two dimensions
C. Three dimensions
D. None of the above

40. What is the result of the following when called as java counting.Binary ?
package counting;
import java.util.*;
public class Binary {
public static void main(String... args) {
Arrays.sort(args);
System.out.println(Arrays.toString(args));
}
}
A. nullB. []
C. The code does not compile.
D. The code compiles but throws an exception at runtime.

41. What does the following output?
String[] os = new String[] { "Mac", "Linux", "Windows" };
System.out.println(Arrays.binarySearch(os, "Linux"));
A. 0
B. 1
C. 2
D. The output is not defined.

42. What is the result of running the following program?
1: package fun;
2: public class Sudoku {
3: static int[][] game;
4: public static void main(String[] args) {
5: game[3][3] = 6;
6: Object[] obj = game;
7: game[3][3] = "X";
8: System.out.println(game[3][3]);
9: }
10: }
A. X
B. The code does not compile.
C. The code compiles but throws a NullPointerException at runtime.
D. The code compiles but throws a different exception at runtime.

43. What is the output of the following?
String[][] listing = new String[][] { { "Book" }, { "Game", "29.99" } };
System.out.println(listing.length + " " + listing[0].length);
A. 2 1
B. 2 2
C. The code does not compile.
D. The code compiles but throws an exception at runtime.

44. What is the output of the following when run as java FirstName ?
public class FirstName {
public static void main(String[] names) {
System.out.println(names[0]);}
A. FirstName
B. The code does not compile.
C. The code throws an ArrayIndexOutOfBoundsException .
D. The code throws a NullPointerException .

45. How many lines does the following code output?
String[] days = new String[] { "Sunday", "Monday", "Tuesday",
"Wednesday", "Thursday", "Friday", "Saturday" };
for (int i = 1; i < days.length; i++)
System.out.println(days[i]);
A. Six
B. Seven
C. The code does not compile.
D. The code compiles but throws an exception at runtime.


46. What is the output of the following when run as java Count "1 2" ?
public class Count {
public static void main(String target[]) {
System.out.println(target.length);
}
}
A. 0
B. 1
C. 2
D. The code does not compile.

47. What does the following output?
String[] os = new String[] { "Linux", "Mac", "Windows" };
System.out.println(Arrays.binarySearch(os, "Linux"));
A. 0
B. 1
C. 2
D. The output is not defined.

48. Which of the following statements are true?
I. You can always change a method signature from call(String[] arg) to
call(String... arg) without causing a compiler error in the calling code.II. You can always change a method signature from call(String... arg) to
call(String[] arg) without causing a compiler error in the existing code.
A. I
B. II
C. Both I and II
D. Neither I nor II

49. Which of these four array references can point to an array that is different from the
others?
A. int[][][][] nums1a, nums1b;
B. int[][][] nums2a[], nums2b;
C. int[][] nums3a[][], nums3b[][];
D. int[] nums4a[][][], numbs4b[][][];

50. What is the output of the following when run as java unix.EchoFirst seed flower ?
package unix;
import java.util.*;
public class EchoFirst {
    public static void main(String[] args) {
        Arrays.sort(args);
        String result = Arrays.binarySearch(args, args[0]);
        System.out.println(result);
    }
}
A. 0
B. 1
C. The code does not compile.
D. The code compiles but throws an exception at runtime.


1. B. Três pontos (...) são a sintaxe para um parâmetro de método do tipo varargs. É tratado
como uma matriz.

2. B. Os índices de matriz são zero com base em Java. Um parâmetro varargs é simplesmente outra maneira de
passando dados para um método. De dentro do método, ele é tratado como se você tivesse
escreveu Frisbee [] f como o parâmetro do método. Portanto, o primeiro elemento usa o
0º índice e a opção B está correta.

3. D. Truque de pergunta! Enquanto int é um primitivo, todas as matrizes são objetos. Uma maneira de dizer é
que uma matriz possui uma variável de instância pública chamada length. Outra maneira é que você pode
atribua uma variável do tipo Object. Portanto, a opção D está correta.


4. C. Os colchetes da matriz podem aparecer antes ou depois do nome da variável, tornando
as declarações do tigre e do urso estão corretas. Os aparelhos não podem aparecer antes
o tipo que faz a declaração do leão inc1. B. Três pontos (...) são a sintaxe para um parâmetro de método do tipo varargs. É tratado
como uma matriz.

5. C. De dentro de um método, um parâmetro de matriz ou varargs é tratado da mesma forma. Contudo,
existe uma diferença do ponto de vista do chamador. Um parâmetro varargs pode receber
uma matriz ou valores individuais, tornando as Opções A e B compiladas. No entanto, um
O parâmetro array pode ter apenas uma matriz, o que impede a opção C de compilar.

6. A. As matrizes usam a variável length para determinar o número de elementos, tornando
Opção A correta. Para um ArrayList, a opção D teria sido a resposta.

7. C. Uma matriz bidimensional é declarada listando os dois tamanhos em pares de chaves separados.
A opção C mostra corretamente essa sintaxe.

8. B. Não há nada errado com este código. Ele cria corretamente uma matriz de sete elementos.
O loop começa com o índice 0 e termina com o índice 6. Cada linha é exibida corretamente.
Portanto, a opção B está correta.

9. B. Desculpe. Isso é apenas algo que você precisa memorizar. O sort () e
Os métodos binarySearch () fazem a classificação e a pesquisa, respectivamente.

10. B. Os elementos da matriz são do tipo String, em vez de int. Portanto, usamos
ordem alfabética ao classificar. O caractere 1 classifica antes do caractere 9,
alfabeticamente, tornando a Opção A incorreta. Sequências mais curtas ordenam antes de sequências mais longas
quando todos os outros caracteres forem iguais, tornando a opção B a resposta.

11. B. Os índices da matriz começam com 0, tornando as Opções C e D incorretas. O atributo length
refere-se ao número de elementos em uma matriz. É um passado o último índice de matriz válido.
Portanto, a opção B está correta.

12. C. Ao usar um inicializador de matriz, você não tem permissão para especificar o tamanho separadamente.
O tamanho é inferido a partir do número de elementos listados. Portanto, tigre e ohMy são
incorreta. Quando você não está usando um inicializador de matriz, é necessário o tamanho. Um vazio
inicializador de matriz é permitido. A opção C está correta porque leão e urso são legais. 

13. B. Como nenhum elemento está sendo fornecido ao criar as matrizes, é necessário um tamanho.
Portanto, leão e urso estão incorretos. As chaves que contêm o tamanho são necessárias para
após o tipo, tornando ohMy incorreto. O único que está correto é o tigre, fazendo
a resposta correta opção B.

14. C. O método binarySearch () requer uma matriz classificada para retornar uma correta
resultado. Se a matriz não for classificada, os resultados de uma pesquisa binária serão indefinidos.

15. A. Um ArrayList se expande automaticamente quando está cheio. Uma matriz não, fazendo
Opção A a resposta. As outras três afirmações são verdadeiras para uma matriz e uma
ArrayList.

16. C. Este código cria uma matriz bidimensional de tamanho 1 × 2. As linhas m1 e m2 atribuem valores
para ambos os elementos na matriz externa. A linha m3 tenta referenciar o segundo elemento
da matriz externa. Como não existe tal posição, lança uma exceção e Option
C está correto.

17. B. O código é ordenado antes de chamar binarySearch (), portanto atende à pré-condição para esse
método. A cadeia de destino de "Mac" é o segundo elemento na matriz classificada. Desde a
os índices da matriz começam com zero, a segunda posição é o índice 1 e a opção B está correta.

18. A. Uma matriz multidimensional é criada com vários conjuntos de parâmetros de tamanho. O primeiro
a linha deve ser char [] ticTacToe = new char [3] [3]; . Portanto, a opção A é a
responda.

19. B. A primeira linha cria um objeto; a própria matriz. Embora existam quatro referências a
nulo nessa matriz, nenhum desses são objetos. A segunda linha cria um objeto e
aponta uma das referências de matriz para ele. Até agora, existem dois objetos: o próprio array e
um objeto que está referenciando. A terceira linha faz o mesmo, exibindo a contagem de objetos
para três. Portanto, a opção B está correta.

20. B. Assim como em uma matriz unidimensional, as chaves devem ser do tipo, tornando alfa
e declarações ilegais beta. Para uma matriz multidimensional, as chaves são permitidas
antes e / ou depois do nome da variável. Eles não precisam estar no mesmo lugar.
Portanto, os três restantes estão corretos e a opção B está correta.

21. B. As opções A, C e D representam matrizes 2D 3x3. A opção B representa melhor a matriz em
o código. Mostra que existem três matrizes diferentes de comprimentos diferentes.

22. D. names.length é o número de elementos na matriz. O último índice válido no
array é um a menos que names.length. Em Java, as matrizes não são redimensionadas automaticamente.
Portanto, o código lança uma ArrayIndexOutOfBoundsException.

23. C. O código days.size () estaria correto se este fosse um ArrayList. Como é uma matriz,
days.length é o código correto. Portanto, o código não é compilado e a opção C é
a resposta.

24. C. Como os colchetes na declaração estão antes dos nomes das variáveis, o tipo de variável
booleano [] [] [] se aplica a ambas as variáveis. Portanto, ambos os bools e moreBools podem

25. C. Chamar toString () em uma matriz não gera o conteúdo da matriz, tornando
Opção C correta. Para que a opção A seja a resposta, você deve ligar para
Arrays.toString (strings).

26. B. As matrizes começam com um índice de 0. Essa matriz é uma matriz 3 × 3. Portanto. apenas índices 0,
1. e 2 são válidos. A linha r2 lança uma ArrayIndexOutOfBoundsException. Portanto.
A opção B está correta.

27. D. Três pontos seguidos é um parâmetro varargs. Enquanto varargs é usado como uma matriz de
dentro do método, ele só pode ser usado como um parâmetro do método. Essa sintaxe não é
permitido para uma variável, tornando a opção D a resposta.

28. D. A linha 6 atribui um int a uma célula em uma matriz 2D. Isto é bom. A linha 7 lança para um general
Objeto []. Isso é perigoso, mas legal. Por que é perigoso, você pergunta? Isso nos leva a
linha 8. O compilador não pode nos proteger de atribuir uma String ao int [] porque o
referência é mais genérica. Portanto, a linha 8 lança uma ArrayStoreException porque
o tipo está incorreto e a opção D está correta. Você não poderia ter atribuído um int
linha 8 ou porque obj [3] é realmente um int [] nos bastidores e não um int.

29. C. O código é ordenado antes de chamar o binarySearch, portanto atende à pré-condição para esse
método. A cadeia de destino de "RedHat" não foi encontrada na matriz classificada. Se foi encontrado,
estaria entre o segundo e o terceiro elemento. A regra é pegar o negativo
índice de onde seria inserido e subtraído 1. Ele precisaria ser inserido como o
terceiro elemento. Como os índices são baseados em zero, esse é o índice 2. Tomamos o negativo,
que é -2 e subtrai 1, dando -3. Portanto, a opção C está correta.

30. B. Os índices de matriz começam com zero. Nome é o nome da classe, não um argumento.
Portanto, o primeiro argumento é Wolfie e a opção B está correta.

31. C. O nome do programa é Count e há dois argumentos. Portanto, o
programa produz 2 e a opção C está correta.

32. B. Esta classe é chamada com dois argumentos. O primeiro (semente) é armazenado na variável
1 . Em seguida, a matriz é classificada, atendendo à pré-condição para pesquisa binária. Binário
A pesquisa retorna 1 porque a semente é o segundo elemento na matriz classificada e o Java usa
índices baseados em zero. A opção B está correta.

33. D. As opções A e B mostram que as chaves podem estar antes ou depois do nome da variável e
produz a mesma matriz. A opção C especifica a mesma matriz ao longo do caminho com dois
matrizes de comprimento 1. A opção D é a resposta porque é diferente das outras. isto
em vez disso, especifica uma matriz de comprimento 1 em que esse elemento é de comprimento 2.

34. C. As matrizes são indexadas usando números, não cadeias, tornando as Opções A e B incorretas.
Como os índices da matriz são baseados em zero, a opção C é a resposta.

35. D. Em Java, as matrizes são indexadas começando com 0. Embora seja incomum o início do loop
com 1, isso não causa um erro. O que causa um erro é o loop que termina em atdata.length, porque
o operador <= é usado em vez do operador <. O último loop
índice é 6, não 7. Na última iteração do loop, o código lança um
Índice de matriz fora dos limites de exceção . Portanto, a opção D está correta.

36. C. Os índices de matriz começam com zero. Nome é o nome da classe, não um argumento.
O primeiro e único argumento é Wolfie. Como não existe um segundo argumento, a opção C é
corrigir.

37. D. Este código está correto. A linha r1 cria corretamente uma matriz 2D. As próximas três linhas
atribua corretamente um valor a um elemento da matriz. A linha r3 gera corretamente 3 em linha!

38. D. As matrizes expõem uma variável de comprimento. Eles não têm um método length (). Portanto,
o código não é compilado e a opção D está correta.

39. B. Este é complicado, pois as chaves do array estão divididas. Isso significa que bools é um 3D
referência de matriz. Os colchetes antes e depois da contagem do nome da variável. Para
moreBools, é apenas uma referência de matriz 2D porque existem apenas dois pares de chaves
próximo ao tipo. Em outras palavras, booleano [] [] se aplica a ambas as variáveis. Então bools
obtém outra dimensão dos aparelhos logo após o nome da variável. Contudo,
moreBools permanece em 2D, tornando a Opção B correta.

40. B. Como nenhum argumento é passado na linha de comando, isso cria uma matriz vazia.
A classificação de uma matriz vazia é válida e resulta em uma matriz vazia. Portanto, a opção B é
corrigir.

41. D. Java requer ter uma matriz classificada antes de chamar o binarySearch. Como a matriz é
não classificado, o resultado é indefinido e a opção D está correta. Pode acontecer que você obtenha
1 como resultado, mas esse comportamento não é garantido. Você precisa saber para o exame
isso é indefinido, mesmo que você obtenha a resposta "certa".

42. B. A linha 8 tenta armazenar uma String em uma matriz destinada a um int. A linha 8 não
compilar e a opção B está correta.

43. A. Essa matriz possui dois elementos, tornando a saída list.length 2. Enquanto cada matriz
elemento não tem o mesmo tamanho, isso não importa, porque estamos apenas procurando
no primeiro elemento. O primeiro elemento tem um. Isso torna a resposta Opção A.

44. C. Nome é o nome da classe, não um argumento. Não há outros argumentos,
so names é uma matriz vazia. Portanto, a opção C está correta.

45. A. Em Java, as matrizes são indexadas começando com 0. Embora seja incomum o início do loop
com 1, isso não causa um erro. Faz com que o código produza seis linhas em vez disso
de sete, já que o loop não cobre o primeiro elemento da matriz. Portanto, a opção A é
corrigir.

46. ​​B. O nome do programa é Count, e há apenas um argumento porque o dobro
aspas são usadas em torno do valor. Esse argumento é uma String com três caracteres: 1,
um espaço e 2. Portanto, o programa gera 1 e a opção B está correta.

47. A. Java requer ter uma matriz classificada antes de chamar binarySearch (). Você não precisa chamar Arrays.sort para executar a classificação. Essa matriz já está
classificados, para que atenda à pré-condição. A cadeia de destino do "Linux" é o primeiro elemento em
a matriz. Como o Java usa indexação baseada em zero, a resposta é a Opção A.

48. A. De dentro de um método, um parâmetro de matriz e um parâmetro de varargs são tratados como
mesmo. No chamador, um parâmetro de matriz é mais restritivo. Ambos os tipos podem receber
uma matriz. No entanto, apenas um parâmetro varargs pode ativar automaticamente
parâmetros individuais em uma matriz. Portanto, a afirmação I está correta e a resposta
é a opção A.

49. B. Todas as variáveis, exceto nums2b, apontam para uma matriz 4D. Não crie uma matriz 4D; Está
confuso. As opções mostram que as chaves podem estar antes ou depois da variável em qualquer
combinação. A opção B é a resposta porque nums2b aponta para uma matriz 3D. Só tem
três pares de chaves antes da variável e nenhum depois. Em comparação, nums2a tem
três pares de chaves antes da variável e o quarto par de chaves depois.

50. C. A pesquisa binária retorna um int representando o índice de uma correspondência ou onde uma correspondência
seria. Um int não pode ser armazenado em uma variável String. Portanto, o código não
compilar e a resposta é a opção C. correta. Portanto, a opção C está correta.


