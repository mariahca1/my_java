package main_pack;

import main_pack.Building;

public class AptBuilding extends Building {
    private int aptNumber;

    public AptBuilding(int i_Height, int i_AptNumber) {
        super(i_Height);
        aptNumber = i_AptNumber;
    }

    //переопределение метода
    public String getColor() {
        return "Apt_" + super.getColor();
    }

/*
    public void setAptNumber(int aptNumber) {
        aptNumber = aptNumber;
    }*/

    public int getAptNumber() {
        return aptNumber;
    }

    @Override
    public String toString() {
        return "main_pack.AptBuilding{" +
                "AptNumber=" + aptNumber +
                '}';
    }
}
