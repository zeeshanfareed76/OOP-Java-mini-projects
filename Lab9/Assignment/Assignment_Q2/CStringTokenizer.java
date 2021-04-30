
package lab09;

/**
 *
 * @author BOSS
 */
import java.util.StringTokenizer;

class CStringTokenizer extends StringTokenizer{

    private int Count;

    public CStringTokenizer(String s) {
        super(s);
    }

    @Override
    public int countTokens(){
        int total_Tokens = super.countTokens();
        Count = total_Tokens;
        String curr_token;
        for(int i=0;i<total_Tokens;i++){
            curr_token = super.nextToken();
            for(int j = 0; j<curr_token.length(); j++){
                if(Character.isDigit(curr_token.charAt(j))){
                    Count--;
                    break;
                }
            }
        }
        return Count;
    }
}