package com.example.amitarcticturecomponnents;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;

public class Person implements Parcelable {

    String name;
    String age;
    String phone;
    String facebookAcount;
    String position;
    String adress;

    public Person(String name, String age, String phone, String facebookAcount, String position, String adress) {
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.facebookAcount = facebookAcount;
        this.position = position;
        this.adress = adress;
    }

    public Person() {
    }

    protected Person(Parcel in) {
        name = in.readString();
        age = in.readString();
        phone = in.readString();
        facebookAcount = in.readString();
        position = in.readString();
        adress = in.readString();
    }

    public static final Creator<Person> CREATOR = new Creator<Person>() {
        @Override
        public Person createFromParcel(Parcel in) {
            return new Person(in);
        }

        @Override
        public Person[] newArray(int size) {
            return new Person[size];
        }
    };

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", phone='" + phone + '\'' +
                ", facebookAcount='" + facebookAcount + '\'' +
                ", position='" + position + '\'' +
                ", adress='" + adress + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFacebookAcount() {
        return facebookAcount;
    }

    public void setFacebookAcount(String facebookAcount) {
        this.facebookAcount = facebookAcount;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(age);
        dest.writeString(phone);
        dest.writeString(facebookAcount);
        dest.writeString(position);
        dest.writeString(adress);
    }
}
