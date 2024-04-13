package OOPS;

public class L1 {
    public static void main(String args[]){
        Pen p1 = new Pen(); 
        p1.setColor("Blue");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);
        p1.color = "Green";
        System.out.println(p1.color);

        BankAccount myAcc = new BankAccount();
        myAcc.userName = "Vyom Sutariya";
        // myAcc.password = "abdeddef";
    }
}

class BankAccount {
    public String userName;
    @SuppressWarnings("unused")
    private String password;
    public void setPassword(String pwd){
        password = pwd;
    }
}

class Pen {
    String color;
    int tip;

    void setColor(String newColor){
        color = newColor;
    }

    void setTip(int newTip){
        tip = newTip;
    }
}

class Student {
    String name;
    int age;
    float percentage;

    void calcPercentage(int phy, int chem, int math){
        percentage = (phy + chem + math) / 3;
    }
}