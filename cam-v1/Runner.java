import javax.swing.*;
public class Runner{
    public Runner(){
        //
        VirtualPet v = new VirtualPet();
        v.exercise();
        takeABeat(1000);
        v.feed();
        String ans = getResponse("How are you?");
        if(ans.equalsIgnoreCase("Good")){
            v.feed();
        }
        v.working();
    }


    public void takeABeat(int milliseconds){
        try {
            Thread.sleep(milliseconds); //milliseconds
        } catch(Exception e){

        }
    }

    public String getResponse(String q){
        String s = (String)JOptionPane.showInputDialog(
                    new JFrame(),
                    q,
                    "Get a Response",
                    JOptionPane.PLAIN_MESSAGE
        );
        return s;
    }

    public static void main(String[] args){
        new Runner();
    }

}
