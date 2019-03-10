package com.example.ac_twitterclone;

import android.app.Application;

import com.parse.Parse;

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("39UWiqsEWDWGlkWuLoxbEHNuqJSQ1odrsImxVzy0")
                // if defined
                .clientKey("5OejqfO41tlxzk80BqYynsi5PHGnct1GAyrV5Np5")
                .server(getString(R.string.back4app_server_url))
                .build()
        );

    }
}
