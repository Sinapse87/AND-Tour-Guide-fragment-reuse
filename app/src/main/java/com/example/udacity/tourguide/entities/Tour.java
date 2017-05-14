package com.example.udacity.tourguide.entities;

import android.os.Parcel;
import android.os.Parcelable;

public class Tour implements Parcelable {
    private int name, category;
    private final int image, description, latitude, longitude;

    public Tour(int name, int image, int description, int latitude, int longitude) {
        this.name = name;
        this.image = image;
        this.description = description;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public Tour(int name, int category, int image, int description, int latitude, int longitude) {
        this.name = name;
        this.category = category;
        this.image = image;
        this.description = description;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public int getName() {
        return name;
    }

    public int getCategory() {
        return category;
    }

    public int getImage() {
        return image;
    }

    public int getDescription() {
        return description;
    }

    public int getLatitude() {
        return latitude;
    }

    public int getLongitude() {
        return longitude;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.name);
        dest.writeInt(this.category);
        dest.writeInt(this.image);
        dest.writeInt(this.description);
        dest.writeInt(this.latitude);
        dest.writeInt(this.longitude);
    }

    private Tour(Parcel in) {
        this.name = in.readInt();
        this.category = in.readInt();
        this.image = in.readInt();
        this.description = in.readInt();
        this.latitude = in.readInt();
        this.longitude = in.readInt();
    }

    public static final Creator<Tour> CREATOR = new Creator<Tour>() {
        @Override
        public Tour createFromParcel(Parcel source) {
            return new Tour(source);
        }

        @Override
        public Tour[] newArray(int size) {
            return new Tour[size];
        }
    };
}
