package com.snapIT.a_basics.d_controlFlow;

public class G_WhileLoop {
    // infinite loop example
    public static void main(String[] args) {
        int tasksToBeDone = 20;
        while(tasksToBeDone > 0){
            System.out.println("Doing task #" + tasksToBeDone);
            tasksToBeDone = tasksToBeDone - 1;
        }
    }
}
