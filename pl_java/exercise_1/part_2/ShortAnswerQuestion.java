package pl_java.exercise_1.part_2;

import pl_java.exercise_1.part_0.QuestionType;

public class ShortAnswerQuestion extends Question{

    // Attributes

    private String shortAnswer;
   

    // Constructor

    public ShortAnswerQuestion(String questionText) {
        setQuestionType(QuestionType.SHORT_ANSWER);
        setQuestionText(questionText);
    }

    // Getter

    

    public String getShortAnswer() {
        return shortAnswer;
    }


    // Setter

    public void setShortAnswer(String shortAnswer) {
        this.shortAnswer = shortAnswer;
    }

    
}
