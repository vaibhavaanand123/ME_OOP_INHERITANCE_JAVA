package pl_java.exercise_1.part_2;

import java.util.List;

import pl_java.exercise_1.part_0.QuestionType;

public class CheckBoxQuestion extends Question {

    // attribute
    private List<String> checkBoxAnswerList;
    private List<String> checkBoxOption;
   

    // constructor

    public CheckBoxQuestion(String questionText, List<String> checkBoxOption) {

        setQuestionText(questionText);
        setCheckBoxOption(checkBoxOption);
        setQuestionType(QuestionType.CHECKBOX);

    }

    // getter

    public List<String> getCheckBoxAnswerList() {
        return checkBoxAnswerList;
    }

    public List<String> getCheckBoxOption() {
        return checkBoxOption;
    }


    // setter


    public void setCheckBoxAnswerList(List<String> checkBoxAnswerList) {
        this.checkBoxAnswerList = checkBoxAnswerList;
    }

    public void setCheckBoxOption(List<String> checkBoxOption) {
        this.checkBoxOption = checkBoxOption;
    }


}
