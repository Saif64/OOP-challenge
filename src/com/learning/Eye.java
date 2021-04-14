package com.learning;

public class Eye extends Organ{
    private String color;
    private boolean isOpen;

    public Eye(String name, String medicalCondition, String color, boolean isOpen) {
        super(name, medicalCondition);
        this.color = color;
        this.isOpen = isOpen;
    }

    @Override
    public void getDetails() {
        super.getDetails();
    }

    void open(boolean isOpen){
        if(isOpen){
            System.out.println("Eye is open");
        }
        else{
            System.out.println("Eye is closed");
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }
}
