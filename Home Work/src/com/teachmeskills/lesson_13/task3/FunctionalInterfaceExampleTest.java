package com.teachmeskills.lesson_13.task3;

import com.teachmeskills.lesson_13.task3.Runner;
import com.teachmeskills.lesson_13.task3.Main;

@FunctionalInterface
interface FunctionalInterfaceExample<T> {
    T doJob(T parameter);
}