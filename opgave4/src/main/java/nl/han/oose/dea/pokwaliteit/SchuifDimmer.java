package nl.han.oose.dea.pokwaliteit;

public final class SchuifDimmer extends Dimmer {
    private static final int maxSterkte = 5;
    private static final int verhoogSterkteMet = 1;
    private static final int minSterkte = 0;
    private static final int verlaagSterkteMet = 1;

    public int rechts() {
        if (super.getStand() < maxSterkte)
            super.setStand(super.getStand() + verhoogSterkteMet);
        return super.getStand();
    }

    public int links()
    {
        if (super.getStand() > minSterkte)
            super.setStand(super.getStand() - verlaagSterkteMet);
        return super.getStand();
    }
}
