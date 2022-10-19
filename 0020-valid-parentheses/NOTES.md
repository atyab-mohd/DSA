* LIFO. using simple stack push, pop function
* APPROACH:- last bracket to open should be the first one to close. maintaining a structure where last bracket to open is accessible easily.
1. open bracket:- push to stack.
2. closing bracket -->A) stack is empty. *return false
--> B) if st.peek() matches with the closing bracet. *pop and continue*