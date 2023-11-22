package adapter;

import itaphones.phone.MobilePhone;
import itaphones.phone.Phone;

public class MobilePhoneAdapter implements Phone {

    protected MobilePhone mPhone;
    private String number;

    public MobilePhoneAdapter(MobilePhone mPhone) {
        this.mPhone = mPhone;
    }


    @Override
    public void dial(String s) {
        number = s;
    }

    @Override
    public String getReponse() {
        return mPhone.dial(number);
    }
}
