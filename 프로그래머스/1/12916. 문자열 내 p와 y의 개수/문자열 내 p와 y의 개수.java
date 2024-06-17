import java.util.*;
class Solution {
    boolean solution(String s) {
        boolean answer = true;
        s = s.toLowerCase();
        int p = 0;
        int y = 0;
        
        for (int i = 0; i < s.length(); i++) { 
            //인덱스 값 넣어줌
            char c = s.charAt(i);
            if (c == 'p')
                p++;
            if (c == 'y')
                y++;
        }
        
        if (p == y)
            answer = true;
        else 
            answer = false;
        
        return answer;
    }
}