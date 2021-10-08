package com.company;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs= new ArrayList<Song>();
    }

    public Song findSong(String title){
        for(Song song:songs){
            if(song.getTitle()==title){
                return song;
            }
        }
        return null;
    }

    public boolean addSong(String title, double duration){
        if(this.findSong(title)==null){
            Song newSong= new Song(title,duration);
            this.songs.add(newSong);
            return true;
        }
        return false;
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList){
        int index= trackNumber-1;
        if(index>=0 && index<this.songs.size()){
            playList.add(this.songs.get(index));
            return true;
        }
        return false;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playList){
        Song requiredSong= this.findSong(title);
        if(requiredSong==null){
            return false;
        }
        playList.add(requiredSong);
        return true;
    }

}
