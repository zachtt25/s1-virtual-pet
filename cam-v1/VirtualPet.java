/* Virtual Pet, version 1
 * 
 * @author Cam
 * @author ?
 */
public class VirtualPet {
    
    VirtualPetFace face;
    int hunger = 0;   // how hungry the pet is.
    int bodyTemp = 96;
    
    // constructor
    public VirtualPet() {
        face = new VirtualPetFace();
        face.setImage("normal");
        face.setMessage("Hello.");
    }

    public void plead(){
        face.setMessage("Please say yes?")
    }
    
    public void verysick() {
        bodyTemp = bodyTemp + 5;
        face.setImage("verysick");
        face.setMessage("I have a fever, my body temp is " + bodyTemp);
    }

    public void medicine() {
        if (bodyTemp >= 101) {
            bodyTemp = bodyTemp - 5;
        } else {
            bodyTemp = 96;
        }
        face.setMessage("I'm feeling better now, thanks");
        face.setImage("normal");
    }

    public void feed() {
        if (hunger > 10) {
            hunger = hunger - 10;
        } else {
            hunger = 0;
        }
        face.setMessage("Yum, thanks");
        face.setImage("normal");
    }
    
    public void exercise() {
        hunger = hunger + 3;
        face.setMessage("1, 2, 3, jump.  Whew.");
        face.setImage("tired");
    }
    
    public void sleep() {
        hunger = hunger + 1;
        face.setImage("asleep");
    }

} // end Virtual Pet
