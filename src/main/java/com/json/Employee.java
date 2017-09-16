
package com.json;

public class Employee {

 private String name;
 private String type;
 private int age;

 public String getName() {
  return name;
 }

 public void setName(String name) {
  this.name = name;
 }

 public String getType() {
  return type;
 }

 public void setType(String type) {
  this.type = type;
 }

 public int getAge() {
  return age;
 }

 public void setAge(int age) {
  this.age = age;
 }

 @Override
 public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("name=" + this.name);
  if (type != null) {
   sb.append("\ntype=" + type);
  }
  sb.append("\n");
  sb.append("age=" + age);
  return sb.toString();
 }
}
