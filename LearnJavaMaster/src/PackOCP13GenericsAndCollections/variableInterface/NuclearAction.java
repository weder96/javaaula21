package PackOCP13GenericsAndCollections.variableInterface;

public class NuclearAction implements Actionable {

    public void performAction() {
        // Code that depends on isActionable variable
        if (isActionable) {
            System.out.println(isActionable);
            // Code that can alter isActionable state since it is not constant
            // isActionable = true;
        }
    }
}