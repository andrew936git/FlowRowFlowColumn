package com.example.flowrowflowcolumn

class Person(val name: String, val surname: String, val post: String, val salary: Int) {
    companion object{
        val persons = listOf(
            Person("Андрей","Иванов", "программист", 100000),
            Person("Николай","Сидоров", "врач", 80000),
            Person("Анастасия","Петрова", "учитель", 40000),
            Person("Екатерина","Курочкина", "инженер", 60000),
            Person("Алексей","Галактионов", "врач", 70000),
            Person("Леонид","Слуцкий", "программист", 120000),
            Person("Максим","Головин", "врач", 50000),
            Person("Иван","Алексеев", "учитель", 30000),
            Person("Владимир","Жириновский", "инженер", 85000),
            Person("Сергей","Игнашевич", "инженер", 90000),
            Person("Анна","Киняпина", "учитель", 35000),
            Person("Диана","Сажина", "программист", 150000),
        )
    }
}