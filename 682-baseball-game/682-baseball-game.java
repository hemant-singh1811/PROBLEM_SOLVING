class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer> st = new Stack<>();//creating a stack
        for(String s :ops){//filling stack
            if(s.equals("C")){ //if we got C in String then remove peek value in stack
                st.pop();
            }
            else if (s.equals("D")){//if we got D in String then multiply the peek value of tack by 2
                st.push(st.peek()*2);
            }
            else if(s.equals("+")){// if we got + in String then add the upermost 2 value of the stack
                int temp = st.pop();// removing the peek value while storing it in temperary value
                int sum = temp+st.peek();//now add both temp and the peek value
                st.push(temp);//pushing back temp and then sum in order
                st.push(sum);
            }
            else{// for all the interger value in string 
                st.push(Integer.parseInt(s));// converting string to interger
            }
        }
        int res = 0;
        for(int i :st){
            res+=i;// adding all the value to stack in result 
        }
        return res;
    }
}