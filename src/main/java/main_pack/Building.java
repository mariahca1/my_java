package main_pack;

import abstract_pack.Funny;
import abstract_pack.Thing;

public class Building extends Thing implements Comparable, Funny {
    private int height;
    private String color;

    //public void sort();
     Building(int height) {
        this.height = height;
        this.color = "Gray";
    }

    public int getHeight() {
        return height;
    }

    public String getColor() {
        return color;
    }


    public String toString() {
        return this.getClass() + "[height=" + height + ",color=" + color + "]";
    }


    //    Если этот метод возвращает отрицательное число, то текущий объект будет располагаться перед тем, который передается через параметр.
//    Если метод вернет положительное число, то, наоборот, после второго объекта.
//    Если метод возвратит ноль, значит, оба объекта равны.
    public int compareTo(Object otherObject) {
        Building other = (Building) otherObject;

        return this.height - other.height;

    }
/*
    @Override
    public String getFunName() {
        return "funny_"+color;
    }*/
/*
    public String getFunName() {
        return this.getClass().toString() + "_ololo";
    }*/

}
