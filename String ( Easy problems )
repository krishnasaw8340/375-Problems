125. Valid Palindrome :

Algorothm:
Step-1: Take string make it lowerCase()
Step-2: ReplaceAll by replacAll[^a-z0-9]","")
Step-3: take two variable i and j
Step-4: Make a loop until i<=j
Step-5: If(s.charAt(i) != s.charAt(j) return false
Step-6: Increment i, j


 s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
       int i=0;
       int j= s.length()-1;
       while (i<=j)
       {
           if(s.charAt(i) !=s.charAt(j))
           {
               return false;
           }
           i++;
           j--;

       }
       return true;

    }
}
