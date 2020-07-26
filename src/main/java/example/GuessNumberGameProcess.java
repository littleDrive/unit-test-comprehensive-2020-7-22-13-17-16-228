package example;

import java.util.Scanner;

/**
 * @author ozm
 * @date 2020/7/26 - 23:35
 */
public class GuessNumberGameProcess {

    int life;
    Scanner scanner ;
    VerifyInputNumber verifyInputNumber;
    AnswerGenerator answerGenerator;
    GuessNumberGame guessNumberGame;

    public GuessNumberGameProcess() {
        life = 6;
        scanner = new Scanner(System.in);
        verifyInputNumber = new VerifyInputNumber();
        answerGenerator = new AnswerGeneratorImpl();
        guessNumberGame = new GuessNumberGame(answerGenerator.generator());
    }

    public void begin() {

        while (life > 0) {
            String inputNumber = scanner.nextLine();
            if (verifyInputNumber.varify(inputNumber)) {
                life--;
                System.out.println("Wrong Input，Input again");
                continue;
            }
            String outPutMassage = guessNumberGame.guess(inputNumber);
            if (outPutMassage.equals("4A0B")) {
                life = 0;
                System.out.println(outPutMassage);
                System.out.println("win, all correct");
                return;
            }
            System.out.println(outPutMassage);
            life--;
        }
        System.out.println("Defeated!");
    }

//    public static void main(String[] args) {
//        GuessNumberGameProcess guessNumberGameProcess = new GuessNumberGameProcess();
//        guessNumberGameProcess.begin();
//    }
}
