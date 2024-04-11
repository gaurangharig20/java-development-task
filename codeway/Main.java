import java.util.Scanner;

class Quiz {
    private Question[] questions;
    private int score;

    public Quiz(Question[] questions) {
        this.questions = questions;
        this.score = 0;
    }

    public void displayQuestion(Question question) {
        System.out.println(question.getQuestion());
        String[] options = question.getOptions();
        for (int i = 0; i < options.length; i++) {
            System.out.println((i + 1) + ". " + options[i]);
        }
    }

    public void startQuiz() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < questions.length; i++) {
            System.out.println("Question " + (i + 1) + ":");
            displayQuestion(questions[i]);
            System.out.print("Your answer: ");
            int userAnswer = scanner.nextInt();
            if (userAnswer == questions[i].getCorrectAnswer()) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect.");
            }
            System.out.println(); // Add a newline for clarity
        }
        scanner.close();
    }

    public void displayResult() {
        System.out.println("Quiz ended.");
        System.out.println("Your score: " + score + "/" + questions.length);
        System.out.println("Summary of answers:");
        for (int i = 0; i < questions.length; i++) {
            System.out.println("Question " + (i + 1) + ": " + questions[i].getQuestion());
            System.out.println("Correct answer: " + questions[i].getOptions()[questions[i].getCorrectAnswer() - 1]);
            System.out.println(); // Add a newline for clarity
        }
    }
}

class Question {
    private String question;
    private String[] options;
    private int correctAnswer;

    public Question(String question, String[] options, int correctAnswer) {
        this.question = question;
        this.options = options;
        this.correctAnswer = correctAnswer;
    }

    public String getQuestion() {
        return question;
    }

    public String[] getOptions() {
        return options;
    }

    public int getCorrectAnswer() {
        return correctAnswer;
    }
}

public class Main{
    public static void main(String[] args) {
        // Sample quiz questions
        Question[] questions = {
                new Question("What is the capital of France?", new String[]{"London", "Paris", "Berlin", "Madrid"}, 2),
                new Question("What is the powerhouse of the cell?", new String[]{"Nucleus", "Mitochondria", "Ribosome", "Chloroplast"}, 2)
                // Add more questions here
        };

        // Create a Quiz instance and start the quiz
        Quiz quiz = new Quiz(questions);
        quiz.startQuiz();
        quiz.displayResult();
    }
}
