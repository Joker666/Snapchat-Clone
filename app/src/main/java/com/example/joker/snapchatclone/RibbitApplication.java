package com.example.joker.snapchatclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class RibbitApplication extends Application {

    @Override
    public void onCreate() {
        Parse.initialize(this, "eddCR4hlZosWjWwfydDuDUWTUzcSqZjSeOMiAK3p", "INl6KT7k5xkQiQbgkKTEItoHvx9OcxKpNIBQPZAi");

    }
}
