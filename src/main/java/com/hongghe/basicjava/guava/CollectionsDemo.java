package com.hongghe.basicjava.guava;

import afu.org.checkerframework.checker.nullness.qual.Nullable;
import com.google.common.base.Function;
import com.google.common.base.Functions;
import com.google.common.collect.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.List;
import java.util.Set;

/**
 * collections 的使用
 *
 * @author hongghe 06/08/2018
 */
public class CollectionsDemo {

    private static final Logger LOGGER = LoggerFactory.getLogger(CollectionsDemo.class);

    public static void main(String[] args) {
        ImmutableSet<String> immutableSet = ImmutableSet.of("1", "2", "3");
        LOGGER.info("The data = {}", immutableSet);
        ImmutableSet<String> immutableSetA = ImmutableSet.copyOf(immutableSet);
        LOGGER.info("The data = {}", immutableSetA);
        ImmutableSet<String> immutableSetB = ImmutableSet.<String>builder().addAll(immutableSet).add("4").build();
        LOGGER.info("The data = {}", immutableSetB);
        ImmutableList<String> immutableList = immutableSet.asList();
        LOGGER.info("The data = {}", immutableList);
    }

    public static void collectionsOperations() {
        Set<Integer> set1= Sets.newHashSet(1,2,3,4,5);
        Set<Integer> set2=Sets.newHashSet(3,4,5,6);
        //交集
        Sets.SetView<Integer> inter=Sets.intersection(set1,set2);
        System.out.println(inter);
        //差集,在A中不在B中
        Sets.SetView<Integer> diff=Sets.difference(set1,set2);
        System.out.println(diff);
        //并集
        Sets.SetView<Integer> union=Sets.union(set1,set2);
        System.out.println(union);
    }

    public static void filterOperations() {
        List<String> list= Lists.newArrayList("moon","dad","refer","son");
        Collection<String> palindromeList= Collections2.filter(list, input -> {
            //找回文串
            return new StringBuilder(input).reverse().toString().equals(input);
        });
        System.out.println(palindromeList);
    }

    public static void transformOperations() {
        Set<Long> times= Sets.newHashSet();
        times.add(91299990701L);
        times.add(9320001010L);
        times.add(9920170621L);
        Collection<String> timeStrCol= Collections2.transform(times, new Function<Long, String>() {
            @Nullable
            @Override
            public String apply(@Nullable Long input) {
                return new SimpleDateFormat("yyyy-MM-dd").format(input);
            }
        });
        System.out.println(timeStrCol);
    }

    public static void transformOperationDemo() {
        List<String> list= Lists.newArrayList("abcde","good","happiness");
        //确保容器中的字符串长度不超过5
        Function<String,String> f1=new Function<String, String>() {
            @Nullable
            @Override
            public String apply(@Nullable String input) {
                return input.length()>5?input.substring(0,5):input;
            }
        };
        //转成大写
        Function<String,String> f2=new Function<String, String>() {
            @Nullable
            @Override
            public String apply(@Nullable String input) {
                return input.toUpperCase();
            }
        };
        Function<String,String> function= Functions.compose(f1,f2);
        Collection<String> results=Collections2.transform(list,function);
        System.out.println(results);
    }
}
