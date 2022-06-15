package com.harunkor.androidjavaserializableparcelablesample;

import android.os.Parcel;
import android.os.Parcelable;

public class EmployeeParcelable implements Parcelable {

    private String name;
    private int age;
    private String address;

    public EmployeeParcelable(String name,int age,String  address){
        this.name=name;
        this.age = age;
        this.address=address;
    }

    protected EmployeeParcelable(Parcel in) {
        name = in.readString();
        age = in.readInt();
        address = in.readString();
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name);
        parcel.writeInt(age);
        parcel.writeString(address);

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public static final Creator<EmployeeParcelable> CREATOR = new Creator<EmployeeParcelable>() {
        @Override
        public EmployeeParcelable createFromParcel(Parcel in) {
            return new EmployeeParcelable(in);
        }

        @Override
        public EmployeeParcelable[] newArray(int size) {
            return new EmployeeParcelable[size];
        }
    };


}
