package com.jjplatt250.animatronicmodemod;

public
class FazControllSettings {
    private double movementPercentage;
    private boolean teleportationEnabled;
    private boolean soundsEnabled;

    public FazControllSettings(double movementPercentage, boolean teleportationEnabled, boolean soundsEnabled) {
        this.movementPercentage = movementPercentage;
        this.teleportationEnabled = teleportationEnabled;
        this.soundsEnabled = soundsEnabled;
    }

    public double getMovementPercentage() {
        return movementPercentage;
    }

    public void setMovementPercentage(double movementPercentage) {
        this.movementPercentage = movementPercentage;
    }

    public boolean isTeleportationEnabled() {
        return teleportationEnabled;
    }

    public void setTeleportationEnabled(boolean teleportationEnabled) {
        this.teleportationEnabled = teleportationEnabled;
    }

    public boolean isSoundsEnabled() {
        return soundsEnabled;
    }

    public void setSoundsEnabled(boolean soundsEnabled) {
        this.soundsEnabled = soundsEnabled;
    }
}
