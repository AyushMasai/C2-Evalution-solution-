package com.masai.usecase;


import com.masai.DAO.EmpDAO;
import com.masai.DAO.EmpDAOImpl;
import com.masai.Model.Department;

import java.util.Scanner;



    public class AddDepartment {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the department Details...");
            EmpDAO dao = new EmpDAOImpl();

            Department dept = new Department();
            System.out.println("Enter the department name: ");
            dept.setName(sc.next());
            System.out.println("Enter the department location: ");
            dept.setLocation(sc.next());

            dao.addDepartment(dept);
        }
    }


