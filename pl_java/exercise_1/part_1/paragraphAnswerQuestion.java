package pl_java.exercise_1.part_1;

import pl_java.exercise_1.part_0.QuestionType;

public class paragraphAnswerQuestion {
    // attributes
    private String questionText;
    private String paragraphAnswer;
    private QuestionType questionType;

    // constructor
    public paragraphAnswerQuestion(String questionText) {
        setQuestionType(QuestionType.PARAGRAPH_ANSWER);
        setQuestionText(questionText);
    }

    // Getter
    public String getQuestionText() {
        return questionText;
    }

    public String getParagraphAnswer() {
        return paragraphAnswer;
    }

    public QuestionType getQuestionType() {
        return questionType;

    }

    // Setter

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }
    public void setParagraphAnswer(String paragraphAnswer){
        this.paragraphAnswer=paragraphAnswer;
    }
    public void setQuestionType(QuestionType questionType){
        this.questionType=questionType;
    }

}
