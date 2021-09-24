# Coding-Problems
<h3>1.Question</h3>
<ol>
<li>Find the max value of the function F(L,R) = { 0    AND(L,R) < K } </li>
<li>                                            { OR(L,R) + AND(L,R) AND(L,R) > K </li> 
<li>Given K value and A = {1,4,5,4}</li>
  <li><a href="https://github.com/subhash14580/Coding-Problems/blob/main/Dynamic%20Programing/Question1.java">Solution</a> <li>
</ol>

 int len = arr.length;
        int result = 0;
        int i = 0, j = 0;
        // flag1 = false it means 0
        // flag1 = true it means 1
        boolean flag1 = false;
        while(i < len - 1) {
            if(( !flag1 && arr[i] < arr[i + 1]) || ( flag1 && arr[i] > arr[i + 1])) {
                i++;
            }else{
                result = Math.max(result, i - j + 1);
                i++;
                j = i;
            }
            flag1 = !flag1;
        }

        result = Math.max(result, i - j + 1);
        i = 0; j = 0;
        flag1 = true;
        while(i < len - 1) {
            if((flag1 && arr[i] < arr[i + 1]) || (!flag1 && arr[i] > arr[i + 1])) {
                i++;
            }else{
                result = Math.max(result, i - j);
                i++;
                j = i;
            }
            flag1 = !flag1;
        }
        result = Math.max(result, i - j);
