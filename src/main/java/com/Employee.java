package com;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Employee implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label(value = "Name")
   private java.lang.String name;
   @org.kie.api.definition.type.Label(value = "Age")
   private java.lang.Integer age;
   @org.kie.api.definition.type.Label(value = "Salary")
   private java.math.BigDecimal salary;
   @org.kie.api.definition.type.Label(value = "Designation")
   private java.lang.String designation;

   public Employee()
   {
   }

   public java.lang.String getName()
   {
      return this.name;
   }

   public void setName(java.lang.String name)
   {
      this.name = name;
   }

   public java.lang.Integer getAge()
   {
      return this.age;
   }

   public void setAge(java.lang.Integer age)
   {
      this.age = age;
   }

   public java.math.BigDecimal getSalary()
   {
      return this.salary;
   }

   public void setSalary(java.math.BigDecimal salary)
   {
      this.salary = salary;
   }

   public java.lang.String getDesignation()
   {
      return this.designation;
   }

   public void setDesignation(java.lang.String designation)
   {
      this.designation = designation;
   }

   public Employee(java.lang.String name, java.lang.Integer age,
         java.math.BigDecimal salary, java.lang.String designation)
   {
      this.name = name;
      this.age = age;
      this.salary = salary;
      this.designation = designation;
   }

}