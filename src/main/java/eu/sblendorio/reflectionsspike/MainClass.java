package eu.sblendorio.reflectionsspike;

import org.reflections.Reflections;

import java.util.Set;

public class MainClass {

    public static void main(String s[]) {
        Set<Class<? extends Base>> classes = new Reflections("").getSubTypesOf(Base.class);
        for (Class<? extends Base> clazz: classes) {
            System.out.println("* " + clazz.getName());
        }
    }
}
