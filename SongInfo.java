package in.youtube.navin.musicplayer;

/**
 * Created by Navin Kumar on 2/26/2018.
 */

public class SongInfo {

 public String songName,artistName,songUrl;
    public SongInfo(){

    }
    public SongInfo(String songName,String artistName,String songUrl){
        this.songName=songName;
        this.artistName=artistName;
        this.songUrl=songUrl;
    }

    public String getSongName() {
        return songName;
    }

    public String getArtistName() {
        return artistName;
    }

    public String getSongUrl() {
        return songUrl;
    }
}
