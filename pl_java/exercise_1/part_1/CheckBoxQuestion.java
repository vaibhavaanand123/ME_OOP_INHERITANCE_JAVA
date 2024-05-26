package pl_java.exercise_1.part_1;

import java.util.List;

import pl_java.exercise_1.part_0.QuestionType;

public class CheckBoxQuestion {

    // attribute

    private String questionText;
    private List<String> checkBoxAnswerList;
    private List<String> checkBoxOption;
    private QuestionType questionType;

    // constructor

    public CheckBoxQuestion(String questionText, List<String> checkBoxOption) {

        setQuestionText(questionText);
        setCheckBoxOption(checkBoxOption);
        setQuestionType(QuestionType.CHECKBOX);

    }

    // getter

    public String getQuestionText() {
        return questionText;
    }

    public List<String> getCheckBoxAnswerList() {
        return checkBoxAnswerList;
    }

    public List<String> getCheckBoxOption() {
        return checkBoxOption;
    }

    public QuestionType getQuestionType() {
        return questionType;
    }

    // setter

    public void setQuestionText(String questionText) {

        this.questionText = questionText;
    }

    public void setCheckBoxAnswerList(List<String> checkBoxAnswerList) {
        this.checkBoxAnswerList = checkBoxAnswerList;
    }

    public void setCheckBoxOption(List<String> checkBoxOption) {
        this.checkBoxOption = checkBoxOption;
    }

    public void setQuestionType(QuestionType questionType) {
        this.questionType = questionType;
    }

}
