package com.example.Ovenex.Services;

import java.util.Scanner;

public class MusicService {

    Scanner input = new Scanner(System.in);
    private String[] MusicList = {
            "1. Music1",
            "2. Music2",
            "3. Music3",
            "4. Music4",
            "5. Music5",
            "6. Music6",
            "7. Music7",
            "8. Music8",
            "9. Music9",
            "10. Music10"
    };

    public String playMusic() {
        return MusicList[(int) (Math.random() * MusicList.length)];
    }

    public void chooseMusic() {
        System.out.println("What music do you want to play?");
        for (int i = 0; i < MusicList.length; i++) {
            System.out.println(MusicList[i]);
        }

        int option = input.nextInt();
        System.out.println("Playing music " + option + "...");
    }
}
