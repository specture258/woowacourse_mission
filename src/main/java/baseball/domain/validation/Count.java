package baseball.domain.validation;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Count {
    Map<Integer, Integer> answerValidation = new LinkedHashMap<>();

    public void answerCount(List<Integer> answerNumber){

        for(int i=0 ; i<answerNumber.size() ;i++) {
            answerValidation.put(i, answerNumber.get(i));
        }
    }

    public int[] isSameAnswerNumber(List<Integer> userNumber , List<Integer> answerNumber){
       int[] result = new int[2];

       for(int i=0 ; i<userNumber.size(); i++){
           if(answerNumber.get(i).equals(userNumber.get(i))){
               result[1]++;
           }else if(answerNumber.contains(userNumber.get(i))){
               result[0]++;
           }
       }
       return result;
    }




}
