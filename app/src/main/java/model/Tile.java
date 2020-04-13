package model;

import android.os.Parcel;
import android.os.Parcelable;
import android.widget.Button;
import android.widget.RatingBar;

public class Tile implements Parcelable {

    private String title, content;
    private Button btn;

    public Tile (String title,String content, Button btn) {
        this.title = title;
        this.content = content;
        this.btn = btn;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public Button getBtn() {
        return btn;
    }

    public static Creator<Tile> getCREATOR() {
        return CREATOR;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.title);
        dest.writeString(this.content);
        dest.writeValue(this.btn);
    }

    protected Tile(Parcel in) {
        this.title = in.readString();
        this.content = in.readString();
    }

    public static final Parcelable.Creator<Tile> CREATOR = new Parcelable.Creator<Tile>() {
        @Override
        public Tile createFromParcel(Parcel source) {
            return new Tile(source);
        }

        @Override
        public Tile[] newArray(int size) {
            return new Tile[size];
        }
    };
}

