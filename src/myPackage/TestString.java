package myPackage;

public class TestString {
    public static void main(String[] args) {

        String s = "Hello world";
        System.out.println(s.equals("Hello world"));
        System.out.println(s.equals("hello"));

        String s2 = "Hello";
        System.out.println(s.equals(s2));

        s = "text";
        s2 = "TEXT";
        System.out.println(s.equals(s2));
        System.out.println(s.equalsIgnoreCase(s2));

        s = "TeXt";
        System.out.println();
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());

        System.out.println();
        System.out.println(s.charAt(1));
        System.out.println(s.indexOf("X"));

        s = "Hello world";
        System.out.println();
        System.out.println(s.contains("Hello"));
        System.out.println(s.length());

        System.out.println();
        System.out.println(s.startsWith("He"));
        System.out.println(s.endsWith("!"));

        s = "Hello, world";
        System.out.println();
        String[] array = s.split(",");
        System.out.println(array[0] + "!" + array[1] + "!");
        System.out.println();

        String sttr = "My name is %s! I'm %d years old!";
        int age = 30;
        String name = "Ivan";
        System.out.println(String.format(sttr, name, age));
        System.out.println(String.format(sttr, "Vasya", 10));
        System.out.println();

        String age2 = "30";
        int a = Integer.parseInt(age2);
        System.out.println(a * 3);

        String q = "Hello world!";
        System.out.println(q.substring(1,5));
        System.out.println(q.substring(7));

        System.out.println(s.substring(7, s.length() - 2));
        String ab, bc, cd, res;
        ab = "privet ";
        bc = "my dear ";
        cd = "friend";
        res = ab.concat(bc).concat(cd);
        System.out.println(res);
    }
}
