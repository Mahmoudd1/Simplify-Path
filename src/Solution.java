import java.util.Stack;

class Solution {
    public String simplifyPath(String path) {
        String []myarr=path.split("/");
        Stack<String> mystack=new Stack<>();
        for (String temp : myarr)
        {
            if (temp=="" || temp.equals("."))
                continue;
            else if (temp.equals(".."))
            {
                if (!mystack.empty())
                    mystack.pop();
                else
                    continue;
            }
            else
                mystack.push(temp);
        }
        StringBuilder str=new StringBuilder();
        Stack<String>stack2=new Stack<>();
        while(!mystack.empty())
        {
            stack2.push(mystack.pop());
        }
        while (!stack2.empty())
        {
            str.append("/");
            str.append(stack2.pop());
        }
        if (str.length()==0)
            return "/";
        return str.toString();
    }
}


