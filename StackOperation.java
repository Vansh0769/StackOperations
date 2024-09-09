package com.company;

import java.util.Scanner;

public class StackOperation {
    int[] arr = new int[100];
    int n, x, i;
    int top = -1;

    void push() {
        if (top >= n - 1) {
            System.out.println("Stack is Overflowed: ");
        } else {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the value to be pushed: ");
            x = sc.nextInt();
            top++;
            arr[top] = x;
        }
    }

    void pop() {
        if (top <= -1) {
            System.out.println("Stack is underflow");
        } else {
            System.out.println("The popped element is " + arr[top] + ":");
            top--;
        }
    }

    void display() {
        if (top >= 0) {
            System.out.println("The elements in STACK are \n");
            for (i = top; i >= 0; i--) {
                System.out.println(" " + arr[i]);

            }
        } else {
            System.out.println("The stack is empty");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackOperation stackOps = new StackOperation();

        System.out.print("Enter the size of the STACK [Max=100]: ");
        stackOps.n = sc.nextInt();

        int choice;
        System.out.println("\n\tSTACK OPERATIONS USING ARRAY");
        System.out.println("\t-------------------------------");
        System.out.println("\t1. PUSH\n\t2. POP\n\t3. DISPLAY\n\t4. EXIT");

        do {
            System.out.print("\nEnter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    stackOps.push();
                    break;
                case 2:
                    stackOps.pop();
                    break;
                case 3:
                    stackOps.display();
                    break;
                case 4:
                    System.out.println("\n\tEXIT POINT");
                    break;
                default:
                    System.out.println("\n\tPlease enter a valid choice (1/2/3/4)");
            }
        } while (choice != 4);
    }
    }

