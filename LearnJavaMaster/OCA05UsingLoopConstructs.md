Chapter 5
Using Loop Constructs
THE OCA EXAM TOPICS COVERED IN THIS PRACTICE TEST INCLUDE
THE FOLLOWING:
Using Loop Constructs
Create and use while loops
Create and use for loops including the enhanced for loop
Create and use do/while loops
Compare loop constructs
Use break and continue


1. Which type of loop is best known for its boolean condition that controls entry to the
loop?
A. do-while loop
B. for (traditional)
C. for -each
D. while

2. Which type of loop is best known for using an index or counter?
A. do-while loop
B. for (traditional)
C. for -each
D. while

3. Which type of loop is guaranteed to have the body execute at least once?
A. do-while loop
B. for (traditional)
C. for -each
D. while

4. Which of the following can loop through an array without referring to the elements by
index?
A. do-while loop
B. for (traditional)
C. for -each
D. while

5. What keyword is used to end the current loop iteration and proceed execution with the
next iteration of that loop?
A. break
B. continue
C. end
D. skip

6. What keyword is used to proceed with execution immediately after a loop?
A. break
B. continue
C. end
D. skip

7. Which type of loop has three segments within parentheses?
A. do-while loop
B. for (traditional)
C. for -each
D. while

8. Which of the following statements is/are true?
I. A traditional for loop can iterate through an array starting from index 0.
II. A traditional for loop can iterate through an array starting from the end.
A. Only I
B. Only II
C. Both statements
D. Neither statement

9. Which of the following statements is/are true?
I. A for -each loop can iterate through an array starting from index 0.
II. A for -each loop can iterate through an array starting from the end.
A. Only I
B. Only II
C. Both statements
D. Neither statement

10. Which type of loop has a boolean condition that is first checked after a single iteration
through the loop?
A. do-while loop
B. for (traditional)
C. for -each
D. while

11. What does the following code output?
int singer = 0;
while (singer)
System.out.println(singer++);
A. 0B. The code does not compile.
C. The loops complete with no output.
D. This is an infinite loop.

12. What does the following code output?
List<String> drinks = Arrays.asList("can", "cup");
for (int container = drinks.size() - 1; container >= 0; container )
System.out.print(drinks.get(container) + ",");
A. can,cup,
B. cup,can,
C. The code does not compile.
D. None of the above

13. What does the following code output?
public static void main(String[] args) {
List<String> bottles = Arrays.asList("glass", "plastic");
for (int type = 0; type < bottles.size();) {
System.out.print(bottles.get(type) + ",");
break;
}
System.out.print("end");
}
A. glass,end
B. glass,plastic,end
C. The code does not compile.
D. None of the above

14. What does the following code output?
String letters = "";
while (letters.length() != 2)
letters+="a";
System.out.println(letters);
A. aa
B. aaa
C. The loops complete with no output.
D. This is an infinite loop.

15. What is the result of the following when run with java peregrine.TimeLoop
September 3 1940 ?
package peregrine;public class TimeLoop {
public static void main(String[] args) {
for (int i = args.length; i>=0; i++)
System.out.println("args");
}
}
A. args
B. argsargs
C. The code does not compile.
D. None of the above

16. What is the output of the following code?
package chicago;
public class Loop {
private static int count;
private static String[] stops = new String[] { "Washington",
"Monroe", "Jackson", "LaSalle" };
public static void main(String[] args) {
while (count < stops.length) {
if (stops[count++].length() < 8) {
break;
}
}
System.out.println(count);
}
}
A. 1
B. 2
C. 4
D. The code does not compile.

17. What is the result of the following code?
do {
int count = 0;
do {
count++;
} while (count < 2);
break;
} while (true);
System.out.println(count);
A. 2
B. 3
C. The code does not compile.
D. This is an infinite loop.

18. Which of the following segments of a for loop can be left blank?
for (segmentA; segmentB; segmentC) {
}
A. segmentA
B. segmentB
C. segmentC
D. All of the above

19. How many of the loop types ( while , do while , traditional for , and enhanced for ) allow
you to write code that creates an infinite loop?
A. One
B. Two
C. Three
D. Four

20. What is the output of the following?
List<String> drinks = Arrays.asList("can", "cup");
for (int container = 0; container < drinks.size(); container++)
System.out.print(drinks.get(container) + ",");
A. can,cup,
B. cup,can,
C. The code does not compile.
D. None of the above

21. What happens when running the following code?
do (
System.out.println("helium");
) while (false);
A. It completes successfully without output.
B. It outputs helium once.
C. It keeps outputting helium .
D. The code does not compile.

22. Which of the following is equivalent to this code snippet given an array of String
objects?
for (int i=0; i<fun.length; i++)
System.out.println(fun[i]);A. for (String f = fun) System.out.println(f);
B. for (String f : fun) System.out.println(f);
C. for (String = fun) System.out.println(it);
D. None of the above

23. How many of these statements can be inserted after the println to have the code flow
follow the arrow in this diagram?
break;
break letters;
break numbers;
A. None
B. One
C. Two
D. Three

24. Using the diagram in the previous question, how many of these statements can be
inserted after the println to have the code flow follow the arrow in the diagram?
continue;
continue letters;
continue numbers;
A. None
B. One
C. Two
D. Three

25. What does the following code output?
int singer = 0;
while (singer > 0)
System.out.println(singer++);
A. 0
B. The code does not compile.
C. The loops completes with no output.

26. Which of the following types is taxis not allowed to be in order for this code to
compile?
for (Object obj : taxis) {
}
A. ArrayList<Integer>
B. int[]
C. StringBuilder
D. All of these are allowed.

27. What is the output of the following?
boolean balloonInflated = false;
do {
if (!balloonInflated) {
balloonInflated = true;
System.out.print("inflate-");
}
} while (! balloonInflated);
System.out.println("done");
A. done
B. inflate-done
C. The code does not compile.
D. This is an infinite loop.

28. What does the following code output?
String letters = "";
while (letters.length() != 3)
letters+="ab";
System.out.println(letters);
A. ab
B. abab
C. The loop completes with no output.
D. This is an infinite loop.

29. What describes the order in which the three expressions appear in a for loop?
A. boolean conditional, initialization expression, update statement
B. initialization expression, boolean conditional, update statement
C. initialization expression, update statement, boolean conditional30. What is the result of the following?
int count = 10;
List<Character> chars = new ArrayList<>();
do {
chars.add('a');
for (Character x : chars) count -=1;
} while (count > 0);
System.out.println(chars.size());
A. 3
B. 4
C. The code does not compile.
D. None of the above

31. What is the result of the following?
int k = 0;
for (int i = 10; i > 0; i ) {
while (i > 3) i = 3;
k += 1;
}
System.out.println(k);
A. 1
B. 2
C. 3
D. 4

32. Which of the following is equivalent to this code snippet given an array of String
objects?
for (int i=fun.length-1; i>=0; i )
System.out.println(fun[i]);
A. for (String f = fun) System.out.println(f);
B. for (String f : fun) System.out.println(f);
C. for (String f fun) System.out.println(it);
D. None of the above

33. What does the following code output?
public static void main(String[] args) {
List<String> bottles = Arrays.asList("glass", "plastic");
for (int type = 0; type < bottles.size();)
System.out.print(bottles.get(type) + ",");
break;}
A. glass,end
B. glass,plastic,end
C. The code does not compile.
D. None of the above

34. What is the result of the following?
String[] nycTourLoops = new String[] { "Downtown", "Uptown", "Brooklyn" };
String[] times = new String[] { "Day", "Night" };
for (int i = 0, j = 0; i < nycTourLoops.length
&& j < times.length; i++; j++)
{
System.out.print(nycTourLoops[i] + " " + times[j] + "-");
}
A. Downtown Day-
B. Downtown Day-Uptown Night-
C. The code does not compile.
D. The code compiles but throws an exception at runtime.

35. What is the result of the following when run with java peregrine.TimeLoop
September 3 1940 ?
package peregrine;
public class TimeLoop {
public static void main(String[] args) {
for (int i = args.length; i>=0; i )
System.out.println(args[i]);
}
}
A. September
B. 1940
C. The code does not compile.
D. None of the above

36. What is the output of the following?
public class Shoelaces {
public static void main(String[] args) {
String tie = null;
while (tie == null)
tie = "shoelace";
System.out.print(tie);
}
}A. null
B. shoelace
C. shoelaceshoelace
D. None of the above

37. The following code outputs a single letter x . What happens if you remove lines 25 and 28?
23: String race = "";
24: loop:
25: do {
26:   race += "x";
27:   break loop;
28: } while (true);
29: System.out.println(race);

A. It prints an empty string.
B. It still outputs a single letter x .
C. It no longer compiles.
D. It becomes an infinite loop.


38. What is the output of the following code?
package chicago;
public class Loop {
private static int count;
private static String[] stops = new String[] { "Washington",
"Monroe", "Jackson", "LaSalle" };
public static void main(String[] args) {
while (count < stops.length) {
if (stops[count++].length() < 8) {
continue;
}
}
System.out.println(count);
}
}
A. 1
B. 2
C. 4
D. The code does not compile.

39. What is the output of the following?
StringBuilder builder = new StringBuilder();
String str = new String("Leaves growing");
do {
System.out.println(str);} while (builder);
System.out.println(builder);
A. Leaves growing
B. This is an infinite loop.
C. The code does not compile.
D. The code compiles but throws an exception at runtime.

40. What is the result of the following code?
6: int count = 0;
7: do {
8: do {
9: count++;
10: } while (count < 2);
11: break;
12: } while (true);
13: System.out.println(count);
A. 2
B. 3
C. The code does not compile.
D. This is an infinite loop.

41. Fill in the blank so this code compiles and does not cause an infinite loop.
t: while (true) {
f: while(true) {
_____________
}
}
A. break;
B. break f;
C. break t;
D. None of the above

42. What is the result of the following?
String[] nycTourLoops = new String[] { "Downtown", "Uptown", "Brooklyn" };
String[] times = new String[] { "Day", "Night" };
for (int i = 0, j = 0; i < nycTourLoops.length
&& j < times.length; i++, j++)
{
System.out.print(nycTourLoops[i] + " " + times[j] + "-");
}
A. Downtown Day-B. Downtown Day-Uptown Night-
C. The code does not compile.
D. The code compiles but throws an exception at runtime.

43. How many lines does the following code output?
import java.util.*;
public class Exams {
public static void main(String[] args) {
List<String> exams = Arrays.asList("OCA", "OCP");
for (String e1 : exams)
for (String e2 : exams)
System.out.println(e1 + " " + e2);
}
}
A. One
B. Four
C. The code does not compile.
D. The code compiles but throws an exception at runtime.

44. Which of the following best describes the flow of execution in this for loop if beta
always returns false?
for (alpha; beta; gamma) {
delta;
}
A. alpha
B. alpha, beta
C. alpha, beta, gamma
D. None of the above

45. Which of the following best describes the flow of execution in this for loop if the loop
body is run exactly once?
for (alpha; beta; gamma) {
    delta;
}
A. alpha, delta, gamma, beta
B. alpha, beta, delta, gamma, beta
C. alpha, delta, gamma, alpha, beta
D. alpha, beta, delta, gamma, alpha, beta

46. Which of the following iterates a different number of times than the others?A. for (int k=0; k < 5; k++) {}
B. for (int k=1; k <= 5; k++) {}
C. int k=0; do { } while(k++ < 5)
D. int k=0; while (k++ < 5) {}
47. What is the output of the following?
public class Shoelaces {
public static void main(String[] args) {
String tie = null;
while (tie == null);
tie = "shoelace";
System.out.print(tie);
}
}
A. null
B. shoelace
C. shoelaceshoelace
D. None of the above

48. What is the output of the following?
12: int result = 8;
13: for: while (result > 7) {
14: result++;
15: do {
16:     result--;
17: } while (result > 5);
18:     break for;
19: }
20: System.out.println(result);
A. 5
B. 8
C. The code does not compile.
D. The code compiles but throws an exception at runtime.

49. What is the output of the following?
boolean baloonInflated = false;
do {
if (!baloonInflated) {
baloonInflated = true;
System.out.print("inflate-");
}
} while (baloonInflated);
System.out.println("done");A. done
B. inflate-done
C. The code does not compile.
D. This is an infinite loop.

50. Which of the following can fill in the blank to have the code compile successfully?
package nyc;
public class TouristBus {
public static void main(String... args) {
String[] nycTourLoops = new String[] { "Downtown", "Uptown", "Brooklyn"
};
String[] times = new String[] { "Day", "Night" };
for (_____________ i < 1; i++, j++)
System.out.println(nycTourLoops[i] + " " + times[j]);
}
}
A. int i=0; j=0;
B. int i=0, j=0;
C. int i=0; int j=0;
D. int i=0, int j=0;



#Comments questios
1. D. Um loop while possui uma condição que retorna um booleano que controla o loop. isto
aparece no início e é verificado antes de entrar no loop. Portanto, a opção D
está correto. Um loop for tradicional também possui uma condição booleana que é verificada antes
entrando no loop. No entanto, é mais conhecido por ter uma variável de contador, tornando
Opção B incorreta. A opção A está incorreta porque a condição booleana em um tempo de execução
loop está no final do loop. A opção C está incorreta porque não há condição como
parte da construção do loop.

2. B. Um loop for tradicional é mais conhecido por ter uma variável de loop contando para cima ou para baixo
conforme o loop progride. Portanto, a opção B está correta. As opções A e D estão incorretas
porque os loops de tempo de ação e tempo são conhecidos por suas condições booleanas. A opção C é
incorreto porque o loop for -each percorre sem um índice.

3. A. Um loop do-while verifica a condição do loop após a execução do corpo do loop. este
garante que ele sempre seja executado pelo menos uma vez e a opção A esteja correta. A opção B está incorreta
porque existem loops que você pode escrever que nunca entram no corpo do loop, como para
(int i = 0; i <1; i ++). Da mesma forma, a opção D está incorreta porque um loop while pode ser
escrito onde a condição inicial do loop é falsa. A opção C está incorreta porque um para -
cada loop não entra no corpo do loop ao iterar sobre uma lista vazia.

4. C. Enquanto um loop for tradicional muitas vezes percorre uma matriz, ele usa um índice para fazer isso,
tornando a opção B incorreta. O loop for -each percorre cada elemento, armazenando-o em
uma variável. A opção C está correta.

5. B. A palavra-chave continue é usada para finalizar a iteração do loop imediatamente e continuar
execução na próxima iteração. Portanto, a opção B está correta. A opção A está incorreta
porque a instrução break faz com que a execução prossiga após o corpo do loop. Opções
C e D estão incorretos porque essas não são palavras-chave em Java.

6. A. A palavra-chave break é usada para finalizar a iteração do loop imediatamente, pule qualquer
execuções restantes do loop e retome a execução imediatamente após o loop.
Portanto, a opção A está correta. A opção B está incorreta porque a execução prossegue no
próxima execução do loop atual para continuar. As opções C e D estão incorretas porque
estas não são palavras-chave em Java.

7. B. Um loop for tradicional é mais conhecido por ter uma declaração de inicialização,
instrução de condição e instrução de atualização. A opção B está correta.

8. C. Com um loop for tradicional, você controla a ordem em que os índices são visitados em
código. Isso significa que você pode percorrer uma matriz em ordem crescente ou decrescente e
A opção C está correta.

9. A. Com um loop for -each, a ordem do loop é determinada para você. Com uma matriz, isso
significa começar com o índice 0 e a opção A está correta. Um loop for tradicional permite que você
para controlar a ordem e iterar em qualquer ordem. 

10. A. Um loop do-while possui uma condição que retorna um booleano no final do loop.
Portanto, a opção A está correta. A opção D está incorreta porque um loop while possui esse
condição no início do loop. Um loop for tradicional é mais conhecido por ter
uma variável de loop, tornando a opção B incorreta. A opção C está incorreta porque não há
condição como parte da construção do loop.

11. B. Um loop while requer uma condição booleana. Enquanto cantor é uma variável, não é um
boleano . Portanto, o código não é compilado e a opção B está correta.
12. B. Este é um loop correto para passar por um ArrayList ou List a partir do final. isto
começa com o último índice da lista e vai para o primeiro índice da lista. A opção B é
corrigir.

13. A. Na primeira vez no loop, o índice é 0 e o vidro é emitido. A ruptura
A instrução pula todas as execuções restantes no loop e o método main ()
termina. Se não houvesse uma palavra-chave de interrupção, isso seria um loop infinito, porque não há
incrementador.

14. A. Imediatamente após a inicialização das letras, a condição do loop é verificada. A variável
letras tem o comprimento 0, que não é igual a 2, então o loop é inserido. No corpo do loop,
as letras se tornam comprimento 1 com o conteúdo "a". O índice do loop é verificado novamente e agora
1 não é igual a 2. O loop é inserido e as letras se tornam comprimento 2 e contém
"aa". Em seguida, o índice do loop é verificado novamente. Como o comprimento agora é 2, o loop é
concluída e aa é emitida. A opção A está correta.

15. D. Há três argumentos passados ​​para o programa. Isso significa que eu tenho 3 anos no
primeira iteração do loop. O programa imprime args. Então eu é incrementado para 4. Qual
também é maior que ou igual a 0. Como eu nunca diminui, esse código produz um
loop infinito e a resposta é a opção D.

16. B. Como count é uma variável de classe que não foi especificamente inicializada, o padrão é 0. Em
a primeira iteração do loop, "Washington", tem 11 caracteres e a contagem é definida como 1. O
se o corpo da declaração não for executado. O loop prossegue para a próxima iteração. Desta vez,
o operador pós-incremento usa o índice 1 antes de definir a contagem para 2. "Monroe" é
marcado, com apenas 6 caracteres. A instrução break envia a execução para depois
o loop e 2 é emitido. A opção B está correta.

17. C. No início, esse código parece ser um loop infinito. No entanto, a variável count é
declarado dentro do loop. Não está no escopo após o loop em que é referenciado pelo
println (). Portanto, o código não é compilado e a opção C está correta.

18. D. Um loop for pode deixar os três segmentos em branco. De fato, pois (;;) {} é um
Loop infinito.
19. C. Não é possível criar um loop infinito usando um for -each porque ele simplesmente faz um loop
através de uma matriz ou ArrayList. Os outros tipos permitem loops infinitos, como, por
Por exemplo, faça {} while (true), for (;;) e while (true). Portanto, a opção C é
corrigir. E sim, sabemos que é possível criar um loop infinito com foreach, criando seu próprio Iterable personalizado. No entanto, isso não está no exame OCA ou OCP. Se vocês
Se a resposta for a opção D, esse é um ótimo lembrete do que não se deve ler no
exame real!

20. A. Este é um loop correto para passar por um ArrayList ou List a partir do
começando. Começa com o índice 0 e vai para o último índice da lista. A opção A é
corrigir.

21. D. As chaves são opcionais ao redor dos loops, se houver apenas uma instrução. Parênteses não são
permitido cercar um corpo de loop, portanto, o código não é compilado e a opção D é
corrigir.

22. B. O loop for -each usa uma variável e dois pontos como sintaxe, tornando a Opção B correta.

23. C. Nesta figura, queremos finalizar o loop interno e retomar a execução com as letras
rótulo. Isso significa que queremos apenas sair do loop interno. Uma declaração de quebra não
só isso. Finaliza o loop atual e retoma a execução imediatamente após o loop,
fazendo pausa; uma resposta correta. Os números dos intervalos; afirma explicitamente qual
loop até o fim, que faz a mesma coisa, tornando-o correto também. Por outro lado, quebrar
cartas; finaliza o loop externo, fazendo com que o código execute apenas o println () uma vez.
Portanto, duas instruções correspondem corretamente ao diagrama e a opção C está correta.

24. B. Nesta figura, queremos finalizar o loop interno e retomar a execução com as letras
rótulo. As cartas de continuação; declaração faz isso. As outras duas declarações são retomadas
execução no loop interno. Portanto, apenas a segunda instrução corresponde corretamente
o diagrama e a opção B está correta.

25. C. Um loop while verifica a condição booleana antes de entrar no loop. Nesse código,
essa condição é falsa; portanto, o corpo do loop nunca é executado. Nenhuma saída é produzida e
A opção C está correta.

26. C. Um loop for -each pode ser usado com matrizes e objetos ArrayList.
StringBuilder não é um tipo permitido para esse loop, portanto, a opção C é a resposta.

27. B. Este é um loop do-while correto. Na primeira iteração do loop, a instrução if
executa e imprime inflar. Então a condição do loop é verificada. A variável
balloonInflated é true, portanto, a condição do loop é falsa e o loop é concluído.

28. D. Imediatamente após a inicialização das letras, a condição do loop é verificada. A variável
letras tem o comprimento 0, que não é igual a 3, então o loop é inserido. No corpo do loop,
as letras se tornam comprimento 2 e contêm "ab". O índice do loop é verificado novamente e agora
2 não é igual a 3. O loop é inserido e as letras se tornam comprimento 4 com o conteúdo
"abab". Em seguida, o índice do loop é verificado novamente. Como o comprimento 4 não é igual a 3, o
o corpo do loop é inserido novamente. Isso se repete para 6, 8, 10, etc. O loop nunca termina e
A opção D está correta.

29. B. Em um loop for, os segmentos são uma expressão de inicialização, uma condicional booleana,
e uma instrução de atualização nessa ordem. Portanto, a opção B está correta.

30. B. Na primeira iteração através do loop externo, chars se torna 1 elemento. O interior
loop é executado uma vez e count se torna 9. Na segunda iteração através do loop externo,
chars se torna 2 elementos. O loop interno é executado duas vezes para que a contagem se torne 7. No terceiro
iteração através do loop externo, chars se torna 3 elementos. O loop interno executa três
vezes a contagem se torna 4. Na quarta iteração através do loop externo, chars
torna-se 4 elementos. O loop interno é executado quatro vezes e a contagem se torna 0. Então ambos
os loops terminam. Portanto, a opção B está correta.

31. A. Na primeira iteração do loop externo, eu inicia às 10. O loop interno vê que 10
> 3 e subtrai 3, tornando o 7 o novo valor de i. Como 7> 3, subtraímos 3 novamente,
definindo para 4. Mais uma vez 4> 3, então eu me torno 1. Então k é finalmente incrementado para 1.
O loop externo diminui i i, tornando-o 0. A condição booleana vê que 0 não é
maior que 0. O loop externo termina e 1 é impresso. Portanto, a opção A está correta.

32. D. As opções A e C não são compiladas porque não usam a sintaxe correta para um
ciclo. O loop for -each só pode passar por uma matriz em ordem crescente. Não é
capaz de controlar o pedido, tornando a Opção C incorreta. Portanto, a opção D é o
responda.

33. C. Como não há colchetes na instrução for, o corpo do loop é apenas um
linha. A declaração de interrupção não está no loop. Como o intervalo não pode ser usado no nível superior
de um método, o código não é compilado e a opção C está correta.

34. C. Várias expressões de atualização são separadas por vírgula, em vez de ponto e vírgula.
Tricky, nós sabemos. Mas é uma distinção importante. Isso torna a opção C correta.

35. D. Há três argumentos passados ​​para o programa. Isso significa que eu tenho 3 anos no
primeira iteração do loop. O programa tenta imprimir args [3]. Como os índices são
zero com base em Java, lança uma ArrayIndexOutOfBoundsException.

36. B. Na primeira vez que a condição do loop é verificada, o empate da variável é nulo. O corpo do laço
executa, definindo empate. Apesar do recuo, não há colchetes ao redor do
para que a impressão ainda não seja executada. Em seguida, a condição do loop é verificada e o empate é
não nulo . A impressão é executada após o loop, imprimindo o cadarço uma vez, tornando a Opção B
corrigir.

37. C. O código é compilado como está. No entanto, não nos perguntam se o código compila
como é. A linha 27 refere-se a um rótulo de loop. Enquanto o rótulo ainda está presente, ele não aponta mais
para um loop. Isso faz com que o código não seja compilado e a opção C está correta.

38. C. A declaração continue é inútil aqui, pois não há código mais tarde no loop para
pular. A instrução continue apenas retoma a execução na próxima iteração do
loop, o que aconteceria se a instrução if-then estivesse vazia. Portanto,
contar incrementos para cada elemento da matriz. O código gera 4 e a opção C é
corrigir.

39. C. Um loop do while requer uma condição booleana. A variável do construtor é uma
StringBuilder e não um booleano. O código não é compilado e a opção C está correta.40. R. No início, esse código parece ser um loop infinito. No entanto, há uma declaração de interrupção.
Na linha 6, contagem é definida como 0. Na linha 9, é alterado para 1. Então a condição na linha 10
corre. contagem é menor que 2, então o loop interno continua. A contagem é definida como 2 no
próxima iteração do loop interno. A condição de loop na linha 10 é executada novamente e desta vez
é falso. O loop interno está concluído. Em seguida, a linha 11 do loop externo é executada e envia
execução após o loop na linha 13. Nesse ponto, a contagem ainda é 2, então a opção A é
corrigir.

41. C. A opção A interrompe o loop interno, mas o loop externo ainda é infinito. Opção B
tem o mesmo problema. A opção C está correta porque interrompe os dois loops.

42. B. Este código está correto. Inicializa duas variáveis ​​e usa as duas variáveis ​​no
verificação de condição e as instruções de atualização. Como verifica o tamanho de ambas as matrizes
corretamente, ele imprime os dois primeiros conjuntos de elementos e a opção B está correta.

43. B. É permitido fazer loop na mesma lista várias vezes. O loop externo executa
duas vezes. O loop interno é executado duas vezes para cada uma dessas iterações do loop externo.
Portanto, o loop interno é executado quatro vezes e a opção B está correta.

44. B. O inicializador, que é alfa, roda primeiro. Em seguida, o Java verifica a condição, que é
beta, para ver se a execução do loop deve começar. Como beta retorna falso, o loop nunca é
inserida e a opção B está correta.

45. B. O inicializador, que é alfa, roda primeiro. Em seguida, o Java verifica a condição, que é
beta, para ver se a execução do loop deve começar. Em seguida, o corpo do loop, que é delta, é executado.
Após a execução do loop, o atualizador, que é gama, é executado. Então a condição do loop,
que é beta, é verificado novamente. Portanto, a opção B está correta.

46. ​​C. A opção A passa por cinco índices nas iterações: 0, 1, 2, 3 e 4. A opção B também
passa por cinco índices: 1, 2, 3, 4 e 5. A opção D passa por cinco iterações como
bem, de 0 a 4. No entanto, a opção C passa por seis iterações desde o loop
A condição está no final do loop. Portanto, não é como os outros, e a opção C é
a resposta.

47. D. Na primeira vez que a condição do loop é verificada, o empate da variável é nulo. No entanto, o
o corpo do loop está vazio devido ao ponto e vírgula logo após a condição. Isso significa que o loop
A condição continua em execução sem a oportunidade de definir o empate. Portanto, este é um
loop infinito e a opção D está correta.

48. C. Lembre-se de procurar erros básicos antes de perder tempo rastreando o fluxo. Nisso
Nesse caso, o rótulo do loop está tentando usar a palavra-chave para. Isso não é permitido, então o
código não compila. Se o rótulo fosse válido, a opção A estaria correta.

49. D. Na primeira iteração do loop, a instrução if executa a impressão inflada-. Então
a condição do loop é verificada. A variável baloonInflated é verdadeira, então o loop
A condição é verdadeira e o loop continua. A instrução if não é mais executada, mas o
A variável nunca muda de estado novamente, portanto, o loop não termina.

50. B. No loop for, o tipo só pode ser especificado uma vez. Uma vírgula separa várias variáveis, pois elas fazem parte da mesma instrução. 
Portanto, a opção B é corrigir.

