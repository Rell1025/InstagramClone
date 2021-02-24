package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate(){
        super.onCreate();

        //Register your parse models
        ParseObject.registerSubclass(Post.class);

        ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("kD27YksREfMP7ZIJDBIrnPlWYEXO7RDWht3EBcvL")
                .clientKey("RI9fOm3E62Ps9OKKa7VKNpW83aj8RmSKP0KZqEtb")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
