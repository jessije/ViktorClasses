package com.Feb4;

public enum UserTypes {
    BUSINESS(1),
    REGULAR(4),
    VIP(3);
    private int rate;
    UserTypes(int rate) {
        this.rate = rate;
    }
    int moneyWithRate(int money){
        return money*rate;
    }
    public static void main(String[] args) {
       UserTypes particularUserType = UserTypes.VIP;
        System.out.println(particularUserType);

        if(particularUserType.equals(UserTypes.BUSINESS)){
            System.out.println("user is VIP, give him money");
        }
        UserTypes userTypes = UserTypes.REGULAR;
        System.out.println(userTypes.moneyWithRate(10));
    }

    private static void handleUser(UserTypes userTypes){
        switch (userTypes){
            case REGULAR:
                System.out.println("hello");
            case VIP:
                System.out.println("something else");
                break;
            default:
                System.out.println("default");
        }
    }
}
