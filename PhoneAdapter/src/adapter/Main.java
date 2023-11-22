package adapter;


import itaphones.phone.AutomaticDialer;
import itaphones.phone.MobilePhone;

public class Main {

    public static void main(String[] args) {

        MobilePhone mobilePhone = new MobilePhone();
        mobilePhone.dial("+37060013245");

        MobilePhoneAdapter mobilePhoneAdapter = new MobilePhoneAdapter(mobilePhone);

        System.out.println(AutomaticDialer.dial(mobilePhoneAdapter));


    }
}
