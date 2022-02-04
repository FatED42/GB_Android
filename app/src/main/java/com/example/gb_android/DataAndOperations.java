package com.example.gb_android;

import android.os.Parcel;
import android.os.Parcelable;

public class DataAndOperations implements Parcelable {

    private float numOne;
    private float numTwo;

    private boolean addition;
    private boolean subtraction;
    private boolean multiplication;
    private boolean division;

    protected DataAndOperations(Parcel in) {
        numOne = in.readFloat();
        numTwo = in.readFloat();
    }

    public static final Creator<DataAndOperations> CREATOR = new Creator<DataAndOperations>() {
        @Override
        public DataAndOperations createFromParcel(Parcel in) {
            return new DataAndOperations(in);
        }

        @Override
        public DataAndOperations[] newArray(int size) {
            return new DataAndOperations[size];
        }
    };

    public DataAndOperations() {

    }

    public float getNumOne() {
        return numOne;
    }

    public float getNumTwo() {
        return numTwo;
    }

    public void setNumOne(float numOne) {
        this.numOne = numOne;
    }

    public void setNumTwo(float numTwo) {
        this.numTwo = numTwo;
    }

    public float addition() {
        return numOne + numTwo;
    }

    public float subtraction() {
        return numOne - numTwo;
    }

    public float multiplication() {
        return numOne * numTwo;
    }

    public float division() {
        return numOne / numTwo;
    }

    public float percent() {
        return numOne * numTwo / 100;
    }

    public Boolean getAddition() {
        return addition;
    }

    public void setAddition(Boolean addition) {
        this.addition = addition;
    }

    public Boolean getSubtraction() {
        return subtraction;
    }

    public void setSubtraction(Boolean subtraction) {
        this.subtraction = subtraction;
    }

    public Boolean getMultiplication() {
        return multiplication;
    }

    public void setMultiplication(Boolean multiplication) {
        this.multiplication = multiplication;
    }

    public Boolean getDivision() {
        return division;
    }

    public void setDivision(Boolean division) {
        this.division = division;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(numOne);
        parcel.writeFloat(numTwo);
    }
}
