package assigment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;

public class Assignment {
    public void loops() {
        for (int i = 1; i <= 100; i++)
            if (i % 3 == 0 && i % 2 == 0)
                System.out.println(i + " is divisible by 3 and 2");
            else if (i % 3 == 0)
                System.out.println(i + " is divisible by 3");
            else if (i % 2 == 0)
                System.out.println(i + " is even");
            else
                System.out.println(i + " is odd");
    }

    public void sum(int a, int b) {
        int total = 0;
        for (int i = a; i <= b; i++)
            total = total + i;
        System.out.println(total);

    }

    public void pyramid() {
        for (int i = 0; i <= 6; i++) {
            System.out.println();
            for (int j = 6; j > i; j--)
                System.out.print("*");
        }


    }

    public void nearHundred(int n) {
        boolean result = false;
        if (100 - n <= 10)
            result = true;
        System.out.println(result);
    }

    public void lastDigit(int n, int n2) {
        boolean result = false;
        if (n2 % 10 == n)
            result = true;
        System.out.println(result);

    }

    public void intMax(int a, int b, int c) {
        if (a > b && a > c)
            System.out.println(a);
        else if (b > c && b > a)
            System.out.println(b);
        else if (c > a && c > b)
            System.out.println(c);

    }

    public void lucky7(int a, int b) {
        boolean result = false;
        if (a == 7 || b == 7 || a + b == 7)
            result = true;
        System.out.println(result);

    }

    public void answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        boolean answer = true;
        if (isAsleep)
            answer = false;
        else if (isMorning && !isMom)
            answer = false;
        System.out.println(answer);

    }

    public void equalSlices(int total, int recipients, int slEach) {
        boolean result = false;
        if (slEach * recipients < total)
            result = true;
        System.out.println(result);

    }

    public void compareStrings(String a, String b) {
        String output = "";
        if (a == null || b == null)
            output = "Cannot compare Strings";
        else if (a.contains(b) || b.contains(a))
            output = a + " is a part of " + b;
        else if (a.equalsIgnoreCase(b))
            output = "The strings are the same";
        System.out.println(output);

    }

    public boolean isPalindrome(String txt) {
        txt = txt.replace(" ", "");
        String reversed = "";
        boolean result = false;
        for (int i = txt.length() - 1; i >= 0; i--)
            reversed = reversed + txt.charAt(i);
        if (txt.equalsIgnoreCase(reversed))
            result = true;
        return result;

    }

    public String backAround(String txt) {
        int last = txt.length() - 1;
        String result = txt.charAt(last) + txt + txt.charAt(last);
        return result;

    }

    public boolean maxStart(String txt) {
        boolean result = false;
        if (txt.startsWith("ax", 1))
            result = true;

        return result;

    }

    public String fizz(String txt) {
        String result = "";
        if (txt.startsWith("f") && txt.endsWith("b"))
            result = "FizzBuzz";
        else if (txt.startsWith("f"))
            result = "Fizz";
        else if (txt.endsWith("b"))
            result = "Buzz";
        else
            result = txt;

        return result;

    }

    public String times(String txt, int n) {
        String result = txt.repeat(n);
        return result;

    }

    public boolean isPlural(String txt) {
        boolean result = false;
        txt = txt.toLowerCase();
        if (txt.endsWith("s"))
            result = true;

        return result;

    }

    public String getDay(int day) {
        String result = "";
        ArrayList<String> arrayList = new ArrayList();
        arrayList.add("Sunday");
        arrayList.add("Monday");
        arrayList.add("Tuesday");
        arrayList.add("Wednesday");
        arrayList.add("Thursday");
        arrayList.add("Friday");
        arrayList.add("Saturday");

        if (day > arrayList.size())
            result = "Error";
        else
            result = arrayList.get(day - 1);
        return result;

    }

    public String getToyById(int id) {
        String result = "";
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(12, "Batmobile");
        hashMap.put(45, "Light Saber");
        hashMap.put(6, "Wonder Woman");
        hashMap.put(201, "Hello Kitty Bag");
        hashMap.put(56, "Junior QA Analyst Doll");

        if (!hashMap.containsKey(id))
            result = "No such a Toy";
        else
            result = hashMap.get(id);
        return result;

    }

    public ArrayList noDuplicates(String a, String b, String c, String d, String e, String f, String g) {
        ArrayList<String> names = new ArrayList<>();
        names.add(a);
        names.add(b);
        names.add(c);
        names.add(d);
        names.add(e);
        names.add(f);
        names.add(g);

        LinkedHashSet<String> duplicates = new LinkedHashSet<>(names);
        ArrayList<String> arrayList = new ArrayList<>(duplicates);
        return arrayList;

    }

    public boolean has22(int a, int b, int c) {
        int[] array = {a, b, c};
        for (int i = 0; i < array.length - 1; i++)
            if (array[i] == 2 && array[i + 1] == 2) {
                return true;
            }
        return false;

    }

    public boolean lucky13(int a, int b, int c) {
        int[] nums = {a, b, c};
        for (int i = 0; i < nums.length - 1; i++)
            if (nums[i] == 1 || nums[i] == 3) {
                return false;
            }
        return true;


    }

    public Integer maxTriple(int a, int b, int c) {
        int result = 0;
        int[] nums = {a, b, c};
        for (int i = 0; i < nums.length; i++) {
            int first = nums[0];
            int end = nums[nums.length - 1];
            int mid = nums[((nums.length + 1) / 2 - 1)];

            if (first > mid && first > end)
                result = first;
            else if (end > mid && end > first)
                result = end;
            else
                result = mid;

        }
        return result;

    }

    public boolean arrayFront(int a, int b, int c, int d, int e) {
        int[] numbers = {a, b, c, d, e};
        for (int i = 0; i < numbers.length - 1; i++)
            if (numbers[i] == 9 && i < (numbers.length - numbers.length) + 5)
                return true;
        {

        }
        return false;

    }

    public void square(int a, int b, int c, int d, int e) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(a);
        arrayList.add(b);
        arrayList.add(c);
        arrayList.add(d);
        arrayList.add(e);
        System.out.println(arrayList);
        arrayList.replaceAll(x -> x * x);
        System.out.println(arrayList);


    }

    public void typingGame() {
       String[]userTyped={"cat","blue","skt","umbrells","paddy"};
       String[]correct={"cat","blue","sky","umbrella","paddy"};
        int[]output=new int[userTyped.length];

        for(int i=0;i<userTyped.length;i++)
            if(userTyped[i]==correct[i])
                output[i]=1;
        else
                output[i]=-1;



      System.out.println(Arrays.toString(output));


      //  return Integer.valueOf(Arrays.toString(output));
      //  return Arrays.toString(output);
    }public String nameShuffle(String name){
      //  String name="Trump Donald";
        String myArray[] = name.split(" ");
        String nameReversed =myArray[1]+ " "+ myArray[0];


        return nameReversed;
    }public boolean doubleLetters(String word){
        for(int i=0;i<word.length()-1;i++)
            if(word.charAt(i)==word.charAt(i+1))
                return true;
            return false;


    }

    }








