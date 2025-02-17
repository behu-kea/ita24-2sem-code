package com.example.datastructures

import java.util.LinkedHashMap

import java.util.LinkedList
import kotlin.collections.LinkedHashSet

fun main() {
    val arrayList: ArrayList<String> = arrayListOf("a", "b");
    val linkedList: LinkedList<String> = LinkedList()
    linkedList.add("a");

    doSomething(arrayList);

    val a: MutableList<String> = LinkedList();
    a.add("asd")

    val hanne = Student(23, 12);
    val per = Student(19, 7);
    val jens = Student(18, 7);

    val students: List<Student> = listOf(hanne, per, jens);
    println("compareTo: " + hanne.compareTo(per))
    println(students.sorted())

    val cities: LinkedHashMap<String, String> = LinkedHashMap()
    cities.put("paris", "Paris er en fantastisk by");
    cities.put("copenhagen", "copenhagen er en fantastisk by");
    cities.put("Aarhus", "aarhus er en fantastisk by");

    println(cities.toString())

}

fun doSomething(list: List<String>) {
    println(list.size)
}

class Student(private val age: Int, private val grade: Int): Comparable<Student> {
    override fun compareTo(other: Student): Int {
        return grade - other.grade;
    }

    override fun toString(): String {
        return "Student(age=$age, grade=$grade)"
    }

}
