class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer>stack=new Stack<>();
        for(int i=0;i<tokens.length;i++){
          if(!tokens[i].equals("+") && 
             !tokens[i].equals("-") &&
             !tokens[i].equals("*") &&
             !tokens[i].equals("/")){
            stack.push(Integer.parseInt(tokens[i]));
          }else if(tokens[i].equals("+")){
            int ele1=stack.pop();
            int ele2=stack.pop();
            int res=ele1+ele2;
            stack.push(res);
          }
          else if(tokens[i].equals("-")){
            int ele1=stack.pop();
            int ele2=stack.pop();
            int res=ele2-ele1;
            stack.push(res);
          }
          else if(tokens[i].equals("*")){
            int ele1=stack.pop();
            int ele2=stack.pop();
            int res=ele1*ele2;
            stack.push(res);
          }
          else if(tokens[i].equals("/")){
            int ele1=stack.pop();
            int ele2=stack.pop();
            int res=ele2/ele1;
            stack.push(res);
          }
        }
        return stack.pop();
    }
}
