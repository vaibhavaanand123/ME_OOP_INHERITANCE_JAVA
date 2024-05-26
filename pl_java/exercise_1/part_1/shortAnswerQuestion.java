package pl_java.exercise_1.part_1;

import pl_java.exercise_1.part_0.QuestionType;

public class shortAnswerQuestion {

    // Attributes
    private String questionText;
    private String shortAnswer;
    private QuestionType questionType;

    // Constructor

    public shortAnswerQuestion(String questionText) {
        setQuestionType(QuestionType.SHORT_ANSWER);
        setQuestionText(questionText);
    }

    // Getter

    public String getQuestionText() {
        return questionText;
    }

    public String getShortAnswer() {
        return shortAnswer;
    }

    public QuestionType getQuestionType() {
        return questionType;
    }

    // Setter

    public void setShortAnswer(String shortAnswer) {
        this.shortAnswer = shortAnswer;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public void setQuestionType(QuestionType questionType) {
        this.questionType = questionType;
    }
}
