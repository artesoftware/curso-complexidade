package br.com.artesoftware.cursocomplexidade;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.lang.reflect.Modifier.isFinal;
import static java.lang.reflect.Modifier.isStatic;

public class ContadorRefatorado {

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
                (fieldType.equals(Integer.class) || fieldType.equals(int.class)
                || fieldType.equals(Long.class)	|| fieldType.equals(long.class)
                || fieldType.equals(Short.class) || fieldType.equals(short.class)
                || fieldType.equals(Byte.class) || fieldType.equals(byte.class)
                || fieldType.equals(BigInteger.class));
    }
}
