package day02;

public class JVM_Notes {
/*
 * Java Development Kit: Development + Running (java program)
 * Java Runtime Environment : Running for java program
 * Java Virtual Machine : JVM is a s/w simulation of m/c which operates exactly like physical m/c
 * 
 * 
 * When we compile Java program using javac tool, 
 * the Java compiler converts the source code into byte code.
 * 
 * 
 * What happen at runtime ?
 * 
 * class file -> class loader -> Bytecode Verified -> Interpreter -> Runtime -> Hardware
 * 
 * 
 * JVM ARCHITECTURE : 
 * https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.geeksforgeeks.org%2Fjvm-works-jvm-architecture%2F&psig=AOvVaw1ZHwtxIs8BtEoIu76s_E-p&ust=1643505005835000&source=images&cd=vfe&ved=0CAsQjRxqFwoTCPipq7Tj1fUCFQAAAAAdAAAAABAD
 * 
 * classloader subsystem is responsible for 3 things:
 * Loading, Linking, Initialization
 * 
 * static block is executed whenever class is loaded
 * 
 * class area is used for storing class data.
 * e.g. methods, data variables
 * 
 * Heap area for storing the object related data
 * 
 * Stack area for storing local variable or thread allocate stack memory
 * 
 * PC register : individual thread
 * 
 * Native method stack : thread
 * 
 * Execution Engine is present in JVM
 * Execution Engine is responsible for the execution of class file
 * 
 * Naitive Method Interface/ Java Naitive Interface:
 * It is part of JVM
 * that connects the java code with the java naitive application and libraries
 * 
 * What is Java Naitive application libraries?
 * something which is written in the some other languages like C, C++, Asembly lang or any other lang
 * 
 * Execution Engine is central component of JVM which is responsible for executing most important duty.
 * 
 * 
 * 
 * 
 * */
}
