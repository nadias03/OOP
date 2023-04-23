package ludzie;

public abstract class PodroznyUzbrojony extends Podrozny {
    protected boolean uzbrojony;

    public PodroznyUzbrojony(int wiek){
        super(wiek);
        double los = rand.nextDouble();
        if (los < 0.5) {
            this.uzbrojony = true;
        } else {
            this.uzbrojony = false;
        }
    }
}
