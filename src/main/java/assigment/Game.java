package assigment;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Game {
    enum Type {
        SOCCER,
        HOCKEY,
        RUGBY
    }public static void writeTheNumberOfTheTeamPlayers(Type type){
        switch (type){
            case RUGBY:
                try {
                    BufferedWriter bw=new BufferedWriter(new FileWriter("Rugby.txt"));
                    bw.write("15");
                    bw.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);

                }break;
            case HOCKEY:
                try {
                    BufferedWriter bw =new BufferedWriter(new FileWriter("Hockey"));
                    bw.write("6");
                    bw.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }break;

                case SOCCER:
                try {
                    BufferedWriter bw=new BufferedWriter(new FileWriter("Soccer"));
                    bw.write("11");
                    bw.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }break;


        }
    }

}
