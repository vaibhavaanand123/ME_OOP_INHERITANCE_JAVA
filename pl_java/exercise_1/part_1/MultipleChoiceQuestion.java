package pl_java.exercise_1.part_1;

import pl_java.exercise_1.part_0.QuestionType;

import java.util.List;

public class MultipleChoiceQuestion {

    // Attribute

    private String questionText;
    private String multipleChoiceQuestion;
    private List<String> multipleChoiceOption;
    private QuestionType questionType;

    // constructor

    public MultipleChoiceQuestion(String questionText, List<String> choiceOption) {
        setQuestionText(questionText);
        setQuestionType(QuestionType.MULTIPLE_CHOICE);
        SetMultipleChoiceOption(choiceOption);
    }

    // getter

    public String getQuestionText() {
        return questionText;
    }

    public String getMultipleChoiceQuestion() {
        return multipleChoiceQuestion;
    }

    public List<String> getMultipleChoiceOption() {
        return multipleChoiceOption;
    }

    public QuestionType getQuestionType() {
        return questionType;
    }

    // setter

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public void setMultipleChoiceQuestion(String multipleChoiceQuestion) {
        this.multipleChoiceQuestion = multipleChoiceQuestion;
    }

    public void SetMultipleChoiceOption(List<String> multipleChoiceOption) {
        this.multipleChoiceOption = multipleChoiceOption;
    }

    public void setQuestionType(QuestionType questionType) {
        this.questionType = questionType;
    }

}
