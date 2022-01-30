package day27;

public class MultiThreading_Notes {
/*
 * Multitasking:
 * is a process of executing multiple tasks simultaneously.
 * use for utilize the CPU.
 * 
 * 
 * Types of Multitasking:
 * Process-based Multitasking/ Multiprocessing
 * Thread-based Multitasking/ Multithreading
 * 
 * 
 * Multitasking:
 * eg. using MS-Word & listening music in Music Player
 * 
 * Thread - Unit of a process
 * 
 * Uses:
 * using Complete Power of CPU
 * Async task in Android
 * Web Application
 * Gaming
 * 
 * 
 * 2 ways to achieve Multi-Threading
 * using Multithreading
 * using Enhance Multithreading means using Concurrent package
 * 
 * 
 * Every thread in java belong to some thread group
 * Main thread belong to main group
 * Every thread in java is child of system group
 * Hence system group acts as root for all the thread group
 * Garbage collector in java, is also one type of thread which present in system thread group
 * 
 * 
 * Synchronization:
 * 
 * If multiple threada are trying to operate an same java object then data inconsistancy problem may arries
 * eg. In joint account balance
 * To Resolve the problem, we use synchronized access modifier which is applicable on method and block
 * If a method or block, is synchronized that means only one thread is allowed to execute that method or block
 * 
 * Disadvantage:
 * There is no time limit for other thread are wait.
 * There is no API for listing out the waiting threads.
 * There is no fairness policy on which thread should get chance
 * 
 * 
 * yield() vs join() vs sleep()
 * 
 * */
}
