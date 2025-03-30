package Chapter4;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        // 예측 게임
        Scanner scanner = new Scanner(System.in);
        int hiddenAnswer = (int) (Math.random() * 100 + 1);
        System.out.println("*** 예측 게임을 시작합니다. ***");
        System.out.print("게임에 참여할 선수 수>> ");
        int playerCount = scanner.nextInt();
        Player[] players = new Player[playerCount];

        for (int i = 0; i < playerCount; i++) {
            System.out.print("선수 이름>> ");
            String name = scanner.next();
            players[i] = new Player(name, 0);
        }

        while (true) {
            System.out.println("1~100사이의 숫자가 결정되었습니다. 선수들은 맞추어 보세요.");
            int minDiff = Integer.MAX_VALUE; // 가장 큰 값으로 초기화
            int winnerIndex = -1; // 우승자 인덱스 초기화
            for (int i = 0; i < playerCount; i++) {
                System.out.print(players[i].getName() + ">> ");
                int answer = scanner.nextInt();
                int diff = Math.abs(hiddenAnswer - answer);
                if (diff < minDiff) {
                    minDiff = diff;
                    winnerIndex = i;
                }
            }
            players[winnerIndex].incrementScore();

            System.out.println("정답은 " + hiddenAnswer + ". " + players[winnerIndex].getName() + "가 이겼습니다. 승점 1점 확보!");
            System.out.print("계속 하려면 yes 입력>> ");
            String response = scanner.next();
            if (response.equals("no")) {
                for (Player player : players) {
                    System.out.print(player.getName() + ": " + player.getScore() + " ");
                }
                int maxScore = 0;
                for (Player player : players) {
                    if (player.getScore() > maxScore) {
                        maxScore = player.getScore();
                    }
                }
                for (Player player : players) {
                    if (player.getScore() == maxScore) {
                        System.out.println(player.getName() + "이 최종 승리했습니다.");
                    }
                }
                break;
            } else {
                hiddenAnswer = (int) (Math.random() * 100 + 1);
            }
        }
        scanner.close();
    }
}

@Getter
@AllArgsConstructor
class Player {
    private String name;
    private int score;

    public void incrementScore() {
        score++;
    }
}