package com.codepath.apps.restclienttemplate.models;

import org.json.JSONException;
import org.json.JSONObject;
import org.parceler.Parcel;

@Parcel
public class ImageMedia {
    public String image;
    public String type;

    // empty constructor needed by the Parceler library
    public ImageMedia() {}

    public static ImageMedia fromJson(JSONObject entities) throws JSONException{
        ImageMedia imageMedia = new ImageMedia();
        imageMedia.image = entities.getJSONArray("media").getJSONObject(0).getString("media_url_https");
        imageMedia.type = entities.getJSONArray("media").getJSONObject(0).getString("type");

        return imageMedia;
    }
}
