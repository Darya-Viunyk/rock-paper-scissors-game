//package org.example;
//
//import java.util.Random;
//import java.util.Scanner;
//
///*Объявление класса RockPaperScissors:
//
//есть приватное поле moves, содержащее возможные ходы в виде массива строк ("rock", "paper", "scissors").*/
//
//public class RockPaperScissors {
//    private String[] moves = {"rock", "paper", "scissors"};
//
//    public RockPaperScissors(Player humanPlayer, Player computerPlayer) {
//    }
//
//    /*Метод getPlayerMove():
//
//экземпляр Scanner для  ввода.
//В цикле запрашивается у пользователя ввод хода (rock/paper/scissors) до тех пор,
//пока введенный ход не будет допустимым.
//*/
//    private String getPlayerMove(){
//        Scanner scanner = new Scanner(System.in);
//        while (true){
//            System.out.print("Enter you move (rock/paper/scissors): ");
//            String playerMove = scanner.nextLine().toLowerCase();
//            if (isValidMove(playerMove)){
//                return playerMove;
//            }else{
//                System.out.println("Invalid move. Please try again.");
//            }
//        }
//    }
//
//    /*
//    Метод getComputerMove():
//
//    Создаеm Random для генерации случайного числа.
//    Генерируется случайный индекс в пределах длины массива moves.
//     */
//    private String getComputerMore(){
//        Random random = new Random();
//        int randomIndex = random.nextInt(moves.length);
//        return moves[randomIndex];
//    }
///*
//Метод isValidMove(String move):
//
//Принимает ход (move) в качестве параметра.
//Проверяет, есть ли переданный ход в массиве moves.
//Если ход допустим, возвращает true, иначе false.
// */
//    private boolean isValidMove(String move){
//        for(String validMove : moves){
//            if(validMove.equals(move)){
//                return true;
//            }
//        }
//        return false;
//    }
//    /*
//    Метод determineWinner(String playerMove, String computerMove):
//
//Принимает ход игрока (playerMove) и ход компьютера (computerMove) в качестве параметров.
//Сравнивает ходы и определяет победителя на основе правил камень-ножницы-бумага.
//Возвращает "draw" в случае ничьей, "player" если победил игрок, "computer" если победил компьютер.
//     */
//    private String determineWinner(String playerMove, String computerMove){
//        if(playerMove.equals(computerMove)){
//            return "draw";
//        } else if ((playerMove.equals("rock") && computerMove.equals("scissors")) ||
//                (playerMove.equals("paper") && computerMove.equals("rock")) ||
//                (playerMove.equals("scissors") && computerMove.equals("paper"))
//        ) {
//
//            return "player";
//        }else {
//            return "computer";
//        }
//    }
//
//    /*
//    Метод play():
//
// Scanner для чтения пользовательского ввода.
//Запускается бесконечный цикл игры.
//Выводится сообщение "Rock, Paper, Scissors!".
//Вызывается метод getPlayerMove() для получения хода игрока.
//Вызывается метод getComputerMove() для получения хода компьютера.
//Выводятся выбранные ходы игрока и компьютера.
//Вызывается метод determineWinner() для определения победителя.
//Если результат "draw" (ничья), выводится сообщение о ничьей и игра продолжается.
//Если есть победитель, выводится сообщение о победе и игра завершается.
//     */
//    public void play(){
//        Scanner scanner = new Scanner(System.in);
//        while (true){
//            System.out.println(("Rock, Paper, Scissors"));
//            String playerMore = getPlayerMove();
//            String computerMore = getComputerMore();
//
//            System.out.println("\nYou chose: " + playerMore);
//            System.out.println("Computer chose: " + computerMore);
//
//            String winner = determineWinner(playerMore, computerMore);
//            if (winner.equals("draw")){
//                System.out.println("It's a draw! Let's play agan.");
//            }else {
//                System.out.println(winner.substring(0, 1).toLowerCase() + winner.substring(1) + "wins!");
//            break;
//            }
//        }
//    }
//}
