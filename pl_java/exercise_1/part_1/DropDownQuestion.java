package pl_java.exercise_1.part_1;

import pl_java.exercise_1.part_0.QuestionType;

import java.util.List;

public class DropDownQuestion {

    // attribute

    private String questionText;
    private QuestionType questionType;
    private String dropDownAnswer;
    private List<String> dropDownOption;

    // constructor 
    public DropDownQuestion(String questionText, List<String> dropDownOption  ){

        setQuestionText(questionText);
        setDropDownOption(dropDownOption);
        setQuestionType(QuestionType.DROPDOWN);

    }

    // Getter 

    public String getQuestionText(){
        return questionText;
    }
    public String getDropDownAnswer(){
        return dropDownAnswer;
    }
    public List<String> getDropDownOption(){
        return dropDownOption;
    }
    public QuestionType getQuestionType(){
        return questionType;
    }

    // setter

    public void setQuestionText(String questionText){
        this.questionText=questionText;
    }
    public void setDropDownAnswer(String dropDownAnswer){
        this.dropDownAnswer=dropDownAnswer;
    }
    public void setDropDownOption(List<String> dropDownOption){
        this.dropDownOption=dropDownOption;
    }
    public void setQuestionType(QuestionType questionType){
        this.questionType=questionType;
    }
}
