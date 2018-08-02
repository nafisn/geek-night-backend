package com.geeknight.GeekNightApp.config;

public class AlbumApi {
    private static final String ALBUM_BASE_URL = "api/v1/album";
    public static final String ALBUM_ID = ALBUM_BASE_URL + "/{albumId}";
    public static final String ALBUM_SONGS = ALBUM_ID + "/songs";
}
