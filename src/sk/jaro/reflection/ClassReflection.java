package sk.jaro.reflection;

import sk.jaro.utils.Osoba;

import java.io.PrintStream;
import java.lang.reflect.*;

public class ClassReflection {
    static PrintStream out = System.out;

    public static void main(String... args) {
        Class<?> c = Osoba.class;
        out.format("Class:%n  %s%n%n", c.getCanonicalName());

        Package p = c.getPackage();
        out.format("Package:%n  %s%n%n",
                (p != null ? p.getName() : "-- No Package --"));


        printMembers(c.getConstructors(), "Constructor");

        printMembers(c.getDeclaredFields(), "Fields");

        printMembers(c.getMethods(), "Methods");

        printClasses(c);



        // production code should handle these exceptions more gracefully
    }

    private static void printMembers(Member[] mbrs, String s) {
        out.format("%s:%n", s);
        for (Member mbr : mbrs) {
            if (mbr instanceof Field) {
                out.format("  %s%n", ((Field) mbr).toGenericString());

                int foundMods = ((Field) mbr).getModifiers();
                System.out.println("isAbstract "+ Modifier.isAbstract(foundMods));
                System.out.println("isFinal "+Modifier.isFinal(foundMods));
                System.out.println("isInterface "+Modifier.isInterface(foundMods));
                System.out.println("isNative "+Modifier.isNative(foundMods));
                System.out.println("isPrivate "+Modifier.isPrivate(foundMods));
                System.out.println("isAbstract "+Modifier.isAbstract(foundMods));
                System.out.println("isProtected "+Modifier.isProtected(foundMods));
                System.out.println("isPublic "+Modifier.isPublic(foundMods));
            }
            else if (mbr instanceof Constructor)
                out.format("  %s%n", ((Constructor)mbr).toGenericString());
            else if (mbr instanceof Method)
                out.format("  %s%n", ((Method)mbr).toGenericString());
        }
        if (mbrs.length == 0)
            out.format("  -- No %s --%n", s);
        out.format("%n");
    }

    private static void printClasses(Class<?> c) {
        out.format("Classes:%n");
        Class<?>[] clss = c.getClasses();
        for (Class<?> cls : clss)
            out.format("  %s%n", cls.getCanonicalName());
        if (clss.length == 0)
            out.format("  -- No member interfaces, classes, or enums --%n");
        out.format("%n");
    }
}
