package com.company;

import java.util.*;

public class Main {


    //Primary change to this code was switching LinkedLists to Lists. This is supposed to show Interface power because
    //Java uses Interfaces in many of the prebuilt code. ArrayLists, Lists, LinkedLists can be interchangeable because
    //of Interfaces being used.



    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<Album> albums = new ArrayList<Album>();
    private static List<Song> playlist = new LinkedList<Song>();

    public static void main(String[] args) {

        Album album = new Album("Stormbringer", "Deep Purple");
        album.addSong("Stormbringer", 4.6);
        album.addSong("Love don't mean a thing", 4.22);
        album.addSong("Holy Man", 4.3);
        album.addSong("Hold on", 5.6);
        album.addSong("Lady Double Dealer", 3.21);
        album.addSong("You can't do it right", 4.27);
        album.addSong("High Ball Shooter", 4.2);
        album.addSong("The gypsy", 4.2);
        album.addSong("Soldier of Fortune", 3.13);
        albums.add(album);

        album = new Album("For those about to rock" , "AC/DC");
        album.addSong("For those about to rock", 5.44);
        album.addSong("I put the finger on you", 3.25);
        album.addSong("Lets Go", 3.45);
        album.addSong("Inject the venom", 3.33);
        album.addSong("Snowballed", 4.51);
        album.addSong("Evil Walks", 3.45);
        album.addSong("COD", 5.25);
        album.addSong("Breaking the rules", 5.32);
        album.addSong("Night of the long knives", 5.12);
        albums.add(album);

        albums.get(0).addToPlayList("You can't do it right", playlist);
        albums.get(0).addToPlayList("Holy Man", playlist);
        //albums.get(0).addToPlayList("Speed King", playlist);
        albums.get(0).addToPlayList(9, playlist);
        albums.get(1).addToPlayList(8, playlist);
        albums.get(1).addToPlayList(3, playlist);
        albums.get(1).addToPlayList(2, playlist);
        //albums.get(0).addToPlayList(24, playlist);

        start();
    }

    public static void start() {
        ListIterator<Song> songListIterator = playlist.listIterator();

        if (playlist.isEmpty()) {
            System.out.println("The playlist is currently empty, please add songs to the playlist to continue.");
            return;
        }else{
            System.out.println("Welcome to your personal music player\n");
            System.out.println("Now Playing: " + songListIterator.next() +"\n");
        }

        menu();

        boolean repeat = true;
        boolean quit = false;
        boolean goingForward = true;

        while(!quit) {
            int option = scanner.nextInt();
            switch (option) {
                case 0:
                    System.out.println("Thanks for using the personal music player, goodbye");
                    quit = true;
                    break;
                case 1:
                    if (!goingForward) {
                        if (songListIterator.hasNext()){
                            songListIterator.next();
                        }
                        goingForward = true;
                    }
                    if (songListIterator.hasNext()) {
                        System.out.println("Now Playing: " + songListIterator.next());
                    }else{
                        System.out.println("Reached the end of the playlist.");
                    }
                    break;
                case 2:
                    if (goingForward) {
                        if (songListIterator.hasPrevious()){
                            songListIterator.previous();
                        }
                        goingForward = false;
                    }
                    if (songListIterator.hasPrevious()) {
                        System.out.println("Now Playing: " + songListIterator.previous());
                    }else{
                        System.out.println("You have reached the top of the playlist.");
                    }
                    break;
                case 3:
                    if(goingForward) {
                        if (songListIterator.hasPrevious()) {
                            System.out.println("Repeating: " + songListIterator.previous());
                            goingForward = false;
                        }
                    }else {
                        if (songListIterator.hasNext()) {
                            System.out.println("Repeating: " + songListIterator.next());
                            goingForward = true;
                        }
                    }
                    break;
                case 4:
                    printList(playlist);
                    break;
                case 5:
                    menu();
                    break;
                case 6:
                    if(playlist.size() > 0) {
                        songListIterator.remove();
                        if (songListIterator.hasNext()){
                            System.out.println("Now Playing " + songListIterator.next());
                        } else if (songListIterator.hasPrevious()) {
                            System.out.println("Now Playing " + songListIterator.previous());
                        }
                    }
            }
        }
    }

    public static void menu() {
        System.out.println("Enter the corresponding number:\n" +
                "0 - To quit\n" +
                "1 - To Skip Forward a Song\n" +
                "2 - To Skip Backward a Song\n" +
                "3 - Replay the Current Song\n" +
                "4 - List Song in Playlist\n" +
                "5 - Show the Menu again\n" +
                "6 - Remove current song");
    }

    private static void printList(List<Song> linkedList) {
        Iterator<Song> i = linkedList.iterator();
        System.out.println("Playlist:");
        while(i.hasNext()) {
            System.out.println(i.next().toString());
        }
    }























//    public int findItem(String name) {
//
//        int position = 0;
//        int index = 0;
//        for (Album item:albums) {
//            String tempName = getClass().getName();
//            if (name.equals(tempName)) {
//                position = index;
//            }
//            index++;
//        }
//        return position;
//    }
}
