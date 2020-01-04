package com.saimadhu.mychatapp.Model;

public class User {
    private String profileName;
    private String id;
    private String imageURL;

    public User(String profileName, String id, String imageURL) {
        this.profileName = profileName;
        this.id = id;
        this.imageURL = imageURL;
    }

    public User() {
    }

    public String getProfileName() {
        return profileName;
    }

    public void setProfileName(String profileName) {
        this.profileName = profileName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }
}
