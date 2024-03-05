package com.anvar.leetcode.Easy;

import java.util.*;

public class TicTacToeGameMine {

        static ArrayList<Integer> playerPositions = new ArrayList<>();
        static ArrayList<Integer> cpuPositions = new ArrayList<>();

        public static void main(String[] args) {

        char[][] gameBoard = {
                {' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '}
        };


        printGameBoard(gameBoard);

        while (true) {
            System.out.println("Enter your placement (1-9):");
            Scanner scan = new Scanner(System.in);
            int playerPos = scan.nextInt();

            while (playerPositions.contains(playerPos) || cpuPositions.contains(playerPos)){
                System.out.println("Position is already taken");
                playerPos = scan.nextInt();
            }

            System.out.println(playerPos);

            placePiece(gameBoard, playerPos, "player");

            String result = checkWinner();
            if (result.length() > 0) {
                System.out.println(result);
                break;
            }

            Random random= new Random();
            int cpuPos = random.nextInt(9) + 1;
            while (playerPositions.contains(cpuPositions) || cpuPositions.contains(cpuPositions)){
               // System.out.println("Position is already taken");
                cpuPos = random.nextInt();
            }
            placePiece(gameBoard, cpuPos, "cpu");

            printGameBoard(gameBoard);
            result = checkWinner();
            if (result.length() > 0) {
                System.out.println(result);
                break;
            }
        }


    }

    private static void placePiece(char[][] gameBoard, int pos, String user) {
        char symbol;
        if (user.equals("player")) {
            symbol = 'X';
            playerPositions.add(pos);
        } else {symbol = 'O';
            cpuPositions.add(pos);
        }

        switch (pos) {
            case 1 -> gameBoard[0][0] = symbol;
            case 2 -> gameBoard[0][2] = symbol;
            case 3 -> gameBoard[0][4] = symbol;
            case 4 -> gameBoard[2][0] = symbol;
            case 5 -> gameBoard[2][2] = symbol;
            case 6 -> gameBoard[2][4] = symbol;
            case 7 -> gameBoard[4][0] = symbol;
            case 8 -> gameBoard[4][2] = symbol;
            case 9 -> gameBoard[4][4] = symbol;
        }
    }

    public static String checkWinner() {
        List<Integer> topRow =    Arrays.asList(1, 2, 3);
        List<Integer> middleRow = Arrays.asList(4, 5, 6);
        List<Integer> botmRow =   Arrays.asList(7, 8, 9);
        List<Integer> leftCol =   Arrays.asList(1, 4, 7);
        List<Integer> midCol =    Arrays.asList(2, 5, 8);
        List<Integer> rightCol =  Arrays.asList(3, 6, 9);
        List<Integer> cross1 =    Arrays.asList(1, 5, 9);
        List<Integer> cross2 =    Arrays.asList(7, 5, 3);

        List<List> winning = new ArrayList<>();
        winning.add(topRow);
        winning.add(middleRow);
        winning.add(botmRow);
        winning.add(leftCol);
        winning.add(midCol);
        winning.add(rightCol);
        winning.add(cross1);
        winning.add(cross2);

        for (List l: winning){
            if (playerPositions.containsAll(l)){
                return "Congratulations you won!!!";
            }else if (cpuPositions.containsAll(l))
                return "Sorry you loose!!!";
            else if(playerPositions.size() + cpuPositions.size() == 9)
                return "Seems it is a draw";
        }

        return "";
    }

    private static void printGameBoard(char[][] gameBoard) {
        for (char[] row : gameBoard) {
            for (char c : row) {
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
