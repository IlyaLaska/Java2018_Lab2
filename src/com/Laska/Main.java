package com.Laska;

public class Main {
    public static void main(String[] args) {
        Text t = new Text();
        t.userInit();
        System.out.println("T:" + t);
        System.out.println("RESULT: " + t.getLongestNonLetterSubstring());
    }
}


/*
Scanner sc = new Scanner(System. in );
while (sc.hasNext()) {
if(sc.hasNextInt()) {
System.out.println(sc.nextInt());
break;
}
System.out.println("Try again");
sc.nextLine();
}
sc.close();
*/


/*
while (sc.hasNextLine()) {//HOW WILL THIS WORK
    System.out.println(sc.nextLine());
    if(sc.nextLine().equals("close")) break;
    temp.append(sc.next());
    }
*/