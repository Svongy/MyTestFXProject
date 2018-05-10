import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;

public class BuildLoader {
    public static Class getMainJar(String classname, URL jarPath) throws Exception {
        Class appClass;
        try {
            // final Class<?>[] parameters = new Class[]{URL.class};
            URLClassLoader classLoader = (URLClassLoader) ClassLoader.getSystemClassLoader();
            Class<?> sysClass = URLClassLoader.class;

            Method method = sysClass.getDeclaredMethod("addURL", URL.class);

            method.setAccessible(true);
            method.invoke(classLoader, jarPath);
            appClass = Class.forName(classname, true, ClassLoader.getSystemClassLoader());

        } catch (Exception e) {
            throw e;
        }

        return appClass;
    }
}
