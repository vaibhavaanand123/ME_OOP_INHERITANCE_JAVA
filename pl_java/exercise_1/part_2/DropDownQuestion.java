package pl_java.exercise_1.part_2;

import pl_java.exercise_1.part_0.QuestionType;

import java.util.List;

public class DropDownQuestion extends Question {

    // attribute
    private String dropDownAnswer;
    private List<String> dropDownOption;

    // constructor 
    public DropDownQuestion(String questionText, List<String> dropDownOption  ){

        setQuestionText(questionText);
        setDropDownOption(dropDownOption);
        setQuestionType(QuestionType.DROPDOWN);

    }

    // Getter 

   
    public String getDropDownAnswer(){
        return dropDownAnswer;
    }
    public List<String> getDropDownOption(){
        return dropDownOption;
    }

    // setter

    
    public void setDropDownAnswer(String dropDownAnswer){
        this.dropDownAnswer=dropDownAnswer;
    }
    public void setDropDownOption(List<String> dropDownOption){
        this.dropDownOption=dropDownOption;
    }
    
}
