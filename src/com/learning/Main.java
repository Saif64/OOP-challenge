package com.learning;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Patient patient = new Patient("Saif", 23,
                new Eye("left eye", "Chani", "blue", true),
                new Eye("right eye", "okay", "black", true),
                new Heart("heart", "good", 92));

        System.out.println("Name: " + patient.getName() + "\nAge: "  + patient.getAge());

        Scanner sc = new Scanner(System.in);
        boolean shouldFinish = false;

        while (!shouldFinish){
            System.out.println("choose one of these \n\t1. Left Eye \n\t2.Right Eye \n\t3.Heart \n\t4.Quit");
            System.out.print("choose: ");
            int choice = sc.nextInt();

            switch (choice){
                case 1:
                    patient.getLeftEye().getDetails();

                    if(patient.getLeftEye().isOpen()){
                        System.out.print("\t1. Close the Eye \n\t2.return to main menu \nchoose: ");
                    }
                        if(sc.nextInt() == 1) {
                            System.out.println("Eye is closed\n");
                        }
                        else {
                            continue;
                        }
                        break;
                case 2:
                    patient.getRighEye().getDetails();

                    if(patient.getRighEye().isOpen()){
                        System.out.print("\t1. Open the Eye \n\t2.return to main menu \nchoose: ");
                    }
                    if(sc.nextInt() == 1) {
                        System.out.println("Eye is opened\n");
                    }
                    else {
                        continue;
                    }
                    break;

                case 3:
                    patient.getHeart().getDetails();

                    System.out.print("\t1. change the heart rate \nchoose: ");

                    if(sc.nextInt() == 1){
                        System.out.print("\nchange to: ");
                        patient.getHeart().changeHeartrate(sc.nextInt());
                        System.out.println("\nHeart rate changed to: \n"+patient.getHeart().getRate());
                    }
                    else{
                        continue;
                    }
                    break;
                default:
                    System.out.println("\nThank you. Visit Us again..........");
                    shouldFinish = true;
                    break;

                }
            }
        }
    }

