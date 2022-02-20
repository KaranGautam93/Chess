import board.Board;

import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Board board = new Board();

        Scanner scanner = new Scanner(System.in);
        //take input from user
        while (true) {
            String command = scanner.nextLine();
            if (command.trim().toLowerCase(Locale.ROOT).equalsIgnoreCase("exit")) {
                break;
            }

            String positions[] = command.split(" ");

            if (positions.length == 2) {
                String from[] = positions[0].split("");
                String to[] = positions[1].split("");
                int fromRow = Integer.parseInt(from[1]) - 1;
                int fromCol = from[0].charAt(0) - 'a';
                int toRow = Integer.parseInt(to[1]) - 1;
                int toCol = to[0].charAt(0) - 'a';
                board.makeMove(fromRow, fromCol, toRow, toCol);
            } else {
                System.out.println("Invalid command");
            }
        }
    }
}
