import javax.swing.*;
public class Runner{
    public Runner(){
        VirtualPet v = new VirtualPet();
        v.exercise();
        takeABeat(1000);
        v.feed();
        String ans = getAnswer("How are you?");
        if(ans.equalsIgnoreCase("Good")){

        }
    }

    public void takeABeat(int milliseconds){
        try {
            Thread.sleep(milliseconds); //milliseconds
        } catch(Exception e){

        }
    }

    String s = (String)JOptionPane.showInputDialog(
                    new JFrame(),
                    "Your Message",
                    "Your Title",
                    JOptionPane.PLAIN_MESSAGE
    );

    public static void main(String[] args){
        new Runner();
    }

}
