/* Challenge Activity 3 - Role Playing Game
 * 

Use the Actor and Weapon classes in the roleplaying package to do the following

1) Make a weapon called sword which does up to 10 damage
2) Make a weapon called bite which does up to 5 damage
3) Make a knight "Sir Glagane" with 20 health, 5 armor, and the sword as a weapon
4) Make a snake called "Viper" with 10 health, 1 armor and the bite as a weapon
5) Print out the knight and snake.
6) Make the snake bite the knight, and apply damage to the knight
7) Make the knight slash the snake, and apply damamge to the snake.
8) print out the knight and the snake.

 */
package PackOCA03UsingOperatorsDecisionConstant.RolePlay;

public class RolePlayingGame {

    public static void main(String[] args) {
        // TODO: Write code here
        Weapon sword = new Weapon("Sword", "slashes",  10);
        Weapon bite = new Weapon("Bite", "bites", 5);
        Actor knight = new Actor("Sir Glegane", 20, 5, sword);
        Actor snake = new Actor("Viper", 10, 1, bite);
        System.out.println(knight);
        System.out.println(snake);
        int damage = snake.weapon().hitDamage();
        knight.takeDamage(damage);
        System.out.printf("%s %s for %d damage.\n", snake.name(), snake.weapon().action(),damage); 
        damage = knight.weapon().hitDamage();
        System.out.printf("%s %s for %d damage.\n", knight.name(), knight.weapon().action(),damage); 
        snake.takeDamage(damage);
        System.out.println(knight);
        System.out.println(snake);                
    }
}
