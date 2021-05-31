package nl.han.oose.dea.pokwaliteit;

public final class DraaiDimmer extends Dimmer {
    private static final int verhoogStandMet = 1;
    private static final int standDelenDoor = 4;

    public int draai()
    {
        super.setStand(super.getStand() + verhoogStandMet);
        super.setStand((super.getStand() % standDelenDoor));
        return super.getStand();
    }
}
