package light;

public class CommandPatternTest {
 public static void main(String[] args) {
     Light light = new Light();

     Command lightOn = new LightOnCommand(light);
     Command lightOff = new LightOffCommand(light);

     RemoteControl remote = new RemoteControl();

     remote.setCommand(lightOn);
     remote.pressButton();
     System.out.println();

     remote.setCommand(lightOff);
     remote.pressButton();
 }
}

