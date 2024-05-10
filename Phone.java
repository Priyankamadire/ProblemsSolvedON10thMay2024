/*17. Letter Combinations of a Phone Number
Solved
Medium
Topics
Companies
Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent. Return the answer in any order.

A mapping of digits to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.


 

Example 1:

Input: digits = "23"
Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]
Example 2:

Input: digits = ""
Output: []
Example 3:

Input: digits = "2"
Output: ["a","b","c"]
 

Constraints:

0 <= digits.length <= 4
digits[i] is a digit in the range ['2', '9'].
*/
class Phone {
    public String[] st = {
        "","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"
    };
    public List<String> letterCombinations(String digits) {
        List<String> al = new ArrayList<>();
        if(digits.length()==0 || digits.isEmpty()){
            return al;
        }
        formsubstring(0,digits,"",al);
        return al;
    }
   
    public  void  formsubstring(int ind,String dig,String str,List<String> ans){
           if(ind==dig.length()){
            ans.add(str);
            return;
           }
           String sb = st[dig.charAt(ind)-'0'];
           for(char l:sb.toCharArray()){
            formsubstring(ind+1,dig,str+l,ans);
           }
    }
}
