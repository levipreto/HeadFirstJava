// EXERCICE CODE MAGNETS PAGE 77 OF 722 (P. 43)
package Main;

// OUTPUT
// bang bang ba-bang
// ding ding da-ding

class DrumKit {
    
    boolean topHat = true;
    boolean snare = true;

    void playSnare() {
        System.out.println("bang bang ba-bang");
    }

    void playTopHat() {
        System.out.println("ding ding da-ding");
    }
} // end master class

class DrumKitTestDrive {

    public static void main(String[] args){
        DrumKit d = new DrumKit ();
        d.playSnare();
        d.snare = false;
        d.playTopHat();

        if (d.snare == true) {
            d.playSnare();
        } // end if            
    } // end main method
} // end class