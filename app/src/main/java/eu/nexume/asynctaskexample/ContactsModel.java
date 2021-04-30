package eu.nexume.asynctaskexample;

public class ContactsModel {

    private final String mName;

    private final String mEmail;

    private final String mMobile;

    private final String mAddress;

    public ContactsModel(String name, String email, String mobile, String address) {
        mName = name;
        mEmail = email;
        mMobile = mobile;
        mAddress = address;
    }

    public String getName() {
        return mName;
    }

    public String getEmail() {
        return mEmail;
    }

    public String getMobile() {
        return mMobile;
    }

    public String getAddress() {
        return mAddress;
    }
}
