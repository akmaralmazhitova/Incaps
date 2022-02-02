package com.company;

public class Main {

    public static void main(String[] args) {
        Course java = new Course();
        java.setName("Java5");
        java.setNumber(312343445);
        java.setNameOfTeacher("Muhammed");
        java.setSrNameOfTeacher("Allanov");

        System.out.println(java.getName()+ '\n' + java.getNumber()+ '\n'+ java.getNameOfTeacher()+" "+ java.getSrNameOfTeacher());


        Student st = new Student();
        st.setDateOfBirth("10.11.92");
        st.setName("Akmaral");
        st.setSrName("Mazhitova");
        st.setAge(30);

        System.out.println(st.getDateOfBirth()+ '\n' + st.getName() + " " + st.getSrName()+'\n'+st.getAge());







    }
}
