import javax.swing.*;
public class Runner{
    public Runner(){
        //sloth works a 9-5
        //image: walks to work
        //ask: are you a morning person, if yes, holding coffee and walks down street happy, if no, grumpfy face walking down street
        //
        VirtualPet v = new VirtualPet();
        v.exercise();
        takeABeat(1000);
        v.feed();
        v.verysick();
        takeABeat(5000);
        String ans = getResponse("Give me medicine?");
        if(ans.equalsIgnoreCase("Yes")){
            v.medicine();
        } else {
            v.
        }

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
