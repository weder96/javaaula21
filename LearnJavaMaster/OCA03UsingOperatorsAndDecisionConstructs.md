Chapter 3
Using Operators and Decision Constructs
THE OCA EXAM TOPICS COVERED IN THIS PRACTICE TEST INCLUDE
THE FOLLOWING:
Using Operators and Decision Constructs
Use Java operators; use parentheses to override operator precedence
Test equality between Strings and other objects using == and equals()
Create if and if/else and ternary constructs
Use a switch statement


1. Which of the following variable types is not permitted in a switch statement?
A. String
B. double
C. int
D. char

2. What is the value of tip after executing the following code snippet?
int meal = 5;
int tip = 2;
int total = meal + (meal>6 ? ++tip :
tip);
A. 1
B. 2
C. 3
D. 6

3. What is the output of the following application? 
package registration;
public class NameCheck {
public static void main(String... data) {
String john = "john";
String jon = new String(john);
System.out.print((john==jon)+" "+(john.equals(jon)));
}
}
A. true true
B. true false
C. false true
D. false false

4. What is the output of the following application?
package planning;
public class ThePlan {
public static void main(String[] input) {
int plan = 1;
plan = plan++ + --plan;
if(plan==1) {
System.out.print("Plan A");
} else { if(plan==2) System.out.print("Plan B");
} else System.out.print("Plan C");
}
}
A. Plan AB. Plan B
C. Plan C
D. None of the above

5. Which of the following statements about a default branch in a switch statement is correct?
A. All switch statements must include a default statement.
B. The default statement is required to be placed after all case statements.
C. Unlike a case statement, the default statement does not take a value.
D. A default statement can only be used when at least one case statement is present.

6. What is the value of thatNumber after the execution of the following code snippet?
long thatNumber = 5 >= 5 ? 1+2 : 1*1;
if(++thatNumber < 4)
thatNumber += 1;
A. 3
B. 4
C. 5
D. The answer cannot be determined until runtime.

7. Which statement immediately exits a switch statement, skipping all remaining case or
default branches?
A. exit
B. break
C. goto
D. continue

8. Which statement about ternary expressions is true?
A. In some cases, both expressions to the right of the conditional operator in a ternary
expression will be evaluated at runtime.
B. Ternary expressions require parentheses for proper evaluation.
C. The ternary expressions are a convenient replacement for an if-then-else
statement.
D. Ternary expressions support int and boolean expressions for the left-most operand.

9. What is the output of the following application?

package voting;
1: public class Election {
2: public void calculateResult(Integer candidateA, Integer candidateB) {
3: boolean process = candidateA == null || candidateA.intValue() < 10;
4: boolean value = candidateA && candidateB;
5: System.out.print(process || value);
6: }
7: public static void main(String[] unused) {
8: new Election().calculateResult(null,203);
9: }
10: }
A. true
B. false
C. The code does not compile.
D. The code compiles but throws a NullPointerException on line 3 at runtime.

10. What is the output of the following application?
package dinosaur;
public class Park {
public final static void main(String... arguments) {
int pterodactyl = 6;
long triceratops = 3;
if(pterodactyl % 3 >= 1)
triceratops++;
triceratops--;
System.out.print(triceratops);
}
}
A. 2
B. 3
C. 4
D. The code does not compile.

11. Which statement about if-then statements is true?
A. An if-then statement is required to have an else statement.
B. If the boolean test of an if-then statement evaluates to false , then the target clause
of the if-then statement will still be evaluated.
C. An if-then statement is required to cast an object.
D. An if-then statement can execute a single statement or a block {} .

12. What is the output of the following application?
package restaurant;
public class Pieces {
public static void main(String[] info) {
int flair = 15;if(flair >= 15 && flair < 37) {
System.out.print("Not enough");
} if(flair==37) {
System.out.print("Just right");
} else {
System.out.print("Too many");
}
}
}
A. Not enough
B. Just right
C. Too many
D. None of the above

13. Which statement about case statements of a switch statement is not true?
A. A case value can be final .
B. A case statement must be terminated with a break statement.
C. A case value can be a literal expression.
D. A case value must match the data type of the switch variable, or be able to be
promoted to that type.

14. Given the following truth table, which operator for the boolean expressions x and y
corresponds to this relationship?
x = true x = false
y = true
true
y = false false
false
false
A. --
B. ++
C. ||
D. &&

15. What is the output of the following code snippet?
int hops = 0;
int jumps = 0;
jumps = hops++;
if(jumps)
System.out.print("Jump!");
else
System.out.print("Hop!");
A. Jump!
B. Hop!C. The code does not compile.
D. The code compiles but throws an exception at runtime.

16. Fill in the blanks: The _____________ operator increases the value of a variable by
1 and returns the new value, while the _____________ operator decreases the
value of a variable by 1 and returns the original value.
A. pre-increment [ ++v ], pre-decrement [ --v ]
B. pre-increment [ ++v ], post-decrement [ v-- ]
C. post-increment [ v++ ], pre-decrement [ --v ]
D. post-increment [ v++ ], post-decrement [ v-- ]

17. What is the output of the following application?
package jungle;
public class TheBigRace {
public static void main(String[] in) {
int tiger = 2;
short lion = 3;
long winner = lion+2*(tiger + lion);
System.out.print(winner);
}
}
A. 11
B. 13
C. 25
D. None of the above

18. Given the following code snippet, assuming dayOfWeek is an int , what variable type of
saturday is not permitted?
final _________ saturday = 6;
switch(dayOfWeek) {
default:
System.out.print("Another Weekday");
break;
case saturday:
System.out.print("Weekend!");
}
A. byte
B. long
C. int
D. None of the above

19. Given the following code snippet, what is the value of dinner after it is executed?int time = 11;
int day = 4;
String dinner = time > 10 ? day ? "Takeout" : "Salad" : "Leftovers";
A. Takeout
B. Salad
C. The code does not compile but would compile if parentheses were added.
D. None of the above

20. What is the output of the following application?
package recreation;
public class Dancing {
public static void main(String[] vars) {
int leaders = 10 * (2 + (1 + 2 / 5);
int followers = leaders * 2;
System.out.print(leaders + followers < 10 ? "Too few" : "Too many");
}
}
A. Too few
B. Too many
C. The code does not compile.
D. The code compiles but throws a division by zero error at runtime.

21. What is the output of the following application?
package schedule;
public class PrintWeek {
public static final void main(String[] days) {
System.out.print(5 + 6 + "7" + 8 + 9);
}
}
A. 56789
B. 11789
C. 11717
D. The code does not compile.

22. Fill in the blanks: The______________ operator is used to find the difference
between two numbers, while the______________ operator is used to find the
remainder when one number is divided by another.
A. /, %
B. –, %
C. %, <23. What is the output of the following application?
package transporter;
public class Rematerialize {
public static void main(String[] input) {
int dog = 11;
int cat = 3;
int partA = dog / cat;
int partB = dog % cat;
int newDog = partB + partA * cat;
System.out.print(newDog);
}
}
A. 9
B. 11
C. 15
D. The code does not compile.

24. What is the output of the following application?
package dessert;
public class IceCream {
public final static void main(String... args) {
int flavors = 30;
int eaten = 0;
switch(flavors) {
case 30: eaten++;
case 40: eaten+=2;
default: eaten--;
}
System.out.print(eaten);
}
}
A. 1
B. 2
C. 3
D. The code does not compile.

25. What is the output of the following application?
package mode;
public class Transportation {
public static String travel(int distance) {
return distance<1000 ? "train" : 10;
}
public static void main(String[] answer) {
System.out.print(travel(500));
}}
A. train
B. 10
C. The code does not compile.
D. The code compiles but throws an exception at runtime.

26. Fill in the blanks: Given two non-null String objects with reference names
apples ______________ and oranges , if apples oranges evaluates to true , then
apples ______________ oranges must also evaluate to true .
A. == , equals()
B. != , equals()
C. equals() , ==
D. equals() , =!

27. For a given non-null String myTestVariable , what is the resulting value of executing
the statement myTestVariable.equals(null) ?
A. true
B. false
C. The statement does not compile.
D. The statement compiles but will produce an exception when used at runtime.

28. How many 1 s are outputted when the following application is compiled and run?
package city;
public class Road {
public static void main(String... in) {
int intersections = 100;
int streets = 200;
if (intersections < 150) {
System.out.print("1");
} else if (streets && intersections > 1000) {
System.out.print("2");
} if (streets < 500)
System.out.print("1");
else
System.out.print("2");
}
}
A. None
B. One
C. Two
D. The code does not compile.29. Which statement about the logical operators & and && is true?
A. The & and && operators are interchangeable, always producing the same results at
runtime.
B. The & operator always evaluates both operands, while the && operator may only
evaluate the left operand.
C. Both expressions evaluate to true if either operand is true .
D. The & operator always evaluates both operands, while the && operator may only
evaluate the right operand.

30. What is the output of the following code snippet?
int x = 10, y = 5;
boolean w = true, z = false;
x = w ? y++ : y--;
w = !z;
System.out.print((x+y)+" "+(w ? 5 : 10));
A. The code does not compile.
B. 10 10
C. 11 5
D. 12 5

31. What is the output of the following application?
package bob;
public class AreYouBob {
public static void main(String[] unused) {
String bob = new String("bob");
String notBob = bob;
System.out.print((bob==notBob)+" "+(bob.equals(notBob)));
}
}
A. true true
B. true false
C. false true
D. false false

32. What is the value of 12 + 6 * 3 % (1 + 1) in Java?
A. 0
B. 12
C. 14
D. None of the above

33. Given the following truth table, the boolean variables p and q , and the expression 
p ^ q , what are the missing values in the truth table, starting with the first column?

                           | p = true      | p = false
                q = true   | false         | true
                q = false  |               | 
A. false and true
B. false and false
C. true and true
D. true and false

34. Which of the following is not a possible result of executing the following application?
public class ConditionallyLogical {
    public static void main(String... data) {
        if(data.length>=1
            && (data[0].equals("sound") || data[0].equals ("logic"))
            && data.length<2) {
            System.out.print(data[0]);
        }
    }
}
A. Nothing is printed.
B. sound is printed.
C. The application throws an exception at runtime.
D. logic is printed.

35. Fill in the blanks: The operators + ,______________ ,______________
,______________ , and ++ are listed in the same or increasing level of operator
precedence.
A. * , -- , /
B. % , - , *
C. / , * , %
D. * , - , /

36. What statement about the ^ operator is correct?
A. If one of the operands of ^ is true , then the result is always true .
B. There is a conditional form of the operator, denoted as ^^ .
C. If both operands of ^ are true , the result is true .
D. The ^ operator can only be applied to boolean values.

37. Given the following Venn diagram and the variables, x , y , and z , which Java expression
most closely represents the filled-in region of the diagram?
A. x || z
B. y || (y && z)
C. x || y
D. y && x

38. What variable type of red allows the following application to compile?
package tornado;
public class Kansas {
public static void main(String[] args) {
int colorOfRainbow = 10;
________ red = 5;
switch(colorOfRainbow) {
default:
System.out.print("Home");
break;
case red:
System.out.print("Away");
}
}
}
A. long
B. double
C. int
D. None of the above

39. Which two operators would be used to test if a number is equal to or greater than 5.21
but strictly less than 8.1 ?
A. > and <=B. >= and >
C. < and >=
D. < and >

40. What is the output of the following application?
package transporter;
public class TurtleVsHare {
    public static void main(String[] arguments) {
        int turtle = 10 * (2 + (3 + 2) / 5);
        int hare = turtle < 5 ? 10 : 25;
        System.out.print(turtle < hare ? "Hare wins!" : "Turtle wins!");
    }
}
A. Hare wins!
B. Turtle wins!
C. The code does not compile.
D. The code compiles but throws a division by zero error at runtime.

41. What is the output of the following application?
public class CountEntries {
    public static int getResult(int threshold) {
        return threshold > 5 ? 1 : 0;
    }
    
    public static final void main(String[] days) {
        System.out.print(getResult(5)+getResult(1)
        +getResult(0)+getResult(2)+"");
    }
}

A. 0
B. 1
C. 0000
D. 1000

42. What is the output of the following application?
package yoyo;
public class TestGame {
public String runTest(boolean spinner, boolean roller) {
    if(spinner = roller) return "up";
            else return roller ? "down" : "middle";
    }
    public static final void main(String pieces[]) {
        final TestGame tester = new TestGame();
        System.out.println(tester.runTest(false,true));
    }
}

A. up
B. middle
C. down
D. The code does not compile.

43. Fill in the blanks: The______________ operator is true if either of the operands
are true , while the______________ operator flips a boolean value.
A. + , -
B. && , !
C. | , -
D. || , !

44. Given the following code snippet, what is the value of movieRating after it is executed?
int characters = 5;
int story = 3;
double movieRating = characters <= 4 ? 3 : story>1 ? 2 : 1;
A. 2.0
B. 3.0
C. The code does not compile but would compile if parentheses were added.
D. None of the above

45. Fill in the blanks: A switch statement can have______________ case statements
and______________ default statements.
A. at most one, at least one
B. any number of, at most one
C. at least one, any number of
D. at least one, at most one

46. Which of the following is not a possible result of executing the following application?
public class OutsideLogic {
public static void main(String... weather) {
System.out.print(weather[0]!=null
&& weather[0].equals("sunny")
&& !false
? "Go Outside" : "Stay Inside");
}
}
A. Nothing is printed.B. The application throws an exception at runtime.
C. Go Outside is printed.
D. Stay Inside is printed.

47. What is the value of (5 + (!2 + 8) * 3 - 3 % 2)/2 in Java?
A. 2
B. 11
C. 16
D. None of the above

48. Given the following truth table, the boolean variables w and z , and the expression w ||
z , what are the missing values in the truth table, starting with the first row?
w = true w = false
z = true
true
z = false
false
A. false and false
B. true and false
C. true and true
D. false and true

49. Fill in the blanks: The operators – ,______________ ,______________
,______________ , and % are listed in the same or increasing level of operator
precedence.
A. + , / , *
B. -- , - , *
C. ++ , / , *
D. * , ++ , %

50. What is the output of the following application?
public class Baby {
    public static String play(int toy, int age) {
        final String game;
            if(toy<2)
                game = age > 1 ? 1 : 10; // p1
             else
                game = age > 3 ? "Ball" : "Swim"; // p2
        return game;
    }
    public static void main(String[] variables) {
        System.out.print(play(5,2));
    }
}
A. Ball
B. Swim
C. The code does not compile due to p1 . 
D. The code does not compile due to p2 .

Comments Question 50 : Nao  copila na linha P1 e não pode mudar uma variavel do tipo final 


1. B. Uma instrução switch suporta os tipos primitivos byte, short, char e int e o
classes String, Character, Byte, Short e Inteiro. Ele também suporta enumerados
tipos. Tipos de ponto flutuante como float e double não são suportados, portanto, Option
B é a resposta correta.

2. A. Lembre-se de que em expressões ternárias, apenas uma das duas expressões mais à direita
são avaliados. Como a refeição> 6 é falsa, a dica –– é avaliada e a dica ++ é ignorada. o
O resultado é que a dica é alterada de 2 para 1, tornando a opção A a resposta correta. o
o valor total é 6, pois o operador de pré-incremento foi usado na ponta, embora você
não precisava saber disso para resolver a questão.

3. C. A primeira atribuição cria um novo objeto String "john". A segunda linha explicitamente
usa a nova palavra-chave, o que significa que um novo objeto String é criado. Como esses objetos são
não é o mesmo, o teste == neles é avaliado como falso. O teste equals () neles
retorna true porque os valores aos quais eles se referem são equivalentes. Portanto, o correto
resposta é C.

4. D. Este código não é compilado porque possui mais duas instruções como parte de um único if-
então declaração. Observe que a segunda instrução if não está conectada à última else
declaração. Por esse motivo, a opção D, nenhuma das opções acima, é a resposta correta.

5. C. Uma instrução padrão dentro de uma instrução switch é opcional e pode ser colocada em qualquer
ordem dentro das declarações de caso do comutador, tornando as Opções A e B incorretas. Opção
D é uma instrução incorreta, pois uma instrução switch pode ser composta por um único padrão
declaração e nenhuma declaração de caso. A opção C está correta porque uma instrução padrão
não assume um valor, diferentemente de uma instrução de caso.

6. B. A atribuição inicial desse Número segue a primeira ramificação do ternário
expressão. Como 5> = 5 é avaliado como verdadeiro, um valor de 3 é atribuído a esseNúmero. Dentro
Na próxima linha, o operador de pré-incremento incrementa o valor desseNúmero para 4 e
retorna um valor de 4 para a expressão. Como 4 <4 é avaliado como falso, o bloco if-then
é pulado. Isso deixa o valor desse número como 4, tornando a opção B a correta
responda.

7. B. A instrução break sai de uma instrução switch, pulando todas as ramificações restantes,
tornando a opção B a resposta correta. Na opção A, exit não é uma instrução em Java. Dentro
Opção C, goto é uma palavra reservada, mas não utilizada em Java. Finalmente, na opção D, continue é
uma declaração, mas usada apenas para loops.

8. C. A opção A está incorreta, pois apenas uma das duas expressões à direita é avaliada em
tempo de execução. Os parênteses costumam ser úteis para ler expressões ternárias, mas não são
necessário, tornando a opção B incorreta. A opção C é uma afirmação correta sobre ternário
operadores, pois são comumente usados ​​para substituir instruções curtas se-então-outro. Finalmente,

9.A opção D está incorreta, pois apenas expressões booleanas são permitidas na extremidade esquerda
operando de uma expressão ternária. C. Na linha 4, candidato A e candidato B são números, mas a operação && só pode ser
aplicado a expressões booleanas. Portanto, o código não é compilado devido à linha 4,
fazendo C a resposta correta. Todas as outras linhas estão corretas. Observe que se a linha 4 for
fixa, a linha 3 não produz uma NullPointerException em tempo de execução. O condicional ||
e a verificação nula anterior permite que o código chame apenas intValue () se o candidatoA for
não nulo .

10. A. O primeiro passo é determinar se a expressão da instrução if-then é ou não
executado. A expressão 6% 3 é avaliada como 0, pois não há resto e como 0
> = 1 é false, a expressão triceratops ++ não é chamada. Observe que não há colchetes
{} na instrução if-then. Apesar de o tricerátopo ser recuado, não é
parte da instrução if-then. Lembre-se de que o Java não usa recuo para determinar
o início ou o fim de uma declaração. Portanto, o triceratops - é sempre executado,
resultando em um valor 2 para triceratops e tornando a opção A a resposta correta.

11. D. A opção A está incorreta porque as instruções else são totalmente opcionais. A opção B também é
incorreta. O destino de uma instrução if-then não é avaliado se o teste booleano for
falso. A opção C está incorreta. Embora uma declaração if-then seja freqüentemente usada para testar se
se um objeto é de um tipo específico para convertê-lo, não é necessário converter um objeto.
A opção D está correta, pois uma instrução if-then pode executar uma única instrução ou um bloco
do código {}.

12. D. Para esta pergunta, ajuda notar que a segunda declaração if-then não é
conectado à primeira instrução if-then, pois não há mais como se juntar a eles. Quando isso
código é executado, a primeira instrução if-then gera Não é suficiente, pois o estilo é> = 15 e
<37 A segunda instrução if-then é então avaliada. Como o talento não é 37, o
expressão Demasiada é emitida. Como duas instruções são emitidas, opção D, nenhuma
acima, é a resposta correta.

13. B. Um valor de caso deve ser uma expressão constante, como uma variável literal ou final, para que
As opções A e C são declarações verdadeiras sobre valores de caso. Uma declaração de caso pode ser
finalizada por uma instrução break, mas não é necessária, tornando a Opção B a falsa
declaração e resposta correta. A opção D também é uma afirmação verdadeira sobre valores de caso.

14. D. A questão é sobre operadores booleanos. Como as opções A e B são numéricas
operadores, eles podem ser desconsiderados instantaneamente. A questão então simplifica para qual
expressão booleana, && ou || , corresponde à tabela verdade que é avaliada apenas como verdadeira
se ambos os operandos forem verdadeiros. Somente o operador lógico && conjuntivo representa isso
relacionamento, tornando a opção D a resposta correta.

15. C. O valor de saltos e saltos não é importante porque este código não compila,
tornando a opção C a resposta correta. Ao contrário de outras linguagens de programação, Java
não converte automaticamente números inteiros em valores booleanos para uso em if-then
afirmações. A declaração if (jumps) é avaliada como if (0) e, como 0 não é um booleano
valor, o código não compila. Observe que o valor da variável jumps é irrelevante
neste exemplo; nenhum inteiro é avaliado como um valor booleano em Java.

16. B. Operadores de prefixo modificam a variável e avaliam para o novo valor, enquanto o postfix
operadores modificam a variável, mas retornam o valor original. Portanto, a opção B é o
resposta correta.

17. B. Para este problema, ajuda a reconhecer que os parênteses têm precedência sobre os
operações fora dos parênteses. Depois de substituirmos as variáveis ​​por valores, o
a expressão se torna: 3 + 2 * (2 + 3). Em seguida, calculamos o valor entre parênteses para
obtenha 3 + 2 * 5. Como o operador de multiplicação tem maior precedência que adição, nós
avalie-o primeiro, resultando em 3 + 10 = 13, tornando a opção B a resposta correta.

18. B. Qualquer valor que possa ser implicitamente promovido para int funcionará para a declaração de caso
com uma entrada int. Como as instruções switch não suportam valores longos, e longas
não pode ser convertido para int sem uma possível perda de dados, a opção B é a correta
responda.

19. D. Embora parênteses sejam recomendados para operações ternárias, especialmente
uns, eles não são necessários; portanto, a opção C está incorreta. O código não compila
porque day é uma expressão int, não booleana, na segunda operação ternária,
tornando a opção D a resposta correta. Lembre-se de que em Java, os valores numéricos não são
aceito no lugar de expressões booleanas em instruções if-then ou operações ternárias.

20. C. Embora o código envolva inúmeras operações, nada disso importa para resolver esse problema.
problema. A chave para resolvê-lo é perceber que a linha que designa os líderes
A variável tem um número desigual de parênteses. Sem parênteses equilibrados, o
o código não será compilado, tornando a opção C a resposta correta.

21. B. Lembre-se de que Java avalia + da esquerda para a direita. Os dois primeiros valores são ambos
números, então o + é avaliado como adição numérica, resultando em uma redução para 11 +
"7" + 8 + 9. Os próximos dois termos, 11 + "7", são tratados como concatenação de strings desde
um dos termos é uma String. Isso nos permite reduzir a expressão para "117" + 8 + 9.
Da mesma forma, os dois termos finais são avaliados, um de cada vez, com a String no
esquerda. Portanto, o valor final é 11789, tornando a opção B a resposta correta.

22. B. O operador subtração - é usado para encontrar a diferença entre dois números,
enquanto o operador% do módulo é usado para encontrar o restante quando um número é
dividido por outro, tornando a opção B a resposta correta. As outras opções usam
operadores que não correspondem a essa descrição.

23. B. O código é compilado sem problemas, tornando a Opção D incorreta. O foco disso
A questão está mostrando como a divisão e o módulo de dois números podem ser usados ​​para
reconstitua um dos operandos originais. Neste exemplo, parteA é a divisão inteira
dos dois números. Como 3 não divide 11 uniformemente, é arredondado para 3. o
A variável partB é o restante da primeira expressão, que é 2. The newDog
A variável é uma expressão que reconstitui o valor original do cão usando a divisão
valor e o restante. Observe que, devido à precedência do operador, a multiplicação *
A operação é avaliada antes da operação de adição +. O resultado é o valor original
de 11 para o cão é produzido por este programa. 


24. B. O código é compilado sem problemas, portanto, a opção D está incorreta. No interruptor desta pergunta
declaração, não há declarações de interrupção. Depois que a instrução de caso correspondente, 30, for
atingido, todas as instruções de caso restantes serão executadas. A variável consumida é
aumentado em 1, depois 2 e, em seguida, reduzido em 1, resultando em um valor final de 2, tornando Opção
B a resposta correta.

25. C. As operações ternárias exigem que ambas as expressões à direita sejam de dados compatíveis
tipos. Neste exemplo, a primeira expressão à direita da operação ternária externa é
do tipo String, enquanto a segunda expressão à direita é do tipo int. Como esses dados
tipos são incompatíveis, o código não é compilado e a opção C é a resposta correta.

26. A. Para esta pergunta, lembre-se de que, se dois objetos String forem avaliados como true usando ==,
então eles são o mesmo objeto. Se eles são o mesmo objeto String, equals () será
trivialmente retorne verdadeiro. A opção A reflete corretamente esse princípio. A opção B está incorreta, pois
dois objetos String que não são iguais ainda podem ser equivalentes em termos de igual a ().
Por exemplo, maçãs == nova String (maçãs) é avaliada como falsa, mas igual a () será
avalie como true nesses objetos String. Da mesma forma, as opções C e D também estão incorretas
porque dois objetos String que são equivalentes em termos de equals () podem ser diferentes
objetos.

27. B. A instrução compila e executa sem problemas, tornando as Opções C e D incorretas.
Como somos informados de que myTestVariable não é nulo, a instrução sempre avaliará
para false, tornando a opção B a resposta correta. Observe que, se myTestVariable for nulo,
o código ainda será compilado, mas lançará uma chamada NullPointerException igual a ()
em tempo de execução.


28. D. O código não é compilado, tornando a Opção D a resposta correta. A razão pela qual
o código não compila é devido ao teste na segunda instrução if-then. o
expressão (ruas e cruzamentos> 1000) é inválida porque ruas não é uma
expressão booleana e não pode ser usado como o lado esquerdo da lógica conjuntiva
operador&&. A linha de código foi projetada para se parecer com a expressão corrigida
(ruas> 1000 && cruzamentos> 1000. Observe que a expressão fixa requer dois
operadores relacionais. Se a segunda instrução if-then foi corrigida, o comando
o aplicativo compilaria e produziria dois 1s, tornando a opção C a resposta correta.

29. B. Os operadores & e && (AND) não são intercambiáveis, pois o operador conjuntivo &
sempre avalia os dois lados da expressão, enquanto o conjunto condicional &&
O operador avalia apenas o lado direito da expressão se o lado esquerdo estiver
determinado a ser verdade. É por isso que operadores condicionais são freqüentemente chamados de
operadores de circuito, pulando a expressão do lado direito em tempo de execução. Para estes
motivos, a opção B é a resposta correta. Observe que a opção C é uma instrução incorreta
também, uma vez que descreve operadores disjuntivos (OR).

30. C. O código é compilado, portanto a opção A está incorreta. Desde que w começa verdadeiro, a terceira linha
pega o primeiro lado direito da expressão ternária retornando e atribuindo 5 para x
(operador pós-incremento) enquanto incrementa y para 6. Observe que o segundo lado direito
o lado da expressão ternária y–– não é avaliado, pois os operadores ternários avaliam apenas uma expressão da mão 
direita em tempo de execução. Na quarta linha, o valor de w é definido
para! z. Como z é falso, o valor de w permanece verdadeiro. A linha final gera o valor de
(5 + 6) e (verdadeiro? 5: 10), que é 11 5, tornando a opção C a resposta correta.

31. A. A primeira atribuição realmente usa dois objetos String, o literal "bob" e o
String criada com a nova palavra-chave. Independentemente, apenas o segundo objeto é atribuído a
a variável bob. A segunda variável, notBob, recebe uma referência ao valor de
a variável bob. Isso significa que não apenas o teste equals () passa, mas eles são
na verdade, o mesmo objeto, então o teste == também é verdadeiro. Portanto, a resposta correta é
Opção A.

32. B. A questão é sobre precedência do operador e ordem de operação. o
operadores de multiplicação * e% de módulo têm a maior precedência, embora o que
está dentro dos parênteses precisa ser avaliado primeiro. Podemos reduzir a expressão para
o seguinte: 12 + 6 * 3% 2. Como multiplicação * e% do módulo têm o mesmo
precedência do operador, avaliamos da esquerda para a direita da seguinte forma: 12 + 6 * 3% 2 →
12 + 18% 2 → 12 + 0 → 12. Vimos que, apesar de todos os operadores do lado direito
lado da expressão, o resultado é zero, deixando-nos um valor de 12, tornando a opção B a
resposta correta.

33. D. O operador XOR ^ avalia como verdadeiro se p e q diferem e falso se eles são os
mesmo. Portanto, os valores ausentes são verdadeiros e falsos, tornando a opção D a correta
responda.

34. C. A chave para entender esta questão é lembrar que a condição condicional
O operador Conjunção && executa apenas o lado direito da expressão se o lado esquerdo
lado da expressão é verdadeiro. Se dados são uma matriz vazia, a expressão termina
cedo e nada é produzido. A segunda parte da expressão retornará true se
o primeiro elemento dos dados é som ou lógica. Desde que sabemos desde a primeira parte do
Se os dados tiverem pelo menos um comprimento, nenhuma exceção será lançada. O final
parte da expressão com data.length <2 não altera a saída quando dados são um
matriz de tamanho um. Portanto, som e lógica são duas saídas possíveis. Para estes
motivos, a opção C é o único resultado inesperado no tempo de execução.

35. C. Na opção A, o operador de divisão / incorretamente vem após o decremento ––
operador. Na opção B, o operador de subtração - vem incorretamente após o módulo
% operador. Na opção D, o operador de divisão / vem incorretamente após a subtração
- operador. A resposta correta é a opção C, onde todos os três operadores têm o mesmo
ordem de precedência.

36. D. O operador exclusivo ou (XOR) ^ exige a avaliação de ambos os operandos para determinar
o resultado. Por esse motivo, as opções A e B estão incorretas. Para a opção B, você não pode ter
uma operação de curto-circuito se ambos os operandos forem sempre lidos, portanto ^ ^ não existe.
A opção C é uma declaração incorreta, pois o operador ^ só retorna true se exatamente um
operando é verdadeiro. Por fim, a opção D está correta, pois o ^ é aplicado apenas aos valores booleanos
em Java.

37. C. O diagrama representa a sobreposição de x e y, correspondente a quando um deles
é verdade. Portanto, x || y, a opção C, corresponde mais a esse relacionamento. Observe que
z não é utilizado no diagrama e, portanto, não é necessário em nenhuma expressão.

38. D. O valor de uma instrução de caso deve ser constante, um valor literal ou variável final.
Como vermelho está ausente no atributo final, nenhum tipo de variável permite que o código seja compilado,
tornando a opção D a resposta correta.

39. C. A questão é perguntar qual operador representa maior ou igual a e
qual operador é estritamente menor que. O> = e <correspondem a esses operadores,
respectivamente. Portanto, a opção C é a resposta correta. Observe que a pergunta não
Não especifique em que ordem os operadores precisariam aparecer, apenas para selecionar os dois
operadores que correspondem à descrição da pergunta.

40. B. O código compila e executa sem problemas, tornando as Opções C e D incorretas. o
chave aqui é entender a precedência do operador e aplicar os parênteses para
substituir precedência corretamente. A primeira expressão é avaliada da seguinte forma: 10 * (2 +
(3 + 2) / 5) → 10 * (2 + 5/5) → 10 * (2 + 1) → 10 * 3, com um valor final de 30
para tartaruga. Como a tartaruga não é menor que 5, um valor de 25 é atribuído à lebre. Desde a
tartaruga não é menos que lebre, a última expressão avalia as vitórias da tartaruga! , qual é
emitido para o console, tornando a opção B a resposta correta.

41. A. Todos os termos de getResult () nesta pergunta são avaliados como 0, pois são todos menos
igual ou igual a 5. A expressão pode, portanto, ser reduzida para 0 + 0 + 0 + 0 + "". Desde Java
avalia o operador + da esquerda para a direita, os quatro operandos à esquerda são aplicados
usando adição numérica, resultando na expressão 0+ "". Esta expressão apenas converte
o valor para uma String, resultando em uma saída 0, fazendo da Opção A a resposta correta.

42. A. O código é compilado sem problemas, portanto a opção D está incorreta. A chave aqui é que o
A instrução if-then no método runTest () usa o operador de atribuição (=)
do operador (==). O resultado é que o spinner recebe um valor true e o
A instrução (girador = rolo) retorna o valor recém-atribuído. O método então
retorna, tornando a opção A a resposta correta. Se o operador (==) tivesse sido usado em
a instrução if-then, o processo teria ramificado para a instrução else,
com down sendo retornado pelo método

43. D. Disjunção condicional (OR) || operador é verdadeiro se um dos operandos for
true, enquanto o operador complemento lógico (!) reverte ou vira um valor booleano,
tornando a opção D a resposta correta. As outras opções usam operadores que não
corresponda a esta descrição. Em particular, as opções A e C incluem operadores que podem apenas
ser aplicado a valores numéricos, não booleanos.

44. A. Embora parênteses sejam recomendados para operações ternárias, especialmente
, eles não são necessários; portanto, a opção C está incorreta. A primeira operação ternária
avalia caracteres <= 4 como false, portanto a segunda operação ternária é executada. Desde a
história> 1 é verdadeira, o valor final de movieRating é 2.0, tornando a Opção A a correta
resposta.45. B. Exceto quaisquer limitações da JVM, uma instrução switch pode ter qualquer número de casos
instruções (incluindo nenhuma), mas no máximo uma instrução padrão, com a Opção B
identificando corretamente esse relacionamento.

46. ​​A. O aplicativo usa a conjunção condicional && operador para testar se o tempo [0] é
nulo, mas infelizmente esse teste não funciona em matrizes de comprimento zero. Portanto, é
possível que esse código gere uma ArrayIndexOutOfBoundsException em tempo de execução. o
segunda parte da expressão é avaliada como verdadeira se a primeira entrada de clima corresponder
ensolarado A parte final da expressão, &&! False, é uma tautologia, pois é sempre
true e não tem impacto na expressão. Uma exceção será lançada ou texto
será emitida, com base no valor do tempo, portanto, a opção A é a resposta correta.

47. D. A questão parece muito mais difícil do que é. De fato, para resolvê-lo, você não tem
para calcular qualquer coisa! Você só precisa observar que o operador do complemento lógico (!),
que só pode ser aplicado a valores booleanos, está sendo aplicado a um valor numérico.
Portanto, a resposta é que a expressão não seria compilada ou executada, tornando Option
D a resposta correta.

48. C. A lógica disjuntiva || O operador avalia como true se um dos operandos for verdadeiro.
Outra maneira de ver isso é que ele só avalia falso se ambos os operandos forem falsos.
Portanto, os valores ausentes são verdadeiros, tornando a opção C a resposta correta.

49. A. Na opção B, o operador de subtração - vem incorretamente após o decremento ––
operador. Na opção C, o operador de divisão / vem incorretamente após o incremento ++
operador. Na opção D, o operador de módulo% ocorre incorretamente após o incremento
operador ++. A resposta correta é a opção A, onde a subtração - e a adição +
operadores são seguidos pelos operadores de divisão / e multiplicação *.

50. C. A chave para resolver este problema é lembrar que o tipo do valor retornado
por uma operação ternária é determinada pelas expressões do lado direito. Em
linha p1, as expressões são do tipo int, mas a atribuição é para o jogo variável, de
tipo String. Como a atribuição é inválida, o código não é compilado e a Opção C
está correto.

#Questoes Extras

Pergunta 3: Incorreto

Choose the output of the following program

    class class1 { 
      
        // driver code 
        public static void main(String args[]) 
        { 
            int no1 = 8; 
            int no2 = 4; 
            int res = no1 | no2;
            System.out.println(res);     
        } 
    } 

[A]. 12
B. 0 
C. 8
D. 4  

Se os bits correspondentes de qualquer um dos operandos forem 1, o resultado será 1.
Se os bits correspondentes de ambos os operandos forem 1, também o resultado será 1.
O equivalente binário de 8 é 1000 e 4 é 100, então resultado
é 1100 cujo equivalente decimal é 12.




