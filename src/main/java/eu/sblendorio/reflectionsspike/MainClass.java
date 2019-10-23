package eu.sblendorio.reflectionsspike;

import com.google.common.reflect.ClassPath;

import java.io.IOException;
import java.util.Set;

public class MainClass {

    public static void main(String s[]) throws IOException {
        ClassLoader cl = MainClass.class.getClassLoader();
        Set<ClassPath.ClassInfo> classesInPackage = ClassPath.from(cl).getTopLevelClasses();
        for (ClassPath.ClassInfo c: classesInPackage) {
            Class cz = c.load();
            if (Base.class.isAssignableFrom(cz))
            System.out.println("* " + c.getName());
        }
    }
}
