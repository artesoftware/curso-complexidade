package br.com.artesoftware.cursocomplexidade;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.math.BigInteger;
import java.util.*;

import static java.lang.reflect.Modifier.isFinal;
import static java.lang.reflect.Modifier.isStatic;

public class ContadorRefatorado2 {

    private static final Set<Class<?>> INTEIROS = new HashSet<>();
    static {
        INTEIROS.add(Integer.class);
        INTEIROS.add(int.class);
        INTEIROS.add(Long.class);
        INTEIROS.add(long.class);
        INTEIROS.add(Short.class);
        INTEIROS.add(short.class);
        INTEIROS.add(Byte.class);
        INTEIROS.add(byte.class);
        INTEIROS.add(BigInteger.class);
    }

    public int contar(Class<?> clazz){
        if (!isCountClass(clazz)) return -1;
        List<Field> fields = getFieldsFromClass(clazz);
        int count = 0;  Class<?> fieldType;
        for (Field field : fields) {
            if (isIntConst(field)) {
                System.out.println("Constantante encontrada:" + field);
                count++;
            }
        }
        return count;
    }
    public boolean isCountClass(Class<?> c){
        return c != null && !c.isEnum() &&! Modifier.isAbstract(c.getModifiers());
    }
    public List<Field> getFieldsFromClass(Class<?> clazz){
        List<Field> fields = new ArrayList<>(Arrays.asList(clazz.getDeclaredFields()));
        Class<?> superClass = clazz.getSuperclass();
        if (superClass != null && !superClass.equals(Object.class)) {
            fields.addAll(getFieldsFromClass(superClass));
        }    return fields;
    }
    public boolean isIntConst(Field field){
        Class<?> fieldType = field.getType();
        return isStatic(field.getModifiers()) && isFinal(field.getModifiers()) &&
                INTEIROS.contains(fieldType);
    }
}
