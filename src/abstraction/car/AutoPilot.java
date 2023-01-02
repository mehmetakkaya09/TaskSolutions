package abstraction.car;

public interface AutoPilot extends AutoPark{
    public final boolean hasAutoPilot = true;
    public abstract void selfDrive();

}
