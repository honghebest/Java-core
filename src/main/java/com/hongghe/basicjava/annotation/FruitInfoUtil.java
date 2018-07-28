package com.hongghe.basicjava.annotation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Field;

/**
 * The handler of annotation of java.
 *
 * @author hongghe 28/07/2018
 */
public class FruitInfoUtil {

    public static final Logger logger = LoggerFactory.getLogger(FruitInfoUtil.class);

    public static void getFruitInfo(Class<?> clazz) {
        String fruitNameString = "The fruit name is : ";
        String fruitColorString = "The fruit color is : ";
        String fruitProviderString = "The fruit provider is : ";

        Field[] fields = clazz.getDeclaredFields();

        for (Field field : fields) {
            if (field.isAnnotationPresent(FruitName.class)) {
                FruitName fruitName = (FruitName) field.getAnnotation(FruitName.class);
                fruitNameString = fruitNameString + fruitName;
                logger.info("The annotation is fruitName={}", fruitNameString);
            } else if(field.isAnnotationPresent(FruitColor.class)){
                FruitColor fruitColor= (FruitColor) field.getAnnotation(FruitColor.class);
                fruitColorString = fruitColorString+fruitColor.fruitColor().toString();
                System.out.println(fruitColorString);
            } else if(field.isAnnotationPresent(FruitProvider.class)){
                FruitProvider fruitProvider= (FruitProvider) field.getAnnotation(FruitProvider.class);
                fruitProviderString = fruitProviderString +  " 供应商编号："+fruitProvider.id()+" 供应商名称："+fruitProvider.name()+" 供应商地址："+fruitProvider.address();
                System.out.println(fruitProviderString);
            }
        }
    }
}
