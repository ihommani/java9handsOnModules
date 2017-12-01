package secondgreeting;

import com.google.common.base.Preconditions;

public class GreetingFromSecondModule {

    public static void main(String... varArgs) {

        Preconditions.checkArgument(true);

        System.out.println("Hello from the second module");

    }
}
